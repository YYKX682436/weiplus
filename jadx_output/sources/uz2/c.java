package uz2;

/* loaded from: classes.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI f432157d;

    public c(com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI faceFlashPermissionUI) {
        this.f432157d = faceFlashPermissionUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click setting ", java.lang.Integer.valueOf(hashCode()));
        dialogInterface.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f432157d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
