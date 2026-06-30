package zt;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzt/m;", "Lg75/f0;", "Lm70/e;", "Lm70/g;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "feature-appmsg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class m extends g75.f0<m70.e, m70.g> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        zt.l lVar = new zt.l(this, (m70.e) bVar, zVar);
        if (zVar.e("Common_MakeSureUIThread", false)) {
            com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(lVar);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(lVar);
        }
        return new m70.g();
    }
}
