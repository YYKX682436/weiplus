package com.tencent.mm.plugin.finder.replay.shopping;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayPluginLayout;", "Lbt2/f;", "Ldt2/b0;", "Ltn0/w0;", "getTRTCLiveCore", "", "getRelativeLayoutId", "getLiveRole", "Landroid/content/Context;", "getUIContext", "Ldt2/d0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setUIClickListener", "Lws2/k2;", "g", "Ljz5/g;", "getSeiProcessViewCallbackProxy", "()Lws2/k2;", "seiProcessViewCallbackProxy", "h", "Ldt2/d0;", "getUiClickListener", "()Ldt2/d0;", "setUiClickListener", "(Ldt2/d0;)V", "uiClickListener", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShoppingReplayPluginLayout extends bt2.f implements dt2.b0 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g seiProcessViewCallbackProxy;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public dt2.d0 uiClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingReplayPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.seiProcessViewCallbackProxy = jz5.h.b(new bt2.d(this));
    }

    private final ws2.k2 getSeiProcessViewCallbackProxy() {
        return (ws2.k2) ((jz5.n) this.seiProcessViewCallbackProxy).getValue();
    }

    @Override // dt2.c0
    public void b(boolean z17, java.util.List list, java.util.List list2) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void bindData(km2.m data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.bindData(data);
        com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(this, ((mm2.c1) business(mm2.c1.class)).f328852o, false, 2, null);
        getShoppingReplayBaseUIC().g(this);
        getShoppingReplayDecorateUIC().f(this);
    }

    @Override // dt2.c0
    public void c(int i17) {
        t(i17);
    }

    @Override // dt2.c0
    public void e(int i17, int i18) {
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.y1(i17);
        }
    }

    @Override // bt2.f, com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public int getLiveRole() {
        return 2;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public int getRelativeLayoutId() {
        return com.tencent.mm.R.layout.azk;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public tn0.w0 getTRTCLiveCore() {
        return null;
    }

    @Override // dt2.b0
    public android.content.Context getUIContext() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    public final dt2.d0 getUiClickListener() {
        return this.uiClickListener;
    }

    @Override // dt2.c0
    public void h() {
        com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(this, ((mm2.c1) business(mm2.c1.class)).f328852o, false, 2, null);
    }

    @Override // dt2.c0
    public void i(int i17) {
        hideLoadingLayer(false);
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.y1(i17);
        }
        at2.y1 y1Var2 = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var2 != null) {
            y1Var2.w1();
        }
    }

    @Override // dt2.c0
    public void j(int i17) {
        t(i17);
    }

    @Override // dt2.c0
    public void k() {
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            android.graphics.drawable.Drawable drawable = y1Var.f365323d.getContext().getDrawable(com.tencent.mm.R.raw.icons_filled_play);
            com.tencent.mm.ui.uk.f(drawable, -1);
            y1Var.f13782r.setImageDrawable(drawable);
            y1Var.x1();
        }
    }

    @Override // dt2.c0
    public void l(int i17, int i18) {
        getShoppingReplayBaseUIC().h(i17, i18);
        at2.u1 u1Var = (at2.u1) getPlugin(at2.u1.class);
        if (u1Var != null) {
            u1Var.t1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onAcceptLiveMic(no0.a info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // no0.g
    public void onBattleApply() {
    }

    @Override // no0.g
    public void onBattleClose() {
    }

    @Override // no0.g
    public void onBattleDismiss() {
    }

    @Override // no0.g
    public void onBattleEnd() {
    }

    @Override // no0.g
    public void onBattleStart() {
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void onCallStateChanged(int i17, java.lang.String incomingNumber) {
        kotlin.jvm.internal.o.g(incomingNumber, "incomingNumber");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onCloseLiveMic(no0.f info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) business(mm2.c1.class)).m8(), info.f338718d)) {
            int i17 = info.f338719e;
            com.tencent.mars.xlog.Log.i(getTAG(), "onCloseLinkMicSelf micType:" + i17);
            return;
        }
        int i18 = info.f338719e;
        com.tencent.mars.xlog.Log.i(getTAG(), "onCloseLinkMicOthers micType:" + i18);
        if (((mm2.c1) business(mm2.c1.class)).P6() == 0 || ((mm2.c1) business(mm2.c1.class)).P6() != 1) {
            return;
        }
        java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext() && !com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) it.next()).f309170a, ((mm2.c1) business(mm2.c1.class)).m8())) {
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onLiveEventCallback(int i17, android.os.Bundle bundle) {
    }

    public final void r(boolean z17) {
        ws2.u0 u0Var = ws2.k1.f449066r;
        u0Var.a().k(getSeiProcessViewCallbackProxy());
        ws2.k1.t(u0Var.a(), -1, null, null, null, false, 30, null);
        if (((ct2.j) business(ct2.j.class)).f222268i > 0) {
            ((ct2.d) business(ct2.d.class)).Q6(((ct2.j) business(ct2.j.class)).f222268i);
            ws2.k1 a17 = u0Var.a();
            ws2.b liveMsgOffsetProcess = (ws2.b) ((jz5.n) new ws2.h(u0Var.a(), new zs2.f(3)).f449045c).getValue();
            kotlin.jvm.internal.o.g(liveMsgOffsetProcess, "liveMsgOffsetProcess");
            a17.f449084p = liveMsgOffsetProcess;
        }
        getShoppingReplayBaseUIC().e(z17, false);
        getShoppingReplayDecorateUIC().e(z17, false);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void release() {
    }

    public final void s() {
        getShoppingReplayBaseUIC().f();
        getShoppingReplayDecorateUIC().getClass();
        ws2.k1.f449066r.a().s(getSeiProcessViewCallbackProxy());
    }

    @Override // dt2.b0
    public void setUIClickListener(dt2.d0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.uiClickListener = listener;
    }

    public final void setUiClickListener(dt2.d0 d0Var) {
        this.uiClickListener = d0Var;
    }

    public final void t(int i17) {
        zi2.w wVar;
        at2.u1 u1Var;
        dt2.a0 a0Var;
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.v1();
        }
        if (i17 == 1 && (u1Var = (at2.u1) getPlugin(at2.u1.class)) != null && (a0Var = u1Var.f13762q) != null) {
            a0Var.f243158a.H();
        }
        zi2.w wVar2 = (zi2.w) getPlugin(zi2.w.class);
        if (!(wVar2 != null && wVar2.w0() == 0) || (wVar = (zi2.w) getPlugin(zi2.w.class)) == null) {
            return;
        }
        wVar.K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void unMount() {
        super.unMount();
    }

    @Override // dt2.b0
    public com.tencent.mm.plugin.finder.live.plugin.l y(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return super.getPlugin(modelClass);
    }
}
