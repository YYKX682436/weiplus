package yw;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.c0 f466516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466517e;

    public z(yw.c0 c0Var, int i17) {
        this.f466516d = c0Var;
        this.f466517e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.e eVar = this.f466516d.f466284a;
        if (eVar != null) {
            eVar.q(this.f466517e);
        }
    }
}
