package m21;

/* loaded from: classes4.dex */
public final class i implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.hd2 f322989a = new r45.hd2();

    @Override // m21.u
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        java.lang.String i17 = zy2.d5.i(b());
        kotlin.jvm.internal.o.f(i17, "makeLiveThemeContent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        return i17;
    }

    public r45.hd2 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        r45.hd2 hd2Var = this.f322989a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        return hd2Var;
    }
}
