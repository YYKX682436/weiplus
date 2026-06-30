package mi5;

/* loaded from: classes9.dex */
public final class e1 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.f1 f326826a;

    /* renamed from: b, reason: collision with root package name */
    public oe5.c f326827b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.f1 f1Var = this.f326826a;
        android.view.View view = f1Var != null ? f1Var.f254309a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ehy, (android.view.ViewGroup) null);
        this.f326826a = new em.f1(inflate);
        c(null, this.f326827b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        oe5.c cVar = (oe5.c) pVar;
        oe5.c cVar2 = this.f326827b;
        this.f326827b = cVar;
        c(cVar2, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r4 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(oe5.c r10, oe5.c r11) {
        /*
            r9 = this;
            em.f1 r10 = r9.f326826a
            if (r11 == 0) goto L91
            if (r10 == 0) goto L91
            l15.c r0 = r11.j()
            if (r0 == 0) goto L91
            v05.b r0 = r0.k()
            if (r0 != 0) goto L14
            goto L91
        L14:
            android.view.View r1 = r10.f254309a
            android.content.Context r2 = r1.getContext()
            pt0.e0 r3 = pt0.f0.f358209b1
            int r4 = r11.f43702d
            int r5 = r4 + 1
            java.lang.String r5 = r11.getString(r5)
            r6 = 0
            int r4 = r4 + r6
            long r7 = r11.getLong(r4)
            com.tencent.mm.storage.f9 r3 = r3.n(r5, r7)
            java.lang.String r4 = r11.getThumbPath()
            r5 = 1
            if (r4 == 0) goto L42
            int r7 = r4.length()
            if (r7 <= 0) goto L3c
            r6 = r5
        L3c:
            if (r6 == 0) goto L3f
            goto L40
        L3f:
            r4 = 0
        L40:
            if (r4 != 0) goto L5f
        L42:
            java.lang.Class<k70.y> r4 = k70.y.class
            i95.m r4 = i95.n0.c(r4)
            k70.y r4 = (k70.y) r4
            j70.e r4 = (j70.e) r4
            r4.getClass()
            m11.l0 r4 = m11.b1.Di()
            java.lang.String r6 = r3.z0()
            if (r6 != 0) goto L5b
            java.lang.String r6 = ""
        L5b:
            java.lang.String r4 = r4.D2(r3, r6, r5)
        L5f:
            kotlin.jvm.internal.o.d(r2)
            com.tencent.mm.plugin.ting.widget.MusicView r5 = new com.tencent.mm.plugin.ting.widget.MusicView
            r5.<init>(r2)
            r45.zs4 r0 = r35.f4.a(r4, r0)
            r5.c(r0)
            android.widget.FrameLayout r0 = r10.f254310b
            if (r0 != 0) goto L7d
            r0 = 2131301826(0x7f0915c2, float:1.822172E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.f254310b = r0
        L7d:
            android.widget.FrameLayout r10 = r10.f254310b
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r0.<init>(r2, r2)
            r10.addView(r5, r0)
            mi5.d1 r10 = new mi5.d1
            r10.<init>(r11, r3)
            r1.setOnClickListener(r10)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mi5.e1.c(oe5.c, oe5.c):void");
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326827b;
    }
}
