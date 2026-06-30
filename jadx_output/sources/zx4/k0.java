package zx4;

/* loaded from: classes7.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f477160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f477161e;

    public k0(kotlinx.coroutines.q qVar, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f477160d = qVar;
        this.f477161e = mMWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.q qVar = this.f477160d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(this.f477161e.getWebScrollY())));
        }
    }
}
