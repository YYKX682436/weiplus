package xf5;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f454332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf5.b f454333e;

    public a(xf5.b bVar, long j17) {
        this.f454333e = bVar;
        this.f454332d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        xf5.b bVar = this.f454333e;
        objArr[0] = java.lang.Boolean.valueOf(bVar.f454334a != null);
        objArr[1] = java.lang.Boolean.valueOf(bVar.f454335b);
        objArr[2] = bVar.f454336c;
        objArr[3] = java.lang.Long.valueOf(bVar.f454337d);
        long j17 = this.f454332d;
        objArr[4] = java.lang.Long.valueOf(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxConversationService", "refreshConversationTime thread run boxConv:%s isUpdate:%s child_username:%s callTime:%s convTime:%s", objArr);
        com.tencent.mm.storage.l4 l4Var = bVar.f454334a;
        if (l4Var != null) {
            l4Var.n1(j17);
            if (bVar.f454335b) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(bVar.f454334a, "conversationboxservice");
            } else {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(bVar.f454334a);
            }
        }
    }
}
