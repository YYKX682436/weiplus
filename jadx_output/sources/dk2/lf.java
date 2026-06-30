package dk2;

/* loaded from: classes3.dex */
public final class lf {
    public lf(kotlin.jvm.internal.i iVar) {
    }

    public final dk2.mf a(r45.nj1 notificationInfo, java.lang.Long l17) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(notificationInfo, "notificationInfo");
        r45.t12 t12Var = new r45.t12();
        boolean z17 = true;
        t12Var.set(3, java.lang.Integer.valueOf(notificationInfo.getInteger(3) == 106 ? 1 : 10001));
        java.lang.String string = notificationInfo.getString(1);
        if (string == null) {
            string = "";
        }
        t12Var.set(2, string);
        t12Var.set(5, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        java.lang.String string2 = notificationInfo.getString(5);
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            r45.xn1 xn1Var = new r45.xn1();
            xn1Var.set(11, new java.util.LinkedList());
            t12Var.set(8, xn1Var);
            r45.xn1 xn1Var2 = (r45.xn1) t12Var.getCustom(8);
            if (xn1Var2 != null && (list = xn1Var2.getList(11)) != null) {
                r45.yl1 yl1Var = new r45.yl1();
                yl1Var.set(0, -10002);
                yl1Var.set(4, notificationInfo.getString(5));
                list.add(yl1Var);
            }
        }
        dk2.mf mfVar = new dk2.mf(t12Var);
        mfVar.f233780h = notificationInfo.getString(2);
        r45.oj1 oj1Var = (r45.oj1) notificationInfo.getCustom(6);
        mfVar.f233781i = oj1Var;
        if (oj1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notification msg_jump_info:");
            r45.oj1 oj1Var2 = mfVar.f233781i;
            sb6.append(oj1Var2 != null ? oj1Var2.toJSON() : null);
            com.tencent.mars.xlog.Log.i("FinderLiveTextMsg", sb6.toString());
        }
        mfVar.f233775c = notificationInfo.getInteger(3);
        return mfVar;
    }
}
