package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes3.dex */
public final class FinderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public final java.util.List M;
    public final java.util.List N;
    public android.view.View P;
    public final com.tencent.mm.ui.MMActivity Q;
    public r45.nw6 R;
    public boolean S;
    public android.view.View T;

    public FinderPreference(android.content.Context context) {
        this(context, null);
        this.Q = (com.tencent.mm.ui.MMActivity) context;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.preference.FinderPreference.M():void");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        java.util.List list = this.M;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9p));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9q));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9r));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9s));
        java.util.List list2 = this.N;
        ((java.util.LinkedList) list2).clear();
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_g));
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_h));
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_i));
        ((java.util.LinkedList) list2).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_j));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482920rt);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            textView.setText(this.L);
            com.tencent.mm.ui.fk.b(textView);
            android.content.Context context = this.f197770d;
            textView.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479850gz));
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(context, com.tencent.mm.R.dimen.f479786f7);
            textView.setLayoutParams(layoutParams);
        }
        this.P = view.findViewById(com.tencent.mm.R.id.f482890qy);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fuv);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484433qj3);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.e_c);
        r45.nw6 nw6Var = this.R;
        com.tencent.mm.ui.MMActivity mMActivity = this.Q;
        if (nw6Var != null && nw6Var.getInteger(1) == 0) {
            int size = this.R.getList(2).size();
            int size2 = this.R.getList(6).size();
            if (size > 0 || size2 > 0) {
                ((android.widget.LinearLayout.LayoutParams) ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m38)).getLayoutParams()).topMargin = i65.a.b(mMActivity, 19);
            } else {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.topMargin = i65.a.b(mMActivity, 0);
                layoutParams2.gravity = 16;
            }
        }
        for (int i17 = 0; i17 < ((java.util.LinkedList) list).size(); i17++) {
            ((android.widget.ImageView) ((java.util.LinkedList) list).get(i17)).getLayoutParams().height = i65.a.b(mMActivity, 48);
        }
        for (int i18 = 0; i18 < ((java.util.LinkedList) list2).size(); i18++) {
            ((android.widget.ImageView) ((java.util.LinkedList) list2).get(i18)).getLayoutParams().height = i65.a.b(mMActivity, 12);
        }
        r45.nw6 nw6Var2 = this.R;
        if (nw6Var2 != null && ((com.tencent.mm.protocal.protobuf.FinderContact) nw6Var2.getCustom(0)) != null) {
            textView2.setText(((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getNickname());
            textView2.setVisibility(0);
            if (((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo() != null && ((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo().getAuthProfession() != null && ((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo().getAuthProfession().length() > 0) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.m1.f460511a.c(imageView, ((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo(), 1);
                textView3.setText(((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo().getAuthProfession());
                textView3.setVisibility(0);
                float B = i65.a.B(mMActivity) - i65.a.b(mMActivity, 148);
                float measureText = textView2.getPaint().measureText(((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getNickname());
                float measureText2 = textView3.getPaint().measureText(((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo().getAuthProfession());
                float f17 = B / 2.0f;
                if (measureText >= f17 && measureText2 >= f17) {
                    int i19 = (int) f17;
                    textView2.setMaxWidth(i19);
                    textView3.setMaxWidth(i19);
                } else if (measureText > measureText2) {
                    textView2.setMaxWidth((int) (B - measureText2));
                } else if (imageView.getVisibility() == 0) {
                    textView3.setMaxWidth((int) ((B - measureText) - i65.a.b(mMActivity, 24)));
                } else {
                    textView3.setMaxWidth((int) (B - measureText));
                }
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        hashMap.put("finder_tab_context_id", b52.b.c());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        hashMap.put("finder_context_id", b52.b.b());
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        hashMap.put("comment_scene", a52.a.f1584l);
        if (((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)) != null) {
            hashMap.put("author_finder_username", ((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getUsername());
            if (((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo() != null) {
                hashMap.put("authentication_type", ((com.tencent.mm.protocal.protobuf.FinderContact) this.R.getCustom(0)).getAuthInfo().getAuthProfession());
            }
        }
        hashMap.put("display_style", 1);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(view, 40, 1, false);
        cy1.a aVar2 = (cy1.a) aVar.ik(view, 40, 25496);
        aVar2.pk(view, "wx_business_card_sph_inlet");
        aVar2.gk(view, hashMap);
        M();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.T == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.tencent.mm.R.layout.bze, viewGroup2);
            this.T = u17;
        }
        return this.T;
    }

    public FinderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.Q = (com.tencent.mm.ui.MMActivity) context;
    }

    public FinderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = new java.util.LinkedList();
        this.N = new java.util.LinkedList();
        this.R = null;
        this.S = false;
        this.Q = (com.tencent.mm.ui.MMActivity) context;
        this.L = context.getString(com.tencent.mm.R.string.cfj);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
