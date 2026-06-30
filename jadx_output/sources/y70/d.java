package y70;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly70/d;", "Lg75/f0;", "Lm70/c;", "Lm70/d;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "feature-img_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class d extends g75.f0<m70.c, m70.d> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        m70.h hVar;
        byte[] bArr;
        m70.c cVar = (m70.c) bVar;
        java.lang.String j17 = zVar.j("key_thumb_path", "");
        java.lang.String j18 = zVar.j("key_hd_thumb_path", "");
        java.lang.String j19 = zVar.j("key_mid_thumb_path", "");
        if (com.tencent.mm.vfs.w6.j(j19) && com.tencent.mm.vfs.w6.j(j17)) {
            byte[] N = com.tencent.mm.vfs.w6.N(j17, 0, -1);
            java.lang.String str = cVar.f324467b;
            kotlin.jvm.internal.o.d(N);
            a(new y70.e(str, N, m70.h.f324477f));
        }
        if (com.tencent.mm.vfs.w6.j(j19)) {
            bArr = com.tencent.mm.vfs.w6.N(j19, 0, -1);
            hVar = m70.h.f324475d;
        } else if (com.tencent.mm.vfs.w6.j(j18)) {
            bArr = com.tencent.mm.vfs.w6.N(j18, 0, -1);
            hVar = m70.h.f324476e;
        } else if (com.tencent.mm.vfs.w6.j(j17)) {
            bArr = com.tencent.mm.vfs.w6.N(j17, 0, -1);
            hVar = m70.h.f324477f;
        } else {
            hVar = m70.h.f324477f;
            bArr = null;
        }
        return new m70.d(cVar.f324467b, hVar, bArr);
    }
}
