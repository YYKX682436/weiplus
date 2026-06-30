package i80;

/* loaded from: classes5.dex */
public class e implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        int i17 = com.tencent.mm.ipcinvoker.wx_extension.p0.f68441e;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ipcinvoker.wx_extension.o0());
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
    }
}
