package xn4;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI f455598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI dialogDownloadUI) {
        super(0);
        this.f455598d = dialogDownloadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.mm6 mm6Var = new r45.mm6();
        mm6Var.fromJson(this.f455598d.getIntent().getStringExtra("x_dialoginfo"));
        return mm6Var;
    }
}
