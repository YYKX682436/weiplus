package zy0;

/* loaded from: classes5.dex */
public final class b implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy0.e f477309a;

    public b(zy0.e eVar, java.lang.String str) {
        this.f477309a = eVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.lang.Object obj = map.get("udf_kv");
        java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map2 != null ? map2.get("REPORT_KEY_DYNAMIC_PARAM_AUDIOINFO") : null;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = obj2 instanceof com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo ? (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj2 : null;
        java.lang.Object obj3 = map2 != null ? map2.get("REPORT_KEY_DYNAMIC_PARAM_SOURCEPAGE") : null;
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        zy0.e eVar = this.f477309a;
        java.lang.String str3 = eVar.f477318g;
        boolean b17 = kotlin.jvm.internal.o.b(str, "view_exp");
        zy0.f fVar = eVar.f477315d;
        if (!b17) {
            if (!kotlin.jvm.internal.o.b(str, "view_clk") || fVar == null) {
                return;
            }
            mz0.n0 n0Var = (mz0.n0) fVar;
            if (audioCacheInfo == null) {
                return;
            }
            if (kotlin.jvm.internal.o.b(str2, "3") || kotlin.jvm.internal.o.b(str2, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT)) {
                mz0.b2 b2Var = n0Var.f333005a;
                b2Var.E7(b2Var.o7().a(), audioCacheInfo);
                return;
            }
            return;
        }
        if (fVar != null) {
            mz0.n0 n0Var2 = (mz0.n0) fVar;
            if (audioCacheInfo == null) {
                return;
            }
            boolean z17 = kotlin.jvm.internal.o.b(str2, "3") || kotlin.jvm.internal.o.b(str2, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
            mz0.b2 b2Var2 = n0Var2.f333005a;
            if (z17) {
                b2Var2.F7(b2Var2.o7().a(), audioCacheInfo);
                return;
            }
            ty0.c h76 = b2Var2.h7();
            if (h76 != null) {
                java.lang.String songId = audioCacheInfo.C;
                kotlin.jvm.internal.o.g(songId, "songId");
                bz0.j.f36750a.a(((mz0.q2) h76).f333029a.o7().a(), songId);
            }
        }
    }
}
