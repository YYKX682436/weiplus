package zn0;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn0.s f474371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f474372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, int i17, java.lang.String str2, zn0.s sVar, android.os.Bundle bundle) {
        super(0);
        this.f474368d = str;
        this.f474369e = i17;
        this.f474370f = str2;
        this.f474371g = sVar;
        this.f474372h = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleStartPublishMediaStreamResult, taskId: ");
        java.lang.String str = this.f474368d;
        sb6.append(str);
        sb6.append(", code: ");
        int i17 = this.f474369e;
        sb6.append(i17);
        sb6.append(", message: ");
        java.lang.String str2 = this.f474370f;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", sb6.toString());
        zn0.s sVar = this.f474371g;
        if (sVar.f474389g != zn0.k.f474360e) {
            com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f474389g);
        } else {
            sVar.d();
            sVar.f474389g = zn0.k.f474359d;
            int b17 = i17 == -7 ? zn0.s.b(sVar, this.f474372h) : 0;
            int i18 = this.f474369e;
            if (i18 != 0) {
                this.f474371g.g(zn0.j.f474355d, this.f474368d, i18, this.f474370f, b17);
            }
            if (str == null || str.length() == 0) {
                java.lang.String str3 = sVar.f474385c;
                if (!(str3 == null || str3.length() == 0)) {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId is not null: " + sVar.f474385c);
                    sVar.f474385c = null;
                }
                if (i17 == -6 || i17 == -7) {
                    sVar.f474390h++;
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "taskId is empty, requestFailedCount: " + sVar.f474390h);
                    if (i17 == -6) {
                        sVar.i();
                    } else {
                        zn0.s.c(sVar, str, str2, b17, true);
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("FinderLivePublishMediaStream", "Invalid code: " + i17);
                }
            } else {
                com.tencent.mars.xlog.Log.i("FinderLivePublishMediaStream", "update taskId, lastPublishMediaStreamTaskId: " + sVar.f474386d);
                sVar.f474390h = 0;
                sVar.f474386d = null;
                sVar.f474385c = str;
                zn0.s.a(sVar, i17 != 0);
            }
        }
        return jz5.f0.f302826a;
    }
}
