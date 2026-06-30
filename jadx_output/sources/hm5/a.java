package hm5;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f282296a;

    public a(android.content.Intent intent) {
        this.f282296a = null;
        this.f282296a = intent.getExtras();
    }

    public int a(java.lang.String str, int i17) {
        android.os.Bundle bundle = this.f282296a;
        return bundle == null ? i17 : bundle.getInt(str, i17);
    }

    public java.lang.String b(java.lang.String str) {
        android.os.Bundle bundle = this.f282296a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }
}
