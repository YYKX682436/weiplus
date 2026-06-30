package qb0;

/* loaded from: classes7.dex */
public class n implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        boolean z17 = false;
        xp3.i.a(com.tencent.mm.plugin.performance.elf.MainProcessChecker.class).j(false);
        com.tencent.mm.plugin.performance.watchdogs.b0.B.l(false);
        com.tencent.mm.plugin.performance.watchdogs.v0.f153140g.f153141d = false;
        if (com.tencent.mm.feature.performance.c2.f67534g != null) {
            com.tencent.mm.feature.performance.c2.f67534g.onAppBackground(str);
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (z65.c.a()) {
            try {
                z17 = z2.n1.b(context).contains(context.getPackageName());
            } catch (java.lang.Exception unused) {
            }
            if (z17) {
                try {
                    context.startService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.battery.BackgroundActivationsListener.class));
                } catch (java.lang.Exception unused2) {
                }
            }
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        boolean z17;
        xp3.i.a(com.tencent.mm.plugin.performance.elf.MainProcessChecker.class).j(true);
        com.tencent.mm.plugin.performance.watchdogs.b0.B.l(true);
        com.tencent.mm.plugin.performance.watchdogs.v0.f153140g.f153141d = true;
        if (com.tencent.mm.feature.performance.c2.f67534g != null) {
            com.tencent.mm.feature.performance.c2.f67534g.onAppForeground(str);
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (z65.c.a()) {
            try {
                z17 = z2.n1.b(context).contains(context.getPackageName());
            } catch (java.lang.Exception unused) {
                z17 = false;
            }
            if (z17) {
                try {
                    context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.battery.BackgroundActivationsListener.class));
                } catch (java.lang.Exception unused2) {
                }
            }
        }
    }
}
