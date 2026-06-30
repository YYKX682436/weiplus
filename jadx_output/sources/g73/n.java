package g73;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f269306a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f269307b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f269308c;

    /* renamed from: d, reason: collision with root package name */
    public final g73.m f269309d;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
    }

    public n(android.os.Looper looper) {
        kotlin.jvm.internal.o.g(looper, "looper");
        this.f269306a = new java.util.LinkedHashMap();
        this.f269307b = new java.util.LinkedHashMap();
        this.f269308c = new java.util.LinkedHashMap();
        this.f269309d = new g73.m(looper, this);
    }

    public final int a(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        int dataType = handOff.getDataType();
        int i17 = 1;
        if (dataType == 1) {
            i17 = 4;
        } else if (dataType != 2) {
            if (dataType != 3) {
                i17 = dataType != 6 ? dataType != 7 ? 0 : 22 : 21;
            }
        } else if (handOff instanceof com.tencent.mm.plugin.handoff.model.HandOffURL) {
            java.lang.String url = ((com.tencent.mm.plugin.handoff.model.HandOffURL) handOff).getUrl();
            kotlin.jvm.internal.o.g(url, "<this>");
            if (!r26.i0.y(url, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s?", false)) {
                if (!r26.i0.y(url, "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s?", false)) {
                    if (!r26.i0.y(url, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s/", false)) {
                        if (!r26.i0.y(url, "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s/", false)) {
                            i17 = 0;
                        }
                    }
                }
            }
            i17 = i17 != 0 ? 26 : 2;
        } else {
            i17 = -1;
        }
        com.tencent.mars.xlog.Log.i("HandOff.RequestProcessor", "convert handoffType from " + handOff.getDataType() + " to " + i17);
        return i17;
    }
}
