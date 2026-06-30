package yw;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466315e;

    public f(yw.y yVar, int i17) {
        this.f466314d = yVar;
        this.f466315e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466314d.f466509a;
        if (cVar != null) {
            cVar.o(this.f466315e);
        }
    }
}
