package qn2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.i0 f365066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(qn2.i0 i0Var) {
        super(1);
        this.f365066d = i0Var;
    }

    public static final void a(qn2.i0 i0Var, r45.cz1 cz1Var) {
        r45.cz1 cz1Var2;
        if (!((mm2.c1) i0Var.P0(mm2.c1.class)).a8()) {
            com.tencent.mars.xlog.Log.i("FinderLiveLotteryVisitorCardPlugin", "visitorDoneAction liveStatus:" + ((mm2.c1) i0Var.P0(mm2.c1.class)).f328813h2);
            return;
        }
        android.view.View view = i0Var.f365225u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin$doneAnimCallback$1", "invoke$visitorDoneAction", "(Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin$doneAnimCallback$1", "invoke$visitorDoneAction", "(Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        qn2.v0 v0Var = i0Var.H;
        if (v0Var != null) {
            km2.z zVar = ((on2.z2) i0Var.P0(on2.z2.class)).f347092m;
            if (zVar != null && (cz1Var2 = zVar.f309232d) != null) {
                cz1Var = cz1Var2;
            }
            v0Var.d(cz1Var, true);
        }
        i0Var.K0(0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 it = (r45.cz1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        r45.ht1 ht1Var = ((on2.z2) this.f365066d.P0(on2.z2.class)).f347094o;
        java.lang.String str = null;
        java.lang.Long valueOf = ht1Var != null ? java.lang.Long.valueOf(ht1Var.getLong(5)) : null;
        r45.ht1 ht1Var2 = ((on2.z2) this.f365066d.P0(on2.z2.class)).f347094o;
        boolean z17 = true;
        java.lang.String string = (ht1Var2 == null || (cz1Var3 = (r45.cz1) ht1Var2.getCustom(1)) == null) ? null : cz1Var3.getString(0);
        km2.z zVar = ((on2.z2) this.f365066d.P0(on2.z2.class)).f347092m;
        if (zVar != null && (cz1Var2 = zVar.f309232d) != null) {
            str = cz1Var2.getString(0);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryVisitorCardPlugin", "doneAnimCallback curRecordLiveId" + valueOf + ",curRecordLotteryId:" + string + ",callbakcId:" + it.getString(0) + ",localId:" + str + ",lottering:" + this.f365066d.f365223s);
        long j17 = ((mm2.e1) this.f365066d.P0(mm2.e1.class)).f328988r.getLong(0);
        if (valueOf != null && valueOf.longValue() == j17) {
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17 && kotlin.jvm.internal.o.b(string, str)) {
                a(this.f365066d, it);
                return jz5.f0.f302826a;
            }
        }
        this.f365066d.y1(0);
        qn2.i0 i0Var = this.f365066d;
        qn2.l1 l1Var = i0Var.D;
        if (l1Var != null) {
            km2.z zVar2 = ((on2.z2) i0Var.P0(on2.z2.class)).f347092m;
            if (zVar2 == null || (cz1Var = zVar2.f309232d) == null) {
                cz1Var = it;
            }
            l1Var.g(cz1Var);
        }
        qn2.i0 i0Var2 = this.f365066d;
        i0Var2.u1(new qn2.f0(it, i0Var2));
        return jz5.f0.f302826a;
    }
}
