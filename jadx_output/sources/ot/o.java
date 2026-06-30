package ot;

/* loaded from: classes.dex */
public final class o implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) obj).getCreateTime()), java.lang.Long.valueOf(((com.tencent.mm.storage.f9) obj2).getCreateTime()));
    }
}
