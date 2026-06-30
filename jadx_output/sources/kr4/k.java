package kr4;

/* loaded from: classes4.dex */
public final class k extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f311513e = {l75.n0.getCreateSQLs(kr4.e.f311504v, "W1wContact")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f311514d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l75.k0 db6) {
        super(db6, kr4.e.f311504v, "W1wContact", dm.vb.f240647m);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = kr4.e.f311504v;
        this.f311514d = db6;
    }

    public final kr4.e y0(java.lang.String username) {
        kr4.e eVar;
        kotlin.jvm.internal.o.g(username, "username");
        android.database.Cursor f17 = this.f311514d.f("SELECT *, rowid FROM W1wContact WHERE username = " + d95.b0.O(username), null, 2);
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
            eVar = new kr4.e();
            eVar.convertFrom(f17);
        } else {
            eVar = null;
        }
        vz5.b.a(f17, null);
        return eVar;
    }

    public final boolean z0(kr4.e contact) {
        int p17;
        kotlin.jvm.internal.o.g(contact, "contact");
        java.lang.String str = contact.field_username;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String field_username = contact.field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        kr4.e y07 = y0(field_username);
        l75.k0 k0Var = this.f311514d;
        if (y07 == null) {
            p17 = (int) k0Var.l("W1wContact", dm.i4.COL_USERNAME, contact.convertTo());
        } else {
            android.content.ContentValues convertTo = contact.convertTo();
            convertTo.remove("rowid");
            java.lang.String field_username2 = contact.field_username;
            kotlin.jvm.internal.o.f(field_username2, "field_username");
            p17 = k0Var.p("W1wContact", convertTo, "username=?", new java.lang.String[]{field_username2});
        }
        if (p17 > 0) {
            doNotify("W1wContact", 3, contact);
        }
        return p17 > 0;
    }
}
