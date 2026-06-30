package jr1;

/* loaded from: classes11.dex */
public final class a implements com.tencent.wechat.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr1.e f301344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr1.f f301345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f301347d;

    public a(hr1.e eVar, nr1.f fVar, java.lang.String str, int i17) {
        this.f301344a = eVar;
        this.f301345b = fVar;
        this.f301346c = str;
        this.f301347d = i17;
    }

    @Override // com.tencent.wechat.iam.biz.d1
    public final void complete(int i17) {
        hr1.e eVar = this.f301344a;
        jr1.j.f(eVar, 5);
        eVar.field_unReadCount = i17;
        eVar.field_digest = this.f301346c;
        eVar.field_updateTime = this.f301347d * 1000;
        this.f301345b.replace(eVar, true);
    }
}
