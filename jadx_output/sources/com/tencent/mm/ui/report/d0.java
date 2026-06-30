package com.tencent.mm.ui.report;

/* loaded from: classes12.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.report.d0 f209626a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f209627b;

    static {
        com.tencent.mm.ui.report.d0 d0Var = new com.tencent.mm.ui.report.d0();
        f209626a = d0Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209719d, new com.tencent.mm.ui.report.u(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209720e, new com.tencent.mm.ui.report.v(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209721f, new com.tencent.mm.ui.report.w(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209722g, new com.tencent.mm.ui.report.x(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209723h, new com.tencent.mm.ui.report.y(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209724i, new com.tencent.mm.ui.report.z(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209725m, new com.tencent.mm.ui.report.a0(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209726n, new com.tencent.mm.ui.report.b0(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209727o, new com.tencent.mm.ui.report.c0(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209728p, new com.tencent.mm.ui.report.s(d0Var));
        concurrentHashMap.put(com.tencent.mm.ui.report.p.f209729q, new com.tencent.mm.ui.report.t(d0Var));
        f209627b = concurrentHashMap;
    }

    public final void a(java.util.HashMap hashMap, com.tencent.mm.ui.report.o oVar) {
        hashMap.put("html_has_js", java.lang.Integer.valueOf(com.tencent.mm.ui.report.f0.a(((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).fj(oVar.f209706a, false))));
    }

    public final dy1.r b() {
        return (dy1.r) i95.n0.c(dy1.r.class);
    }

    public final java.util.HashMap c(com.tencent.mm.ui.report.o filePreviewReportParams) {
        int i17;
        kotlin.jvm.internal.o.g(filePreviewReportParams, "filePreviewReportParams");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.storage.f9 f9Var = filePreviewReportParams.f209706a;
        int i18 = 1;
        if (f9Var.Z1() == 0) {
            com.tencent.mm.ui.report.q[] qVarArr = com.tencent.mm.ui.report.q.f209731d;
            i17 = 1;
        } else {
            com.tencent.mm.ui.report.q[] qVarArr2 = com.tencent.mm.ui.report.q.f209731d;
            i17 = 2;
        }
        hashMap.put("upload_download_source", java.lang.Integer.valueOf(i17));
        hashMap.put("file_extension", filePreviewReportParams.f209707b);
        hashMap.put("msgsvrid", java.lang.Long.valueOf(f9Var.I0()));
        if (f9Var.A0() == 1) {
            com.tencent.mm.ui.report.f[] fVarArr = com.tencent.mm.ui.report.f.f209636d;
        } else {
            com.tencent.mm.ui.report.f[] fVarArr2 = com.tencent.mm.ui.report.f.f209636d;
            i18 = 2;
        }
        hashMap.put("send_source", java.lang.Integer.valueOf(i18));
        hashMap.put("data_item_Id", filePreviewReportParams.f209708c);
        hashMap.put("msg_client_id", f9Var.Q0() + '_' + f9Var.getMsgId());
        hashMap.put("file_size", java.lang.Long.valueOf(filePreviewReportParams.f209709d));
        return hashMap;
    }

    public final void d(com.tencent.mm.ui.report.p type, com.tencent.mm.ui.report.o filePreviewReportParams) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(filePreviewReportParams, "filePreviewReportParams");
        pm0.v.O("MicroMsg.File.FilePreviewReporter", new com.tencent.mm.ui.report.r(type, filePreviewReportParams));
    }
}
