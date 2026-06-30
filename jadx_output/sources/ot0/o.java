package ot0;

/* loaded from: classes7.dex */
public enum o {
    /* JADX INFO: Fake field, exist only in values array */
    BUSINESS_MY_LIFE_AROUND,
    /* JADX INFO: Fake field, exist only in values array */
    BUSINESS_OTHER,
    /* JADX INFO: Fake field, exist only in values array */
    BUSINESS_MAX;

    public static java.lang.String a(int i17, java.lang.String str, android.content.Context context) {
        int identifier;
        return (!b(i17) || com.tencent.mm.sdk.platformtools.t8.K0(str) || (identifier = context.getResources().getIdentifier(str, "string", context.getPackageName())) <= 0) ? "" : context.getResources().getString(identifier);
    }

    public static boolean b(int i17) {
        return i17 >= 0 && i17 < 2;
    }
}
