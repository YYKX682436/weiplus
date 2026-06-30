package l72;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mf3 f316844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l72.j f316845e;

    public f(l72.j jVar, r45.mf3 mf3Var) {
        this.f316845e = jVar;
        this.f316844d = mf3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        l72.j jVar = this.f316845e;
        jVar.f316853a.f100185r.clearAnimation();
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = jVar.f316853a;
        faceActionUI.f100174d.setVisibility(8);
        faceActionUI.f100185r.clearAnimation();
        faceActionUI.f100175e.setVisibility(8);
        faceActionUI.f100181n.setVisibility(0);
        faceActionUI.f100176f.setVisibility(0);
        faceActionUI.f100186s.setScaleX(0.0f);
        faceActionUI.f100186s.setScaleY(0.0f);
        faceActionUI.f100186s.animate().scaleX(1.0f).scaleY(1.0f).setDuration(800L);
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI2 = jVar.f316853a;
        r45.mf3 mf3Var = this.f316844d;
        java.lang.String str = mf3Var.f380445h;
        faceActionUI2.H = str;
        java.lang.String str2 = mf3Var.f380443f;
        faceActionUI2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "callbackDetectSuccess（）");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("token", str2);
        bundle.putString("serial_id", str);
        faceActionUI2.G = 0;
        faceActionUI2.U6("ok", 0, bundle, java.lang.Boolean.valueOf(faceActionUI2.f100190w));
    }
}
