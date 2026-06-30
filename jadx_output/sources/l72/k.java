package l72;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316854d;

    public k(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        this.f316854d = faceActionUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316854d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) faceActionUI.f100184q.getLayoutParams();
        marginLayoutParams.topMargin = (int) (faceActionUI.f100179i.getHeight() * 0.4d);
        faceActionUI.f100184q.setLayoutParams(marginLayoutParams);
        faceActionUI.f100184q.setVisibility(0);
    }
}
