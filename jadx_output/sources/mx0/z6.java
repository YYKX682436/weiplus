package mx0;

/* loaded from: classes5.dex */
public final class z6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.base.MJError f332470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.tencent.maas.instamovie.base.MJError mJError, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332470d = mJError;
        this.f332471e = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String aigcWordingTimeout;
        java.lang.String aigcWordingFailed;
        boolean b17 = mx0.s.f332297a.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAIGCRequestFailed isErrTipsOpt:");
        sb6.append(b17);
        sb6.append(", sdk error.message: ");
        com.tencent.maas.instamovie.base.MJError mJError = this.f332470d;
        sb6.append(mJError.message);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
        boolean z17 = true;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332471e;
        if (b17) {
            java.lang.String str = mJError.message;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                java.lang.String message = mJError.message;
                kotlin.jvm.internal.o.f(message, "message");
                if (!r26.n0.B(message, "AigcResultCodeFailed", false)) {
                    aigcWordingFailed = mJError.message;
                    kotlin.jvm.internal.o.d(aigcWordingFailed);
                    shootComposingPluginLayout.U0(aigcWordingFailed, new mx0.y6(shootComposingPluginLayout));
                }
            }
            aigcWordingFailed = shootComposingPluginLayout.getAigcWordingFailed();
            kotlin.jvm.internal.o.d(aigcWordingFailed);
            shootComposingPluginLayout.U0(aigcWordingFailed, new mx0.y6(shootComposingPluginLayout));
        } else {
            if (mJError.getErrorCode() == 1) {
                java.lang.String message2 = mJError.message;
                kotlin.jvm.internal.o.f(message2, "message");
                if (r26.n0.B(message2, "AigcResultCodeReject", false)) {
                    aigcWordingTimeout = shootComposingPluginLayout.getAigcWordingReject();
                } else {
                    java.lang.String message3 = mJError.message;
                    kotlin.jvm.internal.o.f(message3, "message");
                    if (r26.n0.B(message3, "AigcResultCodeTimeout", false)) {
                        aigcWordingTimeout = shootComposingPluginLayout.getAigcWordingTimeout();
                    } else {
                        java.lang.String message4 = mJError.message;
                        kotlin.jvm.internal.o.f(message4, "message");
                        aigcWordingTimeout = r26.n0.B(message4, "AigcResultCodeInsecurity", false) ? shootComposingPluginLayout.getAigcWordingInsecurity() : shootComposingPluginLayout.getAigcWordingFailed();
                    }
                }
            } else {
                aigcWordingTimeout = mJError.getErrorCode() == 87 ? shootComposingPluginLayout.getAigcWordingTimeout() : shootComposingPluginLayout.getAigcWordingFailed();
            }
            android.widget.Toast makeText = db5.t7.makeText(shootComposingPluginLayout.getContext(), aigcWordingTimeout, 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            if (shootComposingPluginLayout.I1) {
                shootComposingPluginLayout.y0();
                shootComposingPluginLayout.u0();
            }
            shootComposingPluginLayout.t0(false);
        }
        return jz5.f0.f302826a;
    }
}
