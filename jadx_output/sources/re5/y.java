package re5;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.d0 f394604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(re5.d0 d0Var) {
        super(2);
        this.f394604d = d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        re5.d0 d0Var = this.f394604d;
        if (str == null || str2 == null) {
            em.s1 s1Var = d0Var.f394564t;
            if (s1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            s1Var.a().setVisibility(8);
        } else {
            em.s1 s1Var2 = d0Var.f394564t;
            if (s1Var2 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            s1Var2.a().setVisibility(0);
            em.s1 s1Var3 = d0Var.f394564t;
            if (s1Var3 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            if (s1Var3.f254777f == null) {
                s1Var3.f254777f = (android.widget.TextView) s1Var3.f254772a.findViewById(com.tencent.mm.R.id.vht);
            }
            s1Var3.f254777f.setText(str);
            em.s1 s1Var4 = d0Var.f394564t;
            if (s1Var4 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            if (s1Var4.f254774c == null) {
                s1Var4.f254774c = (android.widget.TextView) s1Var4.f254772a.findViewById(com.tencent.mm.R.id.vhu);
            }
            s1Var4.f254774c.setText(str2);
        }
        return jz5.f0.f302826a;
    }
}
