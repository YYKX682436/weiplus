package sy0;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI f413829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI maasAlbumTemplatePreviewUI) {
        super(0);
        this.f413829d = maasAlbumTemplatePreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams) this.f413829d.getIntent().getParcelableExtra("request_params");
    }
}
