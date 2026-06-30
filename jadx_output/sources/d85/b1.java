package d85;

/* loaded from: classes15.dex */
public final class b1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f227136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d85.l0 f227137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d85.d1 f227138c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f227139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f227142g;

    public b1(d85.f0 f0Var, d85.l0 l0Var, d85.d1 d1Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17) {
        this.f227136a = f0Var;
        this.f227137b = l0Var;
        this.f227138c = d1Var;
        this.f227139d = activity;
        this.f227140e = str;
        this.f227141f = str2;
        this.f227142g = i17;
    }

    @Override // j35.b0
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.sensitive.business.BusinessStackRecorder.f193183f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", this.f227136a.name());
        boolean z17 = true;
        if (iArr != null) {
            int length = iArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                if (iArr[i18] == -1) {
                    z17 = false;
                    break;
                }
                i18++;
            }
        }
        if (z17) {
            this.f227138c.uj(this.f227139d, this.f227140e, this.f227141f, this.f227142g, this.f227137b);
        } else {
            this.f227137b.a(d85.h0.SYSTEM_REFUSE);
        }
    }
}
