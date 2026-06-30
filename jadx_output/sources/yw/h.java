package yw;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466330e;

    public h(yw.y yVar, int i17) {
        this.f466329d = yVar;
        this.f466330e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466329d.f466509a;
        if (cVar != null) {
            cVar.B(this.f466330e);
        }
    }
}
