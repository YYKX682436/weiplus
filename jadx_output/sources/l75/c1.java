package l75;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll75/c1;", "Ll75/f0;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/c1;", "", "Lo75/a;", "Lo75/c;", "<init>", "()V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class c1<T extends l75.f0> extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f316941d = jz5.h.b(new l75.b1(this));

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Class f316942e;

    /* renamed from: f, reason: collision with root package name */
    public l75.f0 f316943f;

    public o75.e N6() {
        java.lang.reflect.Constructor declaredConstructor;
        if (this.f316943f == null) {
            if (this.f316942e == null) {
                com.tencent.mars.xlog.Log.i(getF368356h(), "getAttachClazz start: java");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                f06.d clazz = kotlin.jvm.internal.i0.a(getClass());
                kotlin.jvm.internal.o.g(clazz, "clazz");
                java.lang.Class b17 = d75.b.b(xz5.a.b(clazz), 0);
                if (!(b17 instanceof java.lang.Class)) {
                    b17 = null;
                }
                this.f316942e = b17;
                com.tencent.mars.xlog.Log.i(getF368356h(), "getAttachClazz cost: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            java.lang.Class cls = this.f316942e;
            this.f316943f = (cls == null || (declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0])) == null) ? null : (l75.f0) declaredConstructor.newInstance(new java.lang.Object[0]);
        }
        l75.f0 f0Var = this.f316943f;
        o75.e observerOwner = f0Var != null ? f0Var.getObserverOwner() : null;
        o75.e eVar = observerOwner instanceof o75.e ? observerOwner : null;
        if (eVar != null) {
            return eVar;
        }
        com.tencent.mars.xlog.Log.i(getF368356h(), "create new storage observer owner");
        return new o75.e();
    }

    /* renamed from: O6 */
    public java.lang.String getF368356h() {
        return "MicroMsg.Mvvm.ObservableStorage";
    }

    public final o75.e P6() {
        return (o75.e) ((jz5.n) this.f316941d).getValue();
    }

    public void Q6(androidx.lifecycle.y lifecycleOwner, o75.a observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        P6().observe(lifecycleOwner, observer);
    }
}
