package o4;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f342802b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Bundle f342803c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f342804d;

    /* renamed from: e, reason: collision with root package name */
    public o4.a f342805e;

    /* renamed from: a, reason: collision with root package name */
    public final q.h f342801a = new q.h();

    /* renamed from: f, reason: collision with root package name */
    public boolean f342806f = true;

    public final android.os.Bundle a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        if (!this.f342804d) {
            throw new java.lang.IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        android.os.Bundle bundle = this.f342803c;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        android.os.Bundle bundle3 = this.f342803c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        android.os.Bundle bundle4 = this.f342803c;
        boolean z17 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z17 = true;
        }
        if (!z17) {
            this.f342803c = null;
        }
        return bundle2;
    }

    public final void b(java.lang.String key, o4.d provider) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(provider, "provider");
        if (!(((o4.d) this.f342801a.e(key, provider)) == null)) {
            throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void c(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        if (!this.f342806f) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        o4.a aVar = this.f342805e;
        if (aVar == null) {
            aVar = new o4.a(this);
        }
        this.f342805e = aVar;
        try {
            clazz.getDeclaredConstructor(new java.lang.Class[0]);
            o4.a aVar2 = this.f342805e;
            if (aVar2 != null) {
                aVar2.f342800a.add(clazz.getName());
            }
        } catch (java.lang.NoSuchMethodException e17) {
            throw new java.lang.IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e17);
        }
    }
}
