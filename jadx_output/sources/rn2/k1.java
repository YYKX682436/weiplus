package rn2;

/* loaded from: classes15.dex */
public final class k1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397784a;

    public k1(rn2.t2 t2Var) {
        this.f397784a = t2Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        rn2.t2 t2Var = this.f397784a;
        rn2.f fVar = t2Var.f397854f;
        t2Var.u(fVar != null ? ((rn2.c1) fVar).f() : false, 2);
    }
}
