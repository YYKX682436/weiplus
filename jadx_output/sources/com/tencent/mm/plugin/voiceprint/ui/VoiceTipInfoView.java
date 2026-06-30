package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class VoiceTipInfoView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f176224d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f176225e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f176226f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f176227g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f176228h;

    public VoiceTipInfoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f176225e = false;
        this.f176228h = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.db6, (android.view.ViewGroup) this, true);
        this.f176224d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.p6i);
        this.f176226f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.p6k);
        this.f176227g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.p6j);
        b();
    }

    public void a() {
        if (this.f176227g.getVisibility() != 0 || this.f176228h) {
            this.f176227g.clearAnimation();
            this.f176227g.setVisibility(4);
        } else {
            this.f176227g.clearAnimation();
            this.f176228h = true;
            com.tencent.mm.plugin.voiceprint.ui.g1.a(this.f176227g, getContext(), new com.tencent.mm.plugin.voiceprint.ui.y0(this));
        }
    }

    public void b() {
        this.f176226f.setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480633ae1));
        this.f176226f.getTextSize();
        this.f176226f.clearAnimation();
    }

    public void c() {
        this.f176227g.animate().alpha(1.0f).setDuration(200L).withStartAction(new com.tencent.mm.plugin.voiceprint.ui.x0(this)).start();
    }

    public void d() {
        this.f176224d.getVisibility();
        if ((this.f176224d.getVisibility() != 4 && this.f176224d.getVisibility() != 8) || this.f176225e) {
            this.f176224d.clearAnimation();
            this.f176224d.setVisibility(0);
            this.f176224d.invalidate();
            return;
        }
        this.f176224d.clearAnimation();
        this.f176225e = true;
        android.widget.TextView textView = this.f176224d;
        android.content.Context context = getContext();
        com.tencent.mm.plugin.voiceprint.ui.v0 v0Var = new com.tencent.mm.plugin.voiceprint.ui.v0(this);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477783bc);
        loadAnimation.setDuration(300L);
        loadAnimation.setFillAfter(true);
        loadAnimation.setRepeatCount(0);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.voiceprint.ui.d1(v0Var));
        textView.startAnimation(loadAnimation);
    }

    public void setErr(java.lang.String str) {
        this.f176227g.setText(str);
    }

    public void setTipText(java.lang.String str) {
        this.f176226f.setText(str);
        this.f176226f.setVisibility(0);
    }

    public void setTitleText(java.lang.String str) {
        this.f176224d.setText(str);
        this.f176224d.setVisibility(0);
    }

    public void setErr(int i17) {
        this.f176227g.setText(i17);
    }

    public void setTipText(int i17) {
        this.f176226f.setText(i17);
        this.f176226f.setVisibility(0);
    }

    public void setTitleText(int i17) {
        this.f176224d.setText(i17);
        this.f176224d.setVisibility(0);
    }
}
