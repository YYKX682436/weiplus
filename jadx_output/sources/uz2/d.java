package uz2;

/* loaded from: classes.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI f432158d;

    public d(com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI faceFlashPermissionUI) {
        this.f432158d = faceFlashPermissionUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%s]Dialog audio click cancel", java.lang.Integer.valueOf(hashCode()));
        int i18 = com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.f137243i;
        com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI faceFlashPermissionUI = this.f432158d;
        faceFlashPermissionUI.setResult(1, faceFlashPermissionUI.V6(4, 90009, "fail"));
        faceFlashPermissionUI.finish();
    }
}
