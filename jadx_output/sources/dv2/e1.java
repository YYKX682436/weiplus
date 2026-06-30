package dv2;

/* loaded from: classes10.dex */
public final class e1 extends dv2.o1 {

    /* renamed from: p, reason: collision with root package name */
    public int f243839p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f243840q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f243841r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243841r = jz5.h.b(dv2.d1.f243831d);
    }

    @Override // dv2.o1
    public boolean Q6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128051z3).getValue()).r()).intValue() == 1;
    }

    @Override // dv2.o1
    public int R6() {
        return 1;
    }

    @Override // dv2.o1
    public int S6() {
        return 20007;
    }

    @Override // dv2.o1
    public void T6(com.tencent.mm.plugin.finder.assist.g9 preCheckInfo, com.tencent.mm.plugin.finder.assist.m8 preCheckCallback) {
        kotlin.jvm.internal.o.g(preCheckInfo, "preCheckInfo");
        kotlin.jvm.internal.o.g(preCheckCallback, "preCheckCallback");
        com.tencent.mars.xlog.Log.i("Finder.PostSafePreCheckUIC", "[preCheckInner] needWatermarkDet:" + this.f243840q + ", watermarkFlag:" + this.f243839p);
        if (!(!this.f243840q || this.f243839p > 0)) {
            pf5.e.launch$default(this, null, null, new dv2.c1(this, preCheckInfo, preCheckCallback, null), 3, null);
            return;
        }
        int i17 = this.f243839p;
        r45.yx5 yx5Var = new r45.yx5();
        r45.dy5 dy5Var = new r45.dy5();
        dy5Var.f372859h = i17;
        yx5Var.f391480h = dy5Var;
        byte[] byteArray = yx5Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        preCheckInfo.f102206b = byteArray;
        super.T6(preCheckInfo, preCheckCallback);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("key_post_has_show_safe_dialog", false);
        com.tencent.mars.xlog.Log.i("Finder.PostSafePreCheckUIC", "[onCreate] hasShowSafeDialog:" + booleanExtra);
        if (booleanExtra) {
            this.f243917d++;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (getActivity().isFinishing() && Q6()) {
            if ((!this.f243840q || this.f243839p > 0) || !ub2.n.f426084a.a()) {
                return;
            }
            ub2.k kVar = (ub2.k) ((jz5.n) this.f243841r).getValue();
            kVar.getClass();
            kVar.b(new ub2.f(kVar, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f243841r = jz5.h.b(dv2.d1.f243831d);
    }
}
