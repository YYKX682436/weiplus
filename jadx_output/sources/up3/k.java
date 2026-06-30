package up3;

/* loaded from: classes12.dex */
public class k implements up3.p {
    @Override // up3.a
    public java.lang.Object a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) ((java.util.Map) obj).get(up3.o.f429843i);
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String e17 = up3.o.e(str2, ':', true);
        try {
            if (android.text.TextUtils.isEmpty(e17)) {
                str = up3.o.f429850s;
            } else {
                str = up3.o.f429850s + ":" + e17;
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str3 = up3.n.f429833a;
            android.content.Intent intent = new android.content.Intent(up3.n.f429834b);
            intent.putExtra("op", 1);
            intent.putExtra(up3.n.f429835c, str);
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            context.sendBroadcast(intent, up3.n.f429833a);
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(up3.o.f429838d, th6, "[-] Explained by src 7: %s", e17);
            return null;
        }
    }
}
