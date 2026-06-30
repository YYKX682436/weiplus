package xd4;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static volatile xd4.g f453640b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f453641a = new java.util.HashSet();

    public static xd4.g a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        if (f453640b == null) {
            synchronized (xd4.g.class) {
                try {
                    if (f453640b == null) {
                        f453640b = new xd4.g();
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
                    throw th6;
                }
            }
        }
        xd4.g gVar = f453640b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        return gVar;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayViewManager", "onUIPause");
        java.util.Iterator it = ((java.util.HashSet) this.f453641a).iterator();
        while (it.hasNext()) {
            ((xd4.d) it.next()).e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        java.util.Iterator it = ((java.util.HashSet) this.f453641a).iterator();
        while (it.hasNext()) {
            ((xd4.d) it.next()).pause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }

    public void d(xd4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        java.util.Set set = this.f453641a;
        ((java.util.HashSet) set).add(dVar);
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            xd4.d dVar2 = (xd4.d) it.next();
            if (dVar2 != dVar) {
                dVar2.pause();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
    }
}
