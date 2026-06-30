package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public cw2.f8 f133833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f133834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("FinderAudioPlayStateMgrUIC", "[FinderAudioPlayStateMgrUIC] onCreate " + hashCode());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        com.tencent.mars.xlog.Log.i("FinderAudioPlayStateMgrUIC", "[FinderAudioPlayStateMgrUIC] onStart " + hashCode());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i("FinderAudioPlayStateMgrUIC", "[FinderAudioPlayStateMgrUIC] onStop " + hashCode());
    }
}
