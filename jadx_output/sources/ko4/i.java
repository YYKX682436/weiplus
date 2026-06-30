package ko4;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f310076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f310077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ko4.l lVar, int i17) {
        super(0);
        this.f310076d = lVar;
        this.f310077e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ko4.l lVar = this.f310076d;
        java.lang.Object obj = lVar.f310092m;
        int i17 = this.f310077e;
        synchronized (obj) {
            ko4.b c17 = lVar.f310089j.c(i17);
            try {
                ko4.d dVar = lVar.f310090k;
                if (dVar != null) {
                    dVar.c(c17.f310038b);
                }
            } catch (java.lang.Exception unused) {
                lVar.f310093n = true;
            }
            lVar.f310089j.d();
            com.tencent.tav.decoder.RenderContext renderContext = lVar.f310082c;
            if (renderContext != null) {
                renderContext.setPresentationTime(c17.f310037a.presentationTimeUs);
            }
            com.tencent.tav.decoder.RenderContext renderContext2 = lVar.f310082c;
            if (renderContext2 != null) {
                renderContext2.swapBuffers();
            }
            lVar.f310092m.notifyAll();
        }
        return jz5.f0.f302826a;
    }
}
