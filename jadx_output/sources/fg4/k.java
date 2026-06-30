package fg4;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI f262478a;

    public k(com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI appProfileUI) {
        this.f262478a = appProfileUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f262478a.finish();
    }
}
