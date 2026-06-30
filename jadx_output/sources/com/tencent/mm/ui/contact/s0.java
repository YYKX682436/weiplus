package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class s0 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f207163o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f207164p;

    /* renamed from: q, reason: collision with root package name */
    public bb5.g f207165q;

    /* renamed from: r, reason: collision with root package name */
    public bb5.e f207166r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b0 f207167s;

    public s0(android.content.Context context, java.lang.String str) {
        super(context, new com.tencent.mm.storage.z3());
        this.f207163o = null;
        com.tencent.mm.ui.base.MMSlideDelView.getItemStatusCallBack();
        this.f207165q = null;
        this.f207166r = null;
        this.f207164p = (com.tencent.mm.ui.MMActivity) context;
        this.f207163o = str;
        this.f207165q = new bb5.g(15, new com.tencent.mm.ui.contact.p0(this));
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
        com.tencent.mm.storage.z3 L = ((com.tencent.mm.storage.k4) q17).L(cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME)));
        if (L != null) {
            return L;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(cursor);
        ((com.tencent.mm.storage.k4) c01.d9.b().q()).s0(z3Var, false);
        return z3Var;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return j().getCount();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.contact.r0 r0Var;
        android.view.View view2;
        if (this.f207166r == null) {
            this.f207166r = new com.tencent.mm.ui.contact.q0(this);
        }
        bb5.g gVar = this.f207165q;
        if (gVar != null) {
            gVar.b(i17, this.f207166r);
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f207164p;
        if (view == null) {
            view2 = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.f488399s9, null);
            r0Var = new com.tencent.mm.ui.contact.r0();
            r0Var.f207148b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.cfx);
            r0Var.f207147a = (com.tencent.mm.ui.base.MaskLayout) view2.findViewById(com.tencent.mm.R.id.cfu);
            r0Var.f207149c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f483914cg1);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view2.findViewById(com.tencent.mm.R.id.f483913cg0);
            r0Var.f207150d = viewGroup2;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = (int) (i65.a.f(mMActivity, com.tencent.mm.R.dimen.f479613ao) * i65.a.A(mMActivity));
            r0Var.f207150d.setLayoutParams(layoutParams);
            view2.setTag(r0Var);
        } else {
            r0Var = (com.tencent.mm.ui.contact.r0) view.getTag();
            view2 = view;
        }
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) getItem(i17 - 1);
        int W0 = z3Var == null ? -1 : z3Var.W0();
        com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) getItem(i17);
        if (i17 == 0) {
            java.lang.String t17 = t(z3Var2, i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", z3Var2.d1(), java.lang.Integer.valueOf(i17));
                r0Var.f207148b.setVisibility(8);
            } else {
                r0Var.f207148b.setVisibility(0);
                r0Var.f207148b.setText(t17);
                r0Var.f207148b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            if (getItem(i17 + 1) == null) {
                r0Var.f207150d.setBackgroundResource(0);
            }
        } else if (i17 <= 0 || z3Var2.W0() == W0) {
            r0Var.f207148b.setVisibility(8);
            u(r0Var, i17, W0);
        } else {
            java.lang.String t18 = t(z3Var2, i17);
            r0Var.f207150d.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(t18)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", z3Var2.d1(), java.lang.Integer.valueOf(i17));
                r0Var.f207148b.setVisibility(8);
            } else {
                r0Var.f207148b.setVisibility(0);
                r0Var.f207148b.setText(t18);
                if (z3Var2.W0() == 32) {
                    r0Var.f207148b.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bk6, 0, 0, 0);
                    r0Var.f207148b.setCompoundDrawablePadding(2);
                } else {
                    r0Var.f207148b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
            u(r0Var, i17, W0);
        }
        r0Var.f207149c.setTextColor(i65.a.e(mMActivity, !c01.e2.D(z3Var2.d1()) ? com.tencent.mm.R.color.f479413yk : com.tencent.mm.R.color.f479414yl));
        android.widget.ImageView imageView = (android.widget.ImageView) r0Var.f207147a.getContentView();
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, z3Var2.d1(), null);
        if (imageView.getDrawable() instanceof com.tencent.mm.pluginsdk.ui.a0) {
            com.tencent.mm.pluginsdk.ui.a0 a0Var = (com.tencent.mm.pluginsdk.ui.a0) imageView.getDrawable();
            com.tencent.mm.pluginsdk.ui.b0 b0Var = this.f207167s;
            if (b0Var != null) {
                b0Var.f189904e.add(new java.lang.ref.WeakReference(a0Var));
            }
        }
        r0Var.f207147a.setMaskDrawable(null);
        try {
            if (c01.e2.R(z3Var2.d1())) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d17 = z3Var2.d1();
                ((sg3.a) v0Var).getClass();
                android.text.SpannableString bj6 = ((ke0.e) xVar).bj(mMActivity, c01.a2.e(d17), (int) r0Var.f207149c.getTextSize());
                j41.b0 b0Var2 = (j41.b0) i95.n0.c(j41.b0.class);
                android.widget.TextView textView = r0Var.f207149c;
                l41.q2 q2Var = (l41.q2) b0Var2;
                q2Var.getClass();
                if (textView instanceof com.tencent.mm.ui.base.EllipsizeTextView) {
                    com.tencent.mm.ui.base.EllipsizeTextView ellipsizeTextView = (com.tencent.mm.ui.base.EllipsizeTextView) textView;
                    ellipsizeTextView.setLayoutCallback(q2Var.f315908f);
                    ellipsizeTextView.b(bj6, " ", -1, (int) textView.getTextSize());
                } else {
                    textView.setText(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(mMActivity, bj6));
                }
            } else {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String d18 = z3Var2.d1();
                ((sg3.a) v0Var2).getClass();
                r0Var.f207149c.setText(((ke0.e) xVar2).bj(mMActivity, c01.a2.e(d18), (int) r0Var.f207149c.getTextSize()));
            }
        } catch (java.lang.Exception unused) {
            r0Var.f207149c.setText("");
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public synchronized void q() {
        android.database.Cursor y17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).y(this.f207163o, "", null, null, false, false);
        c();
        s(y17);
        notifyDataSetChanged();
    }

    public java.lang.String t(com.tencent.mm.storage.z3 z3Var, int i17) {
        return z3Var.W0() == 31 ? "" : z3Var.W0() == 43 ? this.f207164p.getString(com.tencent.mm.R.string.i4y) : java.lang.String.valueOf((char) z3Var.W0());
    }

    public final void u(com.tencent.mm.ui.contact.r0 r0Var, int i17, int i18) {
        int i19 = i17 + 1;
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) getItem(i19);
        if (z3Var == null || !(z3Var.W0() == i18 || com.tencent.mm.sdk.platformtools.t8.K0(t(z3Var, i19)))) {
            r0Var.f207150d.setBackgroundResource(0);
        }
    }
}
