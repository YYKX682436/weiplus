package dl4;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f235367g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ff0.r f235368h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, com.tencent.mm.sdk.platformtools.w1 w1Var, android.view.View view, dl4.m0 m0Var, ff0.r rVar) {
        super(1);
        this.f235364d = str;
        this.f235365e = w1Var;
        this.f235366f = view;
        this.f235367g = m0Var;
        this.f235368h = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kk.j jVar = dl4.k.f235424a;
        java.lang.String key = this.f235364d;
        kotlin.jvm.internal.o.g(key, "key");
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.getRowBytes();
            bitmap.getWidth();
            bitmap.getHeight();
            bitmap.getAllocationByteCount();
            ((jt0.i) dl4.k.f235424a).put(key, bitmap);
        }
        final dl4.a0 a0Var = new dl4.a0(this.f235364d, this.f235366f, bitmap, this.f235367g, this.f235368h);
        com.tencent.mm.sdk.platformtools.w1 w1Var = this.f235365e;
        if (w1Var != null) {
            ((com.tencent.mm.sdk.platformtools.c4) w1Var).a(new java.lang.Runnable(a0Var) { // from class: dl4.x

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f235492d;

                {
                    kotlin.jvm.internal.o.g(a0Var, "function");
                    this.f235492d = a0Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f235492d.invoke();
                }
            });
        } else {
            pm0.v.X(a0Var);
        }
        return jz5.f0.f302826a;
    }
}
