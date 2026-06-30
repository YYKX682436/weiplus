package yi4;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f462608a;

    static {
        int[] iArr = new int[com.tencent.pigeon.status.StatusPrivacyType.values().length];
        try {
            iArr[com.tencent.pigeon.status.StatusPrivacyType.PRIVATE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.tencent.pigeon.status.StatusPrivacyType.VISIBLE_GROUP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.tencent.pigeon.status.StatusPrivacyType.INVISIBLE_GROUP.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.tencent.pigeon.status.StatusPrivacyType.PUBLIC.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        f462608a = iArr;
    }
}
