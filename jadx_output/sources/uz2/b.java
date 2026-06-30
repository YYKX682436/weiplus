package uz2;

/* loaded from: classes.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI f432156d;

    public b(com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI faceFlashPermissionUI) {
        this.f432156d = faceFlashPermissionUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click cancel", java.lang.Integer.valueOf(hashCode()));
        int i18 = com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.f137243i;
        com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI faceFlashPermissionUI = this.f432156d;
        faceFlashPermissionUI.setResult(1, faceFlashPermissionUI.V6(4, 90008, "fail"));
        faceFlashPermissionUI.finish();
    }
}
