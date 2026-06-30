package dd;

/* loaded from: classes9.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final dd.p f228887c = new dd.p(null);

    /* renamed from: d, reason: collision with root package name */
    public static dd.q f228888d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f228889a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f228890b = "lite_app_module_shake_impl_session_id_";

    public final com.tencent.kinda.framework.app.KindaShakeCheckingManager a(bd.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = this.f228890b + callback.f19197a;
        java.util.HashMap hashMap = this.f228889a;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new com.tencent.kinda.framework.app.KindaShakeCheckingManager());
        }
        java.lang.Object obj = hashMap.get(str);
        kotlin.jvm.internal.o.d(obj);
        return (com.tencent.kinda.framework.app.KindaShakeCheckingManager) obj;
    }
}
