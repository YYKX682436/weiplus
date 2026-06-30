package h03;

/* loaded from: classes2.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h03.q f277909d;

    public p(h03.q qVar) {
        this.f277909d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h03.q qVar = this.f277909d;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = qVar.f277910d;
        if (finderObject != null) {
            so2.u1 c17 = c03.i.c(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0));
            java.lang.Integer num = qVar.f277911e;
            h03.q.a(qVar, c17, num != null ? num.intValue() : 162);
            qVar.f277910d = null;
        }
    }
}
