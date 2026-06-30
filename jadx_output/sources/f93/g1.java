package f93;

/* loaded from: classes11.dex */
public class g1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelEditUI f260341a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI, android.os.Looper looper) {
        super(looper);
        this.f260341a = contactLabelEditUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 6001) {
            int i18 = com.tencent.mm.plugin.label.ui.ContactLabelEditUI.I;
            this.f260341a.b7();
        } else if (i17 != 6002) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelEditUI", "unknow message. what is:%d", java.lang.Integer.valueOf(i17));
        } else {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
    }
}
