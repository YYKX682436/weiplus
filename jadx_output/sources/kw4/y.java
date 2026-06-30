package kw4;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f313206h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f313207i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f313208j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f313209k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17, float[] fArr, int i18) {
        super(j17, bool);
        this.f313209k = c0Var;
        this.f313206h = i17;
        this.f313207i = fArr;
        this.f313208j = i18;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f313209k.f(this.f313206h, this.f313207i, this.f313208j));
    }
}
