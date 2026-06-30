package pk2;

/* loaded from: classes3.dex */
public final class l9 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f355965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f355966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f355967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355968e;

    public l9(pk2.o9 o9Var, int i17, yz5.p pVar, boolean z17, int i18) {
        this.f355964a = o9Var;
        this.f355965b = i17;
        this.f355966c = pVar;
        this.f355967d = z17;
        this.f355968e = i18;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        boolean z17 = this.f355967d;
        int i19 = this.f355968e;
        int i27 = this.f355965b;
        pk2.o9 o9Var = this.f355964a;
        if (z17) {
            mm2.c1 c1Var = (mm2.c1) o9Var.c(mm2.c1.class);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i19 & (~i27));
        } else {
            mm2.c1 c1Var2 = (mm2.c1) o9Var.c(mm2.c1.class);
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            c1Var2.p8(i19 | i27);
        }
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("commonAnchorFlagClick failed, flag:" + i27, (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q);
        yz5.p pVar = this.f355966c;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, cv2Var);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        pk2.o9 o9Var = this.f355964a;
        ((mm2.c1) o9Var.c(mm2.c1.class)).q8(j17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).Z9(j17);
        com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("commonAnchorFlagClick succ, flag:" + this.f355965b, (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q);
        yz5.p pVar = this.f355966c;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, cv2Var);
        }
    }
}
