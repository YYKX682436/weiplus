package qk;

/* loaded from: classes11.dex */
public final class ha {
    public ha(kotlin.jvm.internal.i iVar) {
    }

    public final qk.ia a(int i17) {
        for (qk.ia iaVar : qk.ia.values()) {
            if (iaVar.f364175d == i17) {
                return iaVar;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }
}
