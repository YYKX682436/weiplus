package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyWishFooter extends com.tencent.mm.ui.BasePanelKeybordLayout {

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f146679n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageButton f146680o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f146681p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f146682q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f146683r;

    /* renamed from: s, reason: collision with root package name */
    public int f146684s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f146685t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f146686u;

    public LuckyMoneyWishFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f146684s = 0;
        this.f146685t = false;
        this.f146686u = true;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f146679n = mMActivity;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.bva, this);
        this.f146682q = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.j7g);
        i(false);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.j7f);
        this.f146680o = imageButton;
        imageButton.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.mp(this));
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) viewGroup.findViewById(com.tencent.mm.R.id.j7d);
        this.f146681p = mMEditText;
        mMEditText.setOnTouchListener(new com.tencent.mm.plugin.luckymoney.ui.np(this));
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f146683r = new com.tencent.mm.pluginsdk.ui.chat.t5(mMActivity);
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f146683r = wi6;
        wi6.setEntranceScene(0);
        this.f146683r.setVisibility(8);
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g)).addView(this.f146683r, -1, 0);
        this.f146683r.c();
        this.f146683r.i();
        this.f146683r.setOnTextOperationListener(new com.tencent.mm.plugin.luckymoney.ui.op(this));
    }

    @Override // com.tencent.mm.ui.KeyboardLinearLayout
    public void e(int i17) {
        super.e(i17);
    }

    @Override // com.tencent.mm.ui.BasePanelKeybordLayout
    public java.util.List<android.view.View> getPanelView() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f146683r);
        return arrayList;
    }

    public final void i(boolean z17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477843d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477848d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.widget.Button button = this.f146682q;
        if (button == null) {
            return;
        }
        if (z17) {
            if (button.getVisibility() == 8 || this.f146682q.getVisibility() == 4) {
                return;
            }
            this.f146682q.startAnimation(loadAnimation2);
            this.f146682q.setVisibility(8);
            return;
        }
        if (button.getVisibility() == 0 || this.f146682q.getVisibility() == 0) {
            return;
        }
        this.f146682q.startAnimation(loadAnimation);
        this.f146682q.setVisibility(0);
    }

    public final void j() {
        int i17 = this.f146684s;
        com.tencent.mm.ui.MMActivity mMActivity = this.f146679n;
        if (i17 == 0) {
            this.f146681p.requestFocus();
            mMActivity.getWindow().setSoftInputMode(16);
            mMActivity.showVKB();
            this.f146683r.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.kp(this), 200L);
            return;
        }
        this.f146681p.requestFocus();
        mMActivity.getWindow().setSoftInputMode(32);
        mMActivity.hideVKB();
        this.f146683r.i();
        this.f146683r.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.lp(this), 200L);
        android.view.ViewGroup.LayoutParams layoutParams = this.f146683r.getLayoutParams();
        if ((layoutParams == null || layoutParams.height > 0) && !(layoutParams != null && com.tencent.mm.sdk.platformtools.d2.j(getContext()) && this.f146686u)) {
            return;
        }
        layoutParams.height = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f146683r.setLayoutParams(layoutParams);
        this.f146686u = false;
    }

    public void setHint(java.lang.String str) {
        this.f146681p.setHint(str);
    }

    public void setMaxLength(int i17) {
        this.f146681p.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
    }

    public void setModeClick(boolean z17) {
        this.f146685t = z17;
    }

    public void setOnEditTouchListener(com.tencent.mm.plugin.luckymoney.ui.qp qpVar) {
    }

    public void setOnSmileyShowListener(com.tencent.mm.plugin.luckymoney.ui.sp spVar) {
    }

    public void setOnWishSendImp(com.tencent.mm.plugin.luckymoney.ui.rp rpVar) {
        this.f146682q.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.pp(this, rpVar));
    }

    public void setText(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f146681p;
        if (mMEditText != null) {
            mMEditText.setText("");
            this.f146681p.n(str);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        this.f146684s = 0;
        boolean z17 = i17 == 0;
        if (this.f146683r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "showState " + z17);
            if (z17) {
                j();
                this.f146686u = false;
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mm.sdk.platformtools.z3.b(true);
                this.f146683r.setVisibility(8);
                this.f146680o.setImageResource(com.tencent.mm.R.raw.icons_outlined_emoji);
                this.f146679n.hideVKB();
                setModeClick(true);
                requestLayout();
            }
        }
        super.setVisibility(i17);
    }
}
