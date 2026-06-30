package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class lp extends com.tencent.mm.ui.chatting.viewitems.g0 {
    public android.widget.RelativeLayout A;
    public android.widget.TextView B;
    public android.view.animation.Animation C;
    public android.view.View D;

    /* renamed from: b, reason: collision with root package name */
    public int f204504b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f204505c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f204506d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.AnimImageView f204507e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewStub f204508f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewStub f204509g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f204510h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f204511i;

    /* renamed from: j, reason: collision with root package name */
    public rl5.r f204512j;

    /* renamed from: k, reason: collision with root package name */
    public wl5.x f204513k;

    /* renamed from: l, reason: collision with root package name */
    public rl5.r f204514l;

    /* renamed from: m, reason: collision with root package name */
    public wl5.x f204515m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f204516n = "";

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f204517o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f204518p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f204519q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f204520r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ProgressBar f204521s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.base.AnimImageView f204522t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f204523u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ProgressBar f204524v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f204525w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f204526x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f204527y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f204528z;

    public static void a(android.content.Context context, java.lang.CharSequence charSequence, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.putExtra("key_chat_from", context.getClass().getName());
        intent.putExtra("key_chat_text", charSequence);
        intent.putExtra("Chat_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Chat_User", f9Var.Q0());
        if (dVar != null) {
            intent.putExtra("is_group_chat", dVar.D());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$VoiceItemHolder", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$VoiceItemHolder", "goPreviewText", "(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(context);
    }

    public static int c(int i17) {
        int i18;
        if (i17 <= 2) {
            return 80;
        }
        if (i17 < 10) {
            i18 = i17 - 2;
        } else {
            if (i17 >= 60) {
                return 204;
            }
            i18 = (i17 / 10) + 7;
        }
        return (i18 * 9) + 80;
    }

    public static void d(com.tencent.mm.ui.chatting.viewitems.lp lpVar, boolean z17) {
        android.view.View view = lpVar.D;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            int i17 = z17 ? com.tencent.mm.R.id.f483701bs0 : com.tencent.mm.R.id.brr;
            if (i17 != layoutParams.getRule(3)) {
                layoutParams.addRule(3, i17);
                lpVar.D.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0542  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.tencent.mm.ui.chatting.viewitems.a0 r37, com.tencent.mm.ui.chatting.viewitems.lp r38, rd5.d r39, com.tencent.mm.ui.chatting.adapter.q r40, yb5.d r41, boolean r42, boolean r43, android.view.View.OnLongClickListener r44, com.tencent.mm.ui.chatting.l6 r45) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.lp.e(com.tencent.mm.ui.chatting.viewitems.a0, com.tencent.mm.ui.chatting.viewitems.lp, rd5.d, com.tencent.mm.ui.chatting.adapter.q, yb5.d, boolean, boolean, android.view.View$OnLongClickListener, com.tencent.mm.ui.chatting.l6):void");
    }

    public static void f(com.tencent.mm.ui.chatting.viewitems.lp lpVar, int i17, int i18, boolean z17, boolean z18, boolean z19) {
        lpVar.stateIV.setVisibility(i18);
        lpVar.f204520r.setVisibility(i18);
        lpVar.f204517o.setVisibility(i18);
        if (z17) {
            lpVar.f204522t.setVisibility(i17);
            lpVar.f204523u.setVisibility(i18);
            return;
        }
        android.widget.TextView textView = lpVar.f204525w;
        if (textView != null) {
            textView.setVisibility(i17);
        }
        android.widget.TextView textView2 = lpVar.f204525w;
        if (textView2 == null || textView2.getVisibility() != 0) {
            d(lpVar, false);
        } else {
            d(lpVar, true);
        }
    }

    public com.tencent.mm.ui.chatting.viewitems.g0 b(android.view.View view, boolean z17, boolean z18) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f204506d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brp);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
        this.f204520r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.f204517o = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.brq);
        this.f204521s = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.brm);
        this.f204508f = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.ojd);
        this.f204509g = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f487598vo0);
        this.f204505c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brn);
        com.tencent.mm.ui.base.AnimImageView animImageView = (com.tencent.mm.ui.base.AnimImageView) view.findViewById(com.tencent.mm.R.id.brl);
        this.f204507e = animImageView;
        animImageView.setType(1);
        this.A = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.blz);
        this.B = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bly);
        this.D = view.findViewById(com.tencent.mm.R.id.vgx);
        if (z17) {
            this.f204507e.setFromVoice(true);
            this.f204507e.setFromGroup(z18);
            this.f204523u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bix);
            com.tencent.mm.ui.base.AnimImageView animImageView2 = (com.tencent.mm.ui.base.AnimImageView) view.findViewById(com.tencent.mm.R.id.bro);
            this.f204522t = animImageView2;
            animImageView2.setFromVoice(true);
            this.f204522t.setFromGroup(z18);
            this.f204522t.setType(0);
            this.f204526x = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.blt);
            this.f204527y = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.blv);
            this.f204528z = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.blu);
        } else {
            this.f204518p = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.brx);
            this.f204519q = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bry);
            this.f204524v = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.brz);
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f204525w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483701bs0);
            this.f204507e.setFromVoice(false);
            this.f204507e.setFromGroup(z18);
        }
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.view.View a17 = ((io.t) T6).a(view.getContext());
        android.view.View findViewById = a17.findViewById(com.tencent.mm.R.id.uw8);
        ((android.widget.RelativeLayout) this.D.getParent()).addView(a17);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) a17.getLayoutParams();
        layoutParams.addRule(3, com.tencent.mm.R.id.vgx);
        if (z17) {
            layoutParams.addRule(5, com.tencent.mm.R.id.brc);
        } else {
            layoutParams.addRule(0, com.tencent.mm.R.id.f483645bk4);
            layoutParams.addRule(7, com.tencent.mm.R.id.brc);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = i65.a.b(findViewById.getContext(), 5);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setQuoteView(T6);
        return this;
    }

    public final void g() {
        android.view.animation.Animation animation = this.C;
        if (animation != null) {
            animation.cancel();
            this.C = null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f204517o;
    }
}
