package yw;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f466358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f466359g;

    public j(yw.y yVar, int i17, boolean z17, boolean z18) {
        this.f466356d = yVar;
        this.f466357e = i17;
        this.f466358f = z17;
        this.f466359g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466356d.f466509a;
        if (cVar != null) {
            cVar.F0(this.f466357e, yw.m.a(this.f466358f, this.f466359g));
        }
    }
}
