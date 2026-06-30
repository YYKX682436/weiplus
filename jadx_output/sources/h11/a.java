package h11;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.b f278065d;

    public a(h11.b bVar) {
        this.f278065d = bVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        h11.b bVar = this.f278065d;
        if (i17 == 0 && i18 == 0) {
            h11.e eVar = bVar.f278067e;
            eVar.doScene(eVar.dispatcher(), bVar.f278067e.f278072e);
        } else {
            h11.e eVar2 = bVar.f278067e;
            eVar2.f278072e.onSceneEnd(i17, i18, "", eVar2);
        }
    }
}
