package f0;

/* loaded from: classes16.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {
    public final /* synthetic */ rv3.h C;
    public final /* synthetic */ rv3.e D;
    public final /* synthetic */ in5.s0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(rv3.h hVar, rv3.e eVar, in5.s0 s0Var) {
        super(1);
        this.C = hVar;
        this.D = eVar;
        this.E = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView favBtn = (android.widget.TextView) obj;
        kotlin.jvm.internal.o.g(favBtn, "favBtn");
        rv3.h hVar = this.C;
        boolean z17 = !hVar.f400395d.L;
        rv3.e eVar = this.D;
        eVar.w(favBtn, z17);
        ev3.b bVar = eVar.f400385f;
        if (bVar != null) {
            in5.s0 s0Var = this.E;
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            bVar.h(itemView, hVar, s0Var.getAdapterPosition(), z17);
        }
        return jz5.f0.f302826a;
    }
}
