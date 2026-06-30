package gr1;

/* loaded from: classes11.dex */
public final class e implements com.tencent.wechat.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr1.i f274725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f274727c;

    public e(hr1.i iVar, java.lang.String str, int i17) {
        this.f274725a = iVar;
        this.f274726b = str;
        this.f274727c = i17;
    }

    @Override // com.tencent.wechat.iam.biz.d1
    public final void complete(int i17) {
        hr1.i iVar = this.f274725a;
        hr1.e z07 = iVar.z0("bizfansnofiticationholder@bizfansmsg");
        jr1.j.f(z07, 0);
        java.lang.String str = this.f274726b;
        z07.field_digest = str;
        z07.field_updateTime = this.f274727c * 1000;
        z07.field_unReadCount = i17;
        z07.field_readStatus = 0;
        iVar.replace(z07, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.RedDotDelegate", "subscribeNotificationDigestUpdated, digest update " + str + ", redDotCount: " + i17);
    }
}
