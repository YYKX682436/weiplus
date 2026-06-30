package du2;

/* loaded from: classes2.dex */
public final class v extends com.tencent.mm.ui.component.UIComponent implements zy2.pb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onConfigurationChanged] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((eu2.b0) c18).f256776z = newConfig;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onActivityCreate] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((eu2.b0) c18).B.add(activity.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.ui.MMActivity mMActivity;
        android.content.Context context;
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onActivityDestroy] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        b0Var.B.remove(activity.toString());
        b0Var.f256771u = null;
        in5.s0 s0Var = b0Var.f256761h;
        if (s0Var != null && (context = s0Var.f293121e) != null) {
            while (context instanceof android.content.ContextWrapper) {
                if (context instanceof com.tencent.mm.ui.MMActivity) {
                    mMActivity = (com.tencent.mm.ui.MMActivity) context;
                    break;
                } else {
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                    kotlin.jvm.internal.o.f(context, "getBaseContext(...)");
                }
            }
        }
        mMActivity = null;
        if (kotlin.jvm.internal.o.b(mMActivity, activity)) {
            b0Var.f256761h = null;
        }
        java.lang.ref.WeakReference weakReference = b0Var.A;
        if (kotlin.jvm.internal.o.b(weakReference != null ? (androidx.appcompat.app.AppCompatActivity) weakReference.get() : null, activity)) {
            b0Var.A = null;
        }
        cw2.da daVar = b0Var.f256757d;
        if (daVar != null && activity.hashCode() != daVar.getI()) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityDestroy] hashCode is not equal to activity, playingView = " + daVar);
        } else {
            eu2.k kVar = b0Var.f256760g;
            if (kVar == eu2.k.f256795e) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityDestroy] currentScene = MINI_VIEW, return!");
            } else {
                b0Var.hj(kVar);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        super.onPause();
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onActivityPaused] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        if (!(activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) || (activity instanceof com.tencent.mm.plugin.finder.ui.MMLiveFinderUI)) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityPaused] activity = " + activity);
            return;
        }
        in5.s0 Ri = b0Var.Ri(activity);
        cw2.da videoView = (Ri == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) Ri.k(com.tencent.mm.R.id.e_k)) == null) ? null : finderVideoLayout.getVideoView();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        java.lang.Object renderView = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getRenderView() : null;
        android.view.TextureView textureView = renderView instanceof android.view.TextureView ? (android.view.TextureView) renderView : null;
        if (textureView == null) {
            return;
        }
        b0Var.f256771u = textureView.getBitmap();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        ls5.k eventDetectorAdapter;
        super.onStart();
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onActivityStart] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        if (b0Var.f256760g == eu2.k.f256794d) {
            b0Var.ij("unlock_screen_and_return_finder");
        }
        cw2.da daVar = b0Var.f256757d;
        java.lang.Long l17 = null;
        cw2.u9 u9Var = daVar instanceof cw2.u9 ? (cw2.u9) daVar : null;
        if (u9Var != null) {
            ls5.m mVar = u9Var instanceof ls5.m ? (ls5.m) u9Var : null;
            if (mVar != null && (eventDetectorAdapter = mVar.getEventDetectorAdapter()) != null) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[restoreOriginalDetectorLifeCycle] restoring original lifecycle: " + b0Var.f256773w);
                ((ls5.d) eventDetectorAdapter).f321128h = b0Var.f256773w;
                b0Var.f256773w = null;
            }
        }
        b0Var.wi();
        int hashCode = activity.hashCode();
        cw2.da daVar2 = b0Var.f256757d;
        if (!(daVar2 != null && hashCode == daVar2.getI())) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] the context of playingView is not equal to current activity, activity = " + activity + ", return!");
            return;
        }
        cw2.da daVar3 = b0Var.f256757d;
        if (daVar3 != null) {
            daVar3.w();
        }
        b0Var.nj();
        b0Var.Di();
        if (!b0Var.f256766p) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] have not click system player when key guard show, cancel notification, activity = " + activity);
            b0Var.hj(b0Var.f256760g);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] already do operation manually!");
        in5.s0 Ri = b0Var.Ri(activity);
        so2.j5 j5Var = Ri != null ? (so2.j5) Ri.f293125i : null;
        so2.u1 u1Var = j5Var instanceof so2.u1 ? (so2.u1) j5Var : null;
        java.lang.Long valueOf = u1Var != null ? java.lang.Long.valueOf(u1Var.getItemId()) : null;
        cw2.wa waVar = b0Var.f256758e;
        if (waVar != null && (feedData = waVar.f224099f) != null) {
            l17 = java.lang.Long.valueOf(feedData.getExpectId());
        }
        if (kotlin.jvm.internal.o.b(valueOf, l17)) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityStart] update current scene.");
            b0Var.f256760g = eu2.k.f256796f;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onActivityStopped] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        b0Var.A = new java.lang.ref.WeakReference(activity);
        if (b0Var.Zi()) {
            com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onActivityStopped] keyGuard is locked, return!");
        } else {
            if (b0Var.f256760g == eu2.k.f256795e || !b0Var.aj()) {
                return;
            }
            b0Var.Ni();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!du2.j.f243476d.c()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onWindowFocusChanged] not hit exp, return!");
            return;
        }
        i95.m c18 = i95.n0.c(eu2.b0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        eu2.b0 b0Var = (eu2.b0) c18;
        com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onWindowFocusChanged] hasFocus = " + z17 + ", livePausedByMediaSessionOrNotificationAction = " + b0Var.f256763m + ", currentFeedType = " + b0Var.f256762i);
        if (z17) {
            if (!b0Var.f256763m) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "skip, livePausedByMediaSessionOrNotificationAction = false");
                return;
            }
            if (b0Var.f256762i != eu2.e.f256783e) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "skip, currentFeedType = " + b0Var.f256762i + ", not LIVE");
                return;
            }
            if (b0Var.f256760g != eu2.k.f256796f) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "skip, currentScene = " + b0Var.f256760g + ", not FEED_STREAM");
                return;
            }
            in5.s0 Ri = b0Var.Ri(activity);
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = Ri != null ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) Ri.k(com.tencent.mm.R.id.e_k) : null;
            if (finderVideoLayout == null) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "skip, videoLayout is null");
                return;
            }
            if (finderVideoLayout.J()) {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "skip, live feed is already playing");
                b0Var.f256763m = false;
            } else {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "auto resume live feed playback");
                b0Var.f256763m = false;
                cw2.v9.n(finderVideoLayout, 0, null, null, 7, null);
            }
        }
    }
}
