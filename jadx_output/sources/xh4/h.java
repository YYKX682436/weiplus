package xh4;

/* loaded from: classes14.dex */
public final class h extends com.tencent.mm.app.z2 {
    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a()) {
            if (uh4.c0.getService().isTeenMode()) {
                xh4.g.f454598a.tryReport();
            }
            if (uh4.c0.getService().T2()) {
                xh4.f.f454592a.tryReport();
            }
            xh4.e eVar = xh4.e.f454586a;
            if (eVar.isFreezeNow()) {
                return;
            }
            if (android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "minors_mode", 0) == 1) {
                eVar.tryReport();
            }
        }
    }
}
