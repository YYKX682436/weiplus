package fq1;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f265504e;

    public c(int i17, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView) {
        this.f265503d = i17;
        this.f265504e = mMNeat7extView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fq1.e eVar = fq1.e.f265507a;
        int width = this.f265504e.getWidth();
        fq1.e.f265508b.put(java.lang.Integer.valueOf(this.f265503d), java.lang.Integer.valueOf(width));
    }
}
