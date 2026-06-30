package sj2;

/* loaded from: classes10.dex */
public abstract class i extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f408386J;
    public int K;
    public java.util.ArrayList L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        super(context, pluginAbility, service, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    public boolean Z() {
        if (sn0.b.f409964e2 != null) {
            return true;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if ((w0Var == null || w0Var.X()) ? false : true) {
            if (!(in0.q.f292769b2 != null)) {
                return true;
            }
        }
        return false;
    }

    public final void a0() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.N1 = !c1Var.N1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", c1Var.N1);
            qo0.c q17 = getPluginAbility().q();
            if (q17 != null) {
                q17.statusChange(qo0.b.Z2, bundle);
            }
        }
    }

    public abstract void b0(boolean z17);

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    @Override // wj2.w, sj2.m
    public /* bridge */ /* synthetic */ android.view.ViewGroup getGiftRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getLuckyMoneyRootView() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    public sj2.m getMicGiftCallback() {
        return this;
    }

    public final java.util.ArrayList<android.graphics.RectF> getPotholingRectList() {
        return this.L;
    }

    public final int getRightOffestSize() {
        return this.K;
    }

    public abstract com.tencent.mm.ui.widget.RoundCornerConstraintLayout getRoundCornerConstraintLayout();

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    public final void setAudioMode(boolean z17) {
        this.f408386J = z17;
    }

    public final void setFocus(boolean z17) {
        this.M = z17;
    }

    public final void setPotholingRectList(java.util.ArrayList<android.graphics.RectF> arrayList) {
        this.L = arrayList;
    }

    public final void setRightOffestSize(int i17) {
        this.K = i17;
    }

    public final void setScreenMode(boolean z17) {
    }
}
