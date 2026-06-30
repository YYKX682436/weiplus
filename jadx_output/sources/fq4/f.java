package fq4;

/* loaded from: classes12.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.g f265592d;

    public f(fq4.g gVar) {
        this.f265592d = gVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        fq4.g gVar = this.f265592d;
        if (i17 == 0 && i18 == 0) {
            fq4.h hVar = gVar.f265594e;
            hVar.doScene(hVar.dispatcher(), gVar.f265594e.f265598d);
        } else {
            fq4.h hVar2 = gVar.f265594e;
            hVar2.f265598d.onSceneEnd(i17, i18, "", hVar2);
        }
    }
}
