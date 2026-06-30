package s61;

/* loaded from: classes.dex */
public class g1 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.m1 f403353d;

    public g1(s61.m1 m1Var) {
        this.f403353d = m1Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        z61.c cVar = (z61.c) obj;
        if (cVar.f470324a == z61.b.f470322e) {
            int i17 = cVar.f470325b;
            s61.m1 m1Var = this.f403353d;
            if (i17 != 1) {
                m1Var.f403378o = null;
            } else {
                m1Var.f403378o = cVar.f470327d;
                m1Var.c();
            }
        }
    }
}
