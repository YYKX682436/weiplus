package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.n0.class)
/* loaded from: classes7.dex */
public final class w9 extends com.tencent.mm.ui.chatting.component.a implements sb5.n0, a12.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f200161e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f200162f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f200163g;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (m0()) {
            this.f200162f = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "onChattingExitAnimEnd, component:" + hashCode());
            ((a12.s) ((a12.k) i95.n0.c(a12.k.class))).Ni();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "onComponentInstall, this:" + hashCode());
        }
    }

    public final boolean m0() {
        return com.tencent.mm.storage.z3.p4(this.f198580d.x());
    }

    public void n0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "markAllView update isForeGround:" + this.f200162f);
        o0();
        if (this.f200162f) {
            this.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    public final void o0() {
        for (com.tencent.mm.ui.chatting.viewitems.g0 g0Var : this.f200161e.values()) {
            kotlin.jvm.internal.o.d(g0Var);
            p0(g0Var, true);
        }
    }

    public final void p0(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, boolean z17) {
        com.tencent.mm.storage.f9 currentMsgInfo = g0Var.getCurrentMsgInfo(this.f198580d);
        if (currentMsgInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "holder msg is null");
            return;
        }
        com.tencent.mm.storage.a9 a9Var = currentMsgInfo.f193927g2;
        kotlin.jvm.internal.o.e(a9Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgEcsKFDynamicCard.MsgExtInfoAppMsgEcsKFDynamicCard");
        com.tencent.mm.ui.chatting.viewitems.f6 f6Var = (com.tencent.mm.ui.chatting.viewitems.f6) a9Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "EcsKF markViewUpdate msgid: " + currentMsgInfo.getMsgId() + ", msg extinfo oldrefresh:" + f6Var.f203943d + ", newrefresh:" + z17);
        f6Var.f203943d = z17;
        currentMsgInfo.f193927g2 = f6Var;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (m0()) {
            a12.k kVar = (a12.k) i95.n0.c(a12.k.class);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "onChattingResume, component:" + kVar.hashCode());
            this.f200162f = true;
            a12.s sVar = (a12.s) kVar;
            sVar.f525f = new java.lang.ref.WeakReference(this);
            this.f200163g = this.f198580d.c(com.tencent.mm.R.id.f483683bp0);
            o0();
            if (!sVar.f526g) {
                sVar.Ai();
            }
            this.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "onChattingPause, component:" + hashCode());
            this.f200162f = false;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        android.util.LruCache lruCache;
        if (m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKFComponent", "onChattingEnterAnimStart, component:" + hashCode());
            a12.s sVar = (a12.s) ((a12.k) i95.n0.c(a12.k.class));
            sVar.getClass();
            sVar.f525f = new java.lang.ref.WeakReference(this);
            int i17 = 0;
            this.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
            com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
            qVar.c("ilinkres_8f0d67bd");
            ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
            java.lang.String x17 = this.f198580d.x();
            com.tencent.mm.sdk.coroutines.LifecycleScope i18 = this.f198580d.i();
            if (x17.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: empty talker, skip");
                return;
            }
            android.util.LruCache lruCache2 = y00.h.f458527a;
            if (!(x17.length() == 0) && (lruCache = (android.util.LruCache) y00.h.f458527a.get(x17)) != null) {
                i17 = lruCache.size();
            }
            if (i17 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: memcache already populated, skip talker=%s cached=%d", x17, java.lang.Integer.valueOf(i17));
                return;
            }
            if (i18 == null) {
                i18 = gm0.j1.b().f273245h.f273145e;
            }
            if (i18 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardWarmer", "warmForTalker: no available scope, talker=%s", x17);
            } else {
                v65.i.b(i18, null, new y00.d0(x17, null), 1, null);
            }
        }
    }
}
