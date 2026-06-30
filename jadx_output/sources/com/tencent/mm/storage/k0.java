package com.tencent.mm.storage;

/* loaded from: classes.dex */
public final class k0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.k0 f195064d = new com.tencent.mm.storage.k0();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o rr6, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(m1Var, "<anonymous parameter 4>");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "postRealTimeReport: cgi request error! cgi:/cgi-bin/micromsg-bin/reddot_report, funcId:5171, errType=" + i17 + ", errCode=" + i18);
        return 0;
    }
}
