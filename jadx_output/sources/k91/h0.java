package k91;

/* loaded from: classes7.dex */
public abstract class h0 {
    public static final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        kotlin.jvm.internal.o.g(appBrandInitConfigWC, "<this>");
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
        launchParcel.f84901d = appBrandInitConfigWC.f47278x;
        launchParcel.f84902e = appBrandInitConfigWC.f77278d;
        int i17 = appBrandInitConfigWC.G2;
        int i18 = appBrandInitConfigWC.L;
        if (i17 > i18) {
            launchParcel.f84903f = i17;
        } else {
            launchParcel.f84903f = i18;
        }
        launchParcel.f84904g = appBrandInitConfigWC.f77281g;
        launchParcel.f84906i = appBrandInitConfigWC.f77283i;
        launchParcel.f84910o = appBrandInitConfigWC.f47269b2;
        launchParcel.f84911p = appBrandInitConfigWC.D;
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = new com.tencent.mm.modelappbrand.LaunchParamsOptional();
        launchParamsOptional.f70416e = appBrandInitConfigWC.C;
        launchParamsOptional.f70415d = appBrandInitConfigWC.B;
        launchParamsOptional.f70418g = appBrandInitConfigWC.E;
        launchParcel.f84914q = launchParamsOptional;
        launchParcel.f84918u = appBrandInitConfigWC.S;
        launchParcel.f84919v = appBrandInitConfigWC.T;
        launchParcel.f84920w = appBrandInitConfigWC.V;
        launchParcel.G = appBrandInitConfigWC.f77303p2;
        launchParcel.f84926y1 = appBrandInitConfigWC.f47285z1;
        launchParcel.H = appBrandInitConfigWC.L1;
        launchParcel.f84924y = appBrandInitConfigWC.f47272l1;
        return launchParcel;
    }
}
