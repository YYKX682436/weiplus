package lp0;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final lp0.h f320266b = new lp0.h(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f320267a;

    public h(android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            this.f320267a = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        } else {
            this.f320267a = sharedPreferences;
        }
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.o4.M("MMKV_Name_LastLoginInfo").contains(str)) {
            return com.tencent.mm.sdk.platformtools.o4.M("MMKV_Name_LastLoginInfo").getString(str, str2);
        }
        java.lang.String string = this.f320267a.getString(str, str2);
        com.tencent.mm.sdk.platformtools.o4.M("MMKV_Name_LastLoginInfo").putString(str, string);
        return string;
    }
}
