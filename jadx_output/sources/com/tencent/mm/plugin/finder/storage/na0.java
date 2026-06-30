package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class na0 extends l75.n0 implements zy2.a9 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f127239e = {"CREATE INDEX IF NOT EXISTS FinderMsgContactStorage_username_index ON FinderMsgContactStorage(username)"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f127240f = {l75.n0.getCreateSQLs(ya2.b2.O2, "FinderMsgContactStorage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f127241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(l75.k0 storage) {
        super(storage, ya2.b2.O2, "FinderMsgContactStorage", f127239e);
        kotlin.jvm.internal.o.g(storage, "storage");
        l75.e0 e0Var = ya2.b2.O2;
        this.f127241d = storage;
    }

    public final void D0(ya2.b2 b2Var) {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String z07 = ((c61.l7) i95.n0.c(c61.l7.class)).pk().z0(b2Var.D0(), 3);
        Bi.k0(b2Var.D0());
        Bi.k0(z07);
    }

    public boolean J0(ya2.b2 ct6, boolean z17) {
        boolean L0;
        kotlin.jvm.internal.o.g(ct6, "ct");
        if (z17) {
            ct6.field_updateTime = c01.id.c();
        }
        if (y0(ct6.D0()) == null) {
            long z07 = z0(ct6);
            ct6.systemRowid = z07;
            L0 = z07 > 0;
        } else {
            L0 = L0(ct6);
        }
        if (L0) {
            D0(ct6);
            doNotify("FinderMsgContactStorage", 4, ct6.D0());
        }
        return L0;
    }

    public boolean L0(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        android.content.ContentValues convertTo = contact.convertTo();
        convertTo.remove("rowid");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int p17 = this.f127241d.p("FinderMsgContactStorage", convertTo, "username=?", new java.lang.String[]{"" + contact.field_username});
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        new qb2.r("FinderMsgStrangerContactStorage.updateContact", r26.i0.u("updateContact", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.tencent.mars.xlog.Log.i("Finder.MsgContactStorage", "updateContact " + contact.L0() + ' ' + p17);
        if (p17 > 0) {
            D0(contact);
        }
        return p17 > 0;
    }

    public ya2.b2 y0(java.lang.String username) {
        ya2.b2 b2Var;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String sql = "SELECT *, rowid FROM FinderMsgContactStorage WHERE username = " + d95.b0.O(username);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor f17 = this.f127241d.f(sql, null, 2);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderMsgStrangerContactStorage.getContact", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            b2Var = new ya2.b2();
            b2Var.convertFrom(f17);
        } else {
            b2Var = null;
        }
        vz5.b.a(f17, null);
        return b2Var;
    }

    public long z0(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        android.content.ContentValues convertTo = contact.convertTo();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long l17 = this.f127241d.l("FinderMsgContactStorage", "", convertTo);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        new qb2.r("FinderMsgStrangerContactStorage.insertContact", r26.i0.u("insertContact", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.tencent.mars.xlog.Log.i("Finder.MsgContactStorage", "insert contact " + contact + ' ' + l17);
        return l17;
    }
}
