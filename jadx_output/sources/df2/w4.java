package df2;

/* loaded from: classes3.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.x4 f231656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f231657e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(df2.x4 x4Var, r45.tm1 tm1Var) {
        super(0);
        this.f231656d = x4Var;
        this.f231657e = tm1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        if (com.tencent.mm.plugin.finder.live.widget.yx.f120478f.b(this.f231656d.O6(), this.f231656d.getStore().getLiveRoomData())) {
            df2.x4 x4Var = this.f231656d;
            x4Var.f231756p = new com.tencent.mm.plugin.finder.live.widget.yx(x4Var.O6(), this.f231656d.getStore().getLiveRoomData());
            df2.x4 x4Var2 = this.f231656d;
            com.tencent.mm.plugin.finder.live.widget.yx yxVar = x4Var2.f231756p;
            if (yxVar != null) {
                java.util.List list = ((mm2.o4) x4Var2.business(mm2.o4.class)).f329327v;
                kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, ((mm2.c1) x4Var2.business(mm2.c1.class)).m8())) {
                            break;
                        }
                    }
                }
                yxVar.f120482d = com.tencent.mm.plugin.finder.live.widget.yx.f120478f.c(obj != null);
            }
            df2.x4 x4Var3 = this.f231656d;
            com.tencent.mm.plugin.finder.live.widget.yx yxVar2 = x4Var3.f231756p;
            if (yxVar2 != null) {
                yxVar2.b(x4Var3.U6(), 4);
            }
            this.f231656d.m7("manualDismiss", false);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Hk(ml2.u4.f328112f);
        kotlinx.coroutines.r2 r2Var = this.f231656d.f231758r;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        long integer = this.f231657e.getInteger(2);
        if (integer > 0) {
            df2.x4 x4Var4 = this.f231656d;
            x4Var4.f231758r = com.tencent.mm.plugin.finder.live.util.y.o(x4Var4, null, null, new df2.v4(integer, x4Var4, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
