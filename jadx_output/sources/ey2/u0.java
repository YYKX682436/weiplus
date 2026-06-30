package ey2;

/* loaded from: classes2.dex */
public final class u0 extends pf5.o0 implements xy2.h {
    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.ac1 ac1Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "interaction_milestone_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.tencent.mm.protobuf.g byteString = yy0Var != null ? yy0Var.getByteString(1) : null;
        if (byteString != null) {
            ac1Var = new r45.ac1();
            ac1Var.parseFrom(byteString.g());
        } else {
            ac1Var = null;
        }
        java.lang.Integer valueOf = ac1Var != null ? java.lang.Integer.valueOf(ac1Var.getInteger(0)) : null;
        java.util.LinkedList list2 = ac1Var != null ? ac1Var.getList(1) : null;
        java.lang.String string = ac1Var != null ? ac1Var.getString(2) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionMileStoneConfigVM", "modify interactionMileStoneInfo, globalFeatureSwitch" + valueOf + ", breakPoints:" + list2 + ", supplementContent:" + string);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_INTERACTION_MILE_STONE_INT_SYNC, valueOf);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_INTERACTION_MILE_STONE_BREAK_POINTS_STRING_SYNC, list2 != null ? kz5.n0.g0(list2, ",", null, null, 0, null, null, 62, null) : "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_INTERACTION_MILE_STONE_SUPPLEMENT_CONTENT_STRING_SYNC, string);
        com.tencent.mars.xlog.Log.i("Finder.FinderInteractionMileStoneConfigVM", "initInteractionMileStoneInfo, initInteractionMileStoneInfo: " + ac1Var);
    }
}
