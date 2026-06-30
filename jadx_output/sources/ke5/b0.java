package ke5;

/* loaded from: classes9.dex */
public class b0 implements he5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke5.d0 f307061a;

    public b0(ke5.d0 d0Var) {
        this.f307061a = d0Var;
    }

    public int a() {
        ke5.d0 d0Var = this.f307061a;
        yb5.d dVar = d0Var.f307041b;
        if (dVar == null || dVar.f460708c.a(sb5.k0.class) == null) {
            return 0;
        }
        ((sb5.k0) d0Var.f307041b.f460708c.a(sb5.k0.class)).getClass();
        return 50;
    }

    public boolean b(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2) {
        yb5.d dVar = this.f307061a.f307041b;
        if (dVar == null || dVar.f460708c.a(sb5.k0.class) == null) {
            return false;
        }
        sb5.k0 k0Var = (sb5.k0) this.f307061a.f307041b.f460708c.a(sb5.k0.class);
        java.lang.String str = this.f307061a.f307042c;
        com.tencent.mm.ui.chatting.component.g9 g9Var = (com.tencent.mm.ui.chatting.component.g9) k0Var;
        g9Var.getClass();
        synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
            if (((java.util.HashSet) g9Var.f199091o).contains(java.lang.Long.valueOf(f9Var.getMsgId()))) {
                return false;
            }
            if (((java.util.HashSet) g9Var.f199091o).contains(java.lang.Long.valueOf(f9Var2.getMsgId()))) {
                return false;
            }
            if (((java.util.HashMap) g9Var.f199088i).get(java.lang.Long.valueOf(f9Var.getMsgId())) == null) {
                if (((java.util.HashMap) g9Var.f199088i).get(java.lang.Long.valueOf(f9Var2.getMsgId())) == null) {
                    if (!g9Var.m0(f9Var, f9Var2)) {
                        return false;
                    }
                    ((java.util.HashMap) g9Var.f199088i).put(java.lang.Long.valueOf(f9Var.getMsgId()), f9Var);
                    ((java.util.HashMap) g9Var.f199088i).put(java.lang.Long.valueOf(f9Var2.getMsgId()), f9Var2);
                    ((java.util.HashMap) g9Var.f199085f).put(java.lang.Long.valueOf(f9Var2.getMsgId()), java.lang.Long.valueOf(f9Var.getMsgId()));
                    ((java.util.HashMap) g9Var.f199086g).put(java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var2.getMsgId()));
                    java.util.HashSet hashSet = new java.util.HashSet();
                    ((java.util.HashMap) g9Var.f199087h).put(java.lang.Long.valueOf(f9Var.getMsgId()), hashSet);
                    hashSet.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
                    hashSet.add(java.lang.Long.valueOf(f9Var.getMsgId()));
                    return true;
                }
            }
            if (((java.util.HashMap) g9Var.f199088i).get(java.lang.Long.valueOf(f9Var.getMsgId())) != null) {
                if (((java.util.HashMap) g9Var.f199088i).get(java.lang.Long.valueOf(f9Var2.getMsgId())) == null) {
                    if (!g9Var.m0(f9Var, f9Var2)) {
                        return false;
                    }
                    java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) g9Var.f199085f).get(java.lang.Long.valueOf(f9Var.getMsgId()));
                    if (l17.longValue() == 0) {
                        return false;
                    }
                    java.util.Set set = (java.util.Set) ((java.util.HashMap) g9Var.f199087h).get(l17);
                    if (set == null) {
                        return false;
                    }
                    if (set.size() >= 50) {
                        return false;
                    }
                    set.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
                    ((java.util.HashMap) g9Var.f199085f).put(java.lang.Long.valueOf(f9Var2.getMsgId()), l17);
                    ((java.util.HashMap) g9Var.f199086g).put(l17, java.lang.Long.valueOf(f9Var2.getMsgId()));
                    ((java.util.HashMap) g9Var.f199088i).put(java.lang.Long.valueOf(f9Var2.getMsgId()), f9Var2);
                    return true;
                }
            }
            return false;
        }
    }
}
