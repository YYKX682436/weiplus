package go2;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f274071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        super(1);
        this.f274070d = context;
        this.f274071e = intent;
        this.f274072f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xr0 xr0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.String str = this.f274072f;
        if (fVar != null) {
            eo2.f.f255565a.g(str, fVar);
        }
        if (eo2.f.f255565a.d((fVar == null || (xr0Var = (r45.xr0) fVar.f70618d) == null) ? null : java.lang.Integer.valueOf(xr0Var.f390352e))) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = this.f274070d;
            i0Var.Gk(context, this.f274071e, str);
            ((com.tencent.mm.plugin.finder.ui.MMFinderUI) context).finish();
        }
        return jz5.f0.f302826a;
    }
}
