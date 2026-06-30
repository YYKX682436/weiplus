package z53;

/* loaded from: classes8.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.util.List conversations, yz5.p callback) {
        kotlin.jvm.internal.o.g(conversations, "conversations");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (conversations.isEmpty()) {
            callback.invoke(java.lang.Boolean.TRUE, kz5.p0.f313996d);
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = conversations.iterator();
        while (it.hasNext()) {
            z53.i iVar = (z53.i) it.next();
            java.util.List list = (java.util.List) hashMap.get(iVar.field_talker);
            if (list != null) {
                list.add(iVar);
            } else {
                java.lang.String field_talker = iVar.field_talker;
                kotlin.jvm.internal.o.f(field_talker, "field_talker");
                hashMap.put(field_talker, kz5.c0.k(iVar));
            }
            hashSet.add(iVar.field_talker);
            hashSet.add(iVar.field_selfUserName);
        }
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(kz5.n0.S0(hashSet), new z53.l(callback, conversations, hashMap));
    }

    public final void b(z53.i conversation, yz5.p callback) {
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(callback, "callback");
        a(kz5.b0.c(conversation), new z53.k(callback));
    }

    public final void c(int i17, int i18, yz5.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.List<z53.i> Ca = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().Ca(i17, i18);
        for (z53.i iVar : Ca) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.tencent.mm.pluginsdk.ui.u.c().loadBitmap(iVar.field_selfUserName);
        }
        z53.o.f470261a.a(Ca, new z53.m(callback));
    }
}
