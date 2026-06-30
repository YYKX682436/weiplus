package pa2;

/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f352973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa2.g f352974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.widget.dialog.u3 u3Var, pa2.g gVar) {
        super(1);
        this.f352973d = u3Var;
        this.f352974e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f352973d.dismiss();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doUnpublish failed: errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        com.tencent.mars.xlog.Log.e("FinderTemplateShareHandler", sb6.toString());
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f352974e.f434158a;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(appCompatActivity);
        e4Var.d(com.tencent.mm.R.string.f490391to);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
