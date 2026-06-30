package yd5;

@yn.c(exportInterface = sb5.e2.class)
/* loaded from: classes12.dex */
public final class f extends com.tencent.mm.ui.chatting.component.a implements sb5.e2 {

    /* renamed from: e, reason: collision with root package name */
    public static final yd5.f f461096e = new yd5.f();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f461097f = jz5.h.b(yd5.d.f461094d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f461098g = jz5.h.b(yd5.e.f461095d);

    private f() {
    }

    public static final void m0(int i17, boolean z17, java.lang.String str) {
        yd5.c cVar;
        yd5.c cVar2;
        if (str == null) {
            return;
        }
        f461096e.getClass();
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
        jz5.g gVar = f461098g;
        if (((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) gVar).getValue()).k(b17)) {
            java.lang.Object obj = ((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) gVar).getValue()).get(b17);
            kotlin.jvm.internal.o.d(obj);
            cVar2 = (yd5.c) obj;
        } else {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("__biz");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                byte[] decode = android.util.Base64.decode(java.net.URLDecoder.decode(queryParameter), 0);
                kotlin.jvm.internal.o.d(decode);
                long V = com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L);
                long V2 = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
                long V3 = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("idx"), 0L);
                long V4 = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("start"), 0L);
                long V5 = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("end"), 0L);
                java.lang.String queryParameter2 = parse.getQueryParameter("contentMd5");
                cVar = new yd5.c(V, V2, V3, V4, V5, queryParameter2 == null ? "" : queryParameter2);
            } catch (java.lang.Exception unused) {
                cVar = new yd5.c(0L, 0L, 0L, 0L, 0L, "");
            }
            ((com.tencent.mm.sdk.platformtools.r2) ((jz5.n) gVar).getValue()).put(b17, cVar);
            cVar2 = cVar;
        }
        long j17 = z17 ? 1L : 2L;
        com.tencent.mm.autogen.mmdata.rpt.MMBizExcerptsOpReportStruct mMBizExcerptsOpReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MMBizExcerptsOpReportStruct();
        mMBizExcerptsOpReportStruct.f58792d = cVar2.f461088a;
        mMBizExcerptsOpReportStruct.f58793e = cVar2.f461089b;
        mMBizExcerptsOpReportStruct.f58794f = cVar2.f461090c;
        mMBizExcerptsOpReportStruct.f58795g = cVar2.f461091d;
        mMBizExcerptsOpReportStruct.f58796h = cVar2.f461092e;
        mMBizExcerptsOpReportStruct.f58797i = mMBizExcerptsOpReportStruct.b("content_md5", cVar2.f461093f, true);
        mMBizExcerptsOpReportStruct.f58799k = i17;
        mMBizExcerptsOpReportStruct.f58798j = j17;
        mMBizExcerptsOpReportStruct.m();
        mMBizExcerptsOpReportStruct.k();
    }
}
