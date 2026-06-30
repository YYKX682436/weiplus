package ej4;

/* loaded from: classes11.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String statusId) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfItemHelper", "deleteHistoryCardWithStatusId >> ".concat(statusId));
        int size = ej4.e0.f253347f.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.LinkedList linkedList = ej4.e0.f253347f;
            if (kotlin.jvm.internal.o.b(((pj4.n1) linkedList.get(i17)).f355199d, statusId)) {
                linkedList.remove(i17);
                return;
            }
        }
    }
}
