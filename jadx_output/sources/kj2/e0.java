package kj2;

/* loaded from: classes10.dex */
public class e0 extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public int f308396J;
    public final fg2.f0 K;
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout L;
    public final android.widget.TextView M;
    public android.graphics.drawable.Drawable N;
    public final android.graphics.drawable.Drawable P;
    public final android.graphics.drawable.Drawable Q;
    public final android.graphics.drawable.Drawable R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        fg2.f0 a17 = fg2.f0.a(com.tencent.mm.ui.id.b(context), this, false);
        this.K = a17;
        fg2.h1 h1Var = a17.f262026b;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = h1Var.f262063a;
        kotlin.jvm.internal.o.f(roundCornerRelativeLayout, "getRoot(...)");
        this.L = roundCornerRelativeLayout;
        android.widget.TextView tagTextView = h1Var.f262064b;
        kotlin.jvm.internal.o.f(tagTextView, "tagTextView");
        this.M = tagTextView;
        this.P = context.getResources().getDrawable(com.tencent.mm.R.color.f479091af4);
        this.Q = context.getResources().getDrawable(com.tencent.mm.R.color.af6);
        this.R = context.getResources().getDrawable(com.tencent.mm.R.color.f479093af5);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a17.f262025a;
        addView(constraintLayout);
        if (pluginAbility.f() == lj2.w0.f318958d) {
            constraintLayout.setOnClickListener(this);
        }
        pluginAbility.a0().b(new kj2.d0(this));
    }

    private final android.graphics.drawable.Drawable getTeamTagDrawable() {
        xh2.i iVar;
        lj2.t0 a07 = getPluginAbility().a0();
        xh2.a bindMicData = getBindMicData();
        if (a07.d((bindMicData == null || (iVar = bindMicData.f454521b) == null) ? 0 : iVar.f454553e)) {
            android.graphics.drawable.Drawable drawable = this.Q;
            kotlin.jvm.internal.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.R;
        kotlin.jvm.internal.o.d(drawable2);
        return drawable2;
    }

    @Override // lj2.u0
    public void g() {
        r(this.K.f262028d, this.M, this.L);
    }

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

    @Override // lj2.j
    public android.graphics.drawable.Drawable getTagLayoutBackgroundDrawable() {
        dk2.u4 K = getPluginAbility().a0().K();
        lj2.w0 f17 = getPluginAbility().f();
        lj2.w0 w0Var = lj2.w0.f318958d;
        android.graphics.drawable.Drawable drawable = this.P;
        if (f17 != w0Var && getPluginAbility().f() != lj2.w0.f318959e) {
            int a17 = getPluginAbility().a0().a();
            if ((a17 == 5 || a17 == 4) && getCurWidgetMode() == pm2.a.f356862r) {
                if (a17 == 5) {
                    return getTeamTagDrawable();
                }
                kotlin.jvm.internal.o.d(drawable);
                return drawable;
            }
        } else if (K != null && getCurWidgetMode() == pm2.a.f356862r) {
            if (K.f234160g == 2) {
                return getTeamTagDrawable();
            }
            kotlin.jvm.internal.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.N;
        if (drawable2 != null) {
            return drawable2;
        }
        android.graphics.drawable.Drawable tagLayoutBackgroundDrawable = super.getTagLayoutBackgroundDrawable();
        kotlin.jvm.internal.o.f(tagLayoutBackgroundDrawable, "getTagLayoutBackgroundDrawable(...)");
        return tagLayoutBackgroundDrawable;
    }

    @Override // lj2.j
    public java.lang.String getTagString() {
        return "GrabRequestWidget";
    }

    @Override // lj2.j
    public int getTagTextColor() {
        return getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4);
    }

    @Override // wj2.w, lj2.u0
    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    @Override // wj2.w, lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        super.l(widgetMode, data);
        this.f308396J = data.f454521b.f454553e;
        fg2.f0 f0Var = this.K;
        f0Var.f262029e.setText(zl2.r4.f473950a.x1() ? getContext().getResources().getString(com.tencent.mm.R.string.lko) : getContext().getResources().getString(com.tencent.mm.R.string.dw8));
        f0Var.f262027c.setImageResource(com.tencent.mm.R.raw.icons_outlined_add);
        f0Var.f262028d.setBackgroundResource(com.tencent.mm.R.drawable.c3m);
        r(f0Var.f262028d, this.M, this.L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 service;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.K.f262025a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f473950a.w1()) {
                fj2.s.h(fj2.s.f263183a, ml2.w4.f328187e, null, 0, 0, 14, null);
                xh2.a bindMicData = getBindMicData();
                if (bindMicData != null && (service = getService()) != null) {
                    service.e(bindMicData);
                }
            } else {
                lj2.x0 service2 = getService();
                if (service2 != null) {
                    service2.S(this.f308396J);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
