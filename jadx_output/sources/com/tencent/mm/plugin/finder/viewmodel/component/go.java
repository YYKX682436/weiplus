package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class go extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f134541d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.fo f134542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(androidx.appcompat.app.AppCompatActivity act) {
        super(act);
        kotlin.jvm.internal.o.g(act, "act");
        this.f134541d = act;
        this.f134542e = new com.tencent.mm.plugin.finder.viewmodel.component.fo(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("FinderLiveNotificationUIC", "onCreate: ");
        com.tencent.mm.app.w.INSTANCE.a(this.f134542e);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("FinderLiveNotificationUIC", "onDestroy: ");
        com.tencent.mm.app.w.INSTANCE.p(this.f134542e);
    }
}
