package yf5;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f461855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f461856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f461857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461858g;

    public c0(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.storage.l4 l4Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f461855d = f0Var;
        this.f461856e = l4Var;
        this.f461857f = weakReference;
        this.f461858g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yf5.b0(this.f461857f, this.f461858g));
        int i17 = this.f461855d.f310116d;
        if (i17 > 0) {
            com.tencent.mm.ui.report.m0.f209698a.a(this.f461856e, i17);
        }
    }
}
