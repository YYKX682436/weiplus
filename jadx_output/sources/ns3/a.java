package ns3;

/* loaded from: classes8.dex */
public class a implements com.tencent.mm.pluginsdk.ui.tools.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.stub.ReadMailProxy f339420a;

    public a(com.tencent.mm.plugin.qqmail.stub.ReadMailProxy readMailProxy) {
        this.f339420a = readMailProxy;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u6
    public void a() {
        this.f339420a.CLIENT_CALL("onGetQQMailUnreadFailed", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u6
    public void onSuccess(int i17) {
        this.f339420a.CLIENT_CALL("onGetQQMailUnreadSuccess", java.lang.Integer.valueOf(i17));
    }
}
