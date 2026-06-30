package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class i5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.k5 f112915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f112916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f112917f;

    public i5(com.tencent.mm.plugin.finder.live.plugin.k5 k5Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f112915d = k5Var;
        this.f112916e = arrayList;
        this.f112917f = arrayList2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.plugin.k5 k5Var = this.f112915d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = k5Var.f113193r;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        java.util.ArrayList arrayList = this.f112916e;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList2 = this.f112917f;
            if (i17 == 0) {
                java.lang.Object obj = arrayList2.get(i17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                ((db5.h4) g4Var.f(((java.lang.Number) obj).intValue(), (java.lang.CharSequence) arrayList.get(i17))).f228373q = k5Var.f365323d.getContext().getString(com.tencent.mm.R.string.e_l);
            } else {
                java.lang.Object obj2 = arrayList2.get(i17);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                g4Var.f(((java.lang.Number) obj2).intValue(), (java.lang.CharSequence) arrayList.get(i17));
            }
        }
    }
}
