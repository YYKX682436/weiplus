package ik3;

/* loaded from: classes8.dex */
public final class i implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj2).field_createTime), java.lang.Long.valueOf(((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj).field_createTime));
    }
}
