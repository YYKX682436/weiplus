package ws2;

/* loaded from: classes3.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.p0 f449113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ws2.p0 p0Var) {
        super(0);
        this.f449113d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.live.plugin.le0 le0Var;
        ws2.p0 p0Var = this.f449113d;
        ct2.j jVar = (ct2.j) p0Var.b(ct2.j.class);
        boolean z17 = jVar != null && jVar.f222269m == 3;
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = p0Var.f449117a;
        if (!z17 && (le0Var = (com.tencent.mm.plugin.finder.live.plugin.le0) finderLiveReplayPluginLayout.getPlugin(com.tencent.mm.plugin.finder.live.plugin.le0.class)) != null) {
            mm2.c1 c1Var = (mm2.c1) p0Var.b(mm2.c1.class);
            le0Var.x1(c1Var != null ? c1Var.L9() : false, false);
        }
        finderLiveReplayPluginLayout.enableRotation();
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = (com.tencent.mm.plugin.finder.live.plugin.nd0) finderLiveReplayPluginLayout.getPlugin(com.tencent.mm.plugin.finder.live.plugin.nd0.class);
        java.lang.String str3 = "";
        if (nd0Var != null) {
            mm2.c1 c1Var2 = (mm2.c1) p0Var.b(mm2.c1.class);
            if (c1Var2 == null || (str2 = c1Var2.f328852o) == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var, str2, false, 2, null);
        }
        at2.v vVar = (at2.v) finderLiveReplayPluginLayout.getPlugin(at2.v.class);
        if (vVar != null) {
            mm2.c1 c1Var3 = (mm2.c1) p0Var.b(mm2.c1.class);
            if (c1Var3 != null && (str = c1Var3.f328852o) != null) {
                str3 = str;
            }
            vVar.t1(str3);
        }
        return jz5.f0.f302826a;
    }
}
