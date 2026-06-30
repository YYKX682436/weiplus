package kz5;

/* loaded from: classes5.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, int i18, int i19) {
        if (i17 < 0 || i18 > i19) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i17 + ", toIndex: " + i18 + ", size: " + i19);
        }
        if (i17 <= i18) {
            return;
        }
        throw new java.lang.IllegalArgumentException("fromIndex: " + i17 + " > toIndex: " + i18);
    }
}
