package qx5;

/* loaded from: classes11.dex */
public final /* synthetic */ class l0$$c implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Long.compare(((java.io.File) obj2).lastModified(), ((java.io.File) obj).lastModified());
    }
}
