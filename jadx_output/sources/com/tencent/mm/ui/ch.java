package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ch implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SearchBarUI f198097d;

    public ch(com.tencent.mm.ui.SearchBarUI searchBarUI) {
        this.f198097d = searchBarUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.view.View currentFocus;
        com.tencent.mm.ui.SearchBarUI searchBarUI = this.f198097d;
        java.util.LinkedList linkedList = searchBarUI.f196605x;
        if (!linkedList.isEmpty()) {
            linkedList.clear();
            searchBarUI.supportInvalidateOptionsMenu();
        }
        com.tencent.mm.ui.ih ihVar = new com.tencent.mm.ui.ih(searchBarUI);
        searchBarUI.f197055z = ihVar;
        ihVar.setSearchViewListener(searchBarUI);
        searchBarUI.f197055z.setHint(searchBarUI.getResources().getString(com.tencent.mm.R.string.k2_));
        searchBarUI.getSupportActionBar().y(searchBarUI.f197055z);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) searchBarUI.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = searchBarUI.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
        return false;
    }
}
