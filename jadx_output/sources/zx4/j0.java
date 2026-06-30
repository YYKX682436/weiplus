package zx4;

/* loaded from: classes7.dex */
public final class j0 implements al5.o2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f477152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f477153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f477154f;

    public j0(kotlinx.coroutines.q qVar, com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.Runnable runnable) {
        this.f477152d = qVar;
        this.f477153e = mMWebView;
        this.f477154f = runnable;
    }

    @Override // al5.o2
    public void F3(int i17, int i18, int i19, int i27) {
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f477152d;
        if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(i18)));
        }
        this.f477153e.C.remove(this);
        com.tencent.mm.sdk.platformtools.u3.l(this.f477154f);
    }
}
