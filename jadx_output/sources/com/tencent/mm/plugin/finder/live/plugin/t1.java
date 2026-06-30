package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114325d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(2);
        this.f114325d = v3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114325d;
        if (num != null && num.intValue() == 0) {
            java.lang.String string = v3Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.nv8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Context context = v3Var.f365323d.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            com.tencent.mm.plugin.finder.live.plugin.v3.x1(v3Var, 7);
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = v3Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.nv6);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                android.content.Context context2 = v3Var.f365323d.getContext();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = string2;
                e4Var2.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
