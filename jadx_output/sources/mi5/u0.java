package mi5;

/* loaded from: classes9.dex */
public final class u0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326924a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326925b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.i f326926c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326924a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326924a = a17;
        c(null, this.f326926c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.i iVar = (fc5.i) pVar;
        fc5.i iVar2 = this.f326926c;
        this.f326926c = iVar;
        c(iVar2, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a5, code lost:
    
        if (r4 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (r13 == null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(fc5.i r18, fc5.i r19) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi5.u0.c(fc5.i, fc5.i):void");
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326926c;
    }
}
