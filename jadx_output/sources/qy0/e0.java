package qy0;

/* loaded from: classes5.dex */
public final class e0 implements com.tencent.mm.mj_template.sns.compose.widget.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI f367586a;

    public e0(com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI) {
        this.f367586a = maasAlbumMultiTemplatePreviewUI;
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void b(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (kotlin.jvm.internal.o.b(templateId, "@@no_template@@")) {
            return;
        }
        int i18 = com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI.f69753f;
        com.tencent.mm.mj_template.report.MaasPageFinderReporter T6 = this.f367586a.T6();
        T6.getClass();
        T6.c(templateId, false, T6.f69807f);
    }

    @Override // com.tencent.mm.mj_template.sns.compose.widget.b7
    public void f(java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        boolean b17 = kotlin.jvm.internal.o.b(templateId, "@@no_template@@");
        com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI maasAlbumMultiTemplatePreviewUI = this.f367586a;
        if (b17) {
            int i18 = com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI.f69753f;
            maasAlbumMultiTemplatePreviewUI.T6().d("", "no_template2");
        } else {
            int i19 = com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI.f69753f;
            com.tencent.mm.mj_template.report.MaasPageFinderReporter T6 = maasAlbumMultiTemplatePreviewUI.T6();
            T6.d(templateId, T6.f69807f);
        }
    }
}
