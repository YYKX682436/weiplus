package xc2;

/* loaded from: classes2.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f453157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j0 f453158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f453159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, androidx.lifecycle.j0 j0Var, xc2.k0 k0Var) {
        super(1);
        this.f453157d = finderItem;
        this.f453158e = j0Var;
        this.f453159f = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h61 resp = (r45.h61) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f453157d;
        com.tencent.mars.xlog.Log.i("Finder.FeedGlobalJumperUIC", "requestHelpPromotionInfo success ".concat(pm0.v.u(finderItem.getId())));
        this.f453158e.postValue((r45.fm2) resp.getCustom(1));
        this.f453159f.f453191x.remove(java.lang.Long.valueOf(finderItem.getId()));
        return jz5.f0.f302826a;
    }
}
