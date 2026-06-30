package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class im extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199237e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f199238f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199239g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f199240h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.z4 f199241i = new com.tencent.mm.ui.chatting.component.hm(this);

    public final void m0(java.lang.Boolean bool, java.lang.Boolean bool2) {
        android.view.View view = this.f199237e;
        if (view != null) {
            view.clearAnimation();
            android.view.View view2 = this.f199237e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TipsBubbleComponent", "removeTipsBubble", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/TipsBubbleComponent", "removeTipsBubble", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (bool2.booleanValue()) {
                if (bool.booleanValue()) {
                    c01.d9.b().p().w(340228, java.lang.Boolean.TRUE);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(232L, 1L, 1L, false);
                    return;
                }
                return;
            }
            if (bool.booleanValue()) {
                c01.d9.b().p().w(340229, java.lang.Boolean.TRUE);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(232L, 2L, 1L, false);
            }
        }
    }

    public final void n0(java.lang.Boolean bool) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.view.View view;
        this.f199238f = (android.view.ViewGroup) this.f198580d.c(com.tencent.mm.R.id.bki);
        android.view.View inflate = android.view.View.inflate(this.f198580d.g(), com.tencent.mm.R.layout.c7t, null);
        this.f199237e = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k_7);
        if (bool.booleanValue()) {
            textView.setText(this.f198580d.g().getString(com.tencent.mm.R.string.iib));
            this.f199237e.setBackgroundResource(com.tencent.mm.R.drawable.ccf);
            layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 85);
        } else {
            textView.setText(this.f198580d.g().getString(com.tencent.mm.R.string.iig));
            this.f199237e.setBackgroundResource(com.tencent.mm.R.drawable.cce);
            layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 83);
        }
        android.view.ViewGroup viewGroup = this.f199238f;
        if (viewGroup == null || (view = this.f199237e) == null) {
            return;
        }
        viewGroup.addView(view, layoutParams);
        this.f199237e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.f198580d.g(), com.tencent.mm.R.anim.f477874dy));
        this.f199237e.setOnClickListener(new com.tencent.mm.ui.chatting.component.gm(this, bool));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (c01.z1.H().booleanValue()) {
            if (!this.f198580d.u().k2()) {
                boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340228, null));
                this.f199239g = n17;
                if (!n17 && !((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) this.f198580d.f460708c.a(sb5.n.class))).u0() && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).P) {
                    n0(java.lang.Boolean.TRUE);
                }
                this.f199240h = com.tencent.mm.sdk.platformtools.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340229, null));
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) c01.d9.b().p().l(340240, null), 0L);
                if (this.f199239g && !this.f199240h && currentTimeMillis >= 259200000) {
                    n0(java.lang.Boolean.FALSE);
                }
            }
            if (((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e != null) {
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.setTipsShowCallback(this.f199241i);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (this.f198580d.u().k2() || !c01.z1.H().booleanValue()) {
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        m0(bool, bool);
    }
}
