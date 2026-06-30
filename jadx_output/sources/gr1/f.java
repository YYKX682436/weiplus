package gr1;

/* loaded from: classes11.dex */
public final class f implements com.tencent.wechat.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nr1.f f274728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f274730c;

    public f(nr1.f fVar, java.lang.String str, int i17) {
        this.f274728a = fVar;
        this.f274729b = str;
        this.f274730c = i17;
    }

    @Override // com.tencent.wechat.iam.biz.d1
    public final void complete(int i17) {
        nr1.f fVar = this.f274728a;
        hr1.e z07 = fVar.z0("bizphotofansnofiticationholder@picfansmsg");
        jr1.j.f(z07, 5);
        java.lang.String str = this.f274729b;
        z07.field_digest = str;
        z07.field_updateTime = this.f274730c * 1000;
        z07.field_unReadCount = i17;
        z07.field_readStatus = 0;
        fVar.replace(z07, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated photo, digest update " + str + ", redDotCount: " + i17);
    }
}
