package yw;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.l1 f466420f;

    public p(yw.y yVar, int i17, com.tencent.wechat.mm.biz.l1 l1Var) {
        this.f466418d = yVar;
        this.f466419e = i17;
        this.f466420f = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466418d.f466509a;
        if (cVar != null) {
            cVar.u0(this.f466419e, this.f466420f);
        }
    }
}
