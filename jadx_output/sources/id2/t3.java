package id2;

/* loaded from: classes.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f290807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f290808i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f290809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(id2.u3 u3Var, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19) {
        super(1);
        this.f290803d = u3Var;
        this.f290804e = context;
        this.f290805f = j17;
        this.f290806g = j18;
        this.f290807h = z17;
        this.f290808i = z18;
        this.f290809m = z19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "set auto replay gen");
            id2.u3 u3Var = this.f290803d;
            android.content.Context context = this.f290804e;
            id2.u3.Q6(u3Var, context, this.f290805f, this.f290806g, this.f290807h, this.f290808i, this.f290809m, true, new id2.s3(u3Var, context));
        }
        return jz5.f0.f302826a;
    }
}
