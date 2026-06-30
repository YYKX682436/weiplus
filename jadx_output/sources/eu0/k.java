package eu0;

/* loaded from: classes5.dex */
public final class k extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "onAppForeground: app returned to foreground, opening preview page");
        dead();
        eu0.l.f256718b = null;
        eu0.l.f256717a.a();
    }
}
