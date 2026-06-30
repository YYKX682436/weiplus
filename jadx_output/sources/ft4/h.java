package ft4;

/* loaded from: classes14.dex */
public final class h extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft4.i f266618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f266619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ft4.i iVar, ft4.j jVar) {
        super(false);
        this.f266618d = iVar;
        this.f266619e = jVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ft4.a aVar = this.f266618d.f266629n;
        if (aVar != null) {
            aVar.a(this.f266619e);
        }
    }
}
