package um;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final um.f f428678c = new um.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f428679a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Stack f428680b = new java.util.Stack();

    public qk.g6 a() {
        return this.f428680b.empty() ? qk.g6.DEFAULT : (qk.g6) this.f428680b.pop();
    }

    public void b(java.lang.String str) {
        java.util.HashMap hashMap = this.f428679a;
        if (hashMap.containsKey(str)) {
            this.f428680b = (java.util.Stack) hashMap.get(str);
        } else {
            hashMap.put(str, new java.util.Stack());
        }
    }
}
