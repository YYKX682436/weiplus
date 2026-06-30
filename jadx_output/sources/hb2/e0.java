package hb2;

/* loaded from: classes2.dex */
public final class e0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f280037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f280038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280039f;

    public e0(so2.j5 j5Var, boolean z17, android.content.Context context) {
        this.f280037d = j5Var;
        this.f280038e = z17;
        this.f280039f = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ci2 req = (r45.ci2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        android.content.Context context = this.f280039f;
        if (integer != 0) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491357mh5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = string;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f280037d).getFeedObject();
        boolean z17 = this.f280038e;
        feedObject.setDisableHelpPromotion(z17);
        java.lang.String string2 = z17 ? context.getResources().getString(com.tencent.mm.R.string.f493301jo0) : context.getResources().getString(com.tencent.mm.R.string.jnq);
        kotlin.jvm.internal.o.d(string2);
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var2.f211776c = string2;
        e4Var2.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var2.c();
    }
}
