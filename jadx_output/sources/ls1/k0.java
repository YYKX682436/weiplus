package ls1;

/* loaded from: classes7.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI f320999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI tmplWebViewToolUI) {
        super(0);
        this.f320999d = tmplWebViewToolUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f320999d.getIntent().getBooleanExtra(com.tencent.mm.ui.w2.f211200m, false));
    }
}
