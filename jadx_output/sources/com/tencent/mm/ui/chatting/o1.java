package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class o1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.BaseChattingUIFragment f202052d;

    public o1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment) {
        this.f202052d = baseChattingUIFragment;
    }

    @Override // yb5.n
    public void a() {
        java.lang.String UR_C356;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f202052d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "[onEnterBegin] activity:%s isPreLoaded:%b", baseChattingUIFragment.f198151e, java.lang.Boolean.valueOf(baseChattingUIFragment.f198155i));
        yb5.d dVar = baseChattingUIFragment.f198152f;
        dVar.f460714i = true;
        dVar.P(true);
        dVar.f460728w = false;
        dVar.V(false);
        baseChattingUIFragment.f198153g.z();
        baseChattingUIFragment.f198158o = 0L;
        java.lang.String str = "";
        if (((sq.e) i95.n0.c(sq.e.class)) != null) {
            int i17 = y02.g1.f458605d;
            y02.e1 e1Var = (y02.e1) urgen.ur_E2DE.UR_F857.UR_1332();
            if (e1Var != null && (UR_C356 = urgen.ur_E2DE.UR_F857.UR_C356(((y02.g1) e1Var).getCppPointer())) != null) {
                str = UR_C356;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsUserStateMgrService", "genCliUniqueId: ".concat(str));
        }
        b00.k0.f16702a = str;
    }
}
