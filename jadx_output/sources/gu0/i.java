package gu0;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.o f275692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.l f275693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f275694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI f275696h;

    public i(hu0.o oVar, hu0.l lVar, hu0.a0 a0Var, java.lang.String str, com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI) {
        this.f275692d = oVar;
        this.f275693e = lVar;
        this.f275694f = a0Var;
        this.f275695g = str;
        this.f275696h = composingCreationPreviewUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0.k2 k2Var;
        this.f275692d.O6();
        this.f275693e.R6(true);
        this.f275694f.U6(true);
        if (this.f275695g != null) {
            com.tencent.mars.xlog.Log.e("MJCC.PreviewUI", "applyEditResult failed: " + this.f275695g);
        } else {
            com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "applyEditResult success");
        }
        gu0.k2 k2Var2 = this.f275696h.f69177d;
        if ((k2Var2 != null && k2Var2.f275732h) || (k2Var = this.f275696h.f69177d) == null) {
            return;
        }
        k2Var.t();
    }
}
