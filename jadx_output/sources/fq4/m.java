package fq4;

/* loaded from: classes9.dex */
public class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.n f265618d;

    public m(fq4.n nVar) {
        this.f265618d = nVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        fq4.n nVar = this.f265618d;
        if (i17 == 0 && i18 == 0) {
            fq4.o oVar = nVar.f265620e;
            oVar.doScene(oVar.dispatcher(), nVar.f265620e.f265621d);
        } else {
            fq4.o oVar2 = nVar.f265620e;
            oVar2.f265621d.onSceneEnd(i17, i18, "", oVar2);
        }
    }
}
