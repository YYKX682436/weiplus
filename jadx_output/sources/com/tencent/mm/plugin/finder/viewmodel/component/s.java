package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class s extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f135845e;

    public static final void n(com.tencent.mm.plugin.finder.viewmodel.component.s sVar, android.content.Context context, java.lang.String str, boolean z17) {
        sVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.z1.c(so2.z1.f410730a, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), str, z17 ? 1 : 2, -1L, null, false, 31, null, 6, 0L, 640, null);
        ya2.g gVar = ya2.h.f460484a;
        l75.e0 e0Var = ya2.b2.O2;
        gVar.i(str, z17 ? ya2.b2.Q2 : 0);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.adc;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, in5.c r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.s.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.kbf);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) p17);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) holder.p(com.tencent.mm.R.id.e0a);
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
        int dimensionPixelSize = recyclerView2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        int dimensionPixelSize2 = recyclerView2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize3 = recyclerView2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        android.content.Context context = recyclerView2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView2.setAdapter(new com.tencent.mm.plugin.finder.viewmodel.component.j(this, context, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3));
        recyclerView2.N(new com.tencent.mm.plugin.finder.viewmodel.component.k(this, dimensionPixelSize, dimensionPixelSize2));
        android.content.Context context2 = recyclerView2.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        java.lang.String stringExtra = ((com.tencent.mm.ui.MMActivity) context2).getIntent().getStringExtra("profile_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.gak);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        ym5.a1.h(p18, new com.tencent.mm.plugin.finder.viewmodel.component.q(holder, stringExtra));
        holder.p(com.tencent.mm.R.id.gak).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.r(holder, this, stringExtra));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(in5.s0 r6, com.tencent.mm.plugin.finder.viewmodel.component.t r7) {
        /*
            r5 = this;
            r0 = 2131308822(0x7f093116, float:1.823591E38)
            android.view.View r0 = r6.p(r0)
            r1 = 2131308853(0x7f093135, float:1.8235973E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131308821(0x7f093115, float:1.8235908E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f135948d
            java.lang.String r7 = r7.getUsername()
            if (r7 != 0) goto L23
            java.lang.String r7 = ""
        L23:
            ya2.g r3 = ya2.h.f460484a
            ya2.b2 r7 = r3.b(r7)
            r3 = 0
            if (r7 == 0) goto L36
            int r7 = r7.field_follow_Flag
            l75.e0 r4 = ya2.b2.O2
            int r4 = ya2.b2.Q2
            if (r7 != r4) goto L36
            r7 = 1
            goto L37
        L36:
            r7 = r3
        L37:
            android.content.Context r6 = r6.f293121e
            if (r7 != 0) goto L6b
            r7 = 8
            r2.setVisibility(r7)
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131099790(0x7f06008e, float:1.7811943E38)
            int r7 = r7.getColor(r2)
            r0.setBackgroundColor(r7)
            android.content.Context r7 = r0.getContext()
            r0 = 2131762531(0x7f101d63, float:1.9156142E38)
            java.lang.String r7 = r7.getString(r0)
            r1.setText(r7)
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131102740(0x7f060c14, float:1.7817926E38)
            int r6 = r6.getColor(r7)
            r1.setTextColor(r6)
            goto L98
        L6b:
            r2.setVisibility(r3)
            android.content.res.Resources r7 = r6.getResources()
            r2 = 2131101578(0x7f06078a, float:1.781557E38)
            int r7 = r7.getColor(r2)
            android.content.res.Resources r6 = r6.getResources()
            r2 = 2131099698(0x7f060032, float:1.7811757E38)
            int r6 = r6.getColor(r2)
            r0.setBackgroundColor(r7)
            android.content.Context r7 = r0.getContext()
            r0 = 2131762562(0x7f101d82, float:1.9156204E38)
            java.lang.String r7 = r7.getString(r0)
            r1.setText(r7)
            r1.setTextColor(r6)
        L98:
            kotlin.jvm.internal.o.d(r1)
            com.tencent.mm.ui.fk.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.s.o(in5.s0, com.tencent.mm.plugin.finder.viewmodel.component.t):void");
    }
}
