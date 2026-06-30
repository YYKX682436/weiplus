package on2;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f346826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f346827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(on2.j1 j1Var, r45.dz1 dz1Var) {
        super(0);
        this.f346826d = j1Var;
        this.f346827e = dz1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        on2.j1 j1Var = this.f346826d;
        java.util.Iterator it = j1Var.f346945d.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((r45.dz1) it.next()).getInteger(0) == this.f346827e.getInteger(0)) {
                break;
            }
            i17++;
        }
        if (i17 >= 0 && i17 < j1Var.getItemCount()) {
            z17 = true;
        }
        if (z17) {
            j1Var.notifyItemChanged(i17, 1);
        }
        return jz5.f0.f302826a;
    }
}
