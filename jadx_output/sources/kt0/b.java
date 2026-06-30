package kt0;

/* loaded from: classes15.dex */
public class b implements kk.h {
    public b(kt0.e eVar) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.ref.WeakReference weakReference;
        kk.h hVar;
        java.lang.String str = (java.lang.String) obj;
        kt0.a aVar = (kt0.a) obj2;
        kt0.a aVar2 = (kt0.a) obj3;
        if (aVar == null || (weakReference = aVar.f311906d) == null || weakReference.get() == null || (hVar = (kk.h) weakReference.get()) == null) {
            return;
        }
        hVar.a(str, aVar, aVar2);
    }
}
