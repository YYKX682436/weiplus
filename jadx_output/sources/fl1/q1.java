package fl1;

/* loaded from: classes3.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.r1 f263848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(fl1.r1 r1Var) {
        super(1);
        this.f263848d = r1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList changed = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(changed, "changed");
        java.util.Iterator it = changed.iterator();
        while (it.hasNext()) {
            this.f263848d.notifyItemChanged(((java.lang.Number) it.next()).intValue());
        }
        return jz5.f0.f302826a;
    }
}
