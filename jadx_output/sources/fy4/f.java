package fy4;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final fy4.f f267261a = new fy4.f();

    public final java.lang.String a(java.lang.String imgPath, int i17) {
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(imgPath, null);
        if (J2 == null || J2.isRecycled()) {
            return "";
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                J2.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                java.lang.String encodeToString = android.util.Base64.encodeToString(byteArray, i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewInputConnectionUtil", "rawData length = %d, base64 length = %d", java.lang.Integer.valueOf(byteArray.length), java.lang.Integer.valueOf(encodeToString.length()));
                vz5.b.a(byteArrayOutputStream, null);
                return encodeToString;
            } finally {
            }
        } finally {
            J2.recycle();
        }
    }

    public final java.lang.String b(com.tencent.mm.api.IEmojiInfo oInfo) {
        kotlin.jvm.internal.o.g(oInfo, "oInfo");
        r45.ri0 ri0Var = new r45.ri0();
        ri0Var.f384886d = oInfo.getMd5();
        ri0Var.f384887e = oInfo.l0();
        ri0Var.f384888f = oInfo.l();
        ri0Var.f384889g = oInfo.X0();
        ri0Var.f384890h = oInfo.J1();
        ri0Var.f384891i = oInfo.getAesKey();
        ri0Var.f384892m = oInfo.getGroupId();
        ri0Var.f384893n = oInfo.Z();
        ri0Var.f384894o = oInfo.g1();
        ri0Var.f384895p = oInfo.S0();
        ri0Var.f384896q = oInfo.q0();
        ri0Var.f384897r = oInfo.k0();
        ri0Var.f384898s = oInfo.H1();
        try {
            java.lang.String encodeToString = android.util.Base64.encodeToString(ri0Var.toByteArray(), 2);
            kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewInputConnectionUtil", e17, "failed to encode emojiInfo.", new java.lang.Object[0]);
            return "";
        }
    }
}
