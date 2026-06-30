package xx1;

/* loaded from: classes7.dex */
public class b implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f457960a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f457961b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f457962c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f457963d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx1.c f457965f;

    public b(xx1.c cVar, java.lang.Object obj) {
        this.f457965f = cVar;
        this.f457960a = obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init start");
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.IInputConnectionWrapper");
            java.lang.reflect.Field c17 = xx1.c.c(cVar, cls, "mH");
            this.f457962c = c17;
            c17.setAccessible(true);
            java.lang.reflect.Field declaredField = android.os.Handler.class.getDeclaredField("mCallback");
            this.f457963d = declaredField;
            declaredField.setAccessible(true);
            java.lang.reflect.Field c18 = xx1.c.c(cVar, cls, "DO_GET_TEXT_BEFORE_CURSOR");
            c18.setAccessible(true);
            this.f457964e = ((java.lang.Integer) c18.get(null)).intValue();
            this.f457961b = java.lang.Class.forName("com.android.internal.view.IInputConnectionWrapper");
            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init succ");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init fail");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GetTextBeforeCursorFix", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Class<? super java.lang.Object> cls = this.f457961b;
        if (cls != null) {
            xx1.c cVar = this.f457965f;
            if (cVar.d() && method.getName().equals("startInputOrWindowGainedFocus")) {
                int i17 = 0;
                while (true) {
                    if (i17 >= objArr.length) {
                        break;
                    }
                    java.lang.Object obj2 = objArr[i17];
                    if (obj2 == null || obj2.getClass().getSuperclass() != cls) {
                        i17++;
                    } else {
                        android.os.Handler handler = (android.os.Handler) this.f457962c.get(objArr[i17]);
                        java.lang.reflect.Field field = this.f457963d;
                        if (field.get(handler) == null) {
                            field.set(handler, new xx1.a(cVar, handler, this.f457964e));
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "protect succ");
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetTextBeforeCursorFix", "add protected succ");
                    }
                }
            }
        }
        return method.invoke(this.f457960a, objArr);
    }
}
