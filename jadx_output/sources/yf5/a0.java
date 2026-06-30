package yf5;

/* loaded from: classes11.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f461848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f461849e;

    public a0(kotlin.jvm.internal.f0 f0Var, com.tencent.mm.storage.l4 l4Var) {
        this.f461848d = f0Var;
        this.f461849e = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f461848d.f310116d;
        if (i17 > 0) {
            com.tencent.mm.ui.report.m0.f209698a.a(this.f461849e, i17);
        }
    }
}
