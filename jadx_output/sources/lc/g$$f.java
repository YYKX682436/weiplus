package lc;

/* loaded from: classes14.dex */
public final /* synthetic */ class g$$f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.g f317835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f317836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317837f;

    public /* synthetic */ g$$f(lc.g gVar, int i17, java.lang.String str) {
        this.f317835d = gVar;
        this.f317836e = i17;
        this.f317837f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lc.g gVar = this.f317835d;
        if (gVar.f317823x) {
            mc.p.f325531a.e("AuthingFragment", "error dialog had showing!");
            return;
        }
        android.app.Activity activity = gVar.getActivity();
        int i17 = this.f317836e;
        java.lang.String str = this.f317837f;
        if (activity == null || activity.isFinishing()) {
            mc.p.f325531a.e("AuthingFragment", "activity is null or is finishing by create ErrorInfoDialog");
            pc.f.c(i17, str);
            return;
        }
        if (gVar.f317822w == null) {
            gVar.f317822w = new qc.b(activity);
        }
        gVar.f317823x = true;
        int i18 = ic.d.f290281k;
        ic.d dVar = ic.c.f290280a;
        dVar.f290285d = true;
        android.view.WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null) {
            pc.f.c(i17, str);
            return;
        }
        qc.b bVar = gVar.f317822w;
        bVar.getClass();
        windowManager.getDefaultDisplay().getSize(new android.graphics.Point());
        android.view.Window window = bVar.getWindow();
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = dVar.f290290i;
        if (huiYanSdkConfig == null || !huiYanSdkConfig.isLandMode()) {
            attributes.width = (int) (r8.x * 0.8f);
            attributes.height = (int) (r8.y * 0.4f);
        } else {
            attributes.height = (int) (r8.x * 0.32f);
            attributes.width = (int) (r8.y * 0.7f);
        }
        window.setAttributes(attributes);
        qc.b bVar2 = gVar.f317822w;
        bVar2.f361343e = i17;
        bVar2.f361344f = str;
        android.widget.TextView textView = bVar2.f361342d;
        if (textView != null) {
            textView.setText(str);
        }
        if (dVar.f290284c) {
            mc.p.f325531a.e("ErrorInfoDialog", "activity has exit, do not need show!");
        } else {
            bVar2.show();
        }
        com.tencent.cloud.huiyan.view.LoadingFrontAnimatorView loadingFrontAnimatorView = gVar.f317814o;
        if (loadingFrontAnimatorView != null) {
            loadingFrontAnimatorView.c(true);
        }
        mc.p.f325531a.e("AuthingFragment", "showErrorDialog error code:" + str + " msg: " + str);
    }
}
