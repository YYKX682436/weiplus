package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class g1 extends wu5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200516d;

    public g1(com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment, java.lang.String str) {
        this.f200516d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        qk.o b17;
        boolean a17 = gm0.j1.a();
        java.lang.String str = this.f200516d;
        if (a17 && (b17 = r01.z.b(str)) != null) {
            if (b17.F0()) {
                return "_EnterpriseChat";
            }
            if (b17.I0()) {
                return "_EnterpriseFatherBiz";
            }
            if (b17.G0()) {
                return "_EnterpriseChildBiz";
            }
        }
        return com.tencent.mm.storage.z3.R4(str) ? "_chatroom" : com.tencent.mm.storage.z3.H3(str) ? "_bottle" : com.tencent.mm.storage.z3.s4(str) ? "_QQ" : "";
    }
}
