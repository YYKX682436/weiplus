package yw;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466475e;

    public u(yw.y yVar, int i17) {
        this.f466474d = yVar;
        this.f466475e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466474d.f466509a;
        if (cVar != null) {
            cVar.n(this.f466475e);
        }
    }
}
