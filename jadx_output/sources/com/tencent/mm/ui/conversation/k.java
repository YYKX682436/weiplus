package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class k extends com.tencent.mm.ui.conversation.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f207792J;
    public java.util.HashMap K;
    public final com.tencent.mm.sdk.event.IListener L;
    public final java.util.HashMap M;
    public final java.util.List N;

    public k(android.content.Context context, java.lang.String str, com.tencent.mm.ui.y9 y9Var) {
        super(context, y9Var);
        new android.graphics.Paint();
        this.f207792J = str;
        this.K = new java.util.HashMap();
        this.M = new java.util.HashMap();
        this.N = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$AppBrandConversationAdapter$1
            {
                this.__eventId = 495598387;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent onWxaOptionsChangedEvent) {
                am.gn gnVar = onWxaOptionsChangedEvent.f54587g;
                java.lang.String str2 = gnVar.f6783a;
                if (str2 != null) {
                    boolean z17 = (gnVar.f6784b & 2) > 0;
                    com.tencent.mm.ui.conversation.k kVar = com.tencent.mm.ui.conversation.k.this;
                    kVar.K.remove(str2);
                    kVar.K.put(gnVar.f6783a, java.lang.Boolean.valueOf(z17));
                    kVar.notifyDataSetChanged();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ConversationAdapter", "OnWxaOptionsChangedEvent event.brandId is null");
                }
                return true;
            }
        };
        this.L = iListener;
        iListener.alive();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        s(((com.tencent.mm.storage.m4) c01.d9.b().r()).s(4, null, this.f207792J, -1));
        com.tencent.mm.ui.y9 y9Var = this.f212611h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void v(java.lang.String str, com.tencent.mm.ui.conversation.n2 n2Var) {
        boolean booleanValue;
        java.lang.String str2;
        int dimensionPixelOffset;
        float f17;
        float f18;
        float f19;
        java.lang.CharSequence charSequence;
        java.lang.Boolean bool = (java.lang.Boolean) this.K.get(str);
        if (bool == null) {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
            booleanValue = Bi != null && (Bi.field_appOpt & 2) > 0;
            this.K.put(str, bool);
        } else {
            booleanValue = bool.booleanValue();
        }
        java.util.HashMap hashMap = this.M;
        java.lang.String str3 = (java.lang.String) hashMap.get(str);
        if (android.text.TextUtils.isEmpty(str3)) {
            str3 = ab5.c0.c(ab5.c0.b(str));
            if (!android.text.TextUtils.isEmpty(str3)) {
                hashMap.put(str, str3);
            }
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) n2Var.f207886c.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.weight = 0.0f;
            n2Var.f207886c.setLayoutParams(layoutParams);
        } else {
            n2Var.f207887d.setVisibility(0);
            n2Var.f207887d.setText(this.f212608e.getString(com.tencent.mm.R.string.f490297r2, str3));
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
                java.lang.String str4 = charSequence2.substring(0, charSequence2.offsetByCodePoints(0, 1)) + "…";
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationAdapter", "getMinTextWidth, minText: " + str4);
                f17 = noMeasuredTextView2.getPaint().measureText(str4);
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
                n2Var.f207886c.post(new com.tencent.mm.ui.conversation.j(this, n2Var, (int) (dimensionPixelOffset5 + f27), (int) (f27 * f19)));
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
        if (booleanValue) {
            n2Var.f207891h.setVisibility(0);
            n2Var.f207891h.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.chat_reject_title_icon : com.tencent.mm.R.raw.chat_reject_icon);
            if (n2Var.f207887d.getVisibility() == 0) {
                str2 = ((java.lang.Object) n2Var.f207886c.getText()) + ", " + ((java.lang.Object) n2Var.f207887d.getText()) + ", " + ((java.lang.Object) n2Var.f207888e.getText()) + ", " + ((java.lang.Object) n2Var.f207889f.getText()) + ", " + this.f212608e.getString(com.tencent.mm.R.string.f490197no);
            } else {
                str2 = ((java.lang.Object) n2Var.f207886c.getText()) + ", " + ((java.lang.Object) n2Var.f207888e.getText()) + ", " + ((java.lang.Object) n2Var.f207889f.getText()) + ", " + this.f212608e.getString(com.tencent.mm.R.string.f490197no);
            }
            n2Var.f207884a.setContentDescription(str2);
        } else {
            n2Var.f207891h.setVisibility(8);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(n2Var.f207885b, str);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.N;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.tencent.mm.ui.conversation.o2
    public void w() {
        this.K = null;
        this.L.dead();
    }
}
