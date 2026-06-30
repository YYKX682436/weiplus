package o25;

/* loaded from: classes4.dex */
public final class d2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o25.c2 f342503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342505d;

    public d2(java.lang.String str, o25.c2 c2Var, java.lang.String str2, java.lang.String str3) {
        this.f342502a = str;
        this.f342503b = c2Var;
        this.f342504c = str2;
        this.f342505d = str3;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + this.f342502a + ", start fail");
        o25.g2.f342527a.b(this.f342504c, this.f342505d, this.f342502a, -3, null, null);
        o25.c2 c2Var = this.f342503b;
        if (c2Var != null) {
            c2Var.c();
        }
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + this.f342502a + ", start success");
    }
}
