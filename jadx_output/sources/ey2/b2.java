package ey2;

/* loaded from: classes2.dex */
public final class b2 extends pf5.o0 implements xy2.m {
    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.ys2 ys2Var;
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
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "finder_reddot_enhance_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.tencent.mm.protobuf.g byteString = yy0Var != null ? yy0Var.getByteString(1) : null;
        if (byteString != null) {
            ys2Var = new r45.ys2();
            ys2Var.parseFrom(byteString.g());
        } else {
            ys2Var = null;
        }
        java.lang.Integer valueOf = ys2Var != null ? java.lang.Integer.valueOf(ys2Var.getInteger(0)) : null;
        java.lang.Integer valueOf2 = ys2Var != null ? java.lang.Integer.valueOf(ys2Var.getInteger(1)) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderReddotEnhanceConfigVM", "modify reddotEnhanceInfo, n: " + valueOf + ", m: " + valueOf2);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_ENHANCE_N_INT_SYNC, valueOf);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_ENHANCE_M_INT_SYNC, valueOf2);
        com.tencent.mars.xlog.Log.i("Finder.FinderReddotEnhanceConfigVM", "initReddotEnhanceInfo, reddotEnhanceInfo: " + ys2Var);
    }
}
