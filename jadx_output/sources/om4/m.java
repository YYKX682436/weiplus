package om4;

@j95.b
/* loaded from: classes11.dex */
public class m extends i95.w implements pm4.r {

    /* renamed from: d, reason: collision with root package name */
    public om4.t f346427d;

    /* renamed from: e, reason: collision with root package name */
    public om4.p f346428e;

    public final om4.t Ai() {
        om4.t tVar = this.f346427d;
        if (tVar != null) {
            return tVar;
        }
        synchronized (this) {
            om4.t tVar2 = this.f346427d;
            if (tVar2 != null) {
                return tVar2;
            }
            om4.t tVar3 = new om4.t();
            this.f346427d = tVar3;
            return tVar3;
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        s75.d.b(new om4.l(this, null), "TopStory.InitTopStoryCacheFolderTask");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        om4.t tVar = this.f346427d;
        if (tVar != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = tVar.f346442a;
            n3Var.removeCallbacksAndMessages(null);
            n3Var.quit();
            this.f346427d = null;
        }
        om4.p pVar = this.f346428e;
        if (pVar != null) {
            pVar.getClass();
            this.f346428e = null;
        }
        rm4.c cVar = rm4.c.f397441q;
        if (cVar != null) {
            if (cVar.f397446h != null) {
                gm0.j1.d().d(rm4.c.f397441q.f397446h);
                rm4.c.f397441q.f397446h = null;
            }
            if (rm4.c.f397441q.f397447i != null) {
                gm0.j1.d().d(rm4.c.f397441q.f397447i);
                rm4.c.f397441q.f397447i = null;
            }
            gm0.j1.d().q(2748, rm4.c.f397441q);
            rm4.c.f397441q = null;
        }
    }

    public om4.p wi() {
        om4.p pVar = this.f346428e;
        if (pVar == null) {
            synchronized (this) {
                pVar = this.f346428e;
                if (pVar == null) {
                    pVar = new om4.p();
                    this.f346428e = pVar;
                }
            }
        }
        return pVar;
    }
}
