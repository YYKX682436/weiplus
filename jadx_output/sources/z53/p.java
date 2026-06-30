package z53;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u53.z f470262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u53.z zVar) {
        super(2);
        this.f470262d = zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        java.util.List<z53.i> result = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        u53.z zVar = this.f470262d;
        if (zVar != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.w wVar = (com.tencent.mm.plugin.game.ui.chat_tab.w) zVar;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(result)) {
                for (z53.i iVar : result) {
                    com.tencent.mm.plugin.game.ui.chat_tab.a0 a0Var = new com.tencent.mm.plugin.game.ui.chat_tab.a0(wVar.f141324a, null);
                    a0Var.f141232d = iVar.field_updateTime / 1000;
                    a0Var.f141233e = iVar;
                    linkedList.add(a0Var);
                }
            }
            int size = linkedList.size();
            java.util.Collections.sort(linkedList);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.v(wVar, size, linkedList));
        }
        return jz5.f0.f302826a;
    }
}
