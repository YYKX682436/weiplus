package ik1;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f291849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f291850e;

    public z(kotlinx.coroutines.q qVar, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f291849d = qVar;
        this.f291850e = mMWebView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.q qVar = this.f291849d;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(this.f291850e.getWebScrollY())));
        }
    }
}
