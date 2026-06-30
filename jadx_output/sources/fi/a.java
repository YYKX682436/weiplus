package fi;

/* loaded from: classes11.dex */
public class a implements fi.b {
    @Override // fi.b
    public boolean a(java.lang.String str, java.lang.String str2) {
        if (str.endsWith(" (deleted)")) {
            str = str.substring(0, str.length() - 10);
        } else if (str.endsWith("]")) {
            str = str.substring(0, str.length() - 1);
        }
        return !str2.contains("w") && (str.endsWith(".so") || str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.DEX_SUFFIX) || str.endsWith(".apk") || str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.VDEX_SUFFIX) || str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.ODEX_SUFFIX) || str.endsWith(".oat") || str.endsWith(".art") || str.endsWith(".ttf") || str.endsWith(".otf") || str.endsWith(com.tencent.tinker.loader.shareutil.ShareConstants.JAR_SUFFIX));
    }
}
