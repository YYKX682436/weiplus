package xn4;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI f455632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.updater.xlabupdater.XUpdateDownloadUI xUpdateDownloadUI) {
        super(0);
        this.f455632d = xUpdateDownloadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.Toast.makeText(this.f455632d.getContext(), "fail", 0).show();
        return jz5.f0.f302826a;
    }
}
