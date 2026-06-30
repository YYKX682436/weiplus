package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static int f192467a;

    /* renamed from: b, reason: collision with root package name */
    public static long f192468b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.CharSequence f192469c;

    public static java.lang.CharSequence a() {
        return b(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public static java.lang.CharSequence b(android.content.Context context) {
        android.content.ClipData.Item itemAt;
        if (java.lang.System.currentTimeMillis() - f192468b < 1000 && !com.tencent.mm.sdk.platformtools.t8.J0(f192469c)) {
            return f192469c;
        }
        f192468b = java.lang.System.currentTimeMillis();
        android.content.ClipData primaryClip = ((android.content.ClipboardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard")).getPrimaryClip();
        java.lang.CharSequence text = (primaryClip == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.getText();
        f192469c = text;
        if (text != null) {
            return text;
        }
        com.tencent.mars.xlog.Log.i("ClipboardHelper", "getText null");
        return "";
    }

    public static boolean c(java.lang.CharSequence charSequence) {
        return (com.tencent.mm.sdk.platformtools.t8.J0(charSequence) || f192467a == 0 || charSequence.toString().hashCode() != f192467a) ? false : true;
    }

    public static void d(android.content.Context context, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str) {
        f192468b = 0L;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(charSequence, charSequence2));
        } else {
            clipboardManager.setPrimaryClip(android.content.ClipData.newHtmlText(charSequence, charSequence2, str));
        }
        if (charSequence2 != null) {
            f192467a = charSequence2.toString().hashCode();
        }
    }

    public static void e(java.lang.CharSequence charSequence) {
        d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, charSequence, null);
    }

    public static boolean f(java.lang.CharSequence charSequence) {
        try {
            d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, charSequence, null);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ClipboardHelper", th6, "", new java.lang.Object[0]);
            return false;
        }
    }
}
