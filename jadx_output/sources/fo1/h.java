package fo1;

/* loaded from: classes.dex */
public final class h implements c01.o8 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f264875b = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f264876a = new java.util.HashMap();

    public h() {
        android.database.Cursor B = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f195071d.B("select username from rcontact", null);
        try {
            int columnIndex = B.getColumnIndex(dm.i4.COL_USERNAME);
            while (B.moveToNext()) {
                java.util.HashMap hashMap = this.f264876a;
                java.lang.String string = B.getString(columnIndex);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                hashMap.put(string, fo1.g.f264874d);
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("GetContactHelper", "init size of contactHasGotten is " + this.f264876a.size());
        } finally {
        }
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("GetContactHelper", "getContactCallBack return a empty username");
            return;
        }
        java.util.HashMap hashMap = f264875b;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("GetContactHelper", "getContactCallBack failed.");
            java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
            if (num == null) {
                num = 0;
            }
            hashMap.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
            return;
        }
        java.util.HashMap hashMap2 = this.f264876a;
        yz5.a aVar = (yz5.a) hashMap2.get(str);
        if (aVar != null) {
            aVar.invoke();
        }
        hashMap2.put(str, fo1.g.f264874d);
        hashMap.remove(str);
    }

    public final void b(java.lang.String username, yz5.a cb6) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cb6, "cb");
        java.util.HashMap hashMap = this.f264876a;
        yz5.a aVar = (yz5.a) hashMap.get(username);
        if (kotlin.jvm.internal.o.b(aVar, fo1.g.f264874d)) {
            cb6.invoke();
            return;
        }
        if (aVar == null) {
            java.lang.Integer num = (java.lang.Integer) f264875b.get(username);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() < 3) {
                hashMap.put(username, cb6);
                ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(username, 16, this);
            } else {
                com.tencent.mars.xlog.Log.w("GetContactHelper", "Skip getContact of " + username + ", because 3 attempts to get contact failed.");
            }
        }
    }

    public final boolean c(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        return kotlin.jvm.internal.o.b(this.f264876a.get(username), fo1.g.f264874d);
    }
}
