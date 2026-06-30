package to1;

/* loaded from: classes15.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f420924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.net.Uri uri) {
        super(0);
        this.f420924d = uri;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.net.Uri uri = this.f420924d;
        android.database.Cursor a17 = to1.n.a(to1.r.f420934d, uri, "mime_type", "_size");
        if (a17 == null) {
            return null;
        }
        try {
            a17.moveToFirst();
            java.lang.String string = a17.isNull(0) ? null : a17.getString(0);
            if (string == null) {
                com.tencent.mars.xlog.Log.e("WxDocumentFile", "Get mime type form uri(%s) failed.", uri);
                vz5.b.a(a17, null);
                return null;
            }
            boolean b17 = kotlin.jvm.internal.o.b("vnd.android.document/directory", string);
            java.lang.Long valueOf = a17.isNull(1) ? null : java.lang.Long.valueOf(a17.getLong(1));
            to1.r rVar = new to1.r(uri, b17, valueOf != null ? valueOf.longValue() : b17 ? 4096L : 0L);
            vz5.b.a(a17, null);
            return rVar;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(a17, th6);
                throw th7;
            }
        }
    }
}
