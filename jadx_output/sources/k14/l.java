package k14;

/* loaded from: classes12.dex */
public class l implements com.tencent.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k14.n f303357a;

    public l(k14.n nVar) {
        this.f303357a = nVar;
    }

    @Override // com.tencent.mm.app.g3
    public void a(java.lang.String str) {
        d(-1, 0L, 0L, false);
    }

    @Override // com.tencent.mm.app.g3
    public void b(int i17, java.lang.String str) {
        d(0, 0L, 0L, true);
    }

    @Override // com.tencent.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        d(i17, j17, j18, false);
        boolean z17 = this.f303357a.f303361a;
    }

    public final void d(int i17, long j17, long j18, boolean z17) {
        if (i17 >= 0 && i17 < 100 && !z17) {
            k14.m mVar = k14.n.f303359f;
            if (mVar != null) {
                mVar.a(i17, j17, j18, z17);
                return;
            }
            return;
        }
        k14.m mVar2 = k14.n.f303359f;
        if (mVar2 != null) {
            mVar2.a(i17, j17, j18, z17);
            k14.n.f303359f = null;
        }
        this.f303357a.f303361a = false;
    }
}
