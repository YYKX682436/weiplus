package rv3;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv3.e f400379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f400380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv3.h f400381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rv3.e eVar, in5.s0 s0Var, rv3.h hVar) {
        super(1);
        this.f400379d = eVar;
        this.f400380e = s0Var;
        this.f400381f = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView it = (android.widget.TextView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ev3.b bVar = this.f400379d.f400385f;
        if (bVar != null) {
            in5.s0 s0Var = this.f400380e;
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            bVar.X(itemView, this.f400381f, s0Var.getAdapterPosition());
        }
        return jz5.f0.f302826a;
    }
}
