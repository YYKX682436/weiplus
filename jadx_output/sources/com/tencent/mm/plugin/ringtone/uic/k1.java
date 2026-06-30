package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class k1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f158440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158440d = new androidx.lifecycle.j0(mx3.i0.f());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.f1(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f158440d.setValue(mx3.i0.f());
    }
}
