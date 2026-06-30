package yr2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr2.o f464711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yr2.o oVar) {
        super(1);
        this.f464711d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.e("PreloadGlobalInfoCGIFetcher", "fetch error", it);
        this.f464711d.f464714b.set(false);
        return jz5.f0.f302826a;
    }
}
