package yq3;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yq3.v vVar) {
        super(0);
        this.f464506d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String w07;
        yq3.v vVar = this.f464506d;
        com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
        java.lang.String str2 = null;
        if (z3Var != null && (w07 = z3Var.w0()) != null) {
            if (!(w07.length() > 0)) {
                w07 = null;
            }
            if (w07 != null) {
                return w07;
            }
        }
        com.tencent.mm.storage.ya yaVar = vVar.f464536g;
        if (yaVar != null && (str = yaVar.field_conRemark) != null) {
            if (str.length() > 0) {
                str2 = str;
            }
        }
        return str2 == null ? "" : str2;
    }
}
