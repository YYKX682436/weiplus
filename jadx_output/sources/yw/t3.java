package yw;

/* loaded from: classes11.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.u3 f466472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f466473e;

    public t3(yw.u3 u3Var, long j17) {
        this.f466472d = u3Var;
        this.f466473e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.iam.biz.v vVar = this.f466472d.f466479a;
        if (vVar != null) {
            vVar.Z0(this.f466473e);
        }
    }
}
