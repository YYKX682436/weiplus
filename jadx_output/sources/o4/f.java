package o4;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o4.g f342808a;

    /* renamed from: b, reason: collision with root package name */
    public final o4.b f342809b = new o4.b();

    /* renamed from: c, reason: collision with root package name */
    public boolean f342810c;

    static {
        new o4.e(null);
    }

    public f(o4.g gVar, kotlin.jvm.internal.i iVar) {
        this.f342808a = gVar;
    }

    public final void a(android.os.Bundle bundle) {
        boolean z17 = this.f342810c;
        final o4.b bVar = this.f342809b;
        o4.g gVar = this.f342808a;
        if (!z17) {
            androidx.lifecycle.o mo133getLifecycle = gVar.mo133getLifecycle();
            kotlin.jvm.internal.o.f(mo133getLifecycle, "owner.lifecycle");
            if (!(mo133getLifecycle.b() == androidx.lifecycle.n.INITIALIZED)) {
                throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
            }
            mo133getLifecycle.a(new androidx.savedstate.Recreator(gVar));
            bVar.getClass();
            if (!(!bVar.f342802b)) {
                throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.".toString());
            }
            mo133getLifecycle.a(new androidx.lifecycle.v() { // from class: o4.b$$a
                @Override // androidx.lifecycle.v
                public final void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m event) {
                    o4.b this$0 = o4.b.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    kotlin.jvm.internal.o.g(yVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.o.g(event, "event");
                    if (event == androidx.lifecycle.m.ON_START) {
                        this$0.f342806f = true;
                    } else if (event == androidx.lifecycle.m.ON_STOP) {
                        this$0.f342806f = false;
                    }
                }
            });
            bVar.f342802b = true;
            this.f342810c = true;
        }
        androidx.lifecycle.o mo133getLifecycle2 = gVar.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle2, "owner.lifecycle");
        if (!(!mo133getLifecycle2.b().a(androidx.lifecycle.n.STARTED))) {
            throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + mo133getLifecycle2.b()).toString());
        }
        if (!bVar.f342802b) {
            throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!bVar.f342804d)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        bVar.f342803c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        bVar.f342804d = true;
    }

    public final void b(android.os.Bundle outBundle) {
        kotlin.jvm.internal.o.g(outBundle, "outBundle");
        o4.b bVar = this.f342809b;
        bVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = bVar.f342803c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        q.h hVar = bVar.f342801a;
        hVar.getClass();
        q.e eVar = new q.e(hVar);
        hVar.f359213f.put(eVar, java.lang.Boolean.FALSE);
        while (eVar.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) eVar.next();
            bundle.putBundle((java.lang.String) entry.getKey(), ((o4.d) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
