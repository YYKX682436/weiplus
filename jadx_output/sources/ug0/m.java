package ug0;

/* loaded from: classes8.dex */
public final class m implements zy2.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ug0.q f427466a;

    public m(ug0.q qVar) {
        this.f427466a = qVar;
    }

    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f388487e;
        if (i17 >= 500000 && i17 < 599999) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            jbVar.t0(ctrInfo);
            j75.f Ai = this.f427466a.f300267d.Ai();
            if (Ai != null) {
                Ai.B3(new tg0.o2(jbVar));
            }
        }
        return false;
    }
}
