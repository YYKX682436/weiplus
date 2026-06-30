package qy0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI f367588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI) {
        super(0);
        this.f367588d = maasAlbumMultiTemplatePreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI = this.f367588d;
        java.lang.String str = (java.lang.String) ((jz5.n) maasAlbumMultiTemplatePreviewUI.f69754d).getValue();
        android.content.Intent intent = maasAlbumMultiTemplatePreviewUI.getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        return new com.tencent.mm.mj_template.report.MaasPageFinderReporter(str, 132, "recommend_feed_template", intent);
    }
}
