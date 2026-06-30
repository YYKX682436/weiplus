package yq3;

/* loaded from: classes11.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yq3.v vVar) {
        super(1);
        this.f464519d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.storage.z3 z3Var = this.f464519d.f464535f;
        if (z3Var != null) {
            z3Var.e3(value);
        }
        return jz5.f0.f302826a;
    }
}
