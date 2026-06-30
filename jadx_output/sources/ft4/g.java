package ft4;

/* loaded from: classes14.dex */
public final class g implements ft4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft4.i f266613a;

    public g(ft4.i iVar) {
        this.f266613a = iVar;
    }

    @Override // ft4.l
    public void a(dt4.u itemData) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        ft4.a aVar = this.f266613a.f266629n;
        if (aVar != null) {
            aVar.b(itemData);
        }
    }
}
