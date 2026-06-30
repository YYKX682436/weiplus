package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k80 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final zl2.u4 f118822d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f118823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f118824f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f118825g;

    public k80(com.tencent.mm.plugin.finder.live.view.k0 pluginLayout, zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        this.f118822d = uiMode;
        this.f118823e = new java.util.ArrayList();
        this.f118824f = 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f118823e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.finder.live.widget.f80) ((java.util.ArrayList) this.f118823e).get(i17)).f118327a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        r45.px1 px1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof com.tencent.mm.plugin.finder.live.widget.j80) || (px1Var = ((com.tencent.mm.plugin.finder.live.widget.f80) ((java.util.ArrayList) this.f118823e).get(i17)).f118328b) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.j80 j80Var = (com.tencent.mm.plugin.finder.live.widget.j80) holder;
        j80Var.f118733e.setText(java.lang.String.valueOf(i17));
        java.lang.String str = px1Var.f383456h;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        j80Var.f118736h.setText(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        r45.xn1 xn1Var = px1Var.f383452d;
        java.lang.String nickname = (xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getNickname();
        android.widget.TextView textView = j80Var.f118734f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, nickname, textSize));
        boolean z17 = px1Var.f383457i;
        android.widget.TextView textView2 = j80Var.f118735g;
        if (z17) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.oul);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            int i18 = px1Var.f383453e;
            java.lang.String string2 = i18 == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ouh, px1Var.f383455g, string, java.lang.Integer.valueOf(i18)) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.oug, px1Var.f383455g, string, java.lang.Integer.valueOf(i18));
            kotlin.jvm.internal.o.d(string2);
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int parseColor = android.graphics.Color.parseColor("#4dffffff");
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L != -1) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(parseColor), L, string.length() + L, 33);
            }
            textView2.setText(spannableString);
        } else {
            int i19 = px1Var.f383453e;
            textView2.setText(i19 == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nvo, px1Var.f383455g, java.lang.Integer.valueOf(i19)) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nvn, px1Var.f383455g, java.lang.Integer.valueOf(i19)));
        }
        android.view.View view = j80Var.itemView;
        com.tencent.mm.plugin.finder.live.widget.k80 k80Var = j80Var.f118738m;
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.h80(k80Var, px1Var));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.O2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        r45.xn1 xn1Var2 = px1Var.f383452d;
        if (xn1Var2 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null && (username = finderContact.getUsername()) != null) {
            str2 = username;
        }
        gVar.h("rank_username", str2);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        j80Var.itemView.post(new com.tencent.mm.plugin.finder.live.widget.i80(px1Var, j80Var, k80Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.ebz, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.plugin.finder.live.widget.g80(this, inflate);
        }
        android.view.View inflate2 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.ebx, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new com.tencent.mm.plugin.finder.live.widget.j80(this, inflate2);
    }
}
