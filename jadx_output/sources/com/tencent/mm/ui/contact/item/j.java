package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public final class j implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f206883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.m f206884b;

    public j(com.tencent.mm.ui.contact.item.m mVar, boolean z17) {
        this.f206884b = mVar;
        this.f206883a = z17;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        com.tencent.mm.ui.contact.item.i iVar = (com.tencent.mm.ui.contact.item.i) ((jz5.n) this.f206884b.E).getValue();
        kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.ChatroomMemberDataItem.ChatroomMemberViewHolder");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        iVar.f206878b = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.mie);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.CheckBox");
        iVar.f206879c = (android.widget.CheckBox) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        iVar.f206880d = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        iVar.f206881e = (android.widget.TextView) findViewById4;
        iVar.f206877a = inflate.findViewById(com.tencent.mm.R.id.mjc);
        inflate.setTag(iVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    @Override // com.tencent.mm.ui.contact.item.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Context r6, com.tencent.mm.ui.contact.item.b r7, com.tencent.mm.ui.contact.item.d r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof com.tencent.mm.ui.contact.item.i
            if (r6 == 0) goto L98
            boolean r6 = r8 instanceof com.tencent.mm.ui.contact.item.m
            if (r6 == 0) goto L98
            com.tencent.mm.ui.contact.item.m r8 = (com.tencent.mm.ui.contact.item.m) r8
            java.lang.String r6 = r8.f206819z
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L1d
            int r6 = r6.length()
            if (r6 <= 0) goto L18
            r6 = r0
            goto L19
        L18:
            r6 = r1
        L19:
            if (r6 != r0) goto L1d
            r6 = r0
            goto L1e
        L1d:
            r6 = r1
        L1e:
            if (r6 == 0) goto L42
            r6 = r7
            com.tencent.mm.ui.contact.item.i r6 = (com.tencent.mm.ui.contact.item.i) r6
            android.widget.ImageView r2 = r6.f206878b
            if (r2 != 0) goto L28
            goto L2d
        L28:
            java.lang.String r3 = r8.f206819z
            r2.setTag(r3)
        L2d:
            java.lang.Class<kv.z> r2 = kv.z.class
            i95.m r2 = i95.n0.c(r2)
            kv.z r2 = (kv.z) r2
            android.widget.ImageView r6 = r6.f206878b
            java.lang.String r3 = r8.f206819z
            r4 = 1036831949(0x3dcccccd, float:0.1)
            com.tencent.mm.feature.avatar.w r2 = (com.tencent.mm.feature.avatar.w) r2
            r2.Ri(r6, r3, r4)
            goto L4f
        L42:
            r6 = r7
            com.tencent.mm.ui.contact.item.i r6 = (com.tencent.mm.ui.contact.item.i) r6
            android.widget.ImageView r6 = r6.f206878b
            if (r6 == 0) goto L4f
            r2 = 2131232202(0x7f0805ca, float:1.8080507E38)
            r6.setImageResource(r2)
        L4f:
            com.tencent.mm.ui.contact.item.i r7 = (com.tencent.mm.ui.contact.item.i) r7
            android.widget.CheckBox r6 = r7.f206879c
            if (r6 == 0) goto L8a
            boolean r2 = r5.f206883a
            if (r2 == 0) goto L82
            r6.setVisibility(r1)
            r2 = 2131235243(0x7f0811ab, float:1.8086674E38)
            r6.setBackgroundResource(r2)
            if (r9 == 0) goto L7b
            r6.setChecked(r0)
            r6.setEnabled(r1)
            boolean r9 = com.tencent.mm.ui.bk.C()
            if (r9 == 0) goto L74
            r9 = 2131689979(0x7f0f01fb, float:1.9008989E38)
            goto L77
        L74:
            r9 = 2131689978(0x7f0f01fa, float:1.9008987E38)
        L77:
            r6.setBackgroundResource(r9)
            goto L8a
        L7b:
            r6.setChecked(r10)
            r6.setEnabled(r0)
            goto L8a
        L82:
            if (r6 != 0) goto L85
            goto L8a
        L85:
            r9 = 8
            r6.setVisibility(r9)
        L8a:
            java.lang.CharSequence r6 = r8.f206818y
            android.widget.TextView r9 = r7.f206880d
            com.tencent.mm.plugin.fts.ui.n3.a(r6, r9)
            java.lang.CharSequence r6 = r8.G
            android.widget.TextView r7 = r7.f206881e
            com.tencent.mm.plugin.fts.ui.n3.a(r6, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.item.j.c(android.content.Context, com.tencent.mm.ui.contact.item.b, com.tencent.mm.ui.contact.item.d, boolean, boolean):void");
    }
}
