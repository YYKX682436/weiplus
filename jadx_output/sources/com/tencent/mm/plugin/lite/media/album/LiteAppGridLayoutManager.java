package com.tencent.mm.plugin.lite.media.album;

/* loaded from: classes10.dex */
public class LiteAppGridLayoutManager extends androidx.recyclerview.widget.GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppGridLayoutManager", "meet a IOOBE in RecyclerView");
        }
    }
}
