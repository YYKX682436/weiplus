package id2;

/* loaded from: classes.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290785h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(id2.u3 u3Var, android.content.Context context, long j17, long j18, yz5.l lVar) {
        super(1);
        this.f290781d = u3Var;
        this.f290782e = context;
        this.f290783f = j17;
        this.f290784g = j18;
        this.f290785h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "onReplayCancelCallBack triggered with isEnabled=" + booleanValue);
        if (booleanValue) {
            id2.u3 u3Var = this.f290781d;
            android.content.Context context = this.f290782e;
            long j17 = this.f290783f;
            kotlinx.coroutines.l.d(v65.m.b(u3Var.getActivity()), null, null, new id2.p2(context, j17, new id2.q3(u3Var, context, j17, this.f290784g, this.f290785h), null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
