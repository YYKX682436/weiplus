package j3;

/* loaded from: classes13.dex */
public abstract class m {
    public static android.os.LocaleList a(java.util.Locale... localeArr) {
        return new android.os.LocaleList(localeArr);
    }

    public static android.os.LocaleList b() {
        return android.os.LocaleList.getAdjustedDefault();
    }

    public static android.os.LocaleList c() {
        return android.os.LocaleList.getDefault();
    }
}
