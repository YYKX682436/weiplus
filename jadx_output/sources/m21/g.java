package m21;

/* loaded from: classes4.dex */
public final class g implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.ev2 f322987a = new r45.ev2();

    @Override // m21.u
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        java.lang.String e17 = zy2.d5.e(b());
        kotlin.jvm.internal.o.f(e17, "makeContent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        return e17;
    }

    public r45.ev2 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        r45.ev2 ev2Var = this.f322987a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCollection", "com.tencent.mm.modelsns.SnsFinderShareCollection");
        return ev2Var;
    }
}
