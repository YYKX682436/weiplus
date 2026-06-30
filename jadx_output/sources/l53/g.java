package l53;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l53.i f316656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316657e;

    public g(l53.i iVar, android.content.Context context) {
        this.f316656d = iVar;
        this.f316657e = context;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1002) {
            l53.i iVar = this.f316656d;
            if (i18 == -1) {
                l53.a aVar = iVar.f316662c;
                if (aVar != null) {
                    aVar.onSuccess();
                }
                com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToTimeline success");
            } else {
                l53.a aVar2 = iVar.f316662c;
                if (aVar2 != null) {
                    aVar2.onCancel();
                }
                com.tencent.mars.xlog.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video , shareToTimeline cancel");
            }
            ((com.tencent.mm.ui.MMFragmentActivity) this.f316657e).setMMOnFragmentActivityResult(null);
        }
    }
}
