package mx0;

/* loaded from: classes5.dex */
public final class e3 implements mx0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mx0.g3 f331943a;

    public e3(mx0.g3 g3Var) {
        this.f331943a = g3Var;
    }

    public void a() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        androidx.fragment.app.Fragment findFragmentByTag;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onLongPressFinish");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        mx0.g3 g3Var = this.f331943a;
        g3Var.f331999p = elapsedRealtime;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) g3Var.f331991e;
        if (shootComposingPluginLayout.m0()) {
            return;
        }
        android.content.Context context = shootComposingPluginLayout.getContext();
        androidx.fragment.app.FragmentActivity fragmentActivity = context instanceof androidx.fragment.app.FragmentActivity ? (androidx.fragment.app.FragmentActivity) context : null;
        if ((fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (findFragmentByTag = supportFragmentManager.findFragmentByTag("MaterialImportPreviewFragment")) == null || !findFragmentByTag.isAdded() || findFragmentByTag.isRemoving()) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "recordFinish skipped, aigc import preview shown");
            return;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = g3Var.f331993g;
        recordButton.setTouchEnable(false);
        shootComposingPluginLayout.M0(false);
        recordButton.announceForAccessibility(i65.a.r(recordButton.getContext(), com.tencent.mm.R.string.f489973h2));
    }
}
