package ey2;

/* loaded from: classes2.dex */
public final class h1 extends pf5.o0 implements xy2.k {
    public void N6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.gt4 gt4Var;
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
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "native_drama_info")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        com.tencent.mm.protobuf.g byteString = yy0Var != null ? yy0Var.getByteString(1) : null;
        if (byteString != null) {
            gt4Var = new r45.gt4();
            gt4Var.parseFrom(byteString.g());
        } else {
            gt4Var = null;
        }
        java.lang.Integer valueOf = gt4Var != null ? java.lang.Integer.valueOf(gt4Var.getInteger(0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaConfigVM", "setNativeDramaInfo, entrySwitch: " + valueOf);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NATIVE_DRAMA_TAB_SWITCH_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
        com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaConfigVM", "initNativeDramaInfo, nativeDramaInfo: " + gt4Var + ' ');
    }

    public boolean O6() {
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127680ed).getValue()).r()).booleanValue()) {
            return true;
        }
        cq.k1.a();
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127661dd).getValue()).r()).booleanValue()) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_NATIVE_DRAMA_TAB_SWITCH_INT_SYNC, 0);
            com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaConfigVM", "hasEntrySwitch storedValue=" + r17);
            if (r17 == 1) {
                return true;
            }
        }
        return false;
    }
}
