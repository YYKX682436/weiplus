package gh3;

/* loaded from: classes.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f271883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f271884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f271885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f271886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f271887h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f271888i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gh3.i f271889m;

    public f(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.f9 f9Var, boolean z17, android.content.Context context, android.content.Intent intent, int i17, gh3.i iVar) {
        this.f271883d = h0Var;
        this.f271884e = f9Var;
        this.f271885f = z17;
        this.f271886g = context;
        this.f271887h = intent;
        this.f271888i = i17;
        this.f271889m = iVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            pm0.v.X(new gh3.e(this.f271883d, aVar, this.f271884e, this.f271885f, this.f271886g, this.f271887h, this.f271888i, this.f271889m));
        }
        return jz5.f0.f302826a;
    }
}
