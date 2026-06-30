package e73;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (!r26.i0.y(str, ".", false)) {
            str = ".".concat(str);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).toLowerCase().endsWith(".pdf")) {
            return true;
        }
        java.lang.String lowerCase = (str == null ? "" : str).toLowerCase();
        if (lowerCase.endsWith(".doc") || lowerCase.endsWith(".docx") || lowerCase.endsWith("wps")) {
            return true;
        }
        java.lang.String lowerCase2 = (str == null ? "" : str).toLowerCase();
        if (lowerCase2.endsWith(".ppt") || lowerCase2.endsWith(".pptx")) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase3 = str.toLowerCase();
        return lowerCase3.endsWith(".xls") || lowerCase3.endsWith(".xlsx");
    }
}
