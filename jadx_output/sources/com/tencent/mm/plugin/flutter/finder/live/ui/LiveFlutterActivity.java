package com.tencent.mm.plugin.flutter.finder.live.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/flutter/finder/live/ui/LiveFlutterActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-flutter-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class LiveFlutterActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f137294u = jz5.h.b(new e03.a(this));

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, pi0.o0
    public android.view.ViewGroup S2() {
        return U6();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity
    public android.widget.FrameLayout U6() {
        return (android.widget.FrameLayout) ((jz5.n) this.f137294u).getValue();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        return U6();
    }
}
