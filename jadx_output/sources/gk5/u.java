package gk5;

/* loaded from: classes9.dex */
public final class u extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new jd5.b();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        return false;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        java.util.LinkedList<oi3.g> j17 = ((jd5.b) c7()).j();
        if (j17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (oi3.g gVar : j17) {
                com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(gVar.getString(gVar.f345617d + 3), gVar.getLong(gVar.f345617d + 0));
                if (k17 != null) {
                    arrayList.add(k17);
                }
            }
            java.util.ArrayList<com.tencent.mm.storage.f9> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
                if (!(g95.e0.h(f9Var) || f9Var.P2())) {
                    arrayList2.add(obj);
                }
            }
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "processForward, original size: " + arrayList.size() + ", forwardable size: " + arrayList2.size());
            if (arrayList2.isEmpty()) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "processForward, no forwardable msg, return");
                return;
            }
            int size = arrayList2.size();
            k50.n nVar = k50.s.f304256t;
            if (size < 3) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "processForward, forwardable < 3, fallback to single forward without groupId");
                for (com.tencent.mm.storage.f9 f9Var2 : arrayList2) {
                    if (f9Var2.J2()) {
                        nVar.a(f9Var2, toUser, null, null);
                    } else if (f9Var2.isVideo()) {
                        com.tencent.mm.ui.chatting.n3.G(getContext(), toUser, f9Var2, "");
                    }
                }
                return;
            }
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "processForward, forwardable >= 3, continue media group forward");
            byte[] bytes = (java.util.UUID.randomUUID().toString() + c01.id.c()).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
            java.lang.String f17 = dh3.c.f232489a.f(toUser, dh3.d.f232496e);
            java.lang.String str = f17 != null ? f17 : "";
            for (com.tencent.mm.storage.f9 f9Var3 : arrayList2) {
                dh3.c.f232489a.j(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var3.getMsgId(), f9Var3.Q0()), toUser, str);
                if (f9Var3.J2()) {
                    nVar.a(f9Var3, toUser, null, g17);
                } else if (f9Var3.isVideo()) {
                    com.tencent.mm.ui.chatting.n3.G(getContext(), toUser, f9Var3, g17);
                }
            }
        }
    }
}
