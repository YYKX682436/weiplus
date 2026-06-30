package qg5;

/* loaded from: classes5.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f362992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f362993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f362995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f362996h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f362997i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f362998m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362999n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.tencent.mm.sdk.platformtools.o4 o4Var, qg5.q4 q4Var, android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var, boolean z17, xj.m mVar, yz5.a aVar) {
        super(0);
        this.f362992d = o4Var;
        this.f362993e = q4Var;
        this.f362994f = context;
        this.f362995g = list;
        this.f362996h = z3Var;
        this.f362997i = z17;
        this.f362998m = mVar;
        this.f362999n = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f362992d;
        if (o4Var != null) {
            o4Var.putBoolean("yuanbao_forward_agreed", true);
        }
        this.f362993e.a7(this.f362994f, this.f362995g, this.f362996h, this.f362997i, this.f362998m, this.f362999n);
        return jz5.f0.f302826a;
    }
}
