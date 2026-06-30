package ur2;

/* loaded from: classes10.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.m implements yz5.a {
    public u(java.lang.Object obj) {
        super(0, obj, ur2.v.class, "onDelete", "onDelete()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ur2.v vVar = (ur2.v) this.receiver;
        vVar.Q6(false, "");
        ur2.o oVar = vVar.f430429i;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("previewHalfScreen");
            throw null;
        }
        oVar.f430411h = 0;
        oVar.f430415o.setText("");
        return jz5.f0.f302826a;
    }
}
