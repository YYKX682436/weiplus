package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveVisitorPluginLayout$notifyShowCommentStorage$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ long $liveId;
    final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout$notifyShowCommentStorage$1(long j17, com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout) {
        super(0);
        this.$liveId = j17;
        this.this$0 = finderLiveVisitorPluginLayout;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m121invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m121invoke() {
        java.util.List list;
        java.util.List list2;
        dk2.q5 q5Var = dk2.q5.f233939a;
        long j17 = this.$liveId;
        com.tencent.mars.xlog.Log.i("Micro.FinderLiveCommentTemporaryStorage", "[getComments] liveId=" + j17);
        synchronized (q5Var.b()) {
            dk2.l5 l5Var = (dk2.l5) q5Var.b().get(java.lang.Long.valueOf(j17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getComments-enter] liveId=");
            sb6.append(j17);
            sb6.append(", size=");
            sb6.append((l5Var == null || (list2 = l5Var.f233717b) == null) ? 0 : list2.size());
            com.tencent.mars.xlog.Log.i("Micro.FinderLiveCommentTemporaryStorage", sb6.toString());
            if (l5Var != null) {
                if (c01.id.c() - l5Var.f233718c < 30000) {
                    list = l5Var.f233717b;
                } else {
                    q5Var.b().remove(java.lang.Long.valueOf(j17));
                }
            }
            list = null;
        }
        if (list != null) {
            java.util.List list3 = list.isEmpty() ^ true ? list : null;
            if (list3 != null) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.this$0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list3) {
                    if (!((mm2.x4) finderLiveVisitorPluginLayout.business(mm2.x4.class)).f329544y.contains(((dk2.zf) obj).v())) {
                        arrayList.add(obj);
                    }
                }
                com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = this.this$0;
                java.util.List list4 = ((mm2.x4) finderLiveVisitorPluginLayout2.business(mm2.x4.class)).f329544y;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dk2.zf) it.next()).v());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList2) {
                    java.lang.String str = (java.lang.String) obj2;
                    if (!(str == null || str.length() == 0)) {
                        arrayList3.add(obj2);
                    }
                }
                list4.addAll(arrayList3);
                ((mm2.x4) finderLiveVisitorPluginLayout2.business(mm2.x4.class)).f329528f.addAll(arrayList);
                finderLiveVisitorPluginLayout2.notifyUpdateMessage();
            }
        }
    }
}
