package xw4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f457736a = {"cache", "publicCache"};

    public static boolean a(nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        if (c1Var != null && y2Var != null && !android.text.TextUtils.isEmpty(y2Var.f341019i)) {
            java.lang.String[] strArr = f457736a;
            for (int i17 = 0; i17 < 2; i17++) {
                java.lang.String str = strArr[i17];
                if (str.equalsIgnoreCase(y2Var.f341019i)) {
                    c1Var.i5(y2Var, str.concat(":not in white list"), null);
                    return true;
                }
            }
        }
        return false;
    }
}
