package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.s1 f125341d = new com.tencent.mm.plugin.finder.report.s1();

    public s1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            for (java.util.Map.Entry entry : com.tencent.mm.plugin.finder.report.v1.f125397e.entrySet()) {
                if (((com.tencent.mm.plugin.finder.report.r1) entry.getValue()).f125291a && !((com.tencent.mm.plugin.finder.report.r1) entry.getValue()).f125293b) {
                    ((com.tencent.mm.plugin.finder.report.r1) entry.getValue()).f125306h0 = 1;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLoadingTimeReporter", "notifyAppBackground: ", th6);
        }
        return jz5.f0.f302826a;
    }
}
