package lm4;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f319558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(lm4.i0 i0Var) {
        super(1);
        this.f319558d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lm4.b0 it = (lm4.b0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        lm4.i0 i0Var = this.f319558d;
        java.util.Iterator it6 = i0Var.f319576o.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it6.next()).b();
        }
        i0Var.f319576o.clear();
        return jz5.f0.f302826a;
    }
}
