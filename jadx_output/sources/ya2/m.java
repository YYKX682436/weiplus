package ya2;

/* loaded from: classes.dex */
public final class m implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460509d;

    public m(android.content.Context context) {
        this.f460509d = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.mh2 req = (r45.mh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret.getInteger(1) == 0) {
            int integer = req.getInteger(0);
            android.content.Context context = this.f460509d;
            if (integer == 2) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.mao);
                e4Var.b(com.tencent.mm.R.raw.toast_ok);
                e4Var.c();
                return;
            }
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = context.getString(com.tencent.mm.R.string.ikb);
            e4Var2.b(com.tencent.mm.R.raw.toast_ok);
            e4Var2.c();
        }
    }
}
