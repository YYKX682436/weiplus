package zl2;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f473685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f473686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(az2.f fVar, kotlinx.coroutines.q qVar, android.content.Context context) {
        super(1);
        this.f473685d = fVar;
        this.f473686e = qVar;
        this.f473687f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.an4 an4Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f473685d.b();
        boolean z17 = true;
        java.lang.String string = (fVar == null || (an4Var = (r45.an4) fVar.f70618d) == null) ? null : an4Var.getString(1);
        boolean z18 = fVar != null && fVar.f70615a == 0;
        android.content.Context context = this.f473687f;
        kotlinx.coroutines.q qVar = this.f473686e;
        if (z18 && fVar.f70616b == 0) {
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("FinderLiveShareProductDialog", "MmecGetProductTagLinkReq get empty link");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, context.getResources().getString(com.tencent.mm.R.string.leh))));
            } else {
                com.tencent.mm.sdk.platformtools.b0.e(string);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, "")));
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MmecGetProductTagLinkReq failed, err code = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            sb6.append(", errType = ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errMsg = ");
            sb6.append(fVar != null ? fVar.f70617c : null);
            com.tencent.mars.xlog.Log.e("FinderLiveShareProductDialog", sb6.toString());
            java.lang.String str = fVar != null ? fVar.f70617c : null;
            if (str == null) {
                str = context.getResources().getString(com.tencent.mm.R.string.leh);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, str)));
        }
        return jz5.f0.f302826a;
    }
}
