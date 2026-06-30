package com.tencent.mm.plugin.finder.replay;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010%\u001a\u00020\b\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*B\u0019\b\u0016\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\"\u0010#¨\u0006,"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveReplayPluginLayout;", "Lcom/tencent/mm/plugin/finder/live/view/k0;", "Ldt2/b0;", "", "getRelativeLayoutId", "Ltn0/w0;", "getTRTCLiveCore", "getLiveRole", "Landroid/content/Context;", "getUIContext", "Ldt2/d0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setUIClickListener", "Lws2/k2;", "h", "Ljz5/g;", "getSeiProcessViewCallbackProxy", "()Lws2/k2;", "seiProcessViewCallbackProxy", "Lxs2/b1;", "i", "getVideoPlayLifecycleProxy", "()Lxs2/b1;", "videoPlayLifecycleProxy", "m", "Ldt2/d0;", "getUiClickListener", "()Ldt2/d0;", "setUiClickListener", "(Ldt2/d0;)V", "uiClickListener", "Lws2/p0;", "n", "getHelper", "()Lws2/p0;", "helper", "context", "Landroid/util/AttributeSet;", "attr", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveReplayPluginLayout extends com.tencent.mm.plugin.finder.live.view.k0 implements dt2.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final ws2.o f124869d;

    /* renamed from: e, reason: collision with root package name */
    public final ws2.y f124870e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f124871f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f124872g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g seiProcessViewCallbackProxy;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoPlayLifecycleProxy;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public dt2.d0 uiClickListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g helper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveReplayPluginLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, null, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f124869d = new ws2.o(mMActivity, ws2.i0.f449053d);
        this.f124870e = new ws2.y(mMActivity);
        this.f124871f = new ws2.f0(this);
        this.f124872g = new ws2.g0(this);
        this.seiProcessViewCallbackProxy = jz5.h.b(new ws2.j0(this));
        this.videoPlayLifecycleProxy = jz5.h.b(new ws2.k0(this));
        this.helper = jz5.h.b(new ws2.e0(this));
    }

    private final ws2.p0 getHelper() {
        return (ws2.p0) ((jz5.n) this.helper).getValue();
    }

    private final ws2.k2 getSeiProcessViewCallbackProxy() {
        return (ws2.k2) ((jz5.n) this.seiProcessViewCallbackProxy).getValue();
    }

    private final xs2.b1 getVideoPlayLifecycleProxy() {
        return (xs2.b1) ((jz5.n) this.videoPlayLifecycleProxy).getValue();
    }

    public static void s(com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        finderLiveReplayPluginLayout.f124870e.g(z17, z18, z19);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018e  */
    @Override // com.tencent.mm.plugin.finder.live.view.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void activate(km2.m r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout.activate(km2.m, boolean, boolean):void");
    }

    @Override // dt2.c0
    public void b(boolean z17, java.util.List list, java.util.List list2) {
        xs2.o oVar;
        at2.i iVar = (at2.i) getPlugin(at2.i.class);
        if (iVar == null || list == null) {
            return;
        }
        if (z17 && (oVar = iVar.f13686s) != null) {
            ((xs2.q0) oVar).i().f438852d.U4();
        }
        xs2.o oVar2 = iVar.f13686s;
        if (oVar2 != null) {
            ((xs2.q0) oVar2).c(list, "onBulletIncrease");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void bindData(km2.m data) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(data, "data");
        if (((mm2.e1) data.f309130e.a(mm2.e1.class)).f328983m == 0) {
            ws2.n1.f449105a.c(data, 2);
        }
        super.bindData(data);
        com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(this, ((mm2.c1) business(mm2.c1.class)).f328852o, false, 2, null);
        showBlurBg();
        ((we2.s) business(we2.s.class)).O6();
        this.f124869d.g(this);
        this.f124870e.f(this);
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "bindData bgInfo:" + getBgInfo() + '!');
    }

    @Override // dt2.c0
    public void c(int i17) {
        at2.u1 u1Var;
        dt2.a0 a0Var;
        zi2.w wVar;
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var;
        if (((mm2.g0) business(mm2.g0.class)).T6()) {
            getWarnningCountWidget().b();
            showBlurBg();
            fillBlurBg(((mm2.c1) business(mm2.c1.class)).f328852o, true);
            com.tencent.mm.plugin.finder.live.plugin.le0 le0Var2 = (com.tencent.mm.plugin.finder.live.plugin.le0) getPlugin(com.tencent.mm.plugin.finder.live.plugin.le0.class);
            if ((le0Var2 != null && le0Var2.w0() == 0) && (le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) getPlugin(com.tencent.mm.plugin.finder.live.plugin.le0.class)) != null) {
                le0Var.K0(8);
            }
            zi2.w wVar2 = (zi2.w) getPlugin(zi2.w.class);
            if ((wVar2 != null && wVar2.w0() == 0) && (wVar = (zi2.w) getPlugin(zi2.w.class)) != null) {
                wVar.K0(8);
            }
        } else {
            if (i17 == 1 && (u1Var = (at2.u1) getPlugin(at2.u1.class)) != null && (a0Var = u1Var.f13762q) != null) {
                a0Var.f243158a.H();
            }
            ws2.y yVar = this.f124870e;
            yVar.getClass();
            d75.b.g(new ws2.x(yVar));
        }
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.v1();
        }
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = (com.tencent.mm.plugin.finder.live.plugin.fa) getPlugin(com.tencent.mm.plugin.finder.live.plugin.fa.class);
        if (faVar != null) {
            faVar.w1();
        }
    }

    @Override // dt2.c0
    public void e(int i17, int i18) {
        java.lang.String str;
        if (((ct2.j) business(ct2.j.class)).f222265f) {
            return;
        }
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.y1(i17);
        }
        if (((mm2.g0) business(mm2.g0.class)).T6()) {
            com.tencent.mm.plugin.finder.live.plugin.ad adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class);
            if (adVar != null) {
                r45.q84 q84Var = new r45.q84();
                q84Var.set(0, 1);
                q84Var.set(2, java.lang.Integer.valueOf(ct2.j.U6((ct2.j) business(ct2.j.class), 0, 1, null)));
                int integer = q84Var.getInteger(2);
                if (integer > i18) {
                    integer = i18;
                }
                q84Var.set(1, java.lang.Integer.valueOf(integer - i17));
                if (adVar.B || i17 <= 0 || i18 <= 0 || q84Var.getInteger(1) > 0 || adVar.a1()) {
                    adVar.E1(q84Var);
                } else {
                    com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
                    str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
                    com.tencent.mars.xlog.Log.i(str, "updatePlayProgress offset:" + i17 + ",total:" + i18 + ",time_limit:" + q84Var.getInteger(2));
                    qo0.c.a(this, qo0.b.X4, null, 2, null);
                }
            }
            int U6 = ct2.j.U6((ct2.j) business(ct2.j.class), 0, 1, null);
            if (((ct2.j) business(ct2.j.class)).f222274r >= U6) {
                com.tencent.mm.plugin.finder.live.widget.k40 warnningCountWidget = getWarnningCountWidget();
                if (U6 <= i18) {
                    i18 = U6;
                }
                warnningCountWidget.a(i18 - i17);
            }
        }
    }

    @Override // dt2.c0
    public void f() {
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.w1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public int getLiveRole() {
        return 0;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public int getRelativeLayoutId() {
        return com.tencent.mm.R.layout.dao;
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
        com.tencent.mm.plugin.finder.live.plugin.ad adVar;
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        hideLoadingLayer(false);
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.y1(i17);
        }
        at2.y1 y1Var2 = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var2 != null) {
            y1Var2.w1();
        }
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = (com.tencent.mm.plugin.finder.live.plugin.fa) getPlugin(com.tencent.mm.plugin.finder.live.plugin.fa.class);
        if (faVar != null && (finderLiveThumbPlayerProxy = faVar.f112528s) != null) {
            if (!(finderLiveThumbPlayerProxy.f124895n == 6)) {
                finderLiveThumbPlayerProxy = null;
            }
            if (finderLiveThumbPlayerProxy != null) {
                finderLiveThumbPlayerProxy.play();
            }
        }
        if (!((mm2.g0) business(mm2.g0.class)).T6() || (adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class)) == null || i17 > 0 || adVar.w0() != 0) {
            return;
        }
        adVar.x1(true);
    }

    @Override // dt2.c0
    public void j(int i17) {
        at2.u1 u1Var;
        dt2.a0 a0Var;
        if (((mm2.g0) business(mm2.g0.class)).T6()) {
            getWarnningCountWidget().b();
        }
        at2.y1 y1Var = (at2.y1) getPlugin(at2.y1.class);
        if (y1Var != null) {
            y1Var.v1();
        }
        if (i17 == 1 && (u1Var = (at2.u1) getPlugin(at2.u1.class)) != null && (a0Var = u1Var.f13762q) != null) {
            a0Var.f243158a.H();
        }
        ws2.y yVar = this.f124870e;
        yVar.getClass();
        d75.b.g(new ws2.x(yVar));
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = (com.tencent.mm.plugin.finder.live.plugin.fa) getPlugin(com.tencent.mm.plugin.finder.live.plugin.fa.class);
        if (faVar != null) {
            faVar.w1();
        }
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
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = (com.tencent.mm.plugin.finder.live.plugin.fa) getPlugin(com.tencent.mm.plugin.finder.live.plugin.fa.class);
        if (faVar != null) {
            faVar.w1();
        }
    }

    @Override // dt2.c0
    public void l(int i17, int i18) {
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var;
        dt2.a0 a0Var;
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        this.f124869d.h(i17, i18);
        at2.u1 u1Var = (at2.u1) getPlugin(at2.u1.class);
        if (u1Var != null) {
            u1Var.t1();
        }
        at2.u1 u1Var2 = (at2.u1) getPlugin(at2.u1.class);
        if (u1Var2 != null && (a0Var = u1Var2.f13762q) != null && (finderLiveThumbPlayerProxy = a0Var.f243158a) != null) {
            finderLiveThumbPlayerProxy.postDelayed(new ws2.h0(finderLiveThumbPlayerProxy, this), 100L);
        }
        if (((ct2.j) business(ct2.j.class)).f222269m == 3 || (le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) getPlugin(com.tencent.mm.plugin.finder.live.plugin.le0.class)) == null) {
            return;
        }
        le0Var.x1(((mm2.c1) business(mm2.c1.class)).L9(), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void mount() {
        super.mount();
        no0.h hVar = no0.h.f338720a;
        hVar.c(name(), this.f124871f);
        hVar.d(name(), this.f124872g);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onAcceptLiveMic(no0.a info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onAnchorCallInterruption(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onAnchorConnectionChange(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onApplyLiveMic(no0.b info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onBanLiveComment(no0.c info) {
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

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onCloseApplyLiveMic(no0.d info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onCloseLiveMic(no0.f info) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(info, "info");
        if (com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) business(mm2.c1.class)).m8(), info.f338718d)) {
            int i17 = info.f338719e;
            com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
            str2 = com.tencent.mm.plugin.finder.live.view.k0.TAG;
            com.tencent.mars.xlog.Log.i(str2, "onCloseLinkMicSelf micType:" + i17);
            return;
        }
        int i18 = info.f338719e;
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        com.tencent.mars.xlog.Log.i(str, "onCloseLinkMicOthers micType:" + i18);
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

    @Override // com.tencent.mm.plugin.finder.live.view.k0, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onLiveEventCallback(int i17, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onLiveMicSucc(no0.j info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onOnlineLiveList(no0.n info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    public final void r() {
        java.util.LinkedList linkedList;
        this.f124869d.f();
        ws2.y yVar = this.f124870e;
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = yVar.f449164l;
        if (x80Var != null && (linkedList = x80Var.f115053t) != null) {
            linkedList.clear();
        }
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = yVar.f449165m;
        if (adVar != null) {
            adVar.K0(8);
        }
        at2.i iVar = yVar.f449166n;
        if (iVar != null) {
            iVar.K0(8);
        }
        at2.n1 n1Var = yVar.f449167o;
        if (n1Var != null) {
            n1Var.K0(8);
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = yVar.f449163k;
        if (mgVar != null) {
            mgVar.K0(8);
        }
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = yVar.f449161i;
        if (khVar != null) {
            khVar.K0(8);
        }
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var = yVar.f449159g;
        if (le0Var != null) {
            le0Var.K0(8);
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = yVar.f449158f;
        if (nd0Var != null) {
            nd0Var.K0(8);
        }
        ws2.u0 u0Var = ws2.k1.f449066r;
        u0Var.a().s(getSeiProcessViewCallbackProxy());
        ws2.k1 a17 = u0Var.a();
        xs2.b1 proxy = getVideoPlayLifecycleProxy();
        kotlin.jvm.internal.o.g(proxy, "proxy");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayService", "unregisterVideoLifecycleProxy:" + proxy.hashCode());
        a17.f449079k.remove(proxy);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void release() {
    }

    @Override // dt2.b0
    public void setUIClickListener(dt2.d0 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.uiClickListener = listener;
    }

    public final void setUiClickListener(dt2.d0 d0Var) {
        this.uiClickListener = d0Var;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.statusChange(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 130) {
            onScreenClear(bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR") : false);
            return;
        }
        if (ordinal == 231) {
            getHelper().c(getBuContext(), true, false);
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
        } else {
            if (ordinal != 232) {
                return;
            }
            dt2.c0.g(this, 0, 1, null);
            at2.u1 u1Var = (at2.u1) getPlugin(at2.u1.class);
            if (u1Var != null) {
                u1Var.x1();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void unMount() {
        super.unMount();
        no0.h.f338720a.e();
    }

    @Override // dt2.b0
    public com.tencent.mm.plugin.finder.live.plugin.l y(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return super.getPlugin(modelClass);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveReplayPluginLayout(android.content.Context context, android.util.AttributeSet attr) {
        this(context, attr, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attr, "attr");
    }
}
