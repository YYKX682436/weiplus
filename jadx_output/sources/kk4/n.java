package kk4;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.v f308561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kk4.v vVar) {
        super(0);
        this.f308561d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nk4.s sVar;
        kk4.v vVar = this.f308561d;
        vVar.R();
        kk4.c cVar = vVar.f308577b;
        if (cVar != null) {
            cVar.release();
        }
        vVar.f308577b = null;
        if ((vVar.f308581f instanceof ck4.b) && (sVar = vVar.f308588m) != null) {
            ((kw2.m0) sVar).y();
        }
        return jz5.f0.f302826a;
    }
}
