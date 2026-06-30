package nj4;

/* loaded from: classes11.dex */
public abstract class f {
    public static final boolean a(mj4.h hVar, mj4.h hVar2) {
        if (hVar == null && hVar2 == null) {
            return true;
        }
        if (hVar == null || hVar2 == null) {
            return false;
        }
        mj4.k kVar = (mj4.k) hVar;
        mj4.k kVar2 = (mj4.k) hVar2;
        return kotlin.jvm.internal.o.b(kVar.o(), kVar2.o()) && kVar.z() == kVar2.z();
    }
}
