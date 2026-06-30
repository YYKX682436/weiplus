package to1;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f420925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f420926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String[] strArr, android.net.Uri uri) {
        super(0);
        this.f420925d = strArr;
        this.f420926e = uri;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.net.Uri uri = this.f420926e;
        if (this.f420925d.length == 0) {
            return null;
        }
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
        try {
            java.util.Objects.toString(uri);
            return contentResolver.query(this.f420926e, this.f420925d, null, null, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("WxDocumentFile", "Fail to query. uri=" + uri + ", exception=" + e17);
            return null;
        }
    }
}
