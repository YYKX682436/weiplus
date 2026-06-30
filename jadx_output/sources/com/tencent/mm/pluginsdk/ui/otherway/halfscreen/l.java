package com.tencent.mm.pluginsdk.ui.otherway.halfscreen;

/* loaded from: classes8.dex */
public final class l extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        return new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.k();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        j75.f Q6 = Q6();
        if (Q6 == null || ((com.tencent.mm.pluginsdk.ui.otherway.halfscreen.k) Q6.getState()) == null) {
            return;
        }
        java.lang.Object a17 = ok5.d.a(getIntent(), "KEY_ENHANCER");
        com.tencent.mm.pluginsdk.ui.otherway.v vVar = a17 instanceof com.tencent.mm.pluginsdk.ui.otherway.v ? (com.tencent.mm.pluginsdk.ui.otherway.v) a17 : null;
        if (vVar != null) {
            Q6.B3(new com.tencent.mm.pluginsdk.ui.otherway.halfscreen.j(vVar));
        }
    }
}
