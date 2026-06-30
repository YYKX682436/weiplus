package re2;

/* loaded from: classes2.dex */
public final class b1 implements ek2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f394363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f394364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f394366d;

    public b1(long j17, int i17, yz5.l lVar, yz5.p pVar) {
        this.f394363a = j17;
        this.f394364b = i17;
        this.f394365c = lVar;
        this.f394366d = pVar;
    }

    @Override // ek2.p
    public void a(int i17, int i18, java.lang.String str, r45.nx0 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        int i19 = this.f394364b;
        long j17 = this.f394363a;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "inviteManage success: invitationId=" + j17 + ", actionType=" + i19);
            yz5.l lVar = this.f394365c;
            if (lVar != null) {
                lVar.invoke(resp);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("Finder.CoLiveRequestHelper", "inviteManage failed: invitationId=" + j17 + ", actionType=" + i19 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        yz5.p pVar = this.f394366d;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i18), str);
        }
    }
}
