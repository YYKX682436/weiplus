package cx;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx.x f224385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f224386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yw.s2 f224387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f224388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(bx.x xVar, cx.f0 f0Var, yw.s2 s2Var, int i17) {
        super(0);
        this.f224385d = xVar;
        this.f224386e = f0Var;
        this.f224387f = s2Var;
        this.f224388g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bx.x xVar = bx.x.f36231f;
        cx.f0 f0Var = this.f224386e;
        bx.x xVar2 = this.f224385d;
        if (xVar2 == xVar || xVar2 == bx.x.f36230e) {
            f0Var.Di(11);
        }
        yw.s2 s2Var = this.f224387f;
        s2Var.getClass();
        cl0.g gVar = new cl0.g();
        gVar.p(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, s2Var.f466455a);
        gVar.h("unreadMsgCount", s2Var.f466456b);
        gVar.h("unExposeMsgCount", s2Var.f466457c);
        gVar.h("unValidExposeMsgCount", s2Var.f466458d);
        gVar.h("unreadMsgTimeStampList", s2Var.f466459e);
        gVar.h("covBoxIndex", s2Var.f466460f);
        gVar.h("digestMsgBizUin", s2Var.f466461g);
        gVar.h("digestMsgId", s2Var.f466462h);
        gVar.h("digestMsgIdx", s2Var.f466463i);
        gVar.h("digestWording", s2Var.f466464j);
        gVar.h("eventName", xVar2.f36234d);
        gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f224388g);
        gVar.p("mbReceiveTimeStamp", java.lang.System.currentTimeMillis());
        cx.w0 w0Var = f0Var.f224422e;
        if (w0Var != null) {
            com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent onBrandServiceEvent = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent();
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            w0Var.G1(onBrandServiceEvent.f147881d, gVar2);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new cx.e0(xVar2, f0Var));
        return jz5.f0.f302826a;
    }
}
