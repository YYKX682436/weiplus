package gu0;

/* loaded from: classes5.dex */
public final class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI f275803d;

    public s(com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI) {
        this.f275803d = composingCreationPreviewUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "close confirmed by user");
        com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI = this.f275803d;
        gu0.k2 k2Var = composingCreationPreviewUI.f69177d;
        if (k2Var != null) {
            k2Var.p(true, new gu0.r(composingCreationPreviewUI));
        }
    }
}
