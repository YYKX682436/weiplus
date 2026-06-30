package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class ak extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f123544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(java.util.List list) {
        super(1);
        this.f123544d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 feed = (so2.j5) obj;
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.Iterator it = this.f123544d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getItemId() == feed.getItemId()) {
                break;
            }
            i17++;
        }
        return java.lang.Boolean.valueOf(i17 >= 0);
    }
}
