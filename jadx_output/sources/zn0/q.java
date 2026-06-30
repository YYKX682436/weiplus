package zn0;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f474377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, int i17, java.lang.String str2, zn0.s sVar, android.os.Bundle bundle) {
        super(0);
        this.f474373d = str;
        this.f474374e = i17;
        this.f474375f = str2;
        this.f474376g = sVar;
        this.f474377h = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleStopPublishMediaStreamResult, taskId: ");
        sb6.append(this.f474373d);
        sb6.append(", code: ");
        int i17 = this.f474374e;
        sb6.append(i17);
        sb6.append(", message: ");
        sb6.append(this.f474375f);
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", sb6.toString());
        zn0.s sVar = this.f474376g;
        if (sVar.f474389g != zn0.k.f474362g) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f474389g);
        } else {
            sVar.d();
            sVar.f474389g = zn0.k.f474359d;
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Clear lastPublishMediaStreamTaskId: " + sVar.f474386d);
                sVar.f474386d = null;
            } else {
                this.f474376g.g(zn0.j.f474357f, this.f474373d, this.f474374e, this.f474375f, i17 == -7 ? zn0.s.b(sVar, this.f474377h) : 0);
            }
            sVar.h();
        }
        return jz5.f0.f302826a;
    }
}
