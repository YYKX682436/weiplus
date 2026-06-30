package xi5;

/* loaded from: classes.dex */
public final class b extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f454735b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f454736c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f454737d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f454738e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f454739f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f454740g;

    public b(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, java.lang.String str, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        num = (i17 & 1) != 0 ? null : num;
        num2 = (i17 & 2) != 0 ? null : num2;
        num3 = (i17 & 4) != 0 ? null : num3;
        bool = (i17 & 8) != 0 ? null : bool;
        str = (i17 & 16) != 0 ? null : str;
        z17 = (i17 & 32) != 0 ? false : z17;
        this.f454735b = num;
        this.f454736c = num2;
        this.f454737d = num3;
        this.f454738e = bool;
        this.f454739f = str;
        this.f454740g = z17;
    }
}
