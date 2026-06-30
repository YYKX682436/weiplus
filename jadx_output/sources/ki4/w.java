package ki4;

/* loaded from: classes8.dex */
public final class w implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi4.c f308160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f308161e;

    public w(fi4.c cVar, yz5.l lVar) {
        this.f308160d = cVar;
        this.f308161e = lVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        fi4.c cVar = this.f308160d;
        cVar.getClass();
        d17.p(4290, this);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        cVar.getClass();
        d18.q(4290, this);
        yz5.l lVar = this.f308161e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(i17 == 0 && i18 == 0));
        }
    }
}
