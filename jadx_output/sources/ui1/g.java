package ui1;

/* loaded from: classes7.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f428048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f428052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ui1.s f428053f;

    public g(ui1.t tVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, ui1.s sVar) {
        this.f428048a = i17;
        this.f428049b = str;
        this.f428050c = str2;
        this.f428051d = str3;
        this.f428052e = z17;
        this.f428053f = sVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        if (((r45.f24) obj).f373941d.f377491d == 0 && 1 == this.f428048a) {
            java.lang.String str = this.f428049b;
            java.lang.String str2 = this.f428050c;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "setAuth, add allow cache appId = %s, api = %s  scope=%s", str, str2, this.f428051d);
            if (this.f428052e) {
                ui1.t.f428082d.e(str, str2);
            }
        }
        this.f428053f.a();
        return null;
    }
}
