package qn4;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final qn4.v f365297a = new qn4.v();

    /* renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f365298b = new android.os.Handler(android.os.Looper.getMainLooper());

    public final void a(yz5.a action, yz5.a aVar) {
        kotlin.jvm.internal.o.g(action, "action");
        qn4.u uVar = new qn4.u(action, aVar);
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            uVar.run();
        } else {
            f365298b.post(uVar);
        }
    }
}
