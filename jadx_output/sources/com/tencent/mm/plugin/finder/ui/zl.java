package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class zl implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f130113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f130114e;

    public zl(java.util.List list, java.util.List list2) {
        this.f130113d = list;
        this.f130114e = list2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.List list = this.f130113d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            g4Var.f(((java.lang.Number) this.f130114e.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17));
        }
    }
}
