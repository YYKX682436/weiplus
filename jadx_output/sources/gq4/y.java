package gq4;

/* loaded from: classes7.dex */
public class y implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            nm.j.f338443g.a(new gq4.s());
        }
    }
}
