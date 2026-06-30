package hn1;

/* loaded from: classes.dex */
public class c implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (strArr.length <= 1) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCommand", "processCommand: %s", android.text.TextUtils.join(" ", strArr));
        if (strArr[1].equals("pull")) {
            if (strArr.length <= 2) {
                return false;
            }
            java.lang.String str2 = strArr[2];
            java.lang.String d17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str2).d1();
            java.lang.String str3 = lp0.b.D() + "/tencent/MicroMsg/avatar/";
            com.tencent.mm.vfs.w6.u(str3);
            java.lang.String i17 = com.tencent.mm.modelavatar.d1.Ai().i(d17, false, false);
            com.tencent.mm.vfs.w6.c(i17, str3 + str2 + "-s." + com.tencent.mm.vfs.w6.n(i17));
            java.lang.String i18 = com.tencent.mm.modelavatar.d1.Ai().i(d17, true, false);
            com.tencent.mm.vfs.w6.c(i18, str3 + str2 + "-b." + com.tencent.mm.vfs.w6.n(i18));
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pull to ");
            sb6.append(str3);
            dp.a.makeText(context2, sb6.toString(), 0).show();
            return true;
        }
        if (strArr[1].equals("dump")) {
            if (strArr.length <= 2) {
                return false;
            }
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(strArr[2]).d1());
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarCommand", "dump: %s, %s, %s, %s", n07.c(), n07.d(), java.lang.Integer.valueOf(n07.f70531c), java.lang.Integer.valueOf(n07.f70530b));
            return true;
        }
        if (strArr[1].equals("clean")) {
            if (strArr.length <= 2) {
                return false;
            }
            java.lang.String d18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(strArr[2]).d1();
            com.tencent.mm.modelavatar.d1.Ai().p(d18, false);
            com.tencent.mm.modelavatar.d1.Ai().p(d18, true);
            return true;
        }
        if (strArr[1].equals("cleanAll")) {
            com.tencent.mm.vfs.w6.f("wcf://avatar/");
            return true;
        }
        if (!strArr[1].equals("decrypt") || strArr.length <= 2) {
            return false;
        }
        java.lang.String str4 = strArr[2];
        byte[] DecryptAvatar = com.tencent.mm.jni.utils.UtilsJni.DecryptAvatar(com.tencent.mm.vfs.w6.N(str4, 0, -1));
        if (DecryptAvatar == null) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "error", 0).show();
        } else {
            com.tencent.mm.vfs.w6.S(str4 + ".d", DecryptAvatar, 0, DecryptAvatar.length);
        }
        return true;
    }
}
