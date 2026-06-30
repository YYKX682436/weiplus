package sp2;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sp2.o2 o2Var) {
        super(0);
        this.f411103d = o2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sp2.o2 o2Var = this.f411103d;
        int i17 = 0;
        if (r26.n0.D(o2Var.V, "messageNotify", false, 2, null)) {
            i17 = 1;
        } else {
            java.lang.String str = o2Var.V;
            if (kotlin.jvm.internal.o.b(str, "closeGuidePreload")) {
                i17 = 3;
            } else if (kotlin.jvm.internal.o.b(str, "liveEndPage")) {
                i17 = 2;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
