package xx1;

/* loaded from: classes7.dex */
public class c implements vx1.f {
    public static java.lang.reflect.Field c(xx1.c cVar, java.lang.Class cls, java.lang.String str) {
        cVar.getClass();
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Field) declaredMethod.invoke(cls, str);
    }

    @Override // vx1.f
    public boolean a(int i17) {
        return (i17 == 29 || i17 == 30) && d();
    }

    @Override // vx1.f
    public boolean b() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "hook start");
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager.class.getDeclaredMethod("getInputContext", new java.lang.Class[0]).setAccessible(true);
            java.lang.reflect.Field declaredField = android.view.inputmethod.InputMethodManager.class.getDeclaredField("mService");
            declaredField.setAccessible(true);
            try {
                java.lang.reflect.Field declaredField2 = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GetTextBeforeCursorFix", e17.getMessage());
            }
            java.lang.Object obj = declaredField.get(inputMethodManager);
            declaredField.set(inputMethodManager, java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new xx1.b(this, obj)));
            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "hook succ");
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetTextBeforeCursorFix", "hook fail");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetTextBeforeCursorFix", e18, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean d() {
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "get clicfg_inputconnection_protect error!");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetTextBeforeCursorFix", e17, "", new java.lang.Object[0]);
        }
        return com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_inputconnection_protect", "0", false, true), 0) > 0;
    }
}
