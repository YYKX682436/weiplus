package hb2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wh2 f280021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f280022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r45.wh2 wh2Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f280021d = wh2Var;
        this.f280022e = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int integer = this.f280021d.getInteger(2);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f280022e;
        if (integer == 1) {
            finderItem.getFeedObject().setPermissionFlag(finderItem.getFeedObject().getPermissionFlag() | 2048);
        } else {
            finderItem.getFeedObject().setPermissionFlag(finderItem.getFeedObject().getPermissionFlag() & (-2049));
        }
        return jz5.f0.f302826a;
    }
}
