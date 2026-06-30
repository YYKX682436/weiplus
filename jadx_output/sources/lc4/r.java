package lc4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final lc4.r f317982d = new lc4.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            if (!((zc4.b) obj2).n().isAd()) {
                break;
            }
        }
        zc4.b bVar = (zc4.b) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$loadMore$2$info$1");
        return bVar;
    }
}
