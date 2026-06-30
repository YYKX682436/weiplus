package es2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.g f256336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(es2.g gVar) {
        super(0);
        this.f256336d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        es2.g gVar = this.f256336d;
        vr2.e eVar = gVar.f256348i;
        if (eVar != null && (i17 = gVar.f256346g) == eVar.a()) {
            com.tencent.mars.xlog.Log.i("FMTPScheduler", "onPreloadStart " + i17);
            java.util.Iterator it = eVar.b(eVar.a()).iterator();
            while (it.hasNext()) {
                cs2.j jVar = ((cs2.k) it.next()).f222076d;
                if (jVar != null) {
                    jVar.p0("FMTPScheduler.onPreloadStart." + eVar.a());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
