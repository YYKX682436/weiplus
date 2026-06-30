package i05;

@j95.b
/* loaded from: classes9.dex */
public final class n extends i95.w implements p94.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f286594d;

    public n() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("send_big_emoji");
        hashSet.add("send_img");
        hashSet.add("verify_identity");
        hashSet.add("verify_identity_token");
        hashSet.add("check_identity_token");
        hashSet.add("verify_file");
        this.f286594d = hashSet;
    }

    public final java.lang.String Ai(boolean z17) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").getString("mmkv_key_verify_token_wx_id", "");
        java.lang.String str = string != null ? string : "";
        if (z17 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.t8.Y(16);
            com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putString("mmkv_key_verify_token_wx_id", str);
        }
        com.tencent.mars.xlog.Log.i("WxImeHelper", "getTempWxId result:" + str);
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
    
        if (r0 == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(android.view.View r18, p94.u0 r19, java.lang.String r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i05.n.Bi(android.view.View, p94.u0, java.lang.String, android.os.Bundle):boolean");
    }

    public final jz5.l Di(java.lang.String str) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").getString("mmkv_key_verify_token_success_str", "");
        com.tencent.mars.xlog.Log.i("WxImeHelper", "verifyIdentityTokenValid curToken:" + string + ", identityToken:" + str);
        if (!com.tencent.mm.sdk.platformtools.t8.D0(string, str)) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            return new jz5.l(bool, bool);
        }
        long j17 = com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").getLong("mmkv_key_verify_token_valid_time", 0L);
        long b17 = c01.id.b();
        com.tencent.mars.xlog.Log.i("WxImeHelper", "verifyIdentityTokenValid validTimestamp:" + j17 + ", current:" + b17);
        return new jz5.l(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(j17 > b17));
    }

    public final java.lang.String wi() {
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("default_input_method");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/plugin/wxime/WxImeHelper", "getCurIme", "()Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str == null) {
            return "";
        }
        com.tencent.mars.xlog.Log.i("WxImeHelper", "getCurIme: ".concat(str));
        return (java.lang.String) r26.n0.f0(str, new java.lang.String[]{"/"}, false, 0, 6, null).get(0);
    }
}
