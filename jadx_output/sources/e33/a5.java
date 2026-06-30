package e33;

/* loaded from: classes8.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI f247122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI mediaTabAlbumUI) {
        super(0);
        this.f247122d = mediaTabAlbumUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f247122d.getIntent().getBooleanExtra("key_check_permission_on_create", true));
    }
}
