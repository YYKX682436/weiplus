package jr2;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f301385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.storage.f9 f9Var) {
        super(0);
        this.f301385d = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var = this.f301385d;
        java.lang.String j17 = f9Var != null ? f9Var.j() : null;
        if (j17 == null) {
            j17 = "";
        }
        return "index = -1, content = ".concat(j17);
    }
}
