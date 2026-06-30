package jm3;

/* loaded from: classes10.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.t3 f300343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, com.tencent.mm.plugin.mv.ui.view.t3 t3Var) {
        super(0);
        this.f300342d = musicMvMakerUI;
        this.f300343e = t3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI activity = this.f300342d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        h4Var.getClass();
        com.tencent.mm.plugin.mv.ui.view.t3 data = this.f300343e;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "updateFinderItem:" + data);
        java.util.ArrayList arrayList = h4Var.f151161e;
        if (arrayList.size() != 0) {
            int i17 = h4Var.f151167n.f151864m;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            fm3.q qVar2 = new fm3.q();
            fm3.h hVar = fm3.q.f264104p;
            hVar.c(qVar, qVar2);
            java.lang.Object obj2 = h4Var.f151162f.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            qVar2.f264114o = qVar;
            arrayList.set(i17, qVar2);
            hVar.a(data, qVar2);
            fm3.g0.f264070a.b(i17, qVar2);
            h4Var.T6(i17, qVar2, new com.tencent.mm.plugin.mv.ui.uic.f4(h4Var, i17, qVar2));
        }
        ((com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).f151174u = true;
        return jz5.f0.f302826a;
    }
}
