package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f141528d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.t0 f141529e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f141530f;

    /* renamed from: g, reason: collision with root package name */
    public int f141531g;

    public c(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f141528d = i17;
        this.f141530f = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bh9, (android.view.ViewGroup) this, false);
        if (((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(1) == 0 || !z17) {
            addView(this.f141530f);
            return;
        }
        com.tencent.mm.plugin.game.ui.message.t0 t0Var = new com.tencent.mm.plugin.game.ui.message.t0(getContext(), i17);
        this.f141529e = t0Var;
        t0Var.setEmptyCallback(new com.tencent.mm.plugin.game.ui.message.a(this));
        addView(this.f141529e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_NOT_DISTURB_GUIDANCE_COUNT_INT;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c17.m(u3Var, 0));
        if (q17 > 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(q17 + 1));
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 0, true);
        z2Var.y(getResources().getString(com.tencent.mm.R.string.fmq));
        z2Var.x(1);
        z2Var.F = new com.tencent.mm.plugin.game.ui.message.b(this, z2Var);
        z2Var.j(android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bh_, (android.view.ViewGroup) null));
        z2Var.C();
    }

    public void a() {
        if (((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().f1(1) == 0) {
            com.tencent.mm.plugin.game.ui.message.t0 t0Var = this.f141529e;
            if (t0Var != null && indexOfChild(t0Var) >= 0) {
                removeView(this.f141529e);
            }
            android.view.View view = this.f141530f;
            if (view == null || indexOfChild(view) >= 0) {
                return;
            }
            addView(this.f141530f);
        }
    }

    public void setNewMessageCount(int i17) {
        this.f141531g = i17;
    }
}
