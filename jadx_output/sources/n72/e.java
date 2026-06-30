package n72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.f f335255d;

    public e(n72.f fVar) {
        this.f335255d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wo.d1 d1Var = this.f335255d.f335256d.f335275g;
        if (d1Var == null || d1Var.f447654c || !this.f335255d.f335256d.f335281p) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceReflectCam", "camera is null or has released!");
            return;
        }
        n72.q qVar = this.f335255d.f335256d;
        if (qVar.G == 1) {
            return;
        }
        k72.k kVar = k72.j.f304725a;
        android.content.Context applicationContext = qVar.f335289x.getApplicationContext();
        n72.q qVar2 = this.f335255d.f335256d;
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = qVar2.f335289x;
        android.hardware.Camera camera = qVar2.f335275g.f447652a;
        int i17 = qVar2.B;
        android.widget.TextView textView = qVar2.f335290y;
        k72.i iVar = qVar2.H;
        int i18 = qVar2.f335278m;
        n72.q qVar3 = this.f335255d.f335256d;
        android.graphics.Point point = new android.graphics.Point(qVar3.f335276h, qVar3.f335277i);
        n72.q qVar4 = this.f335255d.f335256d;
        int i19 = qVar4.f335284s;
        java.lang.String str = qVar4.f335285t;
        int i27 = qVar4.f335276h;
        int i28 = qVar4.f335277i;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "initFaceDetect（）");
        kVar.f304726a = applicationContext;
        kVar.f304727b = i17;
        kVar.f304730e = textView;
        kVar.f304731f = faceActionUI.getResources().getDisplayMetrics().widthPixels;
        kVar.f304732g = faceActionUI.getResources().getDisplayMetrics().heightPixels;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "mUiWidth:%s  mUiHeight：%s", java.lang.Integer.valueOf(kVar.f304731f), java.lang.Integer.valueOf(kVar.f304732g));
        kVar.f304728c = i19;
        kVar.f304729d = str;
        kVar.f304733h = i27;
        kVar.f304734i = i28;
        new android.graphics.Rect(0, 0, 0, 0);
        new android.graphics.Rect(0, 0, 0, 0);
        kVar.f304736k = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "action：%s,mActionHint:%s", java.lang.Integer.valueOf(kVar.f304728c), kVar.f304729d);
        java.lang.String str2 = kVar.f304729d;
        if (str2 != null) {
            kVar.f304730e.setText(str2);
        } else {
            int i29 = kVar.f304728c;
            if (i29 == 1) {
                kVar.f304730e.setText(com.tencent.mm.R.string.c67);
            } else if (i29 == 2) {
                kVar.f304730e.setText(com.tencent.mm.R.string.c68);
            }
        }
        com.tencent.youtu.ytposedetect.YTPoseDetectInterface.start(applicationContext.getApplicationContext(), camera, i17, new k72.h(kVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionLogic", "init face detect, camera, rotate: %s", java.lang.Integer.valueOf(i18));
        k72.u uVar = k72.u.B;
        uVar.f304763u = i18;
        int i37 = point.x;
        int i38 = point.y;
        uVar.f304764v = i37;
        uVar.f304765w = i38;
    }
}
