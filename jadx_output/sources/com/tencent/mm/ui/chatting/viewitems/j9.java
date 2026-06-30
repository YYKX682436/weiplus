package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class j9 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f204240b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f204241c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f204242d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f204243e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f204244f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f204245g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f204246h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f204247i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f204248j;

    /* renamed from: k, reason: collision with root package name */
    public int f204249k = 0;

    public com.tencent.mm.ui.chatting.viewitems.j9 a(android.view.View view, boolean z17) {
        super.create(view);
        this.clickArea = this.convertView.findViewById(com.tencent.mm.R.id.bkg);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f204241c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bj6);
        this.f204242d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bj8);
        this.f204240b = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.bj7);
        this.f204245g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f485147gq4);
        this.f204243e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483640bj5);
        this.f204244f = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f483639bj4);
        this.f204246h = (com.tencent.mm.ui.widget.MMNeat7extView) view.findViewById(com.tencent.mm.R.id.pum);
        this.f204247i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.puk);
        this.f204248j = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.pul);
        this.f204249k = com.tencent.mm.ui.chatting.w5.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    public void b(com.tencent.mm.ui.chatting.viewitems.j9 j9Var, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, boolean z17) {
        int i17;
        int i18;
        android.graphics.Bitmap bitmap;
        int i19;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameShareViewHolder", "null == content");
            return;
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(v17, java.lang.Long.valueOf(f9Var.I0()), 1);
        j9Var.resetChatBubbleWidth(j9Var.clickArea, j9Var.f204249k);
        java.lang.String str2 = v17.f348654f;
        if (str2 == null || str2.length() <= 0) {
            j9Var.f204240b.setVisibility(8);
        } else {
            j9Var.f204240b.setMaxLines(2);
            j9Var.f204240b.setText(v17.m());
            j9Var.f204240b.setVisibility(0);
        }
        j9Var.f204246h.setVisibility(8);
        j9Var.f204247i.setMaxLines(3);
        j9Var.f204247i.setText(v17.f348658g);
        j9Var.f204247i.setVisibility(0);
        com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = (com.tencent.mm.pluginsdk.ui.tools.g0) v17.y(com.tencent.mm.pluginsdk.ui.tools.g0.class);
        java.lang.String str3 = v17.f348646d;
        if (str3 == null || str3.length() == 0) {
            i17 = 0;
            j9Var.f204245g.setVisibility(0);
            i18 = 8;
            j9Var.f204244f.setVisibility(8);
            j9Var.f204243e.setVisibility(8);
            j9Var.f204248j.setVisibility(8);
        } else {
            j9Var.f204245g.setVisibility(0);
            j9Var.f204248j.setVisibility(0);
            j9Var.f204244f.setImageResource(com.tencent.mm.R.drawable.f481228nu);
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(v17.f348646d, 2, i65.a.g(dVar.g()));
            if (Di == null || Di.isRecycled()) {
                i19 = 0;
            } else {
                j9Var.f204244f.setVisibility(0);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = j9Var.f204244f;
                weImageView.setIconColor(dVar.g().getResources().getColor(com.tencent.mm.R.color.a9e));
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(Di);
                int dimension = (int) dVar.s().getDimension(com.tencent.mm.R.dimen.f479930ja);
                i19 = 0;
                bitmapDrawable.setBounds(0, 0, dimension, dimension);
                weImageView.setImageDrawable(bitmapDrawable);
                weImageView.setImageBitmap(Di);
            }
            j9Var.f204243e.setVisibility(i19);
            java.lang.String str4 = v17.H;
            if (str4 == null) {
                j9Var.f204243e.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(dVar.g(), v17.f348646d));
            } else {
                j9Var.f204243e.setText(str4);
            }
            if (g0Var.f191637i == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameShareViewHolder", "johnjh begin expose");
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(f9Var.Q0(), f9Var.getMsgId());
                ot0.q v18 = ot0.q.v(f9Var.U1());
                if (v18 != null) {
                    com.tencent.mm.pluginsdk.ui.tools.g0 g0Var2 = (com.tencent.mm.pluginsdk.ui.tools.g0) v18.y(com.tencent.mm.pluginsdk.ui.tools.g0.class);
                    g0Var2.f191637i = 1;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    v18.f(g0Var2);
                    g0Var2.c(sb6, v18, null, null, 0, 0);
                    com.tencent.mm.ui.chatting.viewitems.o9.a(sb6, Li);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), Li, true);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(g0Var.f191638j)) {
                    java.lang.String str5 = g0Var.f191634f;
                    m63.g gVar = (m63.g) i95.n0.c(m63.g.class);
                    com.tencent.mm.ui.chatting.viewitems.i9 i9Var = new com.tencent.mm.ui.chatting.viewitems.i9(f9Var);
                    l63.h hVar = (l63.h) gVar;
                    hVar.getClass();
                    r45.f73 f73Var = new r45.f73();
                    f73Var.f374073d = str5;
                    com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                    lVar.f70664a = f73Var;
                    lVar.f70667d = 5020;
                    lVar.f70666c = "/cgi-bin/mmgame-bin/gameshareappsvr/gamesharefirstexpose";
                    lVar.f70665b = new r45.g73();
                    i17 = 0;
                    lVar.f70668e = 0;
                    lVar.f70669f = 0;
                    com.tencent.mm.modelbase.z2.d(lVar.a(), new l63.g(hVar, i9Var), false);
                } else {
                    i17 = 0;
                }
            } else {
                i17 = 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameShareViewHolder", "johnjh isexposed");
            }
            i18 = 8;
        }
        if (g0Var.f191635g == 1) {
            j9Var.f204242d.setVisibility(i17);
        } else {
            j9Var.f204242d.setVisibility(i18);
        }
        if (com.tencent.mm.ui.chatting.viewitems.s1.a(f9Var, f9Var.z0())) {
            bitmap = null;
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            bitmap = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(dVar.g()), false);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            j9Var.f204241c.setImageResource(com.tencent.mm.R.color.f478816i1);
        } else {
            j9Var.f204241c.setImageBitmap(bitmap);
        }
        j9Var.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), j9Var, null));
        j9Var.clickArea.setOnClickListener(a0Var.w(dVar));
        j9Var.clickArea.setOnLongClickListener(a0Var.u(dVar));
        j9Var.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
    }
}
