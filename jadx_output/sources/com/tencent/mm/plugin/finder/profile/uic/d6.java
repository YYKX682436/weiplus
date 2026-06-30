package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d6 extends com.tencent.mm.plugin.finder.profile.uic.f6 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f123612e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f123612e = getIntent().getIntExtra("report_scene", -1) == 19;
        this.f123613f = getIntent().getBooleanExtra("key_hide_float_ball", false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (this.f123612e && getIntent().getBooleanExtra("key_hide_float_ball", false)) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f123613f) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
            qp1.h0.a(true, false, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
