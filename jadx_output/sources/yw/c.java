package yw;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466283e;

    public c(yw.y yVar, int i17) {
        this.f466282d = yVar;
        this.f466283e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466282d.f466509a;
        if (cVar != null) {
            cVar.z(this.f466283e);
        }
    }
}
