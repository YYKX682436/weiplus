package yw;

/* loaded from: classes11.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.u3 f466465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f466466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(yw.u3 u3Var, long j17) {
        super(1);
        this.f466465d = u3Var;
        this.f466466e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String draftData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(draftData, "draftData");
        com.tencent.wechat.iam.biz.v vVar = this.f466465d.f466479a;
        if (vVar != null) {
            vVar.E(this.f466466e, draftData);
        }
        return jz5.f0.f302826a;
    }
}
