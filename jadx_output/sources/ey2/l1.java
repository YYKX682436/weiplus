package ey2;

/* loaded from: classes2.dex */
public final class l1 extends pf5.o0 implements xy2.l {
    public void N6(r45.xb1 resp) {
        r45.db1 db1Var;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            db1Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "help_promotion_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.tencent.mm.protobuf.g byteString = yy0Var != null ? yy0Var.getByteString(1) : null;
        if (byteString != null) {
            db1Var = new r45.db1();
            db1Var.parseFrom(byteString.g());
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPromotionVM", "[initPromotionInfo] promotionInfo:" + db1Var);
        boolean z17 = db1Var != null ? db1Var.getBoolean(0) : false;
        boolean z18 = db1Var != null ? db1Var.getBoolean(1) : false;
        com.tencent.mars.xlog.Log.i("Finder.FinderPromotionVM", "modify promotionInfo switch " + z17 + " isHide " + z18);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_SWITCH_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z18));
    }

    public boolean O6() {
        return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, false);
    }
}
