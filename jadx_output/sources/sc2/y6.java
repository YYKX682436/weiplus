package sc2;

/* loaded from: classes2.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(ad2.h hVar, int i17, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f406392d = hVar;
        this.f406393e = i17;
        this.f406394f = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xc2.p0 p0Var;
        java.lang.Object obj2;
        ad2.h thatObserver = (ad2.h) obj;
        kotlin.jvm.internal.o.g(thatObserver, "thatObserver");
        if (!kotlin.jvm.internal.o.b(thatObserver, this.f406392d) && (p0Var = thatObserver.f3147h) != null) {
            java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.wf6) obj2).getInteger(2) == p0Var.f453257s) {
                    break;
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj2;
            if (wf6Var != null) {
                if (this.f406393e == wf6Var.getInteger(14) / 1000) {
                    this.f406394f.f310123d = thatObserver;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
