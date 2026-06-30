package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bm extends com.tencent.mm.ui.z9 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f167953x = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f167954o;

    /* renamed from: p, reason: collision with root package name */
    public int f167955p;

    /* renamed from: q, reason: collision with root package name */
    public db5.f6 f167956q;

    /* renamed from: r, reason: collision with root package name */
    public db5.b6 f167957r;

    /* renamed from: s, reason: collision with root package name */
    public db5.e6 f167958s;

    /* renamed from: t, reason: collision with root package name */
    public gc4.a f167959t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f167960u;

    /* renamed from: v, reason: collision with root package name */
    public final db5.c6 f167961v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f167962w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, android.content.Context context, com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        super(context, v1Var);
        this.f167962w = snsMsgUI;
        new java.util.HashSet();
        this.f167961v = new com.tencent.mm.plugin.sns.ui.cm(this);
        com.tencent.mm.ui.zk.a(context, 14);
        this.f167954o = 10;
        this.f167955p = 10;
        this.f167960u = new java.util.HashMap();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "adapter created");
    }

    public final boolean A(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        boolean z17 = false;
        if (snsInfo == null || !snsInfo.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return false;
        }
        boolean z18 = snsInfo.field_type == 1;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f167962w;
        boolean z19 = snsMsgUI.f167286z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (z19 && z18 && (snsInfo.isCardAd() || snsInfo.isCombinedGridAD() || snsInfo.isDynamicAD() || snsInfo.getAdXml().isNormalAd())) {
            z17 = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isAdLoadBigImage, isPhotoStyle is ");
        sb6.append(z18);
        sb6.append(", isLoadBigImage is");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        sb6.append(snsMsgUI.f167286z);
        sb6.append(", ret is ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdLoadBigImage", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return z17;
    }

    public void B(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markSnsIdForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        ((java.util.HashMap) this.f167960u).put(str, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markSnsIdForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    public final int C(int i17, com.tencent.mm.ui.MMImageView mMImageView) {
        int oj6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDefaultImg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        if (i17 != 15) {
            if (i17 != 42 && i17 != 47) {
                if (i17 != 54) {
                    oj6 = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
                    switch (i17) {
                        case 2:
                            mMImageView.setImageDrawable(null);
                            oj6 = -1;
                            break;
                        case 6:
                            oj6 = com.tencent.mm.R.raw.app_attach_file_icon_location;
                            break;
                        case 7:
                            oj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).mj();
                            break;
                        case 8:
                            mMImageView.setImageDrawable(null);
                            oj6 = -1;
                            break;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultImg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                    return oj6;
                }
                oj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).mj();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultImg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                return oj6;
            }
            oj6 = com.tencent.mm.R.raw.music_default;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultImg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return oj6;
        }
        oj6 = ((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).oj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultImg", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return oj6;
    }

    public final void D(android.view.View view, android.widget.TextView textView, r45.k76 k76Var, long j17, java.lang.String str, final com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        android.graphics.drawable.Drawable q17;
        java.lang.String str2;
        int i17;
        int i18;
        android.text.SpannableString spannableString;
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMsgContent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        textView.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.L0(k76Var.f378474w) || k76Var.f378474w.get(0) == null) {
            textView.setTag(null);
        } else {
            textView.setTag(((r45.l86) k76Var.f378474w.get(0)).f379230d);
        }
        int[] iArr = new int[2];
        v1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        boolean z17 = (v1Var.field_commentflag & 1) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f167962w;
        if (z17) {
            textView.setText(com.tencent.mm.R.string.jcr);
            textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f, 8.0f}, new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f), null));
            shapeDrawable.getPaint().setColor(snsMsgUI.getResources().getColor(com.tencent.mm.R.color.f478842ip));
            textView.setBackground(shapeDrawable);
            textView.setTextColor(snsMsgUI.getResources().getColor(com.tencent.mm.R.color.FG_1));
            textView.setIncludeFontPadding(true);
            textView.setPadding(20, 2, 20, 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMsgContent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return;
        }
        textView.setTag(com.tencent.mm.R.id.n5q, "");
        textView.setTextColor(snsMsgUI.getResources().getColor(com.tencent.mm.R.color.a0c));
        textView.setBackgroundDrawable(null);
        textView.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        textView.setText("");
        textView.setCompoundDrawablePadding(0);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.v8_);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.v8s);
        viewGroup2.setVisibility(0);
        viewGroup.setVisibility(8);
        int i19 = k76Var.f378462h;
        xa4.b bVar = xa4.b.f452821a;
        if (i19 != 1) {
            com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
            if (i19 == 2 || i19 == 3) {
                java.lang.String str3 = k76Var.f378465n;
                str2 = str3 != null ? str3 : "";
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(v1Var.field_snsID);
                android.content.res.ColorStateList e17 = i65.a.e(this.f212608e, com.tencent.mm.R.color.f479515a62);
                android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(null, 1, (int) textView.getTextSize(), e17, e17);
                if (com.tencent.mm.plugin.sns.ui.widget.t2.i(k76Var.f378472u, 1)) {
                    if (y07 != null) {
                        gm0.j1.i();
                        com.tencent.mm.storage.z3 q18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(y07.field_userName);
                        spannableStringBuilder.append((java.lang.CharSequence) this.f212608e.getString(com.tencent.mm.R.string.jcw)).append((java.lang.CharSequence) q18.g2()).append((java.lang.CharSequence) ": ");
                        int length = this.f212608e.getString(com.tencent.mm.R.string.jcw).length();
                        iArr[0] = length;
                        iArr[1] = length + q18.g2().length();
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    spannableStringBuilder.append((java.lang.CharSequence) this.f212608e.getString(com.tencent.mm.R.string.jcx)).append((java.lang.CharSequence) str).append((java.lang.CharSequence) ": ");
                    int length2 = this.f212608e.getString(com.tencent.mm.R.string.jcx).length();
                    iArr[0] = length2;
                    iArr[1] = length2 + str.length();
                }
                r45.e86 r17 = com.tencent.mm.plugin.sns.ui.widget.q2.r(v1Var);
                boolean z18 = (com.tencent.mm.plugin.sns.ui.widget.q2.c(r17) || com.tencent.mm.plugin.sns.ui.widget.q2.e(r17)) ? false : true;
                if (z18) {
                    spannableStringBuilder.append((java.lang.CharSequence) str2).append((java.lang.CharSequence) " ");
                } else {
                    spannableStringBuilder.append((java.lang.CharSequence) str2);
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(snsMsgUI, spannableStringBuilder, textSize);
                int i27 = iArr[0];
                if (i27 >= 0 && (i17 = iArr[1]) > i27) {
                    j18.setSpan(textAppearanceSpan, i27, i17, 33);
                }
                if (z18) {
                    textView.setText(j18);
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(j18);
                    com.tencent.mm.plugin.sns.ui.widget.q2.l(this.f212608e, com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17), r17, spannableStringBuilder2, false, 5, new com.tencent.mm.plugin.sns.ui.widget.m() { // from class: com.tencent.mm.plugin.sns.ui.bm$$j
                        @Override // com.tencent.mm.plugin.sns.ui.widget.m
                        public final void a(r45.e86 e86Var) {
                            com.tencent.mm.plugin.sns.ui.bm bmVar = com.tencent.mm.plugin.sns.ui.bm.this;
                            bmVar.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setMsgContent$18", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                            com.tencent.mm.plugin.sns.ui.widget.r2.f171259a.i("view_clk", e86Var, com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(bmVar.f167962w, v1Var));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setMsgContent$18", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                        }
                    });
                    r2Var.i("view_exp", r17, com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(snsMsgUI, v1Var));
                    textView.setText(spannableStringBuilder2);
                }
            } else if (i19 == 4) {
                textView.setText(snsMsgUI.getString(com.tencent.mm.R.string.jgc));
            } else if (i19 != 5) {
                if (i19 == 7) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo a76 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.a7(snsMsgUI, v1Var);
                    if (a76 == null || !a76.isSocialAttitudeAd()) {
                        android.content.Context context = this.f212608e;
                        android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.friendactivity_likeicon, context.getResources().getColor(com.tencent.mm.R.color.f478524a5));
                        int h17 = i65.a.h(this.f212608e, com.tencent.mm.R.dimen.f479693cs);
                        e18.setBounds(0, 0, h17, h17);
                        android.text.SpannableString spannableString2 = new android.text.SpannableString(" ");
                        spannableString2.setSpan(new android.text.style.ImageSpan(e18), 0, 1, 18);
                        textView.setText(spannableString2);
                        textView.setContentDescription(snsMsgUI.getContext().getString(com.tencent.mm.R.string.ja9));
                    } else {
                        java.lang.String str4 = a76.getAdXml().adSocialInfo.cheerIcon;
                        if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(a76.getAdXml().adSocialInfo.cheerIconDark)) {
                            str4 = a76.getAdXml().adSocialInfo.cheerIconDark;
                        }
                        if (a76.isFireworkCheerAd()) {
                            str4 = a76.getAdXml().adSocialInfo.f325388m.e();
                            java.lang.String f17 = a76.getAdXml().adSocialInfo.f325388m.f();
                            if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                                str4 = f17;
                            }
                        }
                        textView.setTag(com.tencent.mm.R.id.n5q, str4);
                        a84.m.g(str4, new com.tencent.mm.plugin.sns.ui.am(textView, str4));
                    }
                } else if (i19 == 8) {
                    android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
                    java.lang.String str5 = k76Var.f378465n;
                    str2 = str5 != null ? str5 : "";
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo y08 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(v1Var.field_snsID);
                    android.content.res.ColorStateList e19 = i65.a.e(this.f212608e, com.tencent.mm.R.color.f479515a62);
                    android.text.style.TextAppearanceSpan textAppearanceSpan2 = new android.text.style.TextAppearanceSpan(null, 1, (int) textView.getTextSize(), e19, e19);
                    if (com.tencent.mm.plugin.sns.ui.widget.t2.i(k76Var.f378472u, 1)) {
                        if (y08 != null) {
                            gm0.j1.i();
                            com.tencent.mm.storage.z3 q19 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(y08.field_userName);
                            spannableStringBuilder3.append((java.lang.CharSequence) this.f212608e.getString(com.tencent.mm.R.string.jcw)).append((java.lang.CharSequence) q19.g2()).append((java.lang.CharSequence) ": ");
                            int length3 = this.f212608e.getString(com.tencent.mm.R.string.jcw).length();
                            iArr[0] = length3;
                            iArr[1] = length3 + q19.g2().length();
                        }
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        spannableStringBuilder3.append((java.lang.CharSequence) this.f212608e.getString(com.tencent.mm.R.string.jcx)).append((java.lang.CharSequence) str).append((java.lang.CharSequence) ": ");
                        int length4 = this.f212608e.getString(com.tencent.mm.R.string.jcx).length();
                        iArr[0] = length4;
                        iArr[1] = length4 + str.length();
                    }
                    final r45.e86 r18 = com.tencent.mm.plugin.sns.ui.widget.q2.r(v1Var);
                    boolean z19 = (com.tencent.mm.plugin.sns.ui.widget.q2.c(r18) || com.tencent.mm.plugin.sns.ui.widget.q2.e(r18)) ? false : true;
                    if (z19) {
                        spannableStringBuilder3.append((java.lang.CharSequence) str2).append((java.lang.CharSequence) " ");
                    } else {
                        spannableStringBuilder3.append((java.lang.CharSequence) str2);
                    }
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize2 = textView.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    android.text.SpannableString j19 = com.tencent.mm.pluginsdk.ui.span.c0.j(snsMsgUI, spannableStringBuilder3, textSize2);
                    int i28 = iArr[0];
                    if (i28 >= 0 && (i18 = iArr[1]) > i28) {
                        j19.setSpan(textAppearanceSpan2, i28, i18, 33);
                    }
                    if (z19) {
                        textView.setText(j19);
                    } else {
                        android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder(j19);
                        com.tencent.mm.plugin.sns.ui.widget.q2.l(this.f212608e, com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17), r18, spannableStringBuilder4, false, 5, new com.tencent.mm.plugin.sns.ui.widget.m() { // from class: com.tencent.mm.plugin.sns.ui.bm$$k
                            @Override // com.tencent.mm.plugin.sns.ui.widget.m
                            public final void a(r45.e86 e86Var) {
                                com.tencent.mm.plugin.sns.ui.bm bmVar = com.tencent.mm.plugin.sns.ui.bm.this;
                                bmVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setMsgContent$19", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                                com.tencent.mm.plugin.sns.ui.widget.r2.f171259a.i("view_clk", r18, com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(bmVar.f167962w, v1Var));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setMsgContent$19", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                            }
                        });
                        r2Var.i("view_exp", r18, com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(snsMsgUI, v1Var));
                        textView.setText(spannableStringBuilder4);
                    }
                } else if (i19 == 13) {
                    r45.vv3 vv3Var = new r45.vv3();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + k76Var.f378471t);
                    try {
                        vv3Var.parseFrom(x51.j1.d(k76Var.f378471t));
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "hbbuffer  " + vv3Var.f388604d);
                    } catch (java.lang.Exception e27) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUI", "parser hbbuffer " + e27.getMessage());
                    }
                    ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.ui.SnsMsgUI.Y6(snsMsgUI)).m(k76Var.f378458d);
                    if (vv3Var.f388604d == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2902", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2902", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        spannableString = new android.text.SpannableString(snsMsgUI.getString(com.tencent.mm.R.string.f492413gj4));
                        drawable = null;
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2902", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2902", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                        spannableString = new android.text.SpannableString(" " + snsMsgUI.getString(com.tencent.mm.R.string.f492412gj3, com.tencent.mm.sdk.platformtools.t8.t(vv3Var.f388604d / 100.0d)));
                        drawable = snsMsgUI.getResources().getDrawable(com.tencent.mm.R.drawable.f480758c0);
                    }
                    if (drawable != null) {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        al5.w wVar = new al5.w(drawable, 1);
                        drawable.getIntrinsicHeight();
                        textView.getTextSize();
                        i65.a.b(snsMsgUI, 2);
                        spannableString.setSpan(wVar, 0, 1, 33);
                    }
                    textView.setText(spannableString);
                } else if (i19 == 14) {
                    r45.vv3 vv3Var2 = new r45.vv3();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + k76Var.f378471t);
                    try {
                        vv3Var2.parseFrom(x51.j1.d(k76Var.f378471t));
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "hbbuffer  " + vv3Var2.f388604d);
                    } catch (java.lang.Exception e28) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnsMsgUI", "parser hbbuffer " + e28.getMessage());
                    }
                    textView.setText(snsMsgUI.getString(com.tencent.mm.R.string.f492411gj2, ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.ui.SnsMsgUI.Y6(snsMsgUI)).n(k76Var.f378458d, true).g2(), com.tencent.mm.sdk.platformtools.t8.t(vv3Var2.f388604d / 100.0d)));
                } else if (i19 == 16) {
                    java.lang.String str6 = "[" + snsMsgUI.getString(com.tencent.mm.R.string.j6k) + "]";
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("" + str6);
                    sb6.append(" ");
                    java.lang.String str7 = k76Var.f378465n;
                    sb6.append(str7 != null ? str7 : "");
                    java.lang.String sb7 = sb6.toString();
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    float textSize3 = textView.getTextSize();
                    ((ke0.e) xVar3).getClass();
                    android.text.SpannableString n17 = com.tencent.mm.pluginsdk.ui.span.c0.n(snsMsgUI, sb7, textSize3);
                    com.tencent.mm.plugin.sns.storage.SnsInfo a77 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.a7(snsMsgUI, v1Var);
                    if (a77 != null && a77.isFireworkCheerAd()) {
                        n17.setSpan(new android.text.style.ForegroundColorSpan(k84.d4.V.b(a77)), 0, str6.length(), 33);
                    }
                    final r45.e86 r19 = com.tencent.mm.plugin.sns.ui.widget.q2.r(v1Var);
                    if (com.tencent.mm.plugin.sns.ui.widget.q2.c(r19) || com.tencent.mm.plugin.sns.ui.widget.q2.e(r19)) {
                        android.text.SpannableStringBuilder spannableStringBuilder5 = new android.text.SpannableStringBuilder(n17);
                        com.tencent.mm.plugin.sns.ui.widget.q2.l(this.f212608e, com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17), r19, spannableStringBuilder5, false, 5, new com.tencent.mm.plugin.sns.ui.widget.m() { // from class: com.tencent.mm.plugin.sns.ui.bm$$m
                            @Override // com.tencent.mm.plugin.sns.ui.widget.m
                            public final void a(r45.e86 e86Var) {
                                com.tencent.mm.plugin.sns.ui.bm bmVar = com.tencent.mm.plugin.sns.ui.bm.this;
                                bmVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setMsgContent$20", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                                com.tencent.mm.plugin.sns.ui.widget.r2.f171259a.i("view_clk", r19, com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(bmVar.f167962w, v1Var));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setMsgContent$20", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                            }
                        });
                        r2Var.i("view_exp", r19, com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(snsMsgUI, v1Var));
                        textView.setText(spannableStringBuilder5);
                    } else {
                        textView.setText(n17);
                    }
                } else if (i19 == 19) {
                    textView.setText(snsMsgUI.getString(com.tencent.mm.R.string.jg_));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTogetherRedDotDefault", "com.tencent.mm.plugin.sns.model.SnsConfig");
                    boolean z27 = com.tencent.mm.sdk.platformtools.o4.L().getInt("sns_with_together_red", 0) == 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTogetherRedDotDefault", "com.tencent.mm.plugin.sns.model.SnsConfig");
                    if (z27) {
                        com.tencent.mm.sdk.platformtools.o4.L().A("sns_with_together_red", 1);
                    }
                } else if (i19 == 22) {
                    viewGroup2.setVisibility(8);
                    viewGroup.setVisibility(0);
                    boolean z28 = xa4.g.I() && xa4.g.i(java.lang.Integer.valueOf(k76Var.f378476y));
                    E(viewGroup, v1Var, z28);
                    bVar.f("view_exp", com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(snsMsgUI, v1Var), v1Var, true ^ z28);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMsgContent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(v1Var.field_snsID);
        if (W0 == null || W0.field_type != 7) {
            boolean z29 = xa4.g.I() && xa4.g.i(java.lang.Integer.valueOf(k76Var.f378476y));
            boolean i29 = com.tencent.mm.plugin.sns.ui.widget.t2.i(k76Var.f378472u, 131072);
            if (z29 && i29) {
                viewGroup2.setVisibility(8);
                viewGroup.setVisibility(0);
                if (xa4.g.f452830d.z()) {
                    bVar.e("view_exp", com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(snsMsgUI, v1Var), v1Var, v1Var.field_springWishFlag != 0);
                    F(viewGroup, v1Var);
                } else {
                    E(viewGroup, v1Var, z29);
                }
            } else {
                int h18 = i65.a.h(snsMsgUI.getContext(), com.tencent.mm.R.dimen.f479693cs);
                ca4.e1 e1Var = ca4.f1.f39897a;
                if (W0 != null) {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
                    android.content.Context context2 = this.f212608e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    kotlin.jvm.internal.o.g(context2, "context");
                    xa4.g gVar = xa4.g.f452830d;
                    q17 = e1Var.q(context2, gVar.y(timeLine), h18, h18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
                    if (gVar.y(timeLine)) {
                        textView.setContentDescription(snsMsgUI.getContext().getString(com.tencent.mm.R.string.m6s));
                    } else {
                        textView.setContentDescription(snsMsgUI.getContext().getString(com.tencent.mm.R.string.ja9));
                    }
                } else {
                    android.content.Context context3 = this.f212608e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
                    q17 = e1Var.q(context3, z29, h18, h18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIconDrawable", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
                    textView.setContentDescription(snsMsgUI.getContext().getString(com.tencent.mm.R.string.ja9));
                }
                android.text.SpannableString spannableString3 = new android.text.SpannableString(" ");
                spannableString3.setSpan(new android.text.style.ImageSpan(q17), 0, 1, 18);
                textView.setText(spannableString3);
            }
        } else {
            textView.setText(snsMsgUI.getString(com.tencent.mm.R.string.jc9));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMsgContent", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    public final void E(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.sns.storage.v1 v1Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReceiveCnyBlessLayout", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        ((android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f487044v94)).setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.v96);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.v97);
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f167962w;
        if (z17) {
            weImageView.setIconColor(i65.a.d(snsMsgUI.getContext(), com.tencent.mm.R.color.af9));
            textView.setTextColor(i65.a.d(snsMsgUI.getContext(), com.tencent.mm.R.color.af9));
        } else {
            weImageView.setIconColor(i65.a.d(snsMsgUI.getContext(), com.tencent.mm.R.color.a0c));
            textView.setTextColor(i65.a.d(snsMsgUI.getContext(), com.tencent.mm.R.color.a0c));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReceiveCnyBlessLayout", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    public final void F(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSendCnyBlessLayout", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.f487044v94);
        viewGroup2.setVisibility(0);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.v96);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.v97);
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f167962w;
        weImageView.setIconColor(i65.a.d(snsMsgUI.getContext(), com.tencent.mm.R.color.af9));
        textView.setTextColor(i65.a.d(snsMsgUI.getContext(), com.tencent.mm.R.color.af9));
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f487045v95);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.f487042v92);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.f487043v93);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.f487041v91);
        if (v1Var.field_springWishFlag == 0) {
            viewGroup2.setBackgroundResource(com.tencent.mm.R.drawable.d98);
            com.tencent.mm.plugin.sns.storage.v1 v1Var2 = new com.tencent.mm.plugin.sns.storage.v1();
            v1Var2.convertFrom(v1Var.convertTo(), true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter", "setSendCnyBlessLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/sns/storage/SnsComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter", "setSendCnyBlessLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/sns/storage/SnsComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView2.setVisibility(0);
            weImageView3.setVisibility(4);
            textView2.setTextColor(i65.a.d(this.f212608e, com.tencent.mm.R.color.af9));
            textView2.setText(i65.a.r(this.f212608e, com.tencent.mm.R.string.okb));
            viewGroup2.setOnClickListener(new com.tencent.mm.plugin.sns.ui.im(this, v1Var2, viewGroup2, weImageView2, weImageView3, viewGroup, v1Var));
        } else {
            viewGroup2.setBackgroundResource(com.tencent.mm.R.drawable.d99);
            weImageView3.clearAnimation();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter", "setSendCnyBlessLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/sns/storage/SnsComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter", "setSendCnyBlessLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/sns/storage/SnsComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setTextColor(i65.a.d(this.f212608e, com.tencent.mm.R.color.amr));
            textView2.setText(i65.a.r(this.f212608e, com.tencent.mm.R.string.okc));
            viewGroup2.setOnClickListener(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSendCnyBlessLayout", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.lang.String r7, android.widget.TextView r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "setSourceIcon"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "isStranger"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r3 = 0
            r4 = 1
            if (r10 == r4) goto L4a
            r5 = 2
            if (r10 == r5) goto L4a
            r5 = 3
            if (r10 == r5) goto L45
            r5 = 4
            if (r10 == r5) goto L41
            r5 = 5
            if (r10 == r5) goto L45
            r5 = 7
            if (r10 == r5) goto L3d
            r5 = 8
            if (r10 == r5) goto L3d
            r5 = 13
            if (r10 == r5) goto L3d
            r5 = 14
            if (r10 == r5) goto L3d
            r5 = 16
            if (r10 == r5) goto L3d
            r5 = 19
            if (r10 == r5) goto L41
            r5 = 22
            if (r10 == r5) goto L4a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L48
        L3d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L4d
        L41:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L4d
        L45:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L48:
            r3 = r4
            goto L4d
        L4a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L4d:
            r10 = 0
            if (r3 == 0) goto La6
            int r2 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z
            java.lang.String r2 = "access$2500"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsMsgUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.SnsMsgUI r4 = r6.f167962w
            java.lang.String r4 = r4.f167275o
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L67
            goto La6
        L67:
            r7 = 18
            if (r9 == r7) goto L96
            switch(r9) {
                case 22: goto L8c;
                case 23: goto L8c;
                case 24: goto L8c;
                case 25: goto L82;
                case 26: goto L8c;
                case 27: goto L8c;
                case 28: goto L8c;
                case 29: goto L8c;
                case 30: goto L78;
                default: goto L6e;
            }
        L6e:
            android.content.Context r7 = r6.f212608e
            r9 = 2131235660(0x7f08134c, float:1.808752E38)
            android.graphics.drawable.Drawable r7 = i65.a.i(r7, r9)
            goto L9f
        L78:
            android.content.Context r7 = r6.f212608e
            r9 = 2131235658(0x7f08134a, float:1.8087516E38)
            android.graphics.drawable.Drawable r7 = i65.a.i(r7, r9)
            goto L9f
        L82:
            android.content.Context r7 = r6.f212608e
            r9 = 2131235657(0x7f081349, float:1.8087514E38)
            android.graphics.drawable.Drawable r7 = i65.a.i(r7, r9)
            goto L9f
        L8c:
            android.content.Context r7 = r6.f212608e
            r9 = 2131235661(0x7f08134d, float:1.8087522E38)
            android.graphics.drawable.Drawable r7 = i65.a.i(r7, r9)
            goto L9f
        L96:
            android.content.Context r7 = r6.f212608e
            r9 = 2131235659(0x7f08134b, float:1.8087518E38)
            android.graphics.drawable.Drawable r7 = i65.a.i(r7, r9)
        L9f:
            r8.setCompoundDrawablesWithIntrinsicBounds(r10, r10, r7, r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        La6:
            r8.setCompoundDrawablesWithIntrinsicBounds(r10, r10, r10, r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.bm.G(java.lang.String, android.widget.TextView, int, int):void");
    }

    public boolean H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        boolean z17 = this.f167954o >= this.f167955p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return z17;
    }

    public final void I(com.tencent.mm.ui.MMImageView mMImageView, java.lang.Object obj, com.tencent.mm.plugin.sns.ui.km kmVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        if (mMImageView.getTag() != null && mMImageView.getTag().equals(obj)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return;
        }
        mMImageView.setTag(obj);
        kmVar.a();
        mMImageView.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    @Override // com.tencent.mm.ui.z9
    public /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mm.plugin.sns.storage.v1 x17 = x((com.tencent.mm.plugin.sns.storage.v1) obj, cursor);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return x17;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        long j17 = ((com.tencent.mm.plugin.sns.storage.v1) getItem(i17)).field_snsID;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return j17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:23|24|25|(6:379|380|381|382|383|(1:385))(1:27)|28|29|30|31|(3:33|(1:35)|36)(1:373)|37|(1:39)(1:371)|40|(4:42|(1:44)|45|(12:49|50|51|52|(3:354|355|(7:357|55|56|58|(3:339|340|(38:342|343|344|63|64|65|66|67|68|69|(3:320|(1:322)(1:324)|323)(1:74)|75|76|77|78|79|80|(3:148|149|(24:153|(2:306|307)|155|156|(19:163|164|(2:166|(1:168))(4:169|(3:174|175|(2:177|(1:179))(3:180|181|(2:183|(3:185|(1:187)(1:189)|188))(3:190|191|(2:193|(1:195))(5:196|(3:203|204|(4:206|(2:208|(1:210)(2:211|(1:213)))|214|(2:216|(1:218)(1:219)))(4:220|(3:225|226|(2:228|(3:230|(1:232)|233)(1:234))(3:235|236|(2:238|(2:240|(1:242)(1:243)))(4:244|(2:249|(1:251)(2:252|(6:254|255|(1:257)(6:265|(1:267)(1:278)|268|(3:273|(1:275)|276)|277|276)|258|(1:263)|264)(1:279)))|280|(1:282))))|283|(2:285|(1:287))(1:288)))|289|(1:291)|292))))|293|(1:295))|146|88|89|90|91|92|93|(1:97)|98|(1:114)(1:102)|103|(1:105)(1:113)|106|(1:108)(1:112)|109|110)|296|(1:298)(2:299|(2:301|(1:305)))|146|88|89|90|91|92|93|(2:95|97)|98|(1:100)|114|103|(0)(0)|106|(0)(0)|109|110))|82|83|(19:85|(18:125|(3:130|131|(3:133|(3:135|136|137)(1:140)|138))(2:127|(1:129))|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110)|87|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110)|146|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110))|60|(39:62|63|64|65|66|67|68|69|(1:71)|320|(0)(0)|323|75|76|77|78|79|80|(0)|82|83|(0)|146|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110)(40:(1:335)(1:338)|336|337|64|65|66|67|68|69|(0)|320|(0)(0)|323|75|76|77|78|79|80|(0)|82|83|(0)|146|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110)))|54|55|56|58|(0)|60|(0)(0)))|370|51|52|(0)|54|55|56|58|(0)|60|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:342|343|344|63|64|65|(11:66|67|68|69|(3:320|(1:322)(1:324)|323)(1:74)|75|76|77|78|79|80)|(3:148|149|(24:153|(2:306|307)|155|156|(19:163|164|(2:166|(1:168))(4:169|(3:174|175|(2:177|(1:179))(3:180|181|(2:183|(3:185|(1:187)(1:189)|188))(3:190|191|(2:193|(1:195))(5:196|(3:203|204|(4:206|(2:208|(1:210)(2:211|(1:213)))|214|(2:216|(1:218)(1:219)))(4:220|(3:225|226|(2:228|(3:230|(1:232)|233)(1:234))(3:235|236|(2:238|(2:240|(1:242)(1:243)))(4:244|(2:249|(1:251)(2:252|(6:254|255|(1:257)(6:265|(1:267)(1:278)|268|(3:273|(1:275)|276)|277|276)|258|(1:263)|264)(1:279)))|280|(1:282))))|283|(2:285|(1:287))(1:288)))|289|(1:291)|292))))|293|(1:295))|146|88|89|90|91|92|93|(1:97)|98|(1:114)(1:102)|103|(1:105)(1:113)|106|(1:108)(1:112)|109|110)|296|(1:298)(2:299|(2:301|(1:305)))|146|88|89|90|91|92|93|(2:95|97)|98|(1:100)|114|103|(0)(0)|106|(0)(0)|109|110))|82|83|(19:85|(18:125|(3:130|131|(3:133|(3:135|136|137)(1:140)|138))(2:127|(1:129))|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110)|87|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110)|146|88|89|90|91|92|93|(0)|98|(0)|114|103|(0)(0)|106|(0)(0)|109|110) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0c37, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0c3a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0c3b, code lost:
    
        r3 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x048b, code lost:
    
        if (r3.size() == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0351, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0c55, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0c56, code lost:
    
        r16 = r5;
        r3 = r7;
        r2 = "MicroMsg.SnsMsgUI";
        r22 = r14;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0c61, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0c62, code lost:
    
        r3 = r7;
        r2 = "MicroMsg.SnsMsgUI";
        r11 = r6;
        r6 = 8;
        r16 = r1;
        r1 = r0;
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x046f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0419 A[Catch: Exception -> 0x0409, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0409, blocks: (B:74:0x03fe, B:322:0x0419), top: B:69:0x03f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0307 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020d A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #3 {Exception -> 0x0229, blocks: (B:383:0x01ea, B:385:0x01f2, B:33:0x020d, B:35:0x0217, B:36:0x022b, B:39:0x0256, B:42:0x025f, B:44:0x0269, B:45:0x026d, B:47:0x0277, B:49:0x0283), top: B:382:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0259 A[Catch: Exception -> 0x0c70, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0c70, blocks: (B:30:0x0204, B:37:0x0242, B:371:0x0259, B:373:0x023d), top: B:29:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x023d A[Catch: Exception -> 0x0c70, TRY_ENTER, TryCatch #0 {Exception -> 0x0c70, blocks: (B:30:0x0204, B:37:0x0242, B:371:0x0259, B:373:0x023d), top: B:29:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0256 A[Catch: Exception -> 0x0229, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0229, blocks: (B:383:0x01ea, B:385:0x01f2, B:33:0x020d, B:35:0x0217, B:36:0x022b, B:39:0x0256, B:42:0x025f, B:44:0x0269, B:45:0x026d, B:47:0x0277, B:49:0x0283), top: B:382:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025f A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #3 {Exception -> 0x0229, blocks: (B:383:0x01ea, B:385:0x01f2, B:33:0x020d, B:35:0x0217, B:36:0x022b, B:39:0x0256, B:42:0x025f, B:44:0x0269, B:45:0x026d, B:47:0x0277, B:49:0x0283), top: B:382:0x01ea }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0348 A[Catch: Exception -> 0x0351, TryCatch #12 {Exception -> 0x0351, blocks: (B:344:0x0339, B:62:0x0348, B:335:0x0355), top: B:58:0x0305 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0c98  */
    /* JADX WARN: Type inference failed for: r2v207, types: [int] */
    /* JADX WARN: Type inference failed for: r2v208 */
    /* JADX WARN: Type inference failed for: r2v209 */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r42, android.view.View r43, android.view.ViewGroup r44) {
        /*
            Method dump skipped, instructions count: 3447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.bm.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "adapter initCursor");
        c();
        q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public synchronized void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        f();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "onNotifyChange: ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        int f17 = com.tencent.mm.plugin.sns.model.l4.Aj().f();
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f167962w;
        if (f17 > 0) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            boolean z17 = snsMsgUI.f167276p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "adapter resetCursor unReadCount = %d", java.lang.Integer.valueOf(f17));
                s(com.tencent.mm.plugin.sns.model.l4.Aj().W0());
                if (snsMsgUI.C && !snsMsgUI.B) {
                    f17 = 0;
                }
                u(f17);
                notifyDataSetChanged();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            }
        }
        int J0 = com.tencent.mm.plugin.sns.model.l4.Aj().J0(false);
        this.f167955p = J0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "adapter resetCursor totalCount = %d", java.lang.Integer.valueOf(J0));
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        int i18 = this.f167954o;
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from SnsComment where isSend = 0 order by createTime desc LIMIT ");
        Aj.P0();
        sb6.append(i18);
        android.database.Cursor B = Aj.f166156d.B(sb6.toString(), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        s(B);
        if (snsMsgUI.C) {
            f17 = 0;
        }
        u(f17);
        notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }

    public int t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        if (!H()) {
            int i17 = this.f167954o + 10;
            this.f167954o = i17;
            int i18 = this.f167955p;
            if (i17 <= i18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                return 10;
            }
            this.f167954o = i18;
            int i19 = i18 % 10;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            return i19;
        }
        int i27 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f167962w;
        android.view.View view = snsMsgUI.f167270g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (view.getParent() != null) {
            android.widget.ListView listView = snsMsgUI.f167267d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            android.view.View view2 = snsMsgUI.f167270g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            listView.removeFooterView(view2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(int r32) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.bm.u(int):void");
    }

    public boolean v(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsIdHadEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        java.util.Map map = this.f167960u;
        boolean z17 = false;
        if (map != null && !com.tencent.mm.sdk.platformtools.t8.K0(str) && ((java.util.HashMap) map).get(str) != null && ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue() == 1) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsIdHadEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return z17;
    }

    public boolean w(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsIdHadForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        java.util.Map map = this.f167960u;
        boolean z17 = false;
        if (map != null && !com.tencent.mm.sdk.platformtools.t8.K0(str) && ((java.util.HashMap) map).get(str) != null && ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue() == 2) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsIdHadForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return z17;
    }

    public com.tencent.mm.plugin.sns.storage.v1 x(com.tencent.mm.plugin.sns.storage.v1 v1Var, android.database.Cursor cursor) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        if (v1Var == null) {
            v1Var = new com.tencent.mm.plugin.sns.storage.v1();
        }
        v1Var.convertFrom(cursor);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return v1Var;
    }

    public int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        int i17 = this.f167954o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        return i17;
    }

    public final void z(com.tencent.mm.ui.MMImageView mMImageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideThumbView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
        mMImageView.setTag(null);
        mMImageView.setVisibility(8);
        mMImageView.setImageBitmap(null);
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int hashCode = mMImageView.hashCode();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = hj6.f164260i;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.sns.model.b2 b2Var = (com.tencent.mm.plugin.sns.model.b2) it.next();
            if (hashCode == b2Var.a()) {
                copyOnWriteArraySet.remove(b2Var);
                break;
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) hj6.f164256e).remove(java.lang.Integer.valueOf(hashCode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideThumbView", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
    }
}
