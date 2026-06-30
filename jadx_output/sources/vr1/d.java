package vr1;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.w0 f439554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vr1.o oVar, in5.w0 w0Var) {
        super(0);
        this.f439553d = oVar;
        this.f439554e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vr1.o oVar = this.f439553d;
        xr1.e eVar = (xr1.e) kz5.n0.a0(oVar.P6().f152065o, this.f439554e.f293151d);
        android.widget.TextView textView = oVar.f439586h;
        if (textView != null) {
            textView.setText(eVar != null ? eVar.f456186f : null);
        }
        return jz5.f0.f302826a;
    }
}
