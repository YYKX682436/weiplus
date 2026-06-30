package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class t0 extends com.tencent.mm.ui.conversation.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.HashMap f208071J;
    public final java.util.List K;

    public t0(android.content.Context context, java.lang.String str, com.tencent.mm.ui.y9 y9Var) {
        super(context, y9Var);
        new android.graphics.Paint();
        this.f208071J = new java.util.HashMap();
        this.K = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public java.lang.String B() {
        return ".conbox";
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        s(((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, null, "conversationboxservice", -1));
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void v(java.lang.String str, com.tencent.mm.ui.conversation.n2 n2Var) {
        int dimensionPixelOffset;
        float f17;
        float f18;
        float f19;
        java.lang.CharSequence charSequence;
        java.util.HashMap hashMap = this.f208071J;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = ab5.c0.c(ab5.c0.b(str));
            if (!android.text.TextUtils.isEmpty(str2)) {
                hashMap.put(str, str2);
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) n2Var.f207886c.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.weight = 0.0f;
            n2Var.f207886c.setLayoutParams(layoutParams);
        } else {
            n2Var.f207887d.setVisibility(0);
            n2Var.f207887d.setText(this.f212608e.getString(com.tencent.mm.R.string.f490297r2, str2));
            int i17 = this.f212608e.getResources().getDisplayMetrics() != null ? this.f212608e.getResources().getDisplayMetrics().widthPixels : 0;
            int i18 = n2Var.f207888e.getLayoutParams().width;
            if (i65.a.D(this.f212608e)) {
                dimensionPixelOffset = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479891i4);
                if (i18 < 0) {
                    i18 = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479618at);
                }
            } else {
                dimensionPixelOffset = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479892i5);
                if (i18 < 0) {
                    i18 = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479619au);
                }
            }
            int dimensionPixelOffset2 = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479866hf) * 2;
            int dimensionPixelOffset3 = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479866hf);
            com.tencent.mm.ui.conversation.l2 l2Var = (com.tencent.mm.ui.conversation.l2) this.f207911p.get(str);
            java.lang.String charSequence2 = (l2Var == null || (charSequence = l2Var.f207826a) == null) ? "" : charSequence.toString();
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = n2Var.f207886c;
            float measureText = ((noMeasuredTextView == null || charSequence2 == null) ? 0.0f : noMeasuredTextView.getPaint().measureText(charSequence2)) + 48.0f;
            com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView2 = n2Var.f207886c;
            if (noMeasuredTextView2 == null || com.tencent.mm.sdk.platformtools.t8.K0(charSequence2)) {
                f17 = 0.0f;
            } else {
                java.lang.String str3 = charSequence2.substring(0, charSequence2.offsetByCodePoints(0, 1)) + "…";
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "getMinTextWidth, minText: " + str3);
                f17 = noMeasuredTextView2.getPaint().measureText(str3);
            }
            float min = (int) java.lang.Math.min(measureText, f17 + 48.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "nickNameMinWidth:%f", java.lang.Float.valueOf(min));
            int dimensionPixelOffset4 = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479619au);
            int dimensionPixelOffset5 = this.f212608e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479877hq);
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "screenWidth:%d, avatarLayoutWidth:%d, timeTVWidth:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(dimensionPixelOffset), java.lang.Integer.valueOf(i18));
            float f27 = i17 > 0 ? ((((i17 - dimensionPixelOffset) - dimensionPixelOffset2) - i18) - dimensionPixelOffset3) - dimensionPixelOffset5 : 0.0f;
            if (measureText <= f27 && measureText < f27 && f27 > 0.0f) {
                f19 = java.lang.Math.min(measureText / f27, (f27 - dimensionPixelOffset4) / f27);
                f18 = 1.0f - f19;
            } else {
                f18 = 0.4f;
                f19 = 0.6f;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "nickNameParentRemainWidth: %f, nicknameTVWeight:%f, sourceTVWeight:%f", java.lang.Float.valueOf(f27), java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f18));
            if (f27 > 0.0f) {
                float min2 = java.lang.Math.min(1.0f, min / f27);
                if (min2 > f19) {
                    f18 = 1.0f - min2;
                    f19 = min2;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "weight fixed, nicknameTVWeight:%f, sourceTVWeight:%f", java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f18));
            if (z65.c.a()) {
                n2Var.f207886c.post(new com.tencent.mm.ui.conversation.s0(this, n2Var, (int) (dimensionPixelOffset5 + f27), (int) (f27 * f19)));
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) n2Var.f207886c.getLayoutParams();
            layoutParams2.width = 0;
            layoutParams2.weight = f19;
            n2Var.f207886c.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) n2Var.f207887d.getLayoutParams();
            layoutParams3.width = 0;
            layoutParams3.weight = f18;
            n2Var.f207887d.setLayoutParams(layoutParams3);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(n2Var.f207885b, str, 0.1f);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.K;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void y(com.tencent.mm.ui.conversation.l2 l2Var, com.tencent.mm.storage.l4 l4Var, com.tencent.mm.ui.conversation.n2 n2Var, android.view.View view) {
    }
}
