package mi5;

/* loaded from: classes9.dex */
public final class s0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326914a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326915b;

    /* renamed from: c, reason: collision with root package name */
    public se5.a f326916c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326914a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326914a = a17;
        c(null, this.f326916c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        se5.a aVar = (se5.a) pVar;
        se5.a aVar2 = this.f326916c;
        this.f326916c = aVar;
        c(aVar2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (ot0.f.f((r8 == null || (r8 = (r05.g) r8.getCustom(r8.f432315e + 25)) == null) ? -1 : r8.o()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(se5.a r17, se5.a r18) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi5.s0.c(se5.a, se5.a):void");
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326916c;
    }
}
