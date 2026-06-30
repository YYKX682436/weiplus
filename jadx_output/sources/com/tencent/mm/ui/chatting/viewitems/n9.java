package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class n9 implements yn.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f204909d;

    public n9(com.tencent.mm.ui.chatting.viewitems.h9 h9Var) {
    }

    @Override // yn.l
    public void E() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingEnterAnimEnd");
    }

    @Override // yn.l
    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingExitAnimEnd releasePrepareLiteApp");
    }

    @Override // yn.l
    public void K() {
        yb5.d dVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingExitAnimStart");
        java.lang.ref.WeakReference weakReference = this.f204909d;
        if (weakReference == null || (dVar = (yb5.d) weakReference.get()) == null) {
            return;
        }
        c01.n2.d().e(com.tencent.mm.ui.chatting.viewitems.m9.a(dVar));
        ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) dVar.f460708c.a(yn.j.class))).c(this);
    }

    @Override // yn.l
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingInit");
    }

    @Override // yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingResume");
    }

    @Override // yn.l
    public void y() {
    }

    @Override // yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "johnjh onChattingEnterAnimStart");
    }
}
