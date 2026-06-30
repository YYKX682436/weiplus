package zx5;

/* loaded from: classes13.dex */
public class k implements zx5.a {
    @Override // zx5.a
    public void a(boolean z17, int i17, int i18, java.util.HashMap hashMap) {
        by5.c4.g("XWebBroadcastListener", "onAudioHAidConfigUpdated, package:" + org.xwalk.core.XWalkEnvironment.l() + ", process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
        by5.c4.f("XWebAudioHAid", "onAudioHAidConfigChanged.");
        com.tencent.xweb.s1.b(z17, i17, i18, hashMap);
    }

    @Override // zx5.a
    public void b(int i17) {
    }

    @Override // zx5.a
    public void c() {
        by5.c4.g("XWebBroadcastListener", "onMainCfgUpdated, package:" + org.xwalk.core.XWalkEnvironment.l() + ", process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
        yu5.c.a(new zx5.i(this));
    }

    @Override // zx5.a
    public void d(int i17) {
    }

    @Override // zx5.a
    public void e() {
        by5.c4.g("XWebBroadcastListener", "onPluginCfgUpdated, package:" + org.xwalk.core.XWalkEnvironment.l() + ", process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
        yu5.c.a(new zx5.j(this));
    }

    @Override // zx5.a
    public void f(int i17, int i18) {
        by5.c4.g("XWebBroadcastListener", "onUpdateFinished, package:" + org.xwalk.core.XWalkEnvironment.l() + ", process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
        if (i17 == 0) {
            if (!com.tencent.xweb.b3.f220216d) {
                by5.c4.f("XWebBroadcastListener", "onUpdateFinished, not waiting for xweb");
                return;
            }
            int d17 = org.xwalk.core.XWalkEnvironment.d();
            int h17 = org.xwalk.core.XWalkEnvironment.h();
            if (d17 > 0 || h17 <= 0 || "true".equalsIgnoreCase(com.tencent.xweb.b.m().f("dis_reinit_web_core"))) {
                return;
            }
            by5.c4.f("XWebBroadcastListener", "onUpdateFinished, loadedVersion:" + d17 + ", installedVersion:" + h17);
            com.tencent.xweb.WebView.B0();
        }
    }

    @Override // zx5.a
    public void g(boolean z17) {
        by5.c4.g("XWebBroadcastListener", "onMultiProfileUpdated, package:" + org.xwalk.core.XWalkEnvironment.l() + ", process:" + org.xwalk.core.XWalkEnvironment.getProcessName());
        if (by5.a1.c()) {
            by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, main process ignored.");
            return;
        }
        java.lang.Boolean bool = com.tencent.xweb.o2.f220366a;
        if (bool == null) {
            by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, not finish init, will read isSupport from SP.");
            return;
        }
        if (bool.booleanValue() == z17) {
            by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, sIsSupportMultiProfile not changed: " + z17);
            return;
        }
        by5.c4.f("XWebMultiProfile", "onSupportMultiProfileChanged, sIsSupportMultiProfile != isSupport, isSupport:" + z17 + ", lastTrySettingName:" + com.tencent.xweb.o2.f220367b + ", isMultiProfileInited:" + com.tencent.xweb.o2.f220369d);
        if (!com.tencent.xweb.o2.a()) {
            by5.c4.g("XWebMultiProfile", "onSupportMultiProfileChanged, process has used old sIsSupportMultiProfile.");
            xx5.l.a(11, 1, z17);
            return;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.xweb.o2.f220366a = valueOf;
        com.tencent.xweb.o2.f220369d = true;
        if (!valueOf.booleanValue()) {
            if (com.tencent.xweb.o2.f("Default", true)) {
                return;
            }
            xx5.l.a(2, 1, com.tencent.xweb.o2.c());
        } else {
            java.lang.String str = com.tencent.xweb.o2.f220367b;
            if (str != null) {
                com.tencent.xweb.o2.e(str);
            }
        }
    }
}
