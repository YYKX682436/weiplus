package df2;

/* loaded from: classes3.dex */
public final class c6 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f229860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f229861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f229862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229863d;

    public c6(df2.d6 d6Var, boolean z17, kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f229860a = d6Var;
        this.f229861b = z17;
        this.f229862c = c0Var;
        this.f229863d = qVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        kotlin.jvm.internal.c0 c0Var = this.f229862c;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f229863d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        int i17;
        df2.d6 d6Var = this.f229860a;
        mm2.c1 c1Var = (mm2.c1) d6Var.business(mm2.c1.class);
        if (this.f229861b) {
            int i18 = (int) ((mm2.c1) d6Var.business(mm2.c1.class)).f328866q;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            i17 = i18 | 131072;
        } else {
            int i19 = (int) ((mm2.c1) d6Var.business(mm2.c1.class)).f328866q;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            i17 = i19 & (-131073);
        }
        c1Var.p8(i17);
        kotlin.jvm.internal.c0 c0Var = this.f229862c;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f229863d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
