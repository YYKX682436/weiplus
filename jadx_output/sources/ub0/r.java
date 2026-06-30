package ub0;

@j95.b
/* loaded from: classes.dex */
public class r extends i95.w implements vb0.o {
    public boolean Ai(com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = false;
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys fragment is null!");
        } else if (!iq.b.g(mMFragment.getContext()) && !iq.b.v(mMFragment.getContext()) && !iq.b.e(mMFragment.getContext())) {
            com.tencent.mm.pluginsdk.ui.tools.l7.f191766a = com.tencent.mm.vfs.w6.i(str + str2, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("takePhotoFromSys(), filePath = ");
            sb6.append(com.tencent.mm.pluginsdk.ui.tools.l7.f191766a);
            com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", sb6.toString());
            android.app.Activity context = mMFragment.getContext();
            java.lang.String str3 = com.tencent.mm.pluginsdk.ui.tools.l7.f191766a;
            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("system_config_prefs", 0).edit();
            edit.putString("camera_file_path", str3);
            edit.commit();
            android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                try {
                    r6Var.J();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TakePhotoUtil", e17, "", new java.lang.Object[0]);
                }
            }
            if (r6Var.m()) {
                android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(mMFragment.getContext(), new com.tencent.mm.vfs.r6(com.tencent.mm.pluginsdk.ui.tools.l7.f191766a));
                intent.addFlags(2);
                intent.putExtra("output", b17);
                try {
                    mMFragment.startActivityForResult(intent, i17);
                    z17 = true;
                } catch (android.content.ActivityNotFoundException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), " + e18.getMessage());
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TakePhotoUtil", "takePhotoFromSys(), dir not exist. ".concat(str));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TakePhotoUtil", "takePhoto(), dir = [%s], filename = [%s], cmd = [%s], result = [%s]", str, str2, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void wi(android.app.Activity activity, int i17, int i18, int i19, android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("max_select_count", i18);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("query_source_type", i19);
        intent.addFlags(67108864);
        j45.l.n(activity, "gallery", ".ui.GalleryEntryUI", intent, i17);
    }
}
