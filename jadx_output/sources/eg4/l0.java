package eg4;

/* loaded from: classes4.dex */
public final class l0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.storage.m7) obj2).field_lastModifiedTime), java.lang.Long.valueOf(((com.tencent.mm.storage.m7) obj).field_lastModifiedTime));
    }
}
