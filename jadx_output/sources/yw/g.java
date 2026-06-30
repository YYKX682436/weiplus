package yw;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466323e;

    public g(yw.y yVar, int i17) {
        this.f466322d = yVar;
        this.f466323e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466322d.f466509a;
        if (cVar != null) {
            cVar.y(this.f466323e);
        }
    }
}
