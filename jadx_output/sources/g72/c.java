package g72;

/* loaded from: classes.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI f269228d;

    public c(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f269228d = faceDetectConfirmUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f269228d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
