package pd0;

/* loaded from: classes11.dex */
public class a1 implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.x2.n();
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).h(new od0.i(), "SIRWorker");
            if (!android.text.TextUtils.isEmpty(wo.w0.c()) || gm0.j1.a()) {
                od0.r.wi();
            }
        }
    }
}
