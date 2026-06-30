package n12;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n12.n f334082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n12.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334082d = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new n12.i(this.f334082d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n12.i iVar = (n12.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        java.lang.String string;
        java.lang.String str;
        int i18;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        n12.n nVar = this.f334082d;
        nVar.getClass();
        java.lang.String str2 = "mime";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(nVar.f334101a);
                int d17 = cVar.d();
                android.media.MediaFormat mediaFormat = null;
                android.media.MediaFormat mediaFormat2 = null;
                int i19 = 0;
                while (true) {
                    if (i19 >= d17) {
                        i17 = 0;
                        break;
                    }
                    android.media.MediaFormat e17 = cVar.e(i19);
                    kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
                    if (e17.containsKey(str2) && (string = e17.getString(str2)) != null) {
                        str = str2;
                        i18 = d17;
                        i17 = 0;
                        if (r26.i0.y(string, "video/", false)) {
                            if (mediaFormat == null) {
                                mediaFormat = e17;
                            }
                        } else if (r26.i0.y(string, "audio/", false) && mediaFormat2 == null) {
                            mediaFormat2 = e17;
                        }
                        if (mediaFormat2 != null && mediaFormat != null) {
                            break;
                        }
                        i19++;
                        str2 = str;
                        d17 = i18;
                    }
                    str = str2;
                    i18 = d17;
                    i19++;
                    str2 = str;
                    d17 = i18;
                }
                if (mediaFormat != null) {
                    if (mediaFormat.containsKey("durationUs")) {
                        int i27 = (int) (mediaFormat.getLong("durationUs") / 1000);
                        nVar.f334103c = i27;
                        if (i27 < 500) {
                            throw new java.lang.IllegalStateException("Invalid video duration, duration: " + nVar.f334103c);
                        }
                    }
                    int integer = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : i17;
                    int integer2 = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : i17;
                    if (mediaFormat.containsKey("frame-rate")) {
                        mediaFormat.getInteger("frame-rate");
                    }
                    if (integer == 0 || integer2 == 0) {
                        throw new java.lang.IllegalArgumentException("Invalid video resolution: " + integer + " x " + integer2);
                    }
                    ((kotlinx.coroutines.flow.h3) nVar.f334104d).k(new android.util.Size(integer, integer2));
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmoticonCustomCreatePreprocessLogic", "failed to parse video metadata. " + e18);
            }
            cVar.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreatePreprocessLogic", "loadItemFromExtractor used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            cVar.g();
            throw th6;
        }
    }
}
