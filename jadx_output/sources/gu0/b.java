package gu0;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f275626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI f275627e;

    public b(hu0.a0 a0Var, com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI) {
        this.f275626d = a0Var;
        this.f275627e = composingCreationPreviewUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu0.k2 k2Var;
        this.f275626d.T6();
        gu0.k2 k2Var2 = this.f275627e.f69177d;
        boolean z17 = false;
        if (k2Var2 != null && k2Var2.f275733i) {
            z17 = true;
        }
        if (z17 || (k2Var = this.f275627e.f69177d) == null) {
            return;
        }
        k2Var.t();
    }
}
