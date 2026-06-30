package qx3;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx3.o f367364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qx3.o oVar) {
        super(1);
        this.f367364d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        k6.a aVar;
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qx3.o oVar = this.f367364d;
        ((kotlinx.coroutines.flow.h3) oVar.f367375e).k(new qx3.e(oVar.f367379i, 3));
        ((kotlinx.coroutines.flow.h3) oVar.f367377g).k(new qx3.f(0L, null, 3));
        co4.b bVar = oVar.f367381n;
        if (bVar != null && (aVar = bVar.f43802a) != null) {
            p6.f fVar = aVar.f304477a;
            if (fVar != null) {
                fVar.pause();
            }
            if (fVar != null) {
                fVar.c();
            }
            if (fVar != null) {
                fVar.release();
            }
        }
        return jz5.f0.f302826a;
    }
}
