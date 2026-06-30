package id2;

/* loaded from: classes.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(1);
        this.f290761d = u3Var;
        this.f290762e = context;
        this.f290763f = j17;
        this.f290764g = j18;
        this.f290765h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nw1 nw1Var = (r45.nw1) obj;
        if (nw1Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "showReplayCancelWidget:liveInfo is null");
        } else {
            int integer = nw1Var.getInteger(31);
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "Current replay status: " + integer);
            id2.u3 u3Var = this.f290761d;
            if (integer == 1) {
                java.lang.String string = u3Var.getContext().getResources().getString(com.tencent.mm.R.string.nv7);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f290762e);
                e4Var.f211776c = string;
                e4Var.c();
            } else if (integer != 3) {
                com.tencent.mars.xlog.Log.e("FinderLivePersonalCente", "showReplayCancelWidget Unexpected replay status: " + nw1Var.getInteger(31));
            } else {
                android.content.Context context = this.f290762e;
                long j17 = this.f290763f;
                long j18 = this.f290764g;
                u3Var.getClass();
                id2.c2 c2Var = new id2.c2(u3Var, context, this.f290765h);
                com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[cancelLongFeedGen]");
                r45.hx0 hx0Var = new r45.hx0();
                hx0Var.set(0, 0);
                r45.r02 r02Var = new r45.r02();
                r02Var.set(0, 0);
                r02Var.set(1, 0);
                r02Var.set(2, 0);
                r02Var.set(3, 0);
                r02Var.set(4, 0);
                r02Var.set(5, 1);
                r02Var.set(6, 0);
                hx0Var.set(1, com.tencent.mm.protobuf.g.b(r02Var.toByteArray()));
                u3Var.R6(context, j17, j18, hx0Var, c2Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
