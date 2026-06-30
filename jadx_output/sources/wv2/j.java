package wv2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wv2.m f450015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wv2.m mVar) {
        super(0);
        this.f450015d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        wv2.m mVar = this.f450015d;
        linkedList.addAll(mVar.f450018h.getMediaList());
        java.util.Iterator<T> it = mVar.f450018h.getClipListExt().iterator();
        while (it.hasNext()) {
            linkedList.addAll(((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()).getMediaList());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(((r45.mb4) it6.next()).getString(0));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            java.lang.String q17 = mVar.q(a17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(q17)) {
                com.tencent.mars.xlog.Log.i("LogPost.MvUploadStage", "feedDeleteListener cancelSendTask " + q17);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(q17);
            }
        }
        return jz5.f0.f302826a;
    }
}
