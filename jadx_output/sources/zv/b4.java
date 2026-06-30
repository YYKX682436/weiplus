package zv;

/* loaded from: classes11.dex */
public final class b4 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f475916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.PersonalCenterJumpInfo f475917b;

    public b4(boolean z17, com.tencent.pigeon.biz_base.PersonalCenterJumpInfo personalCenterJumpInfo) {
        this.f475916a = z17;
        this.f475917b = personalCenterJumpInfo;
    }

    @Override // l81.e1
    public void a() {
        int i17;
        if (this.f475916a) {
            ur1.e eVar = ur1.e.f430346d;
            ur1.e eVar2 = ur1.e.f430346d;
            java.lang.Long serviceType = this.f475917b.getServiceType();
            if (serviceType != null) {
                i17 = (int) serviceType.longValue();
            } else {
                tk.s[] sVarArr = tk.s.f419870d;
                i17 = 2;
            }
            eVar2.a(true, i17);
        }
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
    }

    @Override // l81.e1
    public void f(boolean z17) {
        int i17;
        if (this.f475916a) {
            ur1.e eVar = ur1.e.f430346d;
            ur1.e eVar2 = ur1.e.f430346d;
            java.lang.Long serviceType = this.f475917b.getServiceType();
            if (serviceType != null) {
                i17 = (int) serviceType.longValue();
            } else {
                tk.s[] sVarArr = tk.s.f419870d;
                i17 = 2;
            }
            eVar2.a(true, i17);
        }
    }
}
