package sz3;

/* loaded from: classes15.dex */
public final class p extends sz3.a {

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f414086h;

    /* renamed from: i, reason: collision with root package name */
    public final int f414087i;

    /* renamed from: j, reason: collision with root package name */
    public final int f414088j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f414089k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f414090l;

    /* renamed from: m, reason: collision with root package name */
    public int f414091m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f414092n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Point f414093o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sz3.a1 scanProductRequestInfo, int i17, byte[] uploadImageData, int i18, int i19) {
        super(i17, scanProductRequestInfo);
        kotlin.jvm.internal.o.g(scanProductRequestInfo, "scanProductRequestInfo");
        kotlin.jvm.internal.o.g(uploadImageData, "uploadImageData");
        this.f414086h = uploadImageData;
        this.f414087i = i18;
        this.f414088j = i19;
        this.f414089k = true;
        this.f414090l = true;
        this.f414093o = new android.graphics.Point(0, 0);
    }
}
