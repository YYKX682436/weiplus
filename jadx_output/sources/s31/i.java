package s31;

/* loaded from: classes12.dex */
public final class i implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.LinearLayout f402454a;

    /* renamed from: b, reason: collision with root package name */
    public s31.j f402455b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f402454a == null) {
            this.f402454a = new android.widget.LinearLayout(context);
            c(null, this.f402455b);
        }
        android.widget.LinearLayout linearLayout = this.f402454a;
        kotlin.jvm.internal.o.d(linearLayout);
        return linearLayout;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        s31.j jVar = (s31.j) pVar;
        s31.j jVar2 = this.f402455b;
        this.f402455b = jVar;
        c(jVar2, jVar);
    }

    public final void c(s31.j jVar, s31.j jVar2) {
        an5.d dVar;
        an5.c cVar;
        an5.d dVar2;
        an5.c cVar2;
        an5.d dVar3;
        an5.c cVar3;
        an5.d dVar4;
        an5.c cVar4;
        android.widget.LinearLayout linearLayout = this.f402454a;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOrientation(jVar2 != null ? jVar2.f402456d : 0);
        linearLayout.setGravity(17);
        float f17 = 0.0f;
        int a17 = ym5.x.a(linearLayout.getContext(), (jVar2 == null || (dVar4 = jVar2.f402457e) == null || (cVar4 = dVar4.f8879a) == null) ? 0.0f : cVar4.f8878a);
        int a18 = ym5.x.a(linearLayout.getContext(), (jVar2 == null || (dVar3 = jVar2.f402457e) == null || (cVar3 = dVar3.f8880b) == null) ? 0.0f : cVar3.f8878a);
        int a19 = ym5.x.a(linearLayout.getContext(), (jVar2 == null || (dVar2 = jVar2.f402457e) == null || (cVar2 = dVar2.f8881c) == null) ? 0.0f : cVar2.f8878a);
        android.content.Context context = linearLayout.getContext();
        if (jVar2 != null && (dVar = jVar2.f402457e) != null && (cVar = dVar.f8882d) != null) {
            f17 = cVar.f8878a;
        }
        linearLayout.setPadding(a17, a18, a19, ym5.x.a(context, f17));
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f402455b;
    }
}
