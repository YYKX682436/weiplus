package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class sn implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f135910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f135911e;

    public sn(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar) {
        this.f135910d = linkedList;
        this.f135911e = eoVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f135910d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            int integer = ((r45.y94) obj).getInteger(0);
            com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar = this.f135911e;
            java.lang.String string = integer == 1 ? eoVar.getContext().getString(com.tencent.mm.R.string.lok) : eoVar.getContext().getString(com.tencent.mm.R.string.lol);
            kotlin.jvm.internal.o.d(string);
            android.app.Activity context = eoVar.getContext();
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(r3.getLong(2) / 100.0d)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            g4Var.o(i17, string, context.getString(com.tencent.mm.R.string.dlb, format));
            i17 = i18;
        }
    }
}
