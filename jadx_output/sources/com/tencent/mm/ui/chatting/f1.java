package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class f1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f200483d;

    public f1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f200483d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f200483d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[onExitEnd] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
        baseChattingUIFragment.f198153g.J();
        baseChattingUIFragment.getClass();
        yb5.d dVar = baseChattingUIFragment.f198152f;
        dVar.f460714i = false;
        dVar.P(false);
        yb5.d dVar2 = baseChattingUIFragment.f198152f;
        dVar2.f460728w = false;
        dVar2.V(false);
        com.tencent.mm.autogen.events.OnChattingUIActionEvent onChattingUIActionEvent = new com.tencent.mm.autogen.events.OnChattingUIActionEvent();
        am.nm nmVar = onChattingUIActionEvent.f54568g;
        nmVar.f7437a = 1;
        nmVar.f7438b = baseChattingUIFragment.f198152f.x();
        nmVar.f7439c = baseChattingUIFragment.f198158o;
        onChattingUIActionEvent.b(android.os.Looper.getMainLooper());
    }
}
