package p32;

/* loaded from: classes12.dex */
public abstract class g {
    public static boolean a(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18, android.content.Intent intent, java.lang.String str) {
        java.lang.String o17;
        if (i17 == 1001 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (stringArrayListExtra != null && stringArrayListExtra.size() >= 1) {
                java.lang.String str2 = stringArrayListExtra.get(0);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(mMActivity, "com.tencent.mm.plugin.gallery.picker.view.ImageCropUI");
                intent2.putExtra("CropImageMode", 1);
                intent2.putExtra("CropImage_OutputPath", lp0.b.v() + "temp.cover");
                intent2.putExtra("CropImage_ImgPath", str2);
                mMActivity.startActivityForResult(intent2, 1002);
                return true;
            }
        } else if (i17 == 1002 && i18 == -1) {
            java.lang.String str3 = lp0.b.v() + "temp.cover";
            java.lang.String str4 = p32.c.f351459a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                o17 = "";
            } else {
                char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.w2.b(str3.getBytes()) + "_t";
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(p32.c.f351459a);
                if (!r6Var.m() || !r6Var.y()) {
                    r6Var.J();
                }
                o17 = new com.tencent.mm.vfs.r6(r6Var, str5).o();
            }
            com.tencent.mm.sdk.platformtools.x.x(str3, 640, 640, android.graphics.Bitmap.CompressFormat.JPEG, 100, o17, true);
            java.lang.System.currentTimeMillis();
            if (com.tencent.mm.plugin.exdevice.model.l3.Ai().f98985s == null) {
                com.tencent.mm.plugin.exdevice.model.l3.Ai().f98985s = new p32.b();
            }
            p32.b bVar = com.tencent.mm.plugin.exdevice.model.l3.Ai().f98985s;
            bVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("uploadexdeivce", currentTimeMillis, c01.z1.g().d1(), "" + currentTimeMillis);
            bVar.f351458d = b17;
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_ExdevicePictureUploader";
            mVar.f241787f = bVar;
            mVar.field_mediaId = b17;
            mVar.field_fullpath = o17;
            mVar.field_thumbpath = "";
            mVar.field_fileType = 20321;
            mVar.field_talker = "";
            mVar.field_priority = 1;
            mVar.field_needStorage = true;
            mVar.field_isStreamMedia = false;
            mVar.field_appType = 200;
            mVar.field_bzScene = 2;
            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdevicePictureUploader", "hy: cdntra addSendTask failed. clientid:%s", b17);
            }
            return true;
        }
        return false;
    }

    public static void b(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i17) {
        o11.g a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || "#".equals(str)) {
            imageView.setImageResource(i17);
            return;
        }
        if (com.tencent.mm.plugin.exdevice.model.l3.Ai().f98986t == null) {
            com.tencent.mm.plugin.exdevice.model.l3.Ai().f98986t = n11.a.b();
        }
        n11.a aVar = com.tencent.mm.plugin.exdevice.model.l3.Ai().f98986t;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.SubCoreExDevice", "newImageOptions failed, url is null or nil, return default.");
            com.tencent.mm.plugin.exdevice.model.l3 Ai = com.tencent.mm.plugin.exdevice.model.l3.Ai();
            if (Ai.f98987u == null) {
                o11.f fVar = new o11.f();
                fVar.f342087k = 640;
                fVar.f342086j = 640;
                fVar.f342077a = false;
                fVar.f342078b = true;
                Ai.f98987u = fVar.a();
            }
            a17 = com.tencent.mm.plugin.exdevice.model.l3.Ai().f98987u;
        } else {
            o11.f fVar2 = new o11.f();
            fVar2.f342087k = 640;
            fVar2.f342086j = 640;
            fVar2.f342077a = false;
            fVar2.f342079c = true;
            fVar2.f342083g = g83.a.a();
            a17 = fVar2.a();
        }
        aVar.h(str, imageView, a17);
    }

    public static void c(com.tencent.mm.ui.MMActivity mMActivity) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity.getContext(), 1, false);
        k0Var.f211872n = new p32.e(mMActivity);
        k0Var.f211881s = new p32.f(mMActivity);
        k0Var.v();
    }
}
