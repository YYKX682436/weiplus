package vw;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.p1 f440668a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.p1 f440669b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kl f440670c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440671d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440672e;

    public k() {
        com.tencent.wechat.iam.biz.t1 t1Var = com.tencent.wechat.iam.biz.t1.f217792c;
        this.f440668a = t1Var.a().b();
        this.f440669b = t1Var.f().b();
        this.f440671d = "isNeedFetchProfileInfo";
        this.f440672e = jz5.h.b(new vw.j(this));
    }

    public final com.tencent.wechat.iam.biz.p1 a(int i17) {
        com.tencent.wechat.iam.biz.p1 p1Var = this.f440668a;
        if (i17 == 1) {
            return p1Var;
        }
        if (i17 == 2) {
            return this.f440669b;
        }
        com.tencent.mars.xlog.Log.w("BizProfileDraftDataUtil", "Unknown bizType: " + i17);
        return p1Var;
    }
}
