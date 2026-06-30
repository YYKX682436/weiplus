package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class l5 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f204390i = ((int) i65.a.g(com.tencent.mm.sdk.platformtools.i.a())) * 64;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f204391b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f204392c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f204393d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f204394e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f204395f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f204396g;

    /* renamed from: h, reason: collision with root package name */
    public int f204397h = 0;

    public com.tencent.mm.ui.chatting.viewitems.l5 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f204396g = z17;
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.f204391b = (com.tencent.mm.ui.MMImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483260a42);
        this.f204392c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483261a43);
        this.f204393d = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483259a41);
        this.f204394e = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3z);
        this.f204395f = this.convertView.findViewById(com.tencent.mm.R.id.f483258a40);
        this.f204397h = com.tencent.mm.ui.chatting.w5.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        return this;
    }

    public void b(com.tencent.mm.storage.f9 f9Var, android.content.Context context, ot0.q qVar, java.lang.String str) {
        resetChatBubbleWidthWithNewStyle(this.clickArea, this.f204397h);
        int i17 = qVar.f348666i;
        int i18 = f204390i;
        if (i17 == 16) {
            this.f204392c.setText(qVar.f348658g);
            this.f204393d.setText(qVar.V0);
            this.f204391b.setVisibility(0);
            n11.a b17 = n11.a.b();
            java.lang.String str2 = qVar.f348734z;
            com.tencent.mm.ui.MMImageView mMImageView = this.f204391b;
            o11.f fVar = new o11.f();
            fVar.f342101y = com.tencent.mm.ui.chatting.viewitems.o5.a();
            fVar.f342086j = i18;
            fVar.f342087k = i18;
            fVar.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
            fVar.f342096t = true;
            b17.h(str2, mMImageView, fVar.a());
            return;
        }
        if (i17 != 34) {
            this.f204392c.setText(qVar.f348658g);
            this.f204393d.setText(qVar.V0);
            this.f204391b.setVisibility(0);
            n11.a b18 = n11.a.b();
            java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, str, true);
            com.tencent.mm.ui.MMImageView mMImageView2 = this.f204391b;
            o11.f fVar2 = new o11.f();
            fVar2.f342101y = com.tencent.mm.ui.chatting.viewitems.o5.a();
            fVar2.f342085i = 1;
            fVar2.f342086j = i18;
            fVar2.f342087k = i18;
            fVar2.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
            fVar2.f342096t = true;
            b18.h(mj6, mMImageView2, fVar2.a());
            return;
        }
        java.lang.String str3 = qVar.f348654f;
        if (str3 == null || str3.length() <= 0) {
            this.f204392c.setVisibility(8);
        } else {
            this.f204392c.setVisibility(0);
            this.f204392c.setText(qVar.f348654f);
            if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348648d1)) {
                this.f204392c.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            } else {
                this.f204392c.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(qVar.f348648d1, context.getResources().getColor(com.tencent.mm.R.color.a0c)));
            }
        }
        this.f204393d.setMaxLines(2);
        this.f204393d.setVisibility(0);
        this.f204393d.setText(qVar.f348658g);
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348652e1)) {
            this.f204393d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479211sz));
        } else {
            this.f204393d.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(qVar.f348652e1, context.getResources().getColor(com.tencent.mm.R.color.f479211sz)));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.Z0)) {
            this.f204394e.setText(com.tencent.mm.R.string.b3b);
        } else {
            this.f204394e.setText(qVar.Z0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348644c1)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            android.graphics.Bitmap m07 = m11.b1.Di().m0(f9Var, str, i65.a.g(context), false);
            if (m07 == null || m07.isRecycled()) {
                n11.a b19 = n11.a.b();
                java.lang.String str4 = qVar.f348734z;
                com.tencent.mm.ui.MMImageView mMImageView3 = this.f204391b;
                o11.f fVar3 = new o11.f();
                fVar3.f342101y = com.tencent.mm.ui.chatting.viewitems.o5.a();
                fVar3.f342086j = i18;
                fVar3.f342087k = i18;
                fVar3.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
                fVar3.f342096t = true;
                b19.h(str4, mMImageView3, fVar3.a());
            } else {
                this.f204391b.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(m07, false, m07.getWidth() / 2));
            }
            this.f204395f.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.ui.chatting.viewitems.k5(this, context, m07));
            return;
        }
        n11.a b27 = n11.a.b();
        java.lang.String str5 = qVar.f348734z;
        com.tencent.mm.ui.MMImageView mMImageView4 = this.f204391b;
        o11.f fVar4 = new o11.f();
        fVar4.f342101y = com.tencent.mm.ui.chatting.viewitems.o5.a();
        fVar4.f342086j = i18;
        fVar4.f342087k = i18;
        fVar4.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
        fVar4.f342096t = true;
        b27.h(str5, mMImageView4, fVar4.a());
        n11.a b28 = n11.a.b();
        java.lang.String str6 = qVar.f348644c1;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        o11.f fVar5 = new o11.f();
        fVar5.f342101y = com.tencent.mm.ui.chatting.viewitems.o5.a();
        fVar5.f342078b = true;
        b28.i(str6, imageView, fVar5.a(), new com.tencent.mm.ui.chatting.viewitems.j5(this, context));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.convertView;
    }
}
