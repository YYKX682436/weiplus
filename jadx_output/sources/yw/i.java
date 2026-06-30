package yw;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466350e;

    public i(yw.y yVar, int i17) {
        this.f466349d = yVar;
        this.f466350e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466349d.f466509a;
        if (cVar != null) {
            cVar.D(this.f466350e);
        }
    }
}
