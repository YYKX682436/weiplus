package yw;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.c0 f466278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466279e;

    public b0(yw.c0 c0Var, int i17) {
        this.f466278d = c0Var;
        this.f466279e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.e eVar = this.f466278d.f466284a;
        if (eVar != null) {
            eVar.h(this.f466279e);
        }
    }
}
