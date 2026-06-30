package com.tencent.mm.plugin.textstatus.ui;

@db5.a(24611)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lal5/e0;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/h6", "com/tencent/mm/plugin/textstatus/ui/i6", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusDoWhatActivityV2 extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements al5.e0 {
    public static final com.tencent.mm.plugin.textstatus.ui.h6 C1 = new com.tencent.mm.plugin.textstatus.ui.h6(null);
    public final com.tencent.mm.plugin.textstatus.ui.i6 A1;
    public android.view.View B1;
    public com.tencent.mm.ui.widget.MMEditText C;
    public android.view.View D;
    public com.tencent.mm.ui.widget.imageview.WeImageView E;
    public android.widget.ImageView F;
    public android.view.View G;
    public android.view.View H;
    public android.view.View I;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public final com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$statusExptSwitchChangeEventListener$1 W;
    public final com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$configUpdateListener$1 X;
    public final java.util.ArrayList Y;
    public java.util.HashMap Z;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f173537e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f173538f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f173539g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f173540h;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.q7 f173542l1;

    /* renamed from: m, reason: collision with root package name */
    public lj4.d f173543m;

    /* renamed from: n, reason: collision with root package name */
    public bi4.d1 f173544n;

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.s7 f173547p0;

    /* renamed from: p1, reason: collision with root package name */
    public final int f173548p1;

    /* renamed from: w, reason: collision with root package name */
    public ft.p4 f173555w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.service.l5 f173556x;

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.t7 f173557x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f173558x1;

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.ui.r7 f173560y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.EditText f173561y1;

    /* renamed from: z1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f173563z1;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f173536d = kotlinx.coroutines.z0.b();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f173541i = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f173545o = true;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f173546p = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.k6(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f173549q = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.z7(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f173550r = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.p6(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f173551s = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.m6(this));

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f173552t = "wxb1320569c2a2b6d2";

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f173553u = "pages/emoji-panel/emoji-panel.html";

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f173554v = "gh_8672f34b4389@app";

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f173559y = "config";

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f173562z = "key_from_scene";
    public final java.lang.String A = "from_custom_status_icon_experiment";
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.a8(this));

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f173535J = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.u7(this));
    public final jz5.g K = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.l7(this));
    public final jz5.g L = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.b8(this));
    public final jz5.g M = jz5.h.b(com.tencent.mm.plugin.textstatus.ui.s6.f174283d);
    public java.lang.String N = "userdefine";
    public final long V = 150;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$statusExptSwitchChangeEventListener$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$configUpdateListener$1] */
    public TextStatusDoWhatActivityV2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.W = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$statusExptSwitchChangeEventListener$1
            {
                this.__eventId = -926402883;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent statusExptSwitchChangeEvent) {
                com.tencent.mm.autogen.events.StatusExptSwitchChangeEvent event = statusExptSwitchChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54866g.f8327a;
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "statusExptSwitchChangeEventListener callback: %s", str);
                if (!str.equals("ACTION_NEED_HANDLE_LAST_RESP")) {
                    return false;
                }
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.this.R = true;
                return false;
            }
        };
        this.X = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2$configUpdateListener$1
            {
                this.__eventId = -1315263948;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent statusIconConfigUpdateEvent) {
                com.tencent.mm.autogen.events.StatusIconConfigUpdateEvent event = statusIconConfigUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.this;
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.textstatus.ui.o6(event, textStatusDoWhatActivityV2));
                return false;
            }
        };
        this.Y = new java.util.ArrayList();
        this.f173547p0 = new com.tencent.mm.plugin.textstatus.ui.s7(this);
        this.f173557x0 = new com.tencent.mm.plugin.textstatus.ui.t7(this);
        this.f173560y0 = new com.tencent.mm.plugin.textstatus.ui.r7();
        this.f173542l1 = new com.tencent.mm.plugin.textstatus.ui.q7(this);
        this.f173548p1 = 10;
        this.A1 = new com.tencent.mm.plugin.textstatus.ui.i6(this);
    }

    public static final void U6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, java.lang.String str) {
        android.widget.Button button;
        android.widget.ImageView imageView;
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout;
        pj4.b0 b0Var;
        textStatusDoWhatActivityV2.f173558x1 = textStatusDoWhatActivityV2.findViewById(com.tencent.mm.R.id.cp_);
        textStatusDoWhatActivityV2.B1 = textStatusDoWhatActivityV2.findViewById(com.tencent.mm.R.id.ovp);
        android.view.View view = textStatusDoWhatActivityV2.f173558x1;
        if (view != null) {
            bk4.e1 e1Var = bk4.e1.f21460a;
            bi4.d1 d1Var = textStatusDoWhatActivityV2.f173544n;
            view.setBackgroundResource(e1Var.b((d1Var == null || (b0Var = d1Var.f354937d) == null) ? null : b0Var.f354989x));
        }
        android.view.View view2 = textStatusDoWhatActivityV2.f173558x1;
        float f17 = i65.a.f(textStatusDoWhatActivityV2.getContext(), com.tencent.mm.R.dimen.f479688cn);
        if (view2 != null) {
            view2.setOutlineProvider(new bk4.e2(true, true, f17));
        }
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        android.view.View view3 = textStatusDoWhatActivityV2.f173558x1;
        textStatusDoWhatActivityV2.f173561y1 = view3 != null ? (android.widget.EditText) view3.findViewById(com.tencent.mm.R.id.cp8) : null;
        android.view.View view4 = textStatusDoWhatActivityV2.f173558x1;
        textStatusDoWhatActivityV2.f173563z1 = view4 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view4.findViewById(com.tencent.mm.R.id.cp9) : null;
        bk4.f.V(textStatusDoWhatActivityV2.c7(), textStatusDoWhatActivityV2.f173563z1, "userdefine", null, null, null, false, false, 124, null);
        android.view.View view5 = textStatusDoWhatActivityV2.f173558x1;
        if (view5 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = textStatusDoWhatActivityV2.B1;
        if (view6 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showCustomDialog", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view7 = textStatusDoWhatActivityV2.B1;
        if (view7 != null) {
            view7.setOnClickListener(com.tencent.mm.plugin.textstatus.ui.v7.f174365d);
        }
        java.lang.String str2 = textStatusDoWhatActivityV2.f173541i;
        if (str2.length() > 0) {
            android.widget.EditText editText = textStatusDoWhatActivityV2.f173561y1;
            if (editText != null) {
                editText.setText(str2);
            }
            android.widget.EditText editText2 = textStatusDoWhatActivityV2.f173561y1;
            if (editText2 != null) {
                editText2.setSelection(str2.length());
            }
        }
        textStatusDoWhatActivityV2.W6();
        android.widget.EditText editText3 = textStatusDoWhatActivityV2.f173561y1;
        com.tencent.mm.plugin.textstatus.ui.i6 i6Var = textStatusDoWhatActivityV2.A1;
        if (editText3 != null) {
            editText3.removeTextChangedListener(i6Var);
        }
        android.widget.EditText editText4 = textStatusDoWhatActivityV2.f173561y1;
        if (editText4 != null) {
            editText4.addTextChangedListener(i6Var);
        }
        android.view.View view8 = textStatusDoWhatActivityV2.f173558x1;
        if (view8 != null && (inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) view8.findViewById(com.tencent.mm.R.id.cow)) != null) {
            inputPanelLinearLayout.e(textStatusDoWhatActivityV2);
        }
        android.view.View view9 = textStatusDoWhatActivityV2.f173558x1;
        if (view9 != null && (imageView = (android.widget.ImageView) view9.findViewById(com.tencent.mm.R.id.hkr)) != null) {
            imageView.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.w7(textStatusDoWhatActivityV2));
        }
        android.view.View view10 = textStatusDoWhatActivityV2.f173558x1;
        if (view10 != null && (button = (android.widget.Button) view10.findViewById(com.tencent.mm.R.id.b0z)) != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.x7(textStatusDoWhatActivityV2, str));
        }
        android.view.View view11 = textStatusDoWhatActivityV2.f173558x1;
        textStatusDoWhatActivityV2.f173538f = view11 != null ? (android.widget.TextView) view11.findViewById(com.tencent.mm.R.id.oqc) : null;
        android.widget.EditText editText5 = textStatusDoWhatActivityV2.f173561y1;
        if (editText5 != null) {
            editText5.requestFocus();
        }
        super.showVKB();
    }

    public static final void V6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        android.view.View view;
        java.lang.String str;
        android.text.Editable text;
        if (!textStatusDoWhatActivityV2.c7().y()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "showEmojiPanel: error expt");
            return;
        }
        if (java.lang.System.currentTimeMillis() - textStatusDoWhatActivityV2.U <= textStatusDoWhatActivityV2.V) {
            return;
        }
        textStatusDoWhatActivityV2.U = java.lang.System.currentTimeMillis();
        boolean z17 = textStatusDoWhatActivityV2.T;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "showEmojiPanel: isEmojiPanelShow:%s", java.lang.Boolean.valueOf(z17));
            textStatusDoWhatActivityV2.g7();
            com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
            if (mMEditText != null) {
                mMEditText.requestFocus();
            }
            super.showVKB();
            return;
        }
        com.tencent.mm.plugin.appbrand.service.l5 l5Var = textStatusDoWhatActivityV2.f173556x;
        if (l5Var == null || (view = l5Var.getView()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "showEmojiPanel:isSelectStatusIconMode:%s this.translationY:%s", java.lang.Boolean.FALSE, java.lang.Float.valueOf(view.getTranslationY()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (view.getTranslationY() == 0.0f) {
            return;
        }
        textStatusDoWhatActivityV2.T = true;
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = textStatusDoWhatActivityV2.C;
        if (mMEditText2 != null) {
            mMEditText2.setCursorVisible(false);
        }
        textStatusDoWhatActivityV2.b7().e();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = textStatusDoWhatActivityV2.E;
        if (weImageView != null) {
            if (!(weImageView.getRotation() == -90.0f)) {
                android.animation.ObjectAnimator.ofFloat(weImageView, "rotation", 90.0f, -90.0f).setDuration(150L).start();
            }
        }
        android.view.View view2 = textStatusDoWhatActivityV2.G;
        jz5.g gVar = textStatusDoWhatActivityV2.B;
        if (view2 != null) {
            view2.setBackground((android.graphics.drawable.TransitionDrawable) ((jz5.n) gVar).getValue());
        }
        ((android.graphics.drawable.TransitionDrawable) ((jz5.n) gVar).getValue()).startTransition(150);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setDuration(150L);
        ofFloat.start();
        textStatusDoWhatActivityV2.hideVKB();
        com.tencent.mm.plugin.appbrand.service.l5 l5Var2 = textStatusDoWhatActivityV2.f173556x;
        kotlin.jvm.internal.o.d(l5Var2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, c01.id.c());
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = textStatusDoWhatActivityV2.C;
        if (mMEditText3 == null || (text = mMEditText3.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        jSONObject.put("current_text", str);
        ((com.tencent.mm.plugin.appbrand.d9) l5Var2).G("onRequestStatusEmojiPanelShow", jSONObject);
    }

    public static void X6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        bi4.d1 d1Var;
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        textStatusDoWhatActivityV2.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doClickIcon>> ");
        sb6.append(str);
        sb6.append(", isEnter=");
        sb6.append(textStatusDoWhatActivityV2.f173540h);
        sb6.append(", isFromRecentUse=");
        sb6.append(z19);
        sb6.append(", isFromCustomIconRecommend=");
        sb6.append(z27);
        sb6.append(", BreathAnimPlayCount=");
        bi4.d1 d1Var2 = textStatusDoWhatActivityV2.f173544n;
        sb6.append(d1Var2 != null ? java.lang.Integer.valueOf(d1Var2.K) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", sb6.toString());
        if (!textStatusDoWhatActivityV2.f173540h) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("STATUS_TYPE_CUSTOM_TITLE", textStatusDoWhatActivityV2.f173541i);
            intent.putExtra("STATUS_TYPE_IMG", str);
            bi4.d1 d1Var3 = textStatusDoWhatActivityV2.f173544n;
            intent.putExtra("ClkCustomIconCount", d1Var3 != null ? d1Var3.f354946p : 0);
            bi4.d1 d1Var4 = textStatusDoWhatActivityV2.f173544n;
            intent.putExtra("CustomTitleTooLongCount", d1Var4 != null ? d1Var4.f354947q : 0);
            intent.putExtra("ACTION_NEED_HANDLE_LAST_RESP", textStatusDoWhatActivityV2.R);
            intent.putExtra("KEY_CLK_USER_DEFINE_ICON_COUNT", textStatusDoWhatActivityV2.P);
            intent.putExtra("KEY_CLK_ADD_ICON_TO_CUSTOM_TITLE_COUNT", textStatusDoWhatActivityV2.Q);
            intent.putExtra("KEY_IS_FROM_RECENT_STATUS", z19);
            intent.putExtra("KEY_IS_FROM_CUSTOM_ICON_RECOMMEND", z27);
            intent.putStringArrayListExtra("KEY_LAST_CUSTOM_ICON_RECOMMEND_LIST", new java.util.ArrayList<>(textStatusDoWhatActivityV2.d7().f473347i));
            bi4.d1 d1Var5 = textStatusDoWhatActivityV2.f173544n;
            intent.putExtra("KEY_SWITCH_ICON_BREATH_ANIM_PLAY_COUNT", d1Var5 != null ? d1Var5.K : 0);
            textStatusDoWhatActivityV2.setResult(-1, intent);
            textStatusDoWhatActivityV2.f173545o = false;
            textStatusDoWhatActivityV2.finish();
            textStatusDoWhatActivityV2.getContext().overridePendingTransition(0, com.tencent.mm.R.anim.f477855dd);
            return;
        }
        bi4.d1 d1Var6 = textStatusDoWhatActivityV2.f173544n;
        if (d1Var6 != null) {
            d1Var6.f354937d.f354975g.f355214e = str;
            d1Var = d1Var6;
        } else {
            d1Var = new bi4.d1();
            d1Var.f354937d.f354975g.f355214e = str;
            d1Var.f354943m = 0L;
            d1Var.f354941h = "";
            d1Var.f354942i = 0L;
            d1Var.f354944n = 0;
            d1Var.f354945o = 0;
        }
        d1Var.B = textStatusDoWhatActivityV2.Q;
        d1Var.A = textStatusDoWhatActivityV2.P;
        d1Var.H = z19;
        d1Var.I = z27;
        d1Var.f354936J = textStatusDoWhatActivityV2.d7().f473347i;
        d1Var.K = d1Var6 != null ? d1Var6.K : 0;
        boolean a17 = textStatusDoWhatActivityV2.c7().a(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "doClickIcon: iconId:" + str + " canCustomStatusTitle:" + a17);
        if (a17) {
            d1Var.f354937d.f354975g.f355218i = textStatusDoWhatActivityV2.f173541i;
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2.a(textStatusDoWhatActivityV2, d1Var, true, textStatusDoWhatActivityV2.R, (android.os.ResultReceiver) textStatusDoWhatActivityV2.getIntent().getParcelableExtra("CALLBACK"));
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.textstatus.ui.q6 q6Var = new com.tencent.mm.plugin.textstatus.ui.q6(textStatusDoWhatActivityV2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(q6Var, 50L, false);
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        if (z17) {
            android.view.View view = this.f173558x1;
            java.lang.Object layoutParams = view != null ? view.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
                android.view.View view2 = this.f173558x1;
                if (view2 == null) {
                    return;
                }
                view2.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        android.view.View view3 = this.f173558x1;
        java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
        marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
            android.view.View view4 = this.f173558x1;
            if (view4 == null) {
                return;
            }
            view4.setLayoutParams(marginLayoutParams);
        }
    }

    public final void W6() {
        android.text.Editable text;
        java.lang.CharSequence u07;
        android.view.View view = this.f173558x1;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b0z) : null;
        if (button == null) {
            return;
        }
        android.widget.EditText editText = this.f173561y1;
        button.setEnabled(((editText == null || (text = editText.getText()) == null || (u07 = r26.n0.u0(text)) == null) ? 0 : u07.length()) > 0);
    }

    public final boolean Y6() {
        android.text.Editable text;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.C;
        if (mMEditText != null) {
            return mMEditText != null && (text = mMEditText.getText()) != null && (r26.n0.N(text) ^ true);
        }
        return false;
    }

    public final void Z6() {
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView b76;
        android.view.View view;
        this.S = false;
        boolean z17 = b7().isExpand;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "foldCustomStatusPanel: " + z17);
        if (z17 && (view = (b76 = b7()).f173409h) != null) {
            if (!b76.isExpand) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.CustomStatusView", "fold: is fold");
                return;
            }
            b76.isExpand = false;
            yz5.a aVar = b76.foldListener;
            if (aVar != null) {
                aVar.invoke();
            }
            android.view.ViewGroup viewGroup = b76.f173413o;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            android.widget.ImageView imageView = b76.f173414p;
            if (imageView != null) {
                b76.h(imageView, 1.4f, 1.0f);
            }
            android.view.ViewGroup viewGroup2 = b76.f173416r;
            if (viewGroup2 != null) {
                android.view.ViewPropertyAnimator animate = viewGroup2.animate();
                animate.setDuration(b76.f173406e);
                animate.setInterpolator(b76.f173407f);
                animate.setUpdateListener(new com.tencent.mm.plugin.textstatus.ui.f(b76, b76.mContext, view));
                animate.start();
            }
            android.view.View view2 = b76.f173417s;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/CustomStatusView", "fold", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/CustomStatusView", "fold", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final android.view.View a7() {
        java.lang.Object value = ((jz5.n) this.f173546p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.plugin.textstatus.ui.CustomStatusView b7() {
        java.lang.Object value = ((jz5.n) this.f173550r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.textstatus.ui.CustomStatusView) value;
    }

    public final bk4.f c7() {
        return (bk4.f) ((jz5.n) this.M).getValue();
    }

    public final zj4.e d7() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(zj4.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (zj4.e) a17;
    }

    public final android.view.View e7() {
        java.lang.Object value = ((jz5.n) this.f173549q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void f7() {
        android.view.View view = this.f173558x1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.B1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2", "hideCustomDialog", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.EditText editText = this.f173561y1;
        if (editText != null) {
            editText.setText("");
        }
        hideVKB();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f173545o) {
            if (this.f173540h) {
                qj4.s.f363958a.k(this.f173544n, 3L);
                android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f173551s).getValue();
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
            }
            android.content.Intent intent = new android.content.Intent();
            bi4.d1 d1Var = this.f173544n;
            intent.putExtra("ClkCustomIconCount", d1Var != null ? d1Var.f354946p : 0);
            bi4.d1 d1Var2 = this.f173544n;
            intent.putExtra("CustomTitleTooLongCount", d1Var2 != null ? d1Var2.f354947q : 0);
            intent.putStringArrayListExtra("KEY_LAST_CUSTOM_ICON_RECOMMEND_LIST", new java.util.ArrayList<>(d7().f473347i));
            bi4.d1 d1Var3 = this.f173544n;
            intent.putExtra("KEY_SWITCH_ICON_BREATH_ANIM_PLAY_COUNT", d1Var3 != null ? d1Var3.K : 0);
            setResult(0, intent);
        }
        super.finish();
        getContext().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    public final void g7() {
        android.view.View view;
        if (!c7().y()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "hideEmojiPanel: error expt");
            return;
        }
        com.tencent.mm.plugin.appbrand.service.l5 l5Var = this.f173556x;
        if (l5Var == null || (view = l5Var.getView()) == null) {
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.Float valueOf = java.lang.Float.valueOf(view.getTranslationY());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "hideEmojiPanel: isSelectStatusIconMode:%s this.translationY:%s , stack:%s ", bool, valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (view.getTranslationY() == 0.0f) {
            this.T = false;
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.C;
            if (mMEditText != null) {
                mMEditText.setCursorVisible(true);
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.C;
            if (mMEditText2 != null) {
                mMEditText2.requestFocus();
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.E;
            if (weImageView != null) {
                if (!(weImageView.getRotation() == 90.0f)) {
                    android.animation.ObjectAnimator.ofFloat(weImageView, "rotation", -90.0f, 90.0f).setDuration(150L).start();
                }
            }
            android.view.View view2 = this.G;
            jz5.g gVar = this.B;
            if (view2 != null) {
                view2.setBackground((android.graphics.drawable.TransitionDrawable) ((jz5.n) gVar).getValue());
            }
            ((android.graphics.drawable.TransitionDrawable) ((jz5.n) gVar).getValue()).reverseTransition(150);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
            ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
            ofFloat.setDuration(150L);
            ofFloat.start();
            com.tencent.mm.plugin.appbrand.service.l5 l5Var2 = this.f173556x;
            kotlin.jvm.internal.o.d(l5Var2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, c01.id.c());
            ((com.tencent.mm.plugin.appbrand.d9) l5Var2).G("onRequestStatusEmojiPanelDismiss", jSONObject);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.m8v;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cza;
    }

    public final java.util.HashMap h7(java.util.ArrayList arrayList) {
        lj4.d dVar;
        java.lang.String str;
        java.lang.String str2;
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof lj4.d) && (str = (dVar = (lj4.d) cVar).f318981d) != null && (str2 = dVar.f318982e) != null) {
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    public final void i7() {
        int h17 = com.tencent.mm.ui.bl.h(getContext()) + com.tencent.mm.ui.zk.a(getContext(), 6);
        android.view.ViewGroup.LayoutParams layoutParams = a7().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).topMargin = h17;
        android.view.ViewGroup.LayoutParams layoutParams2 = e7().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams2).topMargin = h17;
        int a17 = com.tencent.mm.ui.zk.a(getContext(), 40);
        java.lang.Object value = ((jz5.n) this.K).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams3 = ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) value).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams3).topMargin = h17 + com.tencent.mm.ui.zk.a(getContext(), 24) + a17;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.view.View view = this.f173558x1;
        boolean z17 = false;
        if (((view != null && view.getVisibility() == 0) || b7().isExpand) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "onBackPressed: exit");
            super.onBackPressed();
            return;
        }
        android.view.View view2 = this.f173558x1;
        if (view2 != null && view2.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            f7();
            return;
        }
        if (b7().isExpand) {
            this.N = "userdefine";
            android.widget.ImageView imageView = this.F;
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.C;
            if (mMEditText != null) {
                mMEditText.setText("");
            }
            bk4.f.V(c7(), this.F, this.N, null, null, null, false, false, 124, null);
            Z6();
            hideVKB();
            g7();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0445  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.appbrand.service.l5 l5Var = this.f173556x;
        if (l5Var != null) {
            ((com.tencent.mm.plugin.appbrand.d9) l5Var).E();
        }
        if (this.f173555w != null) {
            ft.q4 q4Var = (ft.q4) i95.n0.c(ft.q4.class);
            ft.p4 p4Var = this.f173555w;
            if (p4Var == null) {
                kotlin.jvm.internal.o.o("weAppDataCallback");
                throw null;
            }
            ((xc1.t) q4Var).Bi(this.f173552t, p4Var);
        }
        dead();
        dead();
        if (this.R && this.f173545o) {
            bk4.i.a().v();
        }
        kotlinx.coroutines.z0.e(this.f173536d, null, 1, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        java.lang.Object obj = this.f173556x;
        if (obj != null) {
            ((com.tencent.mm.plugin.appbrand.l5) obj).w();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.Object obj = this.f173556x;
        if (obj != null) {
            ((com.tencent.mm.plugin.appbrand.l5) obj).A();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void showVKB() {
        super.showVKB();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(zj4.e.class);
        set.add(vj4.d.class);
    }
}
