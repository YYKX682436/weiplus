package gu0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.o f275857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI f275858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f275859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu0.l f275860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(hu0.o oVar, com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI, hu0.a0 a0Var, hu0.l lVar) {
        super(1);
        this.f275857d = oVar;
        this.f275858e = composingCreationPreviewUI;
        this.f275859f = a0Var;
        this.f275860g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        hu0.o oVar = this.f275857d;
        com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI composingCreationPreviewUI = this.f275858e;
        if (str != null) {
            com.tencent.mars.xlog.Log.e("MJCC.PreviewUI", "preparePreview failed: ".concat(str));
            hu0.o.P6(oVar, null, new gu0.w(composingCreationPreviewUI), 1, null);
        } else {
            com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "preparePreview success, start playback");
            com.tencent.mm.sdk.coroutines.LifecycleScope uICScope = composingCreationPreviewUI.getUICScope();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(uICScope, kotlinx.coroutines.internal.b0.f310484a, null, new gu0.x(this.f275859f, this.f275860g, oVar, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
