package com.cristianvillamil.platziwallet.ui.home

interface HomeContrat {
    interface View {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
}

interface Presentador {
    
    fun retrieveFavoriteTransfers()

    
        
}
