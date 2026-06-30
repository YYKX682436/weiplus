package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.g3 f310484a;

    static {
        java.lang.String str;
        java.lang.Object next;
        int i17 = kotlinx.coroutines.internal.n0.f310511a;
        kotlinx.coroutines.g3 g3Var = null;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null) {
            java.lang.Boolean.parseBoolean(str);
        }
        java.util.List y17 = q26.h0.y(q26.y.a(kotlinx.coroutines.internal.a0.a()));
        java.util.Iterator it = y17.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((kotlinx.coroutines.internal.z) next).getLoadPriority();
                do {
                    java.lang.Object next2 = it.next();
                    int loadPriority2 = ((kotlinx.coroutines.internal.z) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlinx.coroutines.internal.z zVar = (kotlinx.coroutines.internal.z) next;
        if (zVar != null) {
            try {
                g3Var = zVar.createDispatcher(y17);
            } catch (java.lang.Throwable unused2) {
                zVar.hintOnError();
            }
            if (g3Var != null) {
                f310484a = g3Var;
                return;
            }
        }
        throw new java.lang.IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
