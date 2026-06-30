package ft4;

/* loaded from: classes14.dex */
public final class e extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft4.i f266604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f266605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ft4.i iVar, ft4.j jVar) {
        super(false);
        this.f266604d = iVar;
        this.f266605e = jVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ft4.a aVar = this.f266604d.f266629n;
        if (aVar != null) {
            aVar.c(this.f266605e);
        }
    }
}
