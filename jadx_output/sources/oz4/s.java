package oz4;

/* loaded from: classes12.dex */
public enum s {
    NONE("", "", "", "", false, false),
    NOTEUL("<wx-ul>", "</wx-ul>", "<wx-li>", "</wx-li>", false, true),
    NOTEOL("<wx-ol>", "</wx-ol>", "<wx-li>", "</wx-li>", false, true),
    NOTETODO("", "", "<wn-todo checked=\"1\" >", "</wn-todo>", false, true);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f350304d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f350305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350306f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f350307g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f350308h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f350309i = false;

    s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18) {
        this.f350304d = str;
        this.f350305e = str2;
        this.f350306f = str3;
        this.f350307g = str4;
        this.f350308h = z18;
    }

    public boolean h() {
        return this == NOTETODO;
    }
}
