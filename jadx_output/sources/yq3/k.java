package yq3;

/* loaded from: classes11.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yq3.v vVar) {
        super(1);
        this.f464511d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.storage.z3 z3Var = this.f464511d.f464535f;
        if (z3Var != null) {
            z3Var.r1(str);
        }
        return jz5.f0.f302826a;
    }
}
