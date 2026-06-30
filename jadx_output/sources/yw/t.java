package yw;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466468e;

    public t(yw.y yVar, int i17) {
        this.f466467d = yVar;
        this.f466468e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.c cVar = this.f466467d.f466509a;
        if (cVar != null) {
            cVar.j(this.f466468e);
        }
    }
}
