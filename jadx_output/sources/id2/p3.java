package id2;

/* loaded from: classes.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f290737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f290738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km2.b f290739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290740i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(id2.u3 u3Var, android.content.Context context, long j17, long j18, km2.b bVar, yz5.l lVar) {
        super(4);
        this.f290735d = u3Var;
        this.f290736e = context;
        this.f290737f = j17;
        this.f290738g = j18;
        this.f290739h = bVar;
        this.f290740i = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String path = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((java.lang.Boolean) obj4).booleanValue();
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "genCallback triggered with path: " + path + ", needGenHighLight: " + booleanValue + ", isChecked: " + booleanValue2 + ", onlyMember: " + booleanValue3);
        kotlinx.coroutines.l.d(v65.m.b(this.f290735d.getActivity()), null, null, new id2.o3(this.f290735d, path, this.f290736e, this.f290737f, this.f290738g, booleanValue2, booleanValue3, booleanValue, this.f290739h, this.f290740i, null), 3, null);
        return jz5.f0.f302826a;
    }
}
