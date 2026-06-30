package yq3;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yq3.v vVar) {
        super(0);
        this.f464514d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        yq3.v vVar = this.f464514d;
        com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
        java.lang.String str3 = null;
        if (z3Var != null && (str2 = z3Var.E1) != null) {
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        com.tencent.mm.storage.ya yaVar = vVar.f464536g;
        if (yaVar != null && (str = yaVar.field_conPhone) != null) {
            if (str.length() > 0) {
                str3 = str;
            }
        }
        return str3 == null ? "" : str3;
    }
}
