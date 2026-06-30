package on2;

/* loaded from: classes3.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ht1 f346996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f346997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(r45.ht1 ht1Var, on2.z2 z2Var) {
        super(0);
        this.f346996d = ht1Var;
        this.f346997e = z2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list;
        java.util.LinkedList<r45.zy1> list2;
        java.lang.Integer num;
        java.util.LinkedList list3;
        r45.cz1 cz1Var;
        r45.ht1 ht1Var = this.f346996d;
        if (ht1Var != null) {
            r45.cz1 cz1Var2 = (r45.cz1) ht1Var.getCustom(1);
            java.lang.String string = cz1Var2 != null ? cz1Var2.getString(0) : null;
            on2.z2 z2Var = this.f346997e;
            r45.ht1 ht1Var2 = z2Var.f347094o;
            java.lang.String string2 = (ht1Var2 == null || (cz1Var = (r45.cz1) ht1Var2.getCustom(1)) == null) ? null : cz1Var.getString(0);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "mergeLotteryRecord localRecordLotteryId:" + string2 + ",remoteRecordId:" + string);
            if (!(string == null || string.length() == 0)) {
                if ((string2 == null || string2.length() == 0) || !kotlin.jvm.internal.o.b(string2, string)) {
                    z2Var.e7(ht1Var);
                } else {
                    r45.ht1 ht1Var3 = z2Var.f347094o;
                    if (ht1Var3 != null) {
                        ht1Var3.set(1, (r45.cz1) ht1Var.getCustom(1));
                        ht1Var3.set(2, ht1Var.getByteString(2));
                        ht1Var3.set(3, java.lang.Integer.valueOf(ht1Var.getInteger(3)));
                        ht1Var3.set(9, ht1Var.getString(9));
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        r45.jz1 jz1Var = (r45.jz1) ht1Var.getCustom(4);
                        if (jz1Var != null && (list2 = jz1Var.getList(0)) != null) {
                            for (r45.zy1 zy1Var : list2) {
                                r45.jz1 jz1Var2 = (r45.jz1) ht1Var3.getCustom(4);
                                if (jz1Var2 == null || (list3 = jz1Var2.getList(0)) == null) {
                                    num = null;
                                } else {
                                    java.util.Iterator it = list3.iterator();
                                    int i17 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i17 = -1;
                                            break;
                                        }
                                        if (kotlin.jvm.internal.o.b(((r45.zy1) it.next()).getString(0), zy1Var.getString(0))) {
                                            break;
                                        }
                                        i17++;
                                    }
                                    num = java.lang.Integer.valueOf(i17);
                                }
                                if (num != null && num.intValue() == -1) {
                                    linkedList.add(zy1Var);
                                }
                            }
                        }
                        r45.jz1 jz1Var3 = (r45.jz1) ht1Var3.getCustom(4);
                        if (jz1Var3 != null && (list = jz1Var3.getList(0)) != null) {
                            list.addAll(linkedList);
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("after mergeLotteryRecord lotteryRecord:");
                    java.lang.Object obj = z2Var.f347094o;
                    if (obj == null) {
                        obj = "";
                    }
                    sb6.append(pm0.b0.g(obj));
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
