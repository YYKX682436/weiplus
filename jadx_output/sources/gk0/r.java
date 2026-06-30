package gk0;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgk0/r;", "Lg75/f0;", "Lgk0/p;", "Lgk0/q;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "imageloader-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class r extends g75.f0<gk0.p, gk0.q> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        byte[] N;
        gk0.p pVar = (gk0.p) bVar;
        java.lang.String j17 = zVar.j("Common_TargetPath", "");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        if (bool != null ? bool.booleanValue() : false) {
            com.tencent.mm.vfs.w6.h(pVar.f272447c);
        }
        boolean j18 = com.tencent.mm.vfs.w6.j(pVar.f272447c);
        java.lang.String str = pVar.f272447c;
        if (j18) {
            N = com.tencent.mm.vfs.w6.N(str, 0, -1);
            if ((!r26.n0.N(j17)) && !com.tencent.mm.vfs.w6.j(j17)) {
                com.tencent.mm.vfs.w6.d(str, j17, true);
            }
        } else {
            N = (!com.tencent.mm.vfs.w6.j(j17) || com.tencent.mm.vfs.w6.d(j17, str, true) <= 0) ? null : com.tencent.mm.vfs.w6.N(str, 0, -1);
        }
        return new gk0.q(pVar.f272446b, str, N);
    }
}
