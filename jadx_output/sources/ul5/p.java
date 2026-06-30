package ul5;

/* loaded from: classes9.dex */
public final class p implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f428638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f428639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ul5.x f428640c;

    public p(com.tencent.mm.ui.widget.picker.c0 c0Var, android.widget.TextView textView, ul5.x xVar) {
        this.f428638a = c0Var;
        this.f428639b = textView;
        this.f428640c = xVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f428638a;
        c0Var.d();
        if (z17) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            this.f428639b.setText((java.lang.CharSequence) obj);
        }
        ul5.y.f428662f = c0Var.b();
        this.f428640c.f428656t = c0Var.b();
    }
}
