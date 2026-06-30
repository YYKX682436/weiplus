package e75;

/* loaded from: classes12.dex */
public final class h extends e75.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f249978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e75.i f249979b;

    public h(e75.i iVar, java.lang.Object obj) {
        this.f249979b = iVar;
        this.f249978a = obj;
    }

    @Override // e75.g
    public java.lang.String getLogTag() {
        this.f249979b.getClass();
        return "MicroMsg.Mvvm.NetSceneObserverOwner";
    }

    @Override // e75.g
    public void removeObserver(e75.a observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        super.removeObserver(observer);
        ((q01.i) this.f249979b).getClass();
        ((java.lang.Number) this.f249978a).intValue();
        com.tencent.mm.sdk.platformtools.k2.c((q01.e) observer);
    }
}
