package y12;

/* loaded from: classes13.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f458875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.l lVar) {
        super(2);
        this.f458875d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.v75 v75Var = (r45.v75) obj;
        java.lang.String str = (java.lang.String) obj2;
        if (v75Var != null) {
            y12.p pVar = y12.p.f458877a;
            if (str == null) {
                str = "";
            }
            pVar.e(v75Var, str);
            if (!pVar.d(v75Var)) {
                v75Var = null;
            }
        }
        this.f458875d.invoke(v75Var);
        return jz5.f0.f302826a;
    }
}
