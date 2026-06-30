package wo1;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter f447971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f447972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f447973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter backedUpConversationAdapter, java.util.List list, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f447971d = backedUpConversationAdapter;
        this.f447972e = list;
        this.f447973f = countDownLatch;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f447971d.setupData(this.f447972e, (com.tencent.wechat.aff.affroam.f) obj);
        this.f447973f.countDown();
        return jz5.f0.f302826a;
    }
}
