package df2;

/* loaded from: classes3.dex */
public final class te extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public boolean f231435m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6() {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        android.content.Context b76 = b7();
        java.lang.Integer valueOf = (b76 == null || (resources = b76.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        com.tencent.mars.xlog.Log.i("LiveChangeOrientationController", "try forceChangeScreenToLandscape");
        if (valueOf != null && valueOf.intValue() == 1) {
            android.content.Context b77 = b7();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = b77 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) b77 : null;
            if (mMFinderUI != null) {
                mMFinderUI.getContext().getResources().getConfiguration().orientation = 2;
                androidx.appcompat.app.AppCompatActivity context = mMFinderUI.getContext();
                if (!(context instanceof android.app.Activity)) {
                    context = null;
                }
                if (context != null && (intent2 = context.getIntent()) != null) {
                    intent2.putExtra("KEY_SUPPORT_RESET_FRAGMENT", true);
                }
                androidx.appcompat.app.AppCompatActivity context2 = mMFinderUI.getContext();
                androidx.appcompat.app.AppCompatActivity appCompatActivity = context2 instanceof android.app.Activity ? context2 : null;
                if (appCompatActivity != null && (intent = appCompatActivity.getIntent()) != null) {
                    intent.putExtra("KEY_PARAMS_RESET_LIVE", true);
                }
                mMFinderUI.b7(true);
                boolean z17 = false;
                mMFinderUI.setRequestedOrientation(0);
                dk2.ef efVar = dk2.ef.f233372a;
                gk2.e eVar = dk2.ef.I;
                if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
                    z17 = true;
                }
                if (!z17) {
                    ((mm2.c1) business(mm2.c1.class)).f328925z2 = 1;
                }
                com.tencent.mars.xlog.Log.i("LiveChangeOrientationController", "changeScreenToLandscape curOrientation:" + valueOf + ",requestOrientation:" + mMFinderUI.getContext().getRequestedOrientation());
            }
        }
    }

    public final void a7() {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        com.tencent.mars.xlog.Log.i("LiveChangeOrientationController", "try forceChangeScreenToPortrait");
        android.content.Context b76 = b7();
        java.lang.Integer valueOf = (b76 == null || (resources = b76.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        if (valueOf != null && valueOf.intValue() == 2) {
            android.content.Context b77 = b7();
            com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = b77 instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) b77 : null;
            if (mMFinderUI != null) {
                mMFinderUI.getContext().getResources().getConfiguration().orientation = 1;
                androidx.appcompat.app.AppCompatActivity context = mMFinderUI.getContext();
                if (!(context instanceof android.app.Activity)) {
                    context = null;
                }
                if (context != null && (intent2 = context.getIntent()) != null) {
                    intent2.putExtra("KEY_PARAMS_RESET_LIVE", true);
                }
                androidx.appcompat.app.AppCompatActivity context2 = mMFinderUI.getContext();
                androidx.appcompat.app.AppCompatActivity appCompatActivity = context2 instanceof android.app.Activity ? context2 : null;
                if (appCompatActivity != null && (intent = appCompatActivity.getIntent()) != null) {
                    intent.putExtra("KEY_SUPPORT_RESET_FRAGMENT", true);
                }
                mMFinderUI.b7(true);
                mMFinderUI.setRequestedOrientation(1);
                dk2.ef efVar = dk2.ef.f233372a;
                gk2.e eVar = dk2.ef.I;
                if (!(eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).a8())) {
                    ((mm2.c1) business(mm2.c1.class)).f328925z2 = 0;
                }
                com.tencent.mars.xlog.Log.i("LiveChangeOrientationController", "changeScreenToPortrait curOrientation:" + valueOf + ",requestOrientation:" + mMFinderUI.getContext().getRequestedOrientation());
            }
        }
    }

    public final android.content.Context b7() {
        java.lang.Object obj = this.f291099e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }
}
