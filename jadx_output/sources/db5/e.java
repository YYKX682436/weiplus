package db5;

/* loaded from: classes14.dex */
public class e implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f228322a;

    public e(db5.b bVar) {
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.ref.WeakReference weakReference = this.f228322a;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityUtil", "swipe invoke fail, callbackRef NULL!");
            return null;
        }
        db5.d dVar = (db5.d) weakReference.get();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityUtil", "swipe invoke fail, callback NULL!");
            return null;
        }
        boolean z17 = false;
        if (objArr != null && objArr.length > 0) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof java.lang.Boolean) {
                z17 = ((java.lang.Boolean) obj2).booleanValue();
            }
        }
        dVar.onComplete(z17);
        return null;
    }
}
