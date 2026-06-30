package qi2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.n f363500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qi2.n nVar, android.content.Context context) {
        super(1);
        this.f363500d = nVar;
        this.f363501e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool;
        int intValue = ((java.lang.Number) obj).intValue();
        qi2.n nVar = this.f363500d;
        dk2.m mVar = ((mm2.y2) nVar.f363577h.g().a(mm2.y2.class)).f329568u;
        zh2.c cVar = nVar.f363577h;
        if (mVar == null) {
            dk2.u4 u4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
            if (u4Var != null) {
                int i17 = u4Var.f234160g;
                int i18 = u4Var.f234161h;
                java.lang.String str = u4Var.f234162i;
                if (str == null) {
                    str = "";
                }
                mVar = new dk2.m(i17, i18, str, u4Var.f234167n, u4Var.f234166m, u4Var.f234163j, u4Var.f234168o);
            } else {
                mVar = null;
            }
        }
        if (mVar != null) {
            dk2.m mVar2 = new dk2.m(mVar.f233738a, mVar.f233739b, mVar.f233740c, mVar.f233741d, mVar.f233742e, mVar.f233743f, mVar.f233744g);
            dk2.u4 u4Var2 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
            if (!(u4Var2 != null && u4Var2.f234168o == intValue)) {
                mVar2.f233744g = intValue;
                dk2.u4 u4Var3 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                java.lang.Boolean valueOf = u4Var3 != null ? java.lang.Boolean.valueOf(u4Var3.i()) : null;
                dk2.u4 u4Var4 = ((mm2.o4) cVar.g().a(mm2.o4.class)).Z;
                if (u4Var4 != null) {
                    bool = java.lang.Boolean.valueOf(u4Var4.f234158e == 7);
                } else {
                    bool = null;
                }
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("VisitorPkPanelWidget", "onMicLayoutSelect isBattleFinish: " + valueOf + " isBattlePublicityFinish: " + bool, null);
                qf2.y1 y1Var = (qf2.y1) cVar.getController(qf2.y1.class);
                if (y1Var != null) {
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    if (kotlin.jvm.internal.o.b(valueOf, bool2) || kotlin.jvm.internal.o.b(bool, bool2)) {
                        qf2.y1 y1Var2 = (qf2.y1) cVar.getController(qf2.y1.class);
                        if (y1Var2 != null) {
                            y1Var2.e7(mVar2, new qi2.a(nVar));
                        }
                    } else {
                        qi2.b bVar = new qi2.b(this.f363501e, intValue, y1Var, nVar);
                        ((mm2.y2) y1Var.business(mm2.y2.class)).f329568u = mVar2;
                        com.tencent.mm.plugin.finder.live.util.y.d(y1Var, null, null, new qf2.r1(1, y1Var, mVar2, bVar, null), 3, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
