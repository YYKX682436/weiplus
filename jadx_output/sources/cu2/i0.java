package cu2;

/* loaded from: classes8.dex */
public final class i0 implements zy2.ba {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f222410a = jz5.h.b(cu2.h0.f222407d);

    @Override // zy2.ba
    public java.util.LinkedList a() {
        java.lang.String T0 = g92.b.f269769e.T0();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList<bw5.e0> redDotDataByUsername = e().redDotDataByUsername(T0);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        kotlin.jvm.internal.o.d(redDotDataByUsername);
        java.util.Iterator<T> it = redDotDataByUsername.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b((bw5.e0) it.next());
            if (b17 != null) {
                linkedList.add(b17);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAll size=");
        sb6.append(redDotDataByUsername.size());
        sb6.append(" username=");
        sb6.append(T0);
        sb6.append(" thread:");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(";queryAffTimeCost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(";\t nativeList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add((com.tencent.mm.plugin.finder.extension.reddot.jb) it6.next());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderRedDotCtrInfoAffStorage", sb6.toString());
        return linkedList;
    }

    @Override // zy2.ba
    public boolean b(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, boolean z17) {
        bw5.ev b17;
        java.lang.String str = jbVar != null ? jbVar.field_tips_uuid : null;
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replace fail,uuid=");
            sb6.append(jbVar != null ? jbVar.field_tips_uuid : null);
            com.tencent.mars.xlog.Log.e("FinderRedDotCtrInfoAffStorage", sb6.toString());
            return false;
        }
        if (jbVar == null) {
            return false;
        }
        bw5.e0 r17 = jbVar.r1();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = jbVar.field_username;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateOrInsertRedDotInfo ");
        if (r17 != null && (b17 = r17.b()) != null) {
            r11 = b17.getTipsUuid();
        }
        sb7.append(r11);
        sb7.append(",finderUsername=");
        sb7.append(str2);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(sb7.toString());
        if (str2 == null || str2.length() == 0) {
            e().updateOrInsertWXRedDotInfo(r17);
        } else {
            e().updateOrInsertFinderRedDotInfo(str2, r17);
        }
        sb8.append(" time cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mars.xlog.Log.i("FinderRedDotCtrInfoAffStorage", sb8.toString());
        return true;
    }

    @Override // zy2.ba
    public boolean c(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        java.lang.String str = jbVar != null ? jbVar.field_tips_uuid : null;
        com.tencent.mars.xlog.Log.i("FinderRedDotCtrInfoAffStorage", "delete RedDotInfo uuid=" + str);
        if (str == null || str.length() == 0) {
            return false;
        }
        e().disposeRedDotByUuidOnly(str);
        return true;
    }

    @Override // zy2.ba
    public boolean d(java.util.LinkedList linkedList) {
        boolean clearAllRedDotInfo = e().clearAllRedDotInfo();
        com.tencent.mars.xlog.Log.i("FinderRedDotCtrInfoAffStorage", "deleteAll " + clearAllRedDotInfo);
        return clearAllRedDotInfo;
    }

    public final com.tencent.wechat.aff.finder.RedDotManager e() {
        return (com.tencent.wechat.aff.finder.RedDotManager) ((jz5.n) this.f222410a).getValue();
    }
}
