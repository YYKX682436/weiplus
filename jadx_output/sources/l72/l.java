package l72;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316855d;

    public l(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        this.f316855d = faceActionUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316855d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) faceActionUI.f100182o.getLayoutParams();
        int height = ((int) (faceActionUI.f100179i.getHeight() * 0.4d)) + ((int) (faceActionUI.f100179i.getWidth() * 0.35d)) + com.tencent.mm.ui.zk.a(faceActionUI, 30);
        marginLayoutParams.topMargin = height;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "topMargin：%d", java.lang.Integer.valueOf(height));
        faceActionUI.f100182o.setLayoutParams(marginLayoutParams);
        faceActionUI.f100182o.setVisibility(0);
    }
}
