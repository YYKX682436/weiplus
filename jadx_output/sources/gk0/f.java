package gk0;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgk0/f;", "Lg75/f0;", "Lgk0/d;", "Lgk0/e;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "imageloader-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class f extends g75.f0<gk0.d, gk0.e> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        android.graphics.Bitmap I;
        gk0.d dVar = (gk0.d) bVar;
        boolean h17 = com.tencent.mm.sdk.platformtools.y1.h(dVar.f272417c);
        gk0.k kVar = dVar.f272418d;
        byte[] bArr = dVar.f272417c;
        if (h17) {
            byte[] wi6 = ((yq.e) ((gk0.o0) i95.n0.c(gk0.o0.class))).wi(bArr);
            if (wi6 == null || (I = com.tencent.mm.sdk.platformtools.x.I(wi6, kVar.f272430a, kVar.f272431b, kVar.f272437h)) == null) {
                I = null;
            }
        } else {
            I = com.tencent.mm.sdk.platformtools.x.I(bArr, kVar.f272430a, kVar.f272431b, kVar.f272437h);
        }
        if (I != null) {
            I = com.tencent.mm.sdk.platformtools.x.B0(I, com.tencent.mm.compatible.util.Exif.fromStream(new java.io.ByteArrayInputStream(bArr)));
            float f17 = kVar.f272432c;
            if (f17 > 0.0f) {
                I = com.tencent.mm.sdk.platformtools.x.s0(I, false, f17);
            } else {
                float f18 = kVar.f272433d;
                if (f18 > 0.0f) {
                    I = com.tencent.mm.sdk.platformtools.x.s0(I, false, f18 * I.getWidth());
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonConvertDataToBitmapPPC", "convert to bitmap " + gk0.x.a(I));
        return new gk0.e(dVar.f272416b, I);
    }
}
