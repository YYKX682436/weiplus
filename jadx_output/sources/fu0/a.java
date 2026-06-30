package fu0;

/* loaded from: classes5.dex */
public final class a implements iv3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f266755a;

    public a(kotlinx.coroutines.q qVar) {
        this.f266755a = qVar;
    }

    @Override // iv3.a
    public void a(boolean z17, lv3.a musicData) {
        kotlin.jvm.internal.o.g(musicData, "musicData");
        kotlinx.coroutines.q qVar = this.f266755a;
        if (!z17) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(musicData.f321509b, false);
        if (i17 == null) {
            i17 = "";
        }
        lv3.a aVar = new lv3.a(musicData.f321508a, i17, 0L, 4, null);
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((c61.p7) ((m40.k0) c17)).fj(i17);
        qVar.resumeWith(kotlin.Result.m521constructorimpl(aVar));
    }
}
