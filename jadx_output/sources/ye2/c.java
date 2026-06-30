package ye2;

/* loaded from: classes3.dex */
public final class c extends we2.b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // we2.b0
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        gk2.e eVar = this.f445216a;
        ((mm2.x4) eVar.a(mm2.x4.class)).f329531i.clear();
        ((mm2.x4) eVar.a(mm2.x4.class)).f329531i.addAll(msgList);
    }

    @Override // we2.b0
    public boolean e(r45.t12 appMsg) {
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        mm2.c1 c1Var = (mm2.c1) this.f445216a.a(mm2.c1.class);
        return !c1Var.f328927z4.contains(appMsg.getString(9));
    }

    @Override // we2.b0
    public int[] f() {
        return new int[]{10017};
    }
}
