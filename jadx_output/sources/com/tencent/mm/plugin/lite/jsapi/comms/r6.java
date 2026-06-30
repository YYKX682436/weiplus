package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public class r6 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q6 f143768a;

    public r6(com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var) {
        this.f143768a = q6Var;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var = this.f143768a;
        java.lang.String C = q6Var.C(q6Var.f143730g, "[pushThumbToCache] download http picture error");
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, C);
        }
    }
}
