package yu4;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f465871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yu4.k kVar, r45.sn3 sn3Var, java.lang.String str) {
        super(0);
        this.f465870d = kVar;
        this.f465871e = sn3Var;
        this.f465872f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yu4.k kVar = this.f465870d;
        kVar.getClass();
        r45.sn3 shareContent = this.f465871e;
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        if (shareContent.f385863n != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            kVar.f465889q = android.os.SystemClock.elapsedRealtime();
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.content.Context context = kVar.getContext();
            r45.xi0 xi0Var = kVar.f465881f;
            ((r35.k1) q1Var).Bi(context, xi0Var.f390123o, shareContent.f385863n.toByteArray(), null, xi0Var.f390125q, kVar.f465889q, null, new yu4.i(kVar, this.f465872f, shareContent));
        }
        return jz5.f0.f302826a;
    }
}
