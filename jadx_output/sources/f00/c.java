package f00;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.d f258291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f00.d dVar) {
        super(0);
        this.f258291d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        f00.v vVar = this.f258291d.f258294b;
        if (vVar != null && (u3Var = ((f00.u) vVar).f258328b) != null) {
            u3Var.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
