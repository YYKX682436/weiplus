package f80;

/* loaded from: classes12.dex */
public final class e extends f80.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f260086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f260087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String thumbPath, int i17, int i18) {
        super(null);
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        this.f260086a = thumbPath;
        this.f260087b = i17;
        this.f260088c = i18;
    }

    @Override // f80.f
    public int a() {
        return this.f260088c;
    }

    @Override // f80.f
    public int b() {
        return this.f260087b;
    }
}
