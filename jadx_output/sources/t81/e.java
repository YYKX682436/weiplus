package t81;

/* loaded from: classes4.dex */
public class e extends qj1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f416357e = {l75.n0.getCreateSQLs(t81.f.f416359y, "PredownloadIssueLaunchWxaAppResponse")};

    public e(l75.k0 k0Var) {
        super(k0Var, t81.f.f416359y, "PredownloadIssueLaunchWxaAppResponse", dm.p9.f239219n);
    }

    public boolean y0(byte[] bArr, java.lang.String str, java.util.List list, long j17, long j18) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, invalid input %s", str);
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, empty sceneList", str);
            return false;
        }
        java.util.Iterator it = list.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            t81.f fVar = new t81.f();
            fVar.field_appId = str;
            fVar.field_scene = intValue;
            boolean z18 = get(fVar, new java.lang.String[0]);
            fVar.field_launchProtoBlob = bArr;
            fVar.field_startTime = j17;
            fVar.field_endTime = j18;
            z17 &= z18 ? update(fVar, new java.lang.String[0]) : insert(fVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, sceneList %d, setOk %b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
