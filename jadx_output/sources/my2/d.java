package my2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.e f332722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(my2.e eVar) {
        super(0);
        this.f332722d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        my2.e eVar = this.f332722d;
        if (((mm2.c1) eVar.P0(mm2.c1.class)).a8()) {
            if (((mm2.c1) eVar.P0(mm2.c1.class)).f328794d6) {
                my2.a aVar = eVar.f332725r;
                if (aVar != null) {
                    pm0.v.X(new my2.t((my2.u) aVar));
                }
                ((mm2.c1) eVar.P0(mm2.c1.class)).f328794d6 = false;
            } else {
                my2.a aVar2 = eVar.f332725r;
                if (aVar2 != null) {
                    my2.u uVar = (my2.u) aVar2;
                    if (uVar.f332769m && ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328784b6 != null) {
                        uVar.f332769m = false;
                        com.tencent.mars.xlog.Log.i(uVar.f332765f, "updateHelpShowBubble");
                        com.tencent.mm.plugin.finder.live.view.k0 c17 = uVar.c();
                        if (c17 != null) {
                            com.tencent.mm.plugin.finder.live.util.y.n(c17, null, null, new my2.s(uVar, null), 3, null);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
