package yw;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466277e;

    public b(yw.y yVar, int i17) {
        this.f466276d = yVar;
        this.f466277e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466276d.f466509a;
        if (cVar != null) {
            cVar.u(this.f466277e);
        }
    }
}
