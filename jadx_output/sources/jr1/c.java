package jr1;

/* loaded from: classes11.dex */
public final class c implements com.tencent.wechat.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr1.e f301350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hr1.i f301351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f301353d;

    public c(hr1.e eVar, hr1.i iVar, java.lang.String str, int i17) {
        this.f301350a = eVar;
        this.f301351b = iVar;
        this.f301352c = str;
        this.f301353d = i17;
    }

    @Override // com.tencent.wechat.iam.biz.d1
    public final void complete(int i17) {
        hr1.e eVar = this.f301350a;
        jr1.j.f(eVar, 0);
        eVar.field_unReadCount = i17;
        eVar.field_digest = this.f301352c;
        eVar.field_updateTime = this.f301353d * 1000;
        this.f301351b.replace(eVar, true);
    }
}
