class Productos:
    
    def __init__(self, nombre, precio, tipo):
        self.nombre = nombre
        self.precio = precio
        self.tipo = tipo
        
    def obtener_nombre(self):
        return self.nombre
        
    def obtener_precio(self):
        return self.precio
        
    def obtener_tipo(self):
        return self.tipo
        
    def establecer_precio(self, nuevo_precio):
        self.precio = nuevo_precio
