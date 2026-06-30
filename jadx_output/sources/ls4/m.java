package ls4;

/* loaded from: classes8.dex */
public final class m implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.fc5 f321081b;

    public m(ls4.u uVar, r45.fc5 fc5Var) {
        this.f321080a = uVar;
        this.f321081b = fc5Var;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        ls4.u uVar = this.f321080a;
        if (ma5Var == null || ma5Var.f380307e != 3) {
            uVar.d(new pr4.a(pr4.j.f358014f));
        } else {
            uVar.h(this.f321081b);
        }
    }
}
