package re2;

/* loaded from: classes2.dex */
public final class z0 implements ek2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f394506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.r f394508c;

    public z0(long j17, yz5.l lVar, yz5.r rVar) {
        this.f394506a = j17;
        this.f394507b = lVar;
        this.f394508c = rVar;
    }

    @Override // ek2.p
    public void a(int i17, int i18, java.lang.String str, r45.nx0 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        long j17 = this.f394506a;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "acceptInvitation success: invitationId=" + j17 + ", userFlag=" + resp.f381719d + ", spamJumpUrl=" + resp.f381720e);
            yz5.l lVar = this.f394507b;
            if (lVar != null) {
                lVar.invoke(resp);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("Finder.CoLiveRequestHelper", "acceptInvitation failed: invitationId=" + j17 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", userFlag=" + resp.f381719d + ", spamJumpUrl=" + resp.f381720e);
        yz5.r rVar = this.f394508c;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(resp.f381719d), resp.f381720e);
        }
    }
}
