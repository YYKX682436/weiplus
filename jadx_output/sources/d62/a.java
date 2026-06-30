package d62;

/* loaded from: classes15.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr != null && objArr.length >= 2) {
            p52.h.f352018c = false;
            java.lang.Object obj2 = objArr[1];
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.Preference");
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) obj2;
            d62.b.f226765a = kotlin.jvm.internal.o.b("jd_market_entrance", preference.f197780q);
            d62.b.f226766b = kotlin.jvm.internal.o.b("find_friends_by_qrcode", preference.f197780q);
            if (kotlin.jvm.internal.o.b("find_friends_by_finder", preference.f197780q)) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FindMoreFriendUIMonitor", "Finder, 19354, 1");
                jx3.f.INSTANCE.d(19354, 1);
            }
            java.lang.String str4 = preference.f197780q;
            kotlin.jvm.internal.o.f(str4, "getKey(...)");
            r45.a07 a07Var = new r45.a07();
            a07Var.f369601d = str4;
            a07Var.f369609o = java.lang.System.currentTimeMillis();
            a07Var.f369602e = str4;
            a07Var.f369604g = b52.b.g(obj != null ? obj.getClass().getName() : null);
            a07Var.f369608n = obj != null ? obj.hashCode() : -1;
            java.lang.String str5 = a07Var.f369604g;
            a07Var.f369605h = str5;
            k52.g gVar = k52.g.f304294e;
            a07Var.f369606i = 1;
            a07Var.f369603f = str5;
            a07Var.f369615u = 0;
            java.util.Map map = k52.l.f304310a;
            k52.l.f304314e.a(null, a07Var);
        }
    }
}
