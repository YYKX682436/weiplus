package gk0;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgk0/g;", "Lg75/f0;", "Ly01/b;", "Ly01/c;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "imageloader-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class g extends g75.f0<y01.b, y01.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        y01.b bVar2 = (y01.b) bVar;
        gk0.h hVar = (gk0.h) zVar.d("Common_HttpParams");
        if (hVar == null) {
            return new y01.c(bVar2.f458584b, bVar2.f458585c, null, 4, null);
        }
        gk0.k kVar = (gk0.k) zVar.d("Common_BitmapOptions");
        q11.b a17 = new com.tencent.mm.modelimage.loader.impr.c().a(hVar.f272424a, kVar != null ? kVar.f272438i : 0L);
        if (a17 == null) {
            return new y01.c(bVar2.f458584b, bVar2.f458585c, null, 4, null);
        }
        int i17 = a17.f359531a;
        byte[] bArr = a17.f359533c;
        if (!(i17 == 0 && bArr != null)) {
            a17 = null;
        }
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommonHttpLoadDataFromRemotePPC", "loadFromNetWork writeResult:" + com.tencent.mm.vfs.w6.R(bVar2.f458585c, a17.f359533c));
        }
        return new y01.c(bVar2.f458584b, bVar2.f458585c, bArr);
    }
}
