package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class b5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f185971d;

    public b5(java.util.ArrayList arrayList) {
        this.f185971d = arrayList;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        java.util.ArrayList arrayList = this.f185971d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            g4Var.f(i17, (java.lang.CharSequence) ((android.util.Pair) arrayList.get(i17)).second);
        }
    }
}
