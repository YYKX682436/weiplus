package wo4;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448287d;

    public r(wo4.y yVar) {
        this.f448287d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wo4.y yVar = this.f448287d;
        yz5.r rVar = yVar.f448312s;
        if (rVar != null) {
            rVar.C("", yVar.f448314u, java.lang.Boolean.TRUE, -1);
        }
    }
}
