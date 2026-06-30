package hb2;

/* loaded from: classes.dex */
public final class i0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280058f;

    public i0(yz5.l lVar, int i17, android.content.Context context) {
        this.f280056d = lVar;
        this.f280057e = i17;
        this.f280058f = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.hi2 req = (r45.hi2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret.getInteger(1) == 0) {
            this.f280056d.invoke(java.lang.Integer.valueOf(this.f280057e));
            return;
        }
        android.content.Context context = this.f280058f;
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491357mh5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
