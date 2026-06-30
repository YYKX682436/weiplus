package zo1;

/* loaded from: classes5.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        super(1);
        this.f474684d = selectContactUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "onMoreIconClicked, username=".concat(username));
        com.tencent.mm.plugin.backup.roambackup.a2.b(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, this.f474684d.f92863w, 3L, null, 4, null);
        return jz5.f0.f302826a;
    }
}
