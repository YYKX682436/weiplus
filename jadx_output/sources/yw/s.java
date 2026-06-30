package yw;

/* loaded from: classes11.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466452e;

    public s(yw.y yVar, int i17) {
        this.f466451d = yVar;
        this.f466452e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466451d.f466509a;
        if (cVar != null) {
            cVar.g(this.f466452e);
        }
    }
}
