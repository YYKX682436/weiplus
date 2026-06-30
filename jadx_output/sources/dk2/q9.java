package dk2;

/* loaded from: classes3.dex */
public final class q9 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f233953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233957f;

    public q9(android.content.Context context, dk2.x4 x4Var, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17) {
        this.f233952a = context;
        this.f233953b = x4Var;
        this.f233954c = str;
        this.f233955d = str2;
        this.f233956e = intent;
        this.f233957f = z17;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(c01.z1.j() & (-9007199254740993L)));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 65;
        p53Var.f382762e = 1;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        dk2.r9.f234025a.m(this.f233952a, this.f233953b, this.f233954c, this.f233955d, this.f233956e, this.f233957f);
    }
}
