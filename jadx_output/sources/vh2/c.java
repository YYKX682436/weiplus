package vh2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final vh2.c f437041a = new vh2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f437042b = new java.util.ArrayList();

    public final void a(java.util.List list) {
        r45.g84 g84Var;
        r45.g84 g84Var2;
        r45.g84 g84Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#updateElements size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenEffectManager", sb6.toString());
        java.util.List list2 = f437042b;
        ((java.util.ArrayList) list2).clear();
        if (list == null) {
            return;
        }
        ((java.util.ArrayList) list2).addAll(list);
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.h84 h84Var = (r45.h84) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#updateElements index=");
            sb7.append(i17);
            sb7.append(" id=");
            sb7.append(h84Var.getString(0));
            sb7.append(" name=");
            sb7.append(h84Var.getString(1));
            sb7.append(" media.type=");
            java.util.LinkedList list3 = h84Var.getList(4);
            sb7.append((list3 == null || (g84Var3 = (r45.g84) kz5.n0.Z(list3)) == null) ? null : java.lang.Integer.valueOf(g84Var3.getInteger(0)));
            sb7.append(" media.url=");
            java.util.LinkedList list4 = h84Var.getList(4);
            sb7.append((list4 == null || (g84Var2 = (r45.g84) kz5.n0.Z(list4)) == null) ? null : g84Var2.getString(1));
            sb7.append(" media.md5=");
            java.util.LinkedList list5 = h84Var.getList(4);
            sb7.append((list5 == null || (g84Var = (r45.g84) kz5.n0.Z(list5)) == null) ? null : g84Var.getString(2));
            sb7.append(' ');
            com.tencent.mars.xlog.Log.i("FinderLiveScreenEffectManager", sb7.toString());
            i17 = i18;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vh2.b(null), 3, null);
    }
}
