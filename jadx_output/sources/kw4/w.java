package kw4;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f313199i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f313200j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float[] f313201k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f313202l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f313203m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kw4.c0 c0Var, long j17, java.lang.Boolean bool, android.view.View view, int i17, int i18, float[] fArr, int i19) {
        super(j17, bool);
        this.f313203m = c0Var;
        this.f313198h = view;
        this.f313199i = i17;
        this.f313200j = i18;
        this.f313201k = fArr;
        this.f313202l = i19;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return java.lang.Boolean.valueOf(this.f313203m.a(this.f313198h, this.f313199i, this.f313200j, this.f313201k, this.f313202l));
    }
}
