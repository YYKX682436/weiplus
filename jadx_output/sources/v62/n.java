package v62;

/* loaded from: classes12.dex */
public class n extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f433521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f433522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v62.p pVar, long j17, java.lang.Boolean bool, boolean z17, java.lang.String str, int i17, int i18) {
        super(j17, bool, z17);
        this.f433520h = str;
        this.f433521i = i17;
        this.f433522j = i18;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        gm0.j1.n().f273288b.a(782, new v62.m(this));
        gm0.j1.n().f273288b.g(new w62.a(this.f433520h, this.f433521i, this.f433522j));
        return java.lang.Boolean.TRUE;
    }
}
