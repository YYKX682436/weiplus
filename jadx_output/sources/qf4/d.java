package qf4;

/* loaded from: classes4.dex */
public final class d extends qf4.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f362685d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f362686e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f362687f;

    /* renamed from: g, reason: collision with root package name */
    public final qf4.k f362688g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.GridLayoutManager f362689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qf4.f f362690i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qf4.f fVar, android.view.View view) {
        super(fVar, view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f362690i = fVar;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f482906rf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f362685d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f482905re);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f362686e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f482903rc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f362687f = (androidx.recyclerview.widget.RecyclerView) findViewById3;
        this.f362688g = new qf4.k();
        this.f362689h = new androidx.recyclerview.widget.GridLayoutManager(view.getContext(), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    @Override // qf4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r15) {
        /*
            r14 = this;
            qf4.f r0 = r14.f362690i
            java.util.ArrayList r1 = r0.f362695h
            java.lang.Object r1 = r1.get(r15)
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            qf4.h r1 = (qf4.h) r1
            r2 = 1
            if (r15 <= 0) goto L2e
            java.util.ArrayList r3 = r0.f362695h
            int r15 = r15 - r2
            java.lang.Object r3 = r3.get(r15)
            qf4.h r3 = (qf4.h) r3
            java.lang.String r3 = r3.f362701a
            java.lang.String r4 = r0.f362692e
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.D0(r3, r4)
            if (r3 != 0) goto L2e
            java.util.ArrayList r3 = r0.f362695h
            java.lang.Object r15 = r3.get(r15)
            qf4.h r15 = (qf4.h) r15
            goto L2f
        L2e:
            r15 = 0
        L2f:
            r0.getClass()
            android.widget.TextView r3 = r14.f362686e
            r4 = 0
            r3.setVisibility(r4)
            java.lang.String r11 = r1.f362701a
            java.lang.String r6 = ":"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            int r5 = r26.n0.L(r5, r6, r7, r8, r9, r10)
            java.util.List r1 = r1.f362702b
            r6 = -1
            r12 = 8
            android.widget.TextView r13 = r14.f362685d
            if (r5 == r6) goto Lad
            java.lang.String r5 = ":"
            java.lang.String[] r6 = new java.lang.String[]{r5}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            java.util.List r5 = r26.n0.f0(r5, r6, r7, r8, r9, r10)
            int r6 = r5.size()
            r7 = 2
            if (r6 != r7) goto Lb3
            java.lang.Object r2 = r5.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            if (r15 == 0) goto L83
            java.util.List r15 = r15.f362702b
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L78
            goto L83
        L78:
            java.lang.Object r15 = r15.get(r4)
            nf4.h r15 = (nf4.h) r15
            nf4.j r15 = r15.f336854p
            int r15 = r15.L
            goto L84
        L83:
            r15 = r4
        L84:
            java.lang.Object r2 = r1.get(r4)
            nf4.h r2 = (nf4.h) r2
            nf4.j r2 = r2.f336854p
            int r2 = r2.L
            java.lang.Object r3 = r5.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            int r15 = r15 / 10000
            int r2 = r2 / 10000
            if (r15 != 0) goto L9e
            int r5 = r0.f362696i
            if (r2 != r5) goto La2
        L9e:
            if (r15 == 0) goto La9
            if (r2 == r15) goto La9
        La2:
            r13.setVisibility(r4)
            r13.setText(r3)
            goto Lb3
        La9:
            r13.setVisibility(r12)
            goto Lb3
        Lad:
            r3.setText(r11)
            r13.setVisibility(r12)
        Lb3:
            androidx.recyclerview.widget.GridLayoutManager r15 = r14.f362689h
            androidx.recyclerview.widget.RecyclerView r2 = r14.f362687f
            r2.setLayoutManager(r15)
            qf4.k r15 = r14.f362688g
            r2.setAdapter(r15)
            yz5.l r0 = r0.f362699o
            r15.f362709e = r0
            java.lang.String r0 = "datas"
            kotlin.jvm.internal.o.g(r1, r0)
            java.util.ArrayList r0 = r15.f362708d
            r0.clear()
            r0.addAll(r1)
            r15.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf4.d.i(int):void");
    }
}
