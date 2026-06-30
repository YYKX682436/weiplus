package rm5;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tav.coremedia.CMTime f397485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f397486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f397487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.tav.coremedia.CMTime cMTime, kotlin.jvm.internal.g0 g0Var, android.graphics.Bitmap bitmap) {
        super(1);
        this.f397485d = cMTime;
        this.f397486e = g0Var;
        this.f397487f = bitmap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        rm5.d it = (rm5.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (kotlin.jvm.internal.o.b(it.f397483c, this.f397485d)) {
            kotlin.jvm.internal.g0 g0Var = this.f397486e;
            long j17 = it.f397481a;
            g0Var.f310121d = j17;
            it.f397482b.invoke(java.lang.Long.valueOf(j17), this.f397487f);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
