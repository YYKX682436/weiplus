package oy1;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ oy1.t f349926a = new oy1.t();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f349927b = new java.util.LinkedHashMap();

    public final oy1.c0 a(int i17) {
        oy1.c0 c0Var;
        java.util.Map map = f349927b;
        synchronized (map) {
            if (!map.containsKey(java.lang.Integer.valueOf(i17))) {
                map.put(java.lang.Integer.valueOf(i17), new oy1.c0(i17));
            }
            c0Var = (oy1.c0) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        }
        return c0Var;
    }

    public final void b(int i17, java.util.List reportInfoList) {
        kotlin.jvm.internal.o.g(reportInfoList, "reportInfoList");
        oy1.c0 a17 = a(i17);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i(a17.f349847b, "LiteAppCustomReportCgiEvent size = " + reportInfoList.size());
            com.tencent.mm.sdk.platformtools.n3 i18 = a17.i();
            android.os.Message obtainMessage = a17.i().obtainMessage();
            obtainMessage.what = 1008;
            obtainMessage.obj = reportInfoList;
            i18.sendMessage(obtainMessage);
        }
    }

    public final void c(boolean z17) {
        java.util.Map map = f349927b;
        synchronized (map) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                ((oy1.c0) entry.getValue()).j(z17);
            }
        }
    }

    public final void d() {
        java.util.Map map = f349927b;
        synchronized (map) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                qy1.b0 b0Var = ((oy1.c0) entry.getValue()).f349854i;
                kotlinx.coroutines.z0.d(b0Var.f367715n, "CgiStorageHelper send destroyed", null, 2, null);
                kotlinx.coroutines.z0.d(b0Var.f367716o, "CgiStorageHelper receive destroyed", null, 2, null);
                u26.x0.a(b0Var.f367712k, null, 1, null);
                kotlinx.coroutines.l.f(null, new qy1.q(b0Var, null), 1, null);
            }
        }
    }

    public final void e() {
        java.util.Map map = f349927b;
        synchronized (map) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                oy1.c0 c0Var = (oy1.c0) entry.getValue();
                com.tencent.mm.sdk.platformtools.n3 i17 = c0Var.i();
                android.os.Message obtainMessage = c0Var.i().obtainMessage();
                obtainMessage.what = 1007;
                i17.sendMessage(obtainMessage);
            }
        }
    }
}
