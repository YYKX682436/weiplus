package f93;

/* loaded from: classes11.dex */
public final class l0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel, android.os.Looper looper) {
        super(looper);
        this.f260378a = contactEditLabel;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260378a;
        if (i17 != 6001) {
            if (i17 != 6002) {
                com.tencent.mars.xlog.Log.w(contactEditLabel.f143191d, "unknow message. what is:%d", java.lang.Integer.valueOf(i17));
                return;
            } else {
                ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
                return;
            }
        }
        f93.y yVar = contactEditLabel.A;
        if (yVar != null) {
            yVar.s();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
