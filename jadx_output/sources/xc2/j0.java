package xc2;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f453167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f453168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(xc2.k0 k0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(1);
        this.f453167d = k0Var;
        this.f453168e = finderItem;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f453167d.f453191x.remove(java.lang.Long.valueOf(this.f453168e.getId()));
        return jz5.f0.f302826a;
    }
}
