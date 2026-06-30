package fq4;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.k f265611d;

    public j(fq4.k kVar) {
        this.f265611d = kVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        fq4.k kVar = this.f265611d;
        if (i17 == 0 && i18 == 0) {
            fq4.l lVar = kVar.f265613e;
            lVar.doScene(lVar.dispatcher(), kVar.f265613e.f265614d);
        } else {
            fq4.l lVar2 = kVar.f265613e;
            lVar2.f265614d.onSceneEnd(i17, i18, "", lVar2);
        }
    }
}
