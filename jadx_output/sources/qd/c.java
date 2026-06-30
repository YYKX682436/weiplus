package qd;

/* loaded from: classes7.dex */
public class c extends qd.a {
    @Override // o91.a
    public boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("http://") || lowerCase.startsWith("https://");
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        return null;
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
    }

    @Override // o91.a
    public java.lang.String key() {
        return "NetworkImageReader";
    }
}
