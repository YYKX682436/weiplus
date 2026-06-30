package yw;

/* loaded from: classes11.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.c0 f466260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466261e;

    public a0(yw.c0 c0Var, int i17) {
        this.f466260d = c0Var;
        this.f466261e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.e eVar = this.f466260d.f466284a;
        if (eVar != null) {
            eVar.f(this.f466261e);
        }
    }
}
