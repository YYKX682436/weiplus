package go2;

/* loaded from: classes2.dex */
public final class e extends fo2.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.g f273966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(go2.g gVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str) {
        super(appCompatActivity, str);
        this.f273966d = gVar;
    }

    @Override // fo2.e
    public boolean A() {
        go2.g gVar = this.f273966d;
        r45.tr0 tr0Var = (r45.tr0) gVar.f452719d;
        if ((tr0Var != null ? java.lang.Long.valueOf(tr0Var.f386742z) : null) == null) {
            return false;
        }
        com.tencent.mm.protobuf.f fVar = gVar.f452719d;
        r45.tr0 tr0Var2 = (r45.tr0) fVar;
        if (tr0Var2 != null && tr0Var2.f386742z == 0) {
            return false;
        }
        r45.tr0 tr0Var3 = (r45.tr0) fVar;
        return tr0Var3 != null && tr0Var3.f386726g == 1;
    }

    @Override // fo2.e
    public void B() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_preview_mode", 1);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Kk(this.f273966d.getContext(), intent, this.f264900c);
    }

    @Override // fo2.e
    public void C() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxaliteb80deceef4f3f04a8643952c529d5471");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pages/detail/main?resourceId=");
        go2.g gVar = this.f273966d;
        r45.tr0 tr0Var = (r45.tr0) gVar.f452719d;
        sb6.append(pm0.v.u(tr0Var != null ? tr0Var.f386742z : 0L));
        sb6.append("&action=unsubscribe&scene=finder_member_topright");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, sb6.toString());
        bundle.putBoolean("isHalfScreen", false);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
        bundle.putDouble("heightPercent", 1.0d);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(gVar.getContext(), bundle, true, false, new go2.d());
    }

    @Override // fo2.e
    public boolean z() {
        r45.tr0 tr0Var = (r45.tr0) this.f273966d.f452719d;
        return tr0Var != null && tr0Var.f386726g == 2;
    }
}
