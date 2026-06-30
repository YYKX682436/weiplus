package yw;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466290e;

    public d(yw.y yVar, int i17) {
        this.f466289d = yVar;
        this.f466290e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466289d.f466509a;
        if (cVar != null) {
            cVar.s(this.f466290e);
        }
    }
}
