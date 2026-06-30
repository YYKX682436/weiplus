package xv2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv2.j f457411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xv2.j jVar) {
        super(0);
        this.f457411d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        xv2.j jVar = this.f457411d;
        linkedList.addAll(jVar.f457413h.getMediaList());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(((r45.mb4) it.next()).getString(0));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            java.lang.String n17 = jVar.n(a17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                com.tencent.mars.xlog.Log.i(jVar.f457414i, "feedDeleteListener cancelSendTask " + n17);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(n17);
            }
        }
        return jz5.f0.f302826a;
    }
}
