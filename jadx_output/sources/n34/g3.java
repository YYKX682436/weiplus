package n34;

/* loaded from: classes10.dex */
public final class g3 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final n34.g3 f334607d = new n34.g3();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        n34.a aVar = (n34.a) obj;
        n34.a aVar2 = (n34.a) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ABAResult");
        kotlin.jvm.internal.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ABAResult");
        int a17 = aVar.a();
        int a18 = aVar2.a();
        int i17 = a18 < a17 ? -1 : a17 < a18 ? 1 : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.SnsFinderPostManager$sortVideoBitrate$1");
        return i17;
    }
}
