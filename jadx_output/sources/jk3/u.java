package jk3;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jk3.v vVar) {
        super(0);
        this.f300110d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jk3.v vVar = this.f300110d;
        ak3.c cVar = vVar.f300111d;
        if (cVar != null) {
            cVar.j(false, vVar);
        }
        return jz5.f0.f302826a;
    }
}
