package nq1;

/* loaded from: classes11.dex */
public final /* synthetic */ class x$$c implements ak0.m {
    @Override // ak0.m
    public final int a(java.io.File file) {
        ak0.e a17 = ak0.g.a(file);
        if (a17 == null) {
            return -24;
        }
        java.lang.String property = ((ak0.f) a17).f5537a.getProperty("patch.basepack.client.ver");
        return (property == null || !property.equalsIgnoreCase(lp0.a.f320249c)) ? -25 : 0;
    }
}
