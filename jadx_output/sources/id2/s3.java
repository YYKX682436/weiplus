package id2;

/* loaded from: classes.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(id2.u3 u3Var, android.content.Context context) {
        super(2);
        this.f290794d = u3Var;
        this.f290795e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLongFeedGen retCode:");
        sb6.append(num);
        sb6.append(", retMsg:");
        sb6.append(str == null ? "" : str);
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", sb6.toString());
        id2.u3 u3Var = this.f290794d;
        android.content.Context context = this.f290795e;
        if (num != null && num.intValue() == 0) {
            java.lang.String string = u3Var.getContext().getResources().getString(com.tencent.mm.R.string.now);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = u3Var.getContext().getResources().getString(com.tencent.mm.R.string.not);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var2.f211776c = string2;
                e4Var2.c();
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
