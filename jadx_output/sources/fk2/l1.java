package fk2;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f263426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263427e;

    public l1(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, com.tencent.mm.pluginsdk.ui.span.f0 f0Var) {
        this.f263426d = mMNeat7extView;
        this.f263427e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263427e;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f263426d;
        mMNeat7extView.b(f0Var);
        mMNeat7extView.setMaxLines(Integer.MAX_VALUE);
    }
}
