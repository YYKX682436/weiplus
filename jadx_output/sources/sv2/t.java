package sv2;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.v f413352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sv2.v vVar) {
        super(0);
        this.f413352d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        sv2.v vVar = this.f413352d;
        linkedList.addAll(vVar.f413356m.getMediaList());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(((r45.mb4) it.next()).getString(0));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            java.lang.String concat = "uploaddraft_".concat(a17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
                com.tencent.mars.xlog.Log.i(vVar.f413355i, "feedDeleteListener cancelSendTask " + concat);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(concat);
            }
        }
        return jz5.f0.f302826a;
    }
}
