package l72;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316835d;

    public b(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        this.f316835d = faceActionUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "openCameraPreviewFailedAnimation");
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316835d;
        faceActionUI.f100189v.setText(com.tencent.mm.R.string.c7i);
        faceActionUI.f100187t.setText(com.tencent.mm.R.string.c7t);
        faceActionUI.f100187t.setOnClickListener(new l72.a(this));
        faceActionUI.f100174d.setVisibility(8);
        faceActionUI.f100177g.setVisibility(0);
        faceActionUI.f100185r.clearAnimation();
        faceActionUI.f100181n.setVisibility(0);
        faceActionUI.f100175e.setVisibility(8);
    }
}
