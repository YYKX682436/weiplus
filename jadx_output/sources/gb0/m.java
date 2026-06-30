package gb0;

/* loaded from: classes8.dex */
public final class m implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb0.n f269967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269968b;

    public m(gb0.n nVar, java.lang.String str) {
        this.f269967a = nVar;
        this.f269968b = str;
    }

    @Override // zh1.a1
    public final void a(boolean z17, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection) {
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgService", "onOpenMaterialsGot success:" + z17 + " openMaterialCollection:" + openMaterialCollection);
        java.lang.String str = this.f269968b;
        gb0.n nVar = this.f269967a;
        if (!z17 || openMaterialCollection.f86252g.size() <= 0) {
            fb0.j jVar = nVar.f269970e;
            if (jVar != null) {
                ((com.tencent.mm.ui.chatting.component.pi) jVar).a(false);
            }
            nVar.f269971f.put(str, java.lang.Boolean.FALSE);
            return;
        }
        fb0.j jVar2 = nVar.f269970e;
        if (jVar2 != null) {
            ((com.tencent.mm.ui.chatting.component.pi) jVar2).a(true);
        }
        nVar.f269971f.put(str, java.lang.Boolean.TRUE);
    }
}
