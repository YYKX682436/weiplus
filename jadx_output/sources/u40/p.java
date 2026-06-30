package u40;

/* loaded from: classes5.dex */
public final class p implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).h(dk2.ng.f233821d, "Finder.LiveExceptionMonitor");
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).h(dk2.og.f233870d, "Finder.LiveExceptionMonitor");
        }
    }
}
