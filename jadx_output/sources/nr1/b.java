package nr1;

/* loaded from: classes11.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final nr1.a f339135e = new nr1.a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f339136f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f339137d;

    static {
        l75.e0 e0Var = hr1.a.Y;
        f339136f = new java.lang.String[]{l75.n0.getCreateSQLs(hr1.a.Y, "BizPhotoFansContact")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, hr1.a.Y, "BizPhotoFansContact", dm.d1.A);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hr1.a.Y;
        this.f339137d = db6;
    }

    public final hr1.a y0(java.lang.String openid) {
        hr1.a aVar;
        kotlin.jvm.internal.o.g(openid, "openid");
        android.database.Cursor f17 = this.f339137d.f("SELECT *, rowid FROM BizPhotoFansContact WHERE openid = " + d95.b0.O(openid), null, 2);
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
            aVar = new hr1.a();
            aVar.convertFrom(f17);
        } else {
            aVar = null;
        }
        vz5.b.a(f17, null);
        return aVar;
    }

    public final boolean z0(hr1.a contact) {
        int p17;
        kotlin.jvm.internal.o.g(contact, "contact");
        java.lang.String str = contact.field_openid;
        if (str == null || str.length() == 0) {
            return false;
        }
        contact.field_createTime = c01.id.e();
        java.lang.String field_openid = contact.field_openid;
        kotlin.jvm.internal.o.f(field_openid, "field_openid");
        hr1.a y07 = y0(field_openid);
        l75.k0 k0Var = this.f339137d;
        if (y07 == null) {
            p17 = (int) k0Var.l("BizPhotoFansContact", com.google.android.gms.common.Scopes.OPEN_ID, contact.convertTo());
        } else {
            android.content.ContentValues convertTo = contact.convertTo();
            convertTo.remove("rowid");
            java.lang.String field_openid2 = contact.field_openid;
            kotlin.jvm.internal.o.f(field_openid2, "field_openid");
            p17 = k0Var.p("BizPhotoFansContact", convertTo, "openid=?", new java.lang.String[]{field_openid2});
        }
        if (p17 > 0) {
            doNotify("BizPhotoFansContact", 3, contact);
        }
        return p17 > 0;
    }
}
