package in2;

/* loaded from: classes10.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.v0 f292886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.q0 f292887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(in2.v0 v0Var, in2.q0 q0Var) {
        super(3);
        this.f292886d = v0Var;
        this.f292887e = q0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        dk2.yg musicItem = (dk2.yg) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(musicItem, "musicItem");
        java.util.Iterator it = this.f292887e.f292880f.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((dk2.yg) it.next()).f234396d) {
                z17 = true;
                break;
            }
        }
        this.f292886d.f0(z17);
        return jz5.f0.f302826a;
    }
}
