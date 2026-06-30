package cr0;

/* loaded from: classes11.dex */
public final class z4 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a(((com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg) obj2).getCount())), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a(((com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg) obj).getCount())));
    }
}
