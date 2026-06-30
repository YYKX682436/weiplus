package sv2;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.h0 f413270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(sv2.h0 h0Var) {
        super(0);
        this.f413270d = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        sv2.h0 h0Var = this.f413270d;
        linkedList.addAll(h0Var.f413287m.getMediaList());
        java.util.Iterator<T> it = h0Var.f413287m.getClipListExt().iterator();
        while (it.hasNext()) {
            linkedList.addAll(((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()).getMediaList());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(((r45.mb4) it6.next()).getString(0));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            java.lang.String q17 = h0Var.q(a17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(q17)) {
                com.tencent.mars.xlog.Log.i(h0Var.f413286i, "draftModifyListener cancelSendTask " + q17);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(q17);
            }
        }
        return jz5.f0.f302826a;
    }
}
