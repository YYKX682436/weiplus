package yw;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466485e;

    public w(yw.y yVar, int i17) {
        this.f466484d = yVar;
        this.f466485e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466484d.f466509a;
        if (cVar != null) {
            cVar.n(this.f466485e);
        }
    }
}
