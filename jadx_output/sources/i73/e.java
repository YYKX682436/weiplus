package i73;

@j95.b
/* loaded from: classes12.dex */
public class e extends i95.w implements j73.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f289447d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f289448e = new java.util.concurrent.ConcurrentLinkedQueue();

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            km5.q qVar = new km5.q();
            qVar.y(com.tencent.mm.sdk.platformtools.x2.f193071a);
            km5.q qVar2 = (km5.q) qVar.i(new l73.a()).q(new l73.b(false));
            qVar2.s(new i73.e$$a(this));
            qVar2.a(new i73.e$$b(this));
            return;
        }
        km5.q qVar3 = new km5.q();
        qVar3.y(com.tencent.mm.sdk.platformtools.x2.f193071a);
        km5.q qVar4 = (km5.q) qVar3.i(new l73.a());
        qVar4.s(new i73.e$$a(this));
        qVar4.a(new i73.e$$b(this));
    }

    public final void wi(boolean z17) {
        synchronized (this) {
            this.f289447d = z17;
            java.util.Iterator it = this.f289448e.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                if (this.f289447d) {
                    k73.a.b().a();
                }
                throw null;
            }
            this.f289448e.clear();
        }
    }
}
