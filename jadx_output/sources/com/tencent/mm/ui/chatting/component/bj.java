package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.o1.class)
/* loaded from: classes5.dex */
public class bj extends com.tencent.mm.ui.chatting.component.a implements sb5.o1 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f198826e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.r2 f198827f;

    /* renamed from: g, reason: collision with root package name */
    public long f198828g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f198829h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f198830i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f198831m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f198832n;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.f483660bm2);
        this.f198826e = c17;
        if (c17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f198828g = 0L;
        this.f198829h = "";
        this.f198831m = 0L;
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        long j17 = this.f198830i;
        if (j17 < i17 || j17 >= i17 + i18) {
            return;
        }
        m0();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        com.tencent.mm.ui.chatting.view.r2 r2Var;
        if (i17 == 1 && (r2Var = this.f198827f) != null && r2Var.isShowing()) {
            this.f198827f.dismiss();
        }
    }

    public void m0() {
        android.view.View view = this.f198826e;
        if (view == null) {
            return;
        }
        if (view.getVisibility() == 0) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, this.f198826e.getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(this.f198580d.g(), android.R.anim.accelerate_interpolator));
            this.f198826e.startAnimation(translateAnimation);
            this.f198831m = 0L;
            this.f198828g = 0L;
            this.f198830i = 0L;
            this.f198829h = "";
        }
        android.view.View view2 = this.f198826e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent", "dismissMsgTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void n0(android.view.View view, android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.chatting.view.r2 r2Var = this.f198827f;
        if (r2Var != null) {
            r2Var.dismiss();
            this.f198827f = null;
        }
        this.f198827f = new com.tencent.mm.ui.chatting.view.r2(view.getContext());
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        try {
            com.tencent.mm.ui.chatting.view.r2 r2Var2 = this.f198827f;
            r2Var2.f203075f = iArr[0];
            r2Var2.f203076g = i65.a.b(view.getContext(), 2);
            this.f198827f.f203077h = i65.a.b(view.getContext(), 100);
            this.f198827f.a(view);
            this.f198827f.f203079j = onClickListener;
        } catch (java.lang.Throwable unused) {
        }
    }

    public void o0(int i17) {
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav;
        android.view.View view = this.f198826e;
        if (view == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        if (i17 == -2) {
            if (((com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) this.f198580d.f460708c.a(sb5.j2.class))).s0()) {
                return;
            }
            layoutParams.setMargins(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) * 3);
        } else {
            if (i17 == 3) {
                layoutParams.setMargins(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) * 3);
                return;
            }
            if (i17 == 0) {
                layoutParams.setMargins(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) * 3);
                return;
            }
            if (i17 != 1) {
                return;
            }
            com.tencent.mm.ui.chatting.component.sm smVar = (com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) this.f198580d.f460708c.a(sb5.j2.class));
            int height = (!smVar.s0() || (talkRoomPopupNav = smVar.f199951f) == null) ? 0 : talkRoomPopupNav.getHeight();
            if (height < 0 || height <= 0) {
                height = 0;
            }
            layoutParams.setMargins(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) + height);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.ui.chatting.view.r2 r2Var = this.f198827f;
        if (r2Var != null) {
            r2Var.dismiss();
        }
    }
}
