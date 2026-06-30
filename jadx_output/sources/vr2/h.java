package vr2;

/* loaded from: classes10.dex */
public abstract class h {
    public static final void a(dn.h hVar, cs2.p task) {
        java.lang.String str;
        r45.vf2 vf2Var;
        java.lang.String string;
        r45.vf2 vf2Var2;
        kotlin.jvm.internal.o.g(hVar, "<this>");
        kotlin.jvm.internal.o.g(task, "task");
        r45.m11 m11Var = new r45.m11();
        m11Var.set(0, java.lang.Long.valueOf(task.f222089f2));
        m11Var.set(1, 0);
        m11Var.set(9, java.lang.Integer.valueOf(hVar.field_averageSpeed));
        m11Var.set(13, java.lang.Integer.valueOf(hVar.field_firstRequestCost));
        m11Var.set(5, java.lang.Integer.valueOf((int) hVar.field_fileLength));
        m11Var.set(3, java.lang.Integer.valueOf((int) hVar.field_recvedBytes));
        m11Var.set(4, java.lang.Integer.valueOf((int) hVar.field_recvedBytes));
        mn2.g4 g4Var = task.f222088e2;
        m11Var.set(6, java.lang.Integer.valueOf(g4Var.f330002e.getInteger(3)));
        m11Var.set(16, java.lang.Integer.valueOf(hVar.field_averageConnectCost));
        m11Var.set(18, hVar.f241769d);
        m11Var.set(19, java.lang.Integer.valueOf(hVar.f241770e));
        m11Var.set(17, java.lang.Integer.valueOf(hVar.f241771f));
        m11Var.set(15, java.lang.Long.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).ek().f464695l));
        m11Var.set(21, java.lang.Long.valueOf(g4Var.f330002e.getLong(24) > 60000 ? task.f222089f2 : 0L));
        r45.sf0 sf0Var = new r45.sf0();
        sf0Var.set(0, java.lang.Long.valueOf(hVar.field_recvedBytes));
        sf0Var.set(2, java.lang.Long.valueOf(hVar.field_startTime));
        sf0Var.set(3, java.lang.Long.valueOf(hVar.field_endTime));
        sf0Var.set(7, hVar.f241769d);
        sf0Var.set(5, hVar.field_clientIP);
        sf0Var.set(4, java.lang.Integer.valueOf(hVar.f241771f));
        sf0Var.set(1, java.lang.Long.valueOf(hVar.field_receiveCostTime));
        m11Var.set(23, sf0Var);
        m11Var.set(26, java.lang.Long.valueOf(g4Var.f330002e.getLong(24)));
        m11Var.set(27, java.lang.Integer.valueOf(task.f222094k2));
        m11Var.set(28, java.lang.Long.valueOf(hVar.field_recvedBytes));
        m11Var.set(30, 0);
        m11Var.set(31, 0);
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        kk.l lVar = ek6.f464701r;
        java.lang.String str2 = task.f222092i2;
        jz5.o oVar = (jz5.o) lVar.get(str2);
        m11Var.set(24, java.lang.Integer.valueOf(oVar != null ? (int) ((java.lang.Number) oVar.f302843f).longValue() : 0));
        kk.l lVar2 = ek6.f464701r;
        jz5.o oVar2 = (jz5.o) lVar2.get(str2);
        java.lang.String str3 = "";
        if (oVar2 == null || (vf2Var2 = (r45.vf2) oVar2.f302841d) == null || (str = vf2Var2.getString(0)) == null) {
            str = "";
        }
        m11Var.set(25, str);
        jz5.o oVar3 = (jz5.o) lVar2.get(str2);
        if (oVar3 != null && (vf2Var = (r45.vf2) oVar3.f302841d) != null && (string = vf2Var.getString(0)) != null) {
            str3 = string;
        }
        m11Var.set(20, str3);
        cw2.p4 p4Var = cw2.p4.f223911a;
        com.tencent.mars.xlog.Log.i("Finder.FinderNetworkStatusStatistic", "addNetworkInfo info:" + m11Var + " size:" + cw2.p4.f223912b.size());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = cw2.p4.f223914d;
        if (copyOnWriteArrayList.size() > 10) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(m11Var);
    }
}
