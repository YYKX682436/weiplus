package pg3;

@j95.b
/* loaded from: classes2.dex */
public final class v extends i95.w implements n40.n {

    /* renamed from: e, reason: collision with root package name */
    public boolean f354227e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f354226d = "MicroMsg.LongVideoReddotService";

    /* renamed from: f, reason: collision with root package name */
    public final pg3.s f354228f = new pg3.s();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f354226d, "LongVideo-Trace, startReddotObserver");
        pm0.v.X(new pg3.u(this));
        qg3.p1 p1Var = (qg3.p1) qg3.p1.f362843d.a();
        pg3.s listener = this.f354228f;
        kotlin.jvm.internal.o.g(listener, "listener");
        urgen.ur_54A4.UR_1007.UR_ABD8(p1Var.getCppPointer(), listener);
    }

    public void wi(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f354226d, "LongVideo-Trace, invalid Reddot Observer: " + z17);
        this.f354227e = z17;
    }
}
