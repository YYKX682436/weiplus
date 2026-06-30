package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class r extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f141619d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.c1 f141620e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f141621f;

    /* renamed from: g, reason: collision with root package name */
    public int f141622g;

    public r(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f141619d = i17;
        this.f141621f = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bh9, (android.view.ViewGroup) this, false);
        if (((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(2) == 0 || !z17) {
            addView(this.f141621f);
            return;
        }
        com.tencent.mm.plugin.game.ui.message.c1 c1Var = new com.tencent.mm.plugin.game.ui.message.c1(getContext(), i17);
        this.f141620e = c1Var;
        c1Var.setEmptyCallback(new com.tencent.mm.plugin.game.ui.message.q(this));
        addView(this.f141620e, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public void a() {
        if (((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(2) == 0) {
            com.tencent.mm.plugin.game.ui.message.c1 c1Var = this.f141620e;
            if (c1Var != null && indexOfChild(c1Var) >= 0) {
                removeView(this.f141620e);
            }
            android.view.View view = this.f141621f;
            if (view == null || indexOfChild(view) >= 0) {
                return;
            }
            addView(this.f141621f);
        }
    }

    public void setNewMessageCount(int i17) {
        this.f141622g = i17;
    }
}
