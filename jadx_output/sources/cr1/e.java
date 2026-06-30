package cr1;

/* loaded from: classes11.dex */
public final class e implements br1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cr1.g f221838b;

    public e(java.lang.String str, cr1.g gVar) {
        this.f221837a = str;
        this.f221838b = gVar;
    }

    @Override // br1.w
    public void a(int i17) {
    }

    @Override // br1.w
    public void b(boolean z17, int i17, hr1.a aVar) {
        java.lang.String str = this.f221837a;
        if (!z17 || aVar == null) {
            com.tencent.mars.xlog.Log.w("BizFans.BizFansAvatarInterceptor", "[loadHdBitmap] failed to get contact, isOk=" + z17 + ", tag=" + str);
            return;
        }
        vo0.d dVar = cr1.k.f221848a;
        wo0.c a17 = cr1.k.f221848a.a(new cr1.a(aVar.field_headImgUrl));
        cr1.d dVar2 = new cr1.d(this.f221838b, str);
        a17.getClass();
        a17.f447873d = dVar2;
        a17.a();
    }
}
