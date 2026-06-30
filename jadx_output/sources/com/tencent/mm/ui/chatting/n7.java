package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class n7 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f202011o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f202012p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f202013q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f202014r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.l7 f202015s;

    public n7(android.content.Context context, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, boolean z17) {
        super(context, f9Var);
        this.f202011o = str;
        this.f202012p = str2;
        this.f202014r = z17;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        if (f9Var == null) {
            f9Var = new com.tencent.mm.storage.f9();
        }
        f9Var.convertFrom(cursor);
        return f9Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.chatting.m7 m7Var;
        if (view == null) {
            view = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.cit, null);
            m7Var = new com.tencent.mm.ui.chatting.m7(null);
            m7Var.f201949a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
            m7Var.f201950b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
            m7Var.f201951c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.otg);
            m7Var.f201952d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jue);
            view.setTag(m7Var);
        } else {
            m7Var = (com.tencent.mm.ui.chatting.m7) view.getTag();
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) getItem(i17);
        if (f9Var != null) {
            if (this.f202014r && f9Var.A0() == 0) {
                java.lang.String j17 = f9Var.j();
                java.lang.String s17 = c01.w9.s(j17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(m7Var.f201949a, s17, null);
                    android.widget.TextView textView = m7Var.f201950b;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = this.f212608e;
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    java.lang.String e17 = c01.a2.e(s17);
                    float textSize = m7Var.f201950b.getTextSize();
                    ((ke0.e) xVar).getClass();
                    textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize));
                }
                m7Var.f201951c.setText(t(f9Var));
                java.lang.String u17 = c01.w9.u(j17);
                android.widget.TextView textView2 = m7Var.f201952d;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = this.f212608e;
                float textSize2 = m7Var.f201952d.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, u17, textSize2));
            } else {
                android.widget.ImageView imageView = m7Var.f201949a;
                int A0 = f9Var.A0();
                java.lang.String str = this.f202012p;
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, A0 == 1 ? str : this.f202011o, null);
                android.widget.TextView textView3 = m7Var.f201950b;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context3 = this.f212608e;
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                if (f9Var.A0() != 1) {
                    str = this.f202011o;
                }
                ((sg3.a) v0Var).getClass();
                java.lang.String e18 = c01.a2.e(str);
                float textSize3 = m7Var.f201950b.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, e18, textSize3));
                m7Var.f201951c.setText(t(f9Var));
                android.widget.TextView textView4 = m7Var.f201952d;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context4 = this.f212608e;
                java.lang.String j18 = f9Var.j();
                float textSize4 = m7Var.f201952d.getTextSize();
                ((ke0.e) xVar4).getClass();
                textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context4, j18, textSize4));
            }
        }
        return view;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        android.database.Cursor B;
        xg3.m0 u17 = c01.d9.b().u();
        final java.lang.String str = this.f202011o;
        final java.lang.String str2 = this.f202013q;
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) u17;
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            B = ot0.c3.l().c("getCursorByFilter", new yz5.a() { // from class: com.tencent.mm.storage.g9$$x6
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.Q(com.tencent.mm.storage.g9.this.f193989r, X8, str, str2, 1L);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$y6
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                    g9Var2.getClass();
                    return g9Var2.f193989r.B(("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND content LIKE '%" + str2 + "%' AND type = 1") + " ORDER BY createTime DESC", null);
                }
            });
        } else if (g9Var.Pb(X8)) {
            B = ot0.z2.f348822a.Q(g9Var.f193989r, X8, str, str2, 1L);
        } else {
            B = g9Var.f193989r.B(("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND content LIKE '%" + str2 + "%' AND type = 1") + " ORDER BY createTime DESC", null);
        }
        s(B);
        if (this.f202015s != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f202013q)) {
            this.f202015s.a(getCount());
        }
        notifyDataSetChanged();
    }

    public java.lang.CharSequence t(com.tencent.mm.storage.f9 f9Var) {
        return f9Var.getCreateTime() == com.tencent.wcdb.core.Database.DictDefaultMatchValue ? "" : k35.m1.f(this.f212608e, f9Var.getCreateTime(), true, false);
    }
}
