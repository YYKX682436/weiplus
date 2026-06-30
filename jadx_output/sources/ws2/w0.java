package ws2;

/* loaded from: classes3.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ws2.k1 k1Var) {
        super(0);
        this.f449152d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "generator innerReplayMiniView!");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ws2.k1 k1Var = this.f449152d;
        dt2.t tVar = new dt2.t(context, new ws2.v0(k1Var));
        tVar.p(k1Var.f449071c);
        return tVar;
    }
}
