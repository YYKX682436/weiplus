package gk5;

/* loaded from: classes9.dex */
public final class m1 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(com.tencent.mm.storage.f9 f9Var, com.tencent.wework.api.IWWAPI.WWAppType wwAppType) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(wwAppType, "wwAppType");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (f9Var != null) {
            linkedList.add(f9Var);
            str = f9Var.Q0();
        } else {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.e("SendToWeWorkUIC", "doForwardToWeWorkInChattingScene: selectItems is empty");
            return;
        }
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(str);
        if (q17 == null) {
            q17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).q(en1.a.a());
        }
        com.tencent.mm.ui.chatting.hd.t(getContext(), q17, linkedList, com.tencent.mm.storage.z3.R4(str), wwAppType, 1);
    }

    public final void U6(java.lang.String str, com.tencent.wework.api.IWWAPI.WWAppType wwAppType) {
        kotlin.jvm.internal.o.g(wwAppType, "wwAppType");
        if (str == null) {
            com.tencent.mars.xlog.Log.w("SendToWeWorkUIC", "doForwardToWeWork: msgContent is Null");
            return;
        }
        r45.w43 w43Var = new r45.w43();
        w43Var.f388872d = java.lang.String.valueOf(c01.id.c());
        w43Var.f388873e = 49;
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(forName, "forName(...)");
        byte[] bytes = str.getBytes(forName);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        w43Var.f388874f = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(w43Var);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((cj5.o) pf5.z.f353948a.a(activity).a(cj5.o.class)).T6();
        ((dk5.s5) tg3.t1.a()).wi(getActivity(), com.tencent.mm.ui.chatting.hd.c(wwAppType), arrayList, new gk5.l1(this));
    }

    public final void V6(java.util.List list, com.tencent.wework.api.IWWAPI.WWAppType wwAppType, int i17) {
        kotlin.jvm.internal.o.g(wwAppType, "wwAppType");
        if (list == null || list.isEmpty()) {
            return;
        }
        java.lang.String Q0 = ((com.tencent.mm.storage.f9) list.get(0)).Q0();
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(Q0);
        if (q17 == null) {
            q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(en1.a.a());
        }
        com.tencent.mm.ui.chatting.hd.t(getContext(), q17, list, com.tencent.mm.storage.z3.R4(Q0), wwAppType, i17);
    }

    public final void W6(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.ui.chatting.hd.r(getActivity(), getString(com.tencent.mm.R.string.ifb), com.tencent.mm.ui.chatting.hd.d(action.f454741b));
    }
}
