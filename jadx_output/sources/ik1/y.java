package ik1;

/* loaded from: classes7.dex */
public final class y implements al5.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f291846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f291847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f291848f;

    public y(kotlinx.coroutines.q qVar, com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.Runnable runnable) {
        this.f291846d = qVar;
        this.f291847e = mMWebView;
        this.f291848f = runnable;
    }

    @Override // al5.o2
    public void F3(int i17, int i18, int i19, int i27) {
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f291846d;
        if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(i18)));
        }
        this.f291847e.C.remove(this);
        com.tencent.mm.sdk.platformtools.u3.l(this.f291848f);
    }
}
