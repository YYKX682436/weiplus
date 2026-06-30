package vd2;

@j95.b
/* loaded from: classes2.dex */
public final class p2 extends i95.w implements ss5.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f435851d = "Finder.FinderLivePreloadFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Vector f435852e = new java.util.Vector();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Vector f435853f = new java.util.Vector();

    public final java.lang.String wi(r45.nw1 nw1Var) {
        ko0.t tVar = ko0.t.f309903a;
        java.lang.String string = nw1Var.getString(3);
        if (string == null) {
            string = "";
        }
        java.lang.String d17 = tVar.d(string);
        java.lang.String u17 = pm0.v.u(nw1Var.getLong(0));
        if ((d17 == null || d17.length() == 0) || kotlin.jvm.internal.o.b(u17, "0")) {
            return null;
        }
        return u17 + '_' + d17;
    }
}
