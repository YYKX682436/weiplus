package id2;

/* loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(id2.u3 u3Var, android.content.Context context, yz5.l lVar) {
        super(2);
        this.f290505d = u3Var;
        this.f290506e = context;
        this.f290507f = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelLongFeedGen retCode:");
        sb6.append(num);
        sb6.append(", retMsg:");
        sb6.append(str == null ? "" : str);
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", sb6.toString());
        yz5.l lVar = this.f290507f;
        id2.u3 u3Var = this.f290505d;
        android.content.Context context = this.f290506e;
        if (num != null && num.intValue() == 0) {
            java.lang.String string = u3Var.getContext().getResources().getString(com.tencent.mm.R.string.nv8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            lVar.invoke(java.lang.Boolean.TRUE);
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = u3Var.getContext().getResources().getString(com.tencent.mm.R.string.nv6);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var2.f211776c = string2;
                e4Var2.c();
                lVar.invoke(java.lang.Boolean.FALSE);
            } else {
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var3.f211776c = str;
                e4Var3.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
