package ra3;

/* loaded from: classes.dex */
public class d implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        java.lang.String i17 = com.tencent.mm.modelavatar.d1.Ai().i(iPCString.f68406d, true, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17) || !com.tencent.mm.vfs.w6.j(i17)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            i17 = com.tencent.mm.modelavatar.d1.Ai().i(iPCString.f68406d, false, false);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17) || !com.tencent.mm.vfs.w6.j(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "getAvatarFullPath file not exist", i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
                sb6.append(gm0.j1.u().h());
                sb6.append("avatar/");
                java.lang.String g17 = kk.k.g(iPCString.f68406d.getBytes());
                sb6.append(g17.substring(0, 2));
                sb6.append('/');
                sb6.append(g17.substring(2, 4));
                sb6.append("/user_");
                sb6.append(g17);
                sb6.append(".png");
                i17 = sb6.toString();
                com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(i17));
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str = iPCString.f68406d;
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            android.graphics.Bitmap b17 = com.tencent.mm.modelavatar.g.b(str, true, -1, null);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "getHeadImage null", iPCString.f68406d);
            } else {
                try {
                    if (!com.tencent.mm.sdk.platformtools.x.D0(b17, 100, android.graphics.Bitmap.CompressFormat.JPEG, i17, true)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "save headImage failed");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "save headImage failed", e17);
                }
            }
        }
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(i17, false);
        new android.os.Bundle().putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, i18);
        return new com.tencent.mm.ipcinvoker.type.IPCString(i18);
    }
}
