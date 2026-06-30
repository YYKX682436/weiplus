package fl1;

/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f263779a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f263780b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f263781c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f263782d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f263783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f263784f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f263785g;

    /* renamed from: h, reason: collision with root package name */
    public final int f263786h;

    public h1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.Bitmap bitmap, boolean z17, java.lang.String iconUrl, int i18) {
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
        this.f263779a = i17;
        this.f263780b = str;
        this.f263781c = str2;
        this.f263782d = str3;
        this.f263783e = bitmap;
        this.f263784f = z17;
        this.f263785g = iconUrl;
        this.f263786h = i18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String iconUrl, int i18) {
        this(i17, str, str2, str3, null, z17, iconUrl, i18);
        kotlin.jvm.internal.o.g(iconUrl, "iconUrl");
    }

    public h1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, android.graphics.Bitmap bitmap, int i18) {
        this(i17, str, str2, str3, bitmap, z17, "", i18);
    }

    public h1(int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        this(i17, str, "", str2, null, z17, "", 0);
    }
}
