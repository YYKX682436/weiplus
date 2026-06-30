package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class v4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117472d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f117473e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f117474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117472d = "Finder.FinderLiveKeyboardUIC";
        this.f117474f = new androidx.lifecycle.j0(new com.tencent.mm.plugin.finder.live.viewmodel.s4(false, 0));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f117472d, "[LiveLifecycler]onPause " + this);
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f117473e;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f117472d, "[LiveLifecycler]onResume " + this);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.live.viewmodel.u4(this));
    }
}
