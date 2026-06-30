package t53;

/* loaded from: classes8.dex */
public final class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f415726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f415727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415728f;

    public b0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.lang.String str4) {
        this.f415723a = str;
        this.f415724b = str2;
        this.f415725c = str3;
        this.f415726d = i17;
        this.f415727e = j17;
        this.f415728f = str4;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(this.f415723a);
        com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
        if (this.f415724b == null || (str = this.f415725c) == null) {
            dVar.c(this.f415726d, this.f415727e, "", Di.field_accountType, this.f415723a, 0L, "", this.f415728f);
            return null;
        }
        if (((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(str) == null) {
            return null;
        }
        dVar.c(this.f415726d, this.f415727e, this.f415724b, Di.field_accountType, this.f415723a, r14.field_accountType, this.f415725c, this.f415728f);
        return null;
    }
}
