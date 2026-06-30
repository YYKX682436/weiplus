package sy0;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI f413830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI maasAlbumTemplatePreviewUI) {
        super(0);
        this.f413830d = maasAlbumTemplatePreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI maasAlbumTemplatePreviewUI = this.f413830d;
        try {
            return sy0.b.values()[maasAlbumTemplatePreviewUI.getIntent().getIntExtra("maas_album_template.scene", -1)];
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MJAlbumTemplatePreviewUI", "Failed to get scene from intent");
            maasAlbumTemplatePreviewUI.getContext().finish();
            return sy0.b.f413826d;
        }
    }
}
