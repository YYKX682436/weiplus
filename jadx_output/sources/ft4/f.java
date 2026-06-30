package ft4;

/* loaded from: classes14.dex */
public final class f implements ft4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft4.i f266610a;

    public f(ft4.i iVar) {
        this.f266610a = iVar;
    }

    @Override // ft4.l
    public void a(dt4.u itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        ft4.a aVar = this.f266610a.f266629n;
        if (aVar != null) {
            aVar.b(itemData);
        }
    }
}
