package com.tencent.mm.plugin.recordvideo.util;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/util/MultiMediaVideoChecker;", "", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Lqc0/d1;", "getVideoInfoBySightJNI", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MultiMediaVideoChecker {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker f156451a = new com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f156452b = new java.util.HashMap();

    private final qc0.d1 getVideoInfoBySightJNI(java.lang.String path) {
        try {
            com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(path, true);
            if (d17 == null) {
                return null;
            }
            int i17 = d17.f162395n;
            if (i17 < 0) {
                i17 = com.tencent.mm.plugin.sight.base.SightVideoJNI.getMp4RotateVFS(path);
            }
            qc0.d1 d1Var = new qc0.d1(d17.f162384c, d17.f162385d, d17.f162386e, d17.f162382a, d17.f162383b, i17, com.tencent.mm.plugin.sight.base.SightVideoJNI.isH265VideoVFS(path), d17.f162388g, d17.f162387f, d17.f162389h, d17.f162393l);
            d1Var.f361374l = d17;
            return d1Var;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final qc0.d1 a(java.lang.String path) {
        hs0.a aVar;
        kotlin.jvm.internal.o.g(path, "path");
        hs0.a aVar2 = null;
        try {
            aVar = new hs0.a(path);
        } catch (java.lang.Exception unused) {
            aVar = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            android.media.MediaFormat mediaFormat = aVar.f284552f;
            boolean z17 = true;
            long j17 = (mediaFormat != null && mediaFormat.containsKey("durationUs") ? mediaFormat.getLong("durationUs") : 0L) / 1000;
            int integer = mediaFormat != null && mediaFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? mediaFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) : 0;
            int integer2 = mediaFormat != null && mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 0;
            if (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) {
                z17 = false;
            }
            qc0.d1 d1Var = new qc0.d1(0, 0, 0.0f, j17, 0, 0, true, integer, integer2, z17 ? mediaFormat.getInteger("sample-rate") : 0, -1);
            aVar.d();
            return d1Var;
        } catch (java.lang.Exception unused2) {
            if (aVar != null) {
                aVar.d();
            }
            return null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            aVar2 = aVar;
            if (aVar2 != null) {
                aVar2.d();
            }
            throw th;
        }
    }

    public final qc0.d1 b(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return c(path, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:21|(1:23)(1:151)|24|(22:25|26|27|28|29|(1:143)(1:33)|(1:35)(1:142)|36|(1:141)(1:40)|(1:42)(1:140)|43|(1:139)(1:47)|(1:49)(1:138)|50|51|(1:137)(1:55)|(1:57)(1:136)|58|(1:135)(1:62)|(1:64)(1:134)|(1:66)|68)|(5:70|71|72|73|(17:75|(2:126|127)(1:77)|78|(1:125)(1:82)|(1:84)(1:124)|85|(1:123)(1:89)|(2:91|92)(1:122)|93|(1:121)(1:97)|(1:99)(1:120)|100|101|102|103|104|105))(1:133)|128|(0)(0)|78|(1:80)|125|(0)(0)|85|(1:87)|123|(0)(0)|93|(1:95)|121|(0)(0)|100|101|102|103|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b A[Catch: all -> 0x017d, Exception -> 0x017f, TRY_LEAVE, TryCatch #0 {Exception -> 0x017f, blocks: (B:127:0x010f, B:78:0x0116, B:80:0x011f, B:84:0x012b, B:87:0x0135, B:91:0x0141, B:95:0x014e, B:99:0x015c, B:100:0x0165), top: B:126:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141 A[Catch: all -> 0x017d, Exception -> 0x017f, TRY_LEAVE, TryCatch #0 {Exception -> 0x017f, blocks: (B:127:0x010f, B:78:0x0116, B:80:0x011f, B:84:0x012b, B:87:0x0135, B:91:0x0141, B:95:0x014e, B:99:0x015c, B:100:0x0165), top: B:126:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c A[Catch: all -> 0x017d, Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:127:0x010f, B:78:0x0116, B:80:0x011f, B:84:0x012b, B:87:0x0135, B:91:0x0141, B:95:0x014e, B:99:0x015c, B:100:0x0165), top: B:126:0x010f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qc0.d1 c(java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.c(java.lang.String, boolean):qc0.d1");
    }
}
