package v01;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbiz.ui.BizProfileCardFragment f432210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f432211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment, com.tencent.wechat.mm.biz.b bVar) {
        super(0);
        this.f432210d = bizProfileCardFragment;
        this.f432211e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.modelbiz.ui.BizProfileCardFragment.f70865q;
        com.tencent.mm.modelbiz.ui.BizProfileCardFragment bizProfileCardFragment = this.f432210d;
        if (!bizProfileCardFragment.u0()) {
            com.tencent.wechat.mm.biz.b bVar = bizProfileCardFragment.f70866n;
            com.tencent.wechat.mm.biz.b bVar2 = this.f432211e;
            if (!bVar2.compareContent(bVar)) {
                bizProfileCardFragment.f70866n = bVar2;
                bizProfileCardFragment.B0();
            }
        }
        return jz5.f0.f302826a;
    }
}
