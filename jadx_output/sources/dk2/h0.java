package dk2;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c04 f233546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r45.c04 c04Var, gk2.e eVar) {
        super(0);
        this.f233546d = c04Var;
        this.f233547e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        gk2.e eVar = this.f233547e;
        r45.c04 c04Var = this.f233546d;
        if (c04Var != null) {
            mm2.f7 f7Var = (mm2.f7) eVar.a(mm2.f7.class);
            f7Var.f329059g.postValue(new dk2.z7(c04Var, true));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            mm2.f7 f7Var2 = (mm2.f7) eVar.a(mm2.f7.class);
            f7Var2.f329059g.postValue(new dk2.z7(new r45.c04(), false));
        }
        return f0Var2;
    }
}
