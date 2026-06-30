package rq1;

/* loaded from: classes11.dex */
public final class w {

    /* renamed from: a */
    public static final rq1.w f398786a = new rq1.w();

    public static final void c(long j17, boolean z17, java.lang.String str) {
        rq1.w wVar = f398786a;
        java.util.Map a17 = wVar.a();
        a17.put("result_type", z17 ? "Success" : "Failed");
        a17.put("total_cost", java.lang.Long.valueOf(j17));
        if (str != null) {
            a17.put("fail_reason", str);
        }
        wVar.b("trace_hotword_binary_generate", a17);
    }

    public static final void d(long j17, boolean z17, long j18, java.lang.String str) {
        rq1.w wVar = f398786a;
        java.util.Map a17 = wVar.a();
        a17.put("result_type", z17 ? "Success" : "Failed");
        a17.put("time_cost", java.lang.Long.valueOf(j17));
        a17.put("file_size", java.lang.Long.valueOf(j18));
        if (str != null) {
            a17.put("fail_reason", str);
        }
        wVar.b("trace_hotword_binary_validate", a17);
    }

    public static final void e(boolean z17, int i17, java.lang.String str) {
        rq1.w wVar = f398786a;
        java.util.Map a17 = wVar.a();
        a17.put("result_type", z17 ? "Success" : "Failed");
        a17.put("native_version", java.lang.Integer.valueOf(i17));
        if (str != null) {
            a17.put("fail_reason", str);
        }
        wVar.b("trace_hotword_lib_load", a17);
    }

    public static /* synthetic */ void f(boolean z17, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            str = null;
        }
        e(z17, i17, str);
    }

    public static final void g(long j17, int i17, int i18, boolean z17, java.lang.String str) {
        rq1.w wVar = f398786a;
        java.util.Map a17 = wVar.a();
        a17.put("result_type", z17 ? "Success" : "Failed");
        a17.put("time_cost", java.lang.Long.valueOf(j17));
        a17.put("message_length", java.lang.Integer.valueOf(i17));
        a17.put("result_count", java.lang.Integer.valueOf(i18));
        if (str != null) {
            a17.put("fail_reason", str);
        }
        wVar.b("trace_hotword_search", a17);
    }

    public final java.util.Map a() {
        return kz5.c1.l(new jz5.l("inner_version", 1), new jz5.l("revision", com.tencent.mm.sdk.platformtools.z.f193109e));
    }

    public final void b(java.lang.String str, java.util.Map map) {
        try {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej(str, map, 37549);
            }
            java.util.Objects.toString(map);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HotWordSearchReport", "[doReport] Failed: event=" + str + ", error=" + e17.getMessage());
        }
    }
}
