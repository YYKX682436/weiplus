package qg5;

/* loaded from: classes8.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f363074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f363075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f363076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xj.m f363078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f363079i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f363080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363081n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(qg5.u3 u3Var, java.util.List list, com.tencent.mm.storage.z3 z3Var, android.content.Context context, xj.m mVar, boolean z17, boolean z18, yz5.a aVar) {
        super(0);
        this.f363074d = u3Var;
        this.f363075e = list;
        this.f363076f = z3Var;
        this.f363077g = context;
        this.f363078h = mVar;
        this.f363079i = z17;
        this.f363080m = z18;
        this.f363081n = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f363074d.f363210f).getValue();
        if (o4Var != null) {
            o4Var.putBoolean("yuanbao_copy_agreed", true);
        }
        this.f363074d.W6(this.f363075e, this.f363076f, this.f363077g, this.f363078h, this.f363079i, this.f363080m, this.f363081n);
        return jz5.f0.f302826a;
    }
}
