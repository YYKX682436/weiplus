package df2;

/* loaded from: classes3.dex */
public final class yv extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f231896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231896m = jz5.h.b(new df2.xv(this, store));
    }

    public final jk2.l Z6() {
        return (jk2.l) ((jz5.n) this.f231896m).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        kn0.p pVar;
        super.onLiveMsg(r71Var);
        tn0.w0 Q6 = Q6();
        boolean z17 = false;
        if (Q6 != null && (pVar = Q6.D) != null && pVar.i()) {
            z17 = true;
        }
        if (z17) {
            jk2.l Z6 = Z6();
            java.util.Iterator it = Z6.f300074b.iterator();
            while (it.hasNext()) {
                jk2.j jVar = (jk2.j) it.next();
                long a17 = dk2.tf.f234133a.a(((mm2.c1) ((df2.wv) Z6.f300073a).b().a(mm2.c1.class)).f328852o);
                if (jVar.f300070b.getBoolean(4) && a17 >= jVar.f300070b.getInteger(2) && jVar.g() && jVar.f()) {
                    jVar.k();
                }
            }
        }
        java.util.Iterator it6 = Z6().f300074b.iterator();
        while (it6.hasNext()) {
            ((jk2.j) it6.next()).j(r71Var);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.yd2 yd2Var;
        java.util.LinkedList<r45.zd2> list;
        super.onLiveStart(hc1Var);
        if (hc1Var != null) {
            jk2.l Z6 = Z6();
            Z6.getClass();
            r45.ic1 ic1Var = (r45.ic1) hc1Var.getCustom(85);
            if (ic1Var != null && (yd2Var = (r45.yd2) ic1Var.getCustom(0)) != null && (list = yd2Var.getList(0)) != null) {
                java.util.ArrayList arrayList = Z6.f300074b;
                arrayList.clear();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleGuideInfoList: ");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (r45.zd2 zd2Var : list) {
                    sb7.append("[type: " + zd2Var.getInteger(0) + " priority: " + zd2Var.getInteger(1) + " watch_time: " + zd2Var.getInteger(2) + " appearTime: " + zd2Var.getInteger(3) + ", enablePreload: " + zd2Var.getBoolean(4) + ']');
                    sb7.append("\n");
                }
                java.lang.String sb8 = sb7.toString();
                kotlin.jvm.internal.o.f(sb8, "toString(...)");
                sb6.append(sb8);
                com.tencent.mars.xlog.Log.i("VisitorGuideManager", sb6.toString());
                for (r45.zd2 zd2Var2 : list) {
                    if (zl2.q4.f473933a.E()) {
                        lb2.j jVar = ae2.in.A6;
                        if (((java.lang.Number) jVar.r()).intValue() > 0) {
                            zd2Var2.set(2, java.lang.Integer.valueOf(((java.lang.Number) jVar.r()).intValue()));
                        }
                        lb2.j jVar2 = ae2.in.B6;
                        if (((java.lang.Number) jVar2.r()).intValue() > 0) {
                            zd2Var2.set(4, java.lang.Boolean.valueOf(((java.lang.Number) jVar2.r()).intValue() == 1));
                        }
                        lb2.j jVar3 = ae2.in.C6;
                        if (((java.lang.Number) jVar3.r()).intValue() > 1) {
                            zd2Var2.set(3, java.lang.Integer.valueOf(((java.lang.Number) jVar3.r()).intValue()));
                        }
                    }
                    int integer = zd2Var2.getInteger(0);
                    jk2.a aVar = Z6.f300073a;
                    if (integer == 1) {
                        arrayList.add(new jk2.e(aVar, zd2Var2));
                    } else if (integer == 3) {
                        arrayList.add(new jk2.g(aVar, zd2Var2));
                    } else if (integer == 4) {
                        arrayList.add(new jk2.m(aVar, zd2Var2));
                    }
                }
            }
            java.util.Iterator it = Z6().f300074b.iterator();
            while (it.hasNext()) {
                ((jk2.j) it.next()).h();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        java.util.Iterator it = Z6().f300074b.iterator();
        while (it.hasNext()) {
            ((jk2.j) it.next()).h();
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        java.util.Iterator it = Z6().f300074b.iterator();
        while (it.hasNext()) {
            ((jk2.j) it.next()).l();
        }
    }
}
