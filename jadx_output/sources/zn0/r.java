package zn0;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f474381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle, zn0.s sVar) {
        super(0);
        this.f474378d = str;
        this.f474379e = i17;
        this.f474380f = str2;
        this.f474381g = bundle;
        this.f474382h = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleUpdatePublishMediaStreamResult, taskId: ");
        java.lang.String str = this.f474378d;
        sb6.append(str);
        sb6.append(", code: ");
        int i17 = this.f474379e;
        sb6.append(i17);
        sb6.append(", message: ");
        java.lang.String str2 = this.f474380f;
        sb6.append(str2);
        sb6.append(", extraInfo: ");
        android.os.Bundle bundle = this.f474381g;
        sb6.append(bundle);
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", sb6.toString());
        zn0.s sVar = this.f474382h;
        if (sVar.f474389g != zn0.k.f474361f) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f474389g);
        } else {
            sVar.d();
            sVar.f474389g = zn0.k.f474359d;
            java.lang.String str3 = sVar.f474385c;
            if (str3 == null || str3.length() == 0) {
                com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId is empty");
            } else {
                if (str == null || str.length() == 0) {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "taskId is empty, publishMediaStreamTaskId: " + sVar.f474385c);
                } else if (!kotlin.jvm.internal.o.b(sVar.f474385c, str)) {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "taskId not same, publishMediaStreamTaskId: " + sVar.f474385c);
                } else if (i17 == 0) {
                    com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "Reset requestFailedCount");
                    sVar.f474390h = 0;
                    sVar.f474391i = 0;
                    zn0.s.a(sVar, false);
                } else {
                    int b17 = i17 == -7 ? zn0.s.b(sVar, bundle) : 0;
                    this.f474382h.g(zn0.j.f474356e, this.f474378d, this.f474379e, this.f474380f, b17);
                    if (i17 == -6 || i17 == -7) {
                        sVar.f474390h++;
                        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "requestFailedCount: " + sVar.f474390h);
                        if (i17 == -6) {
                            sVar.j();
                        } else {
                            zn0.s.c(sVar, str, str2, b17, false);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid code: " + i17);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
