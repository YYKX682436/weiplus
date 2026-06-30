package l72;

/* loaded from: classes14.dex */
public class j implements k72.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316853a;

    public j(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        this.f316853a = faceActionUI;
    }

    public void a(int i17, int i18, java.lang.String str, java.lang.String str2, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "onError, err: %s, cgiErrCode: %s, cgiErrMsg: %s,retry: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19));
        int i27 = com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.f100173J;
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316853a;
        faceActionUI.getClass();
        faceActionUI.B = i18;
        faceActionUI.getClass();
        faceActionUI.H = str2;
        com.tencent.mm.sdk.platformtools.u3.h(new l72.i(this, str, i19, i18, str2));
    }
}
