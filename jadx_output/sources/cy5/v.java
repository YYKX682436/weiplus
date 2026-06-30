package cy5;

/* loaded from: classes13.dex */
public class v implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cy5.y f224917a;

    public v(cy5.y yVar) {
        this.f224917a = yVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        android.util.Pair pair = (android.util.Pair) obj;
        int intValue = ((java.lang.Integer) pair.first).intValue();
        cy5.y yVar = this.f224917a;
        if (intValue == 0) {
            try {
                java.lang.String[] split = ((java.lang.String) pair.second).split(":");
                if (split.length == 3) {
                    by5.s0.e(java.lang.Long.parseLong(split[0]), java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                by5.c4.d(yVar.m(), "idkeyReport parse failed, value:" + ((java.lang.String) pair.second) + ", error", th6);
                return;
            }
        }
        if (((java.lang.Integer) pair.first).intValue() == 1) {
            try {
                java.lang.String[] split2 = ((java.lang.String) pair.second).split(":");
                if (split2.length == 2) {
                    int parseInt = java.lang.Integer.parseInt(split2[0]);
                    java.lang.String str = split2[1];
                    if (parseInt == 17565 || parseInt == 17564) {
                        str = yVar.f224879a + "," + split2[1];
                    }
                    by5.s0.t(parseInt, str);
                }
            } catch (java.lang.Throwable th7) {
                by5.c4.d(yVar.m(), "setKVLog parse failed, value:" + ((java.lang.String) pair.second) + ", error", th7);
            }
        }
    }
}
