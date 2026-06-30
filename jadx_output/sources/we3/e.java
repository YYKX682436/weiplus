package we3;

@j95.b
/* loaded from: classes11.dex */
public final class e extends i95.w implements ve3.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f445272d = new java.util.HashMap();

    @Override // ve3.r
    public void G1(int i17, ve3.o callback) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.HashMap hashMap = this.f445272d;
        we3.k kVar = (we3.k) hashMap.get(java.lang.Integer.valueOf(i17));
        if (kVar != null) {
            kVar.d();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            ve3.o.a(callback, null, 1, null);
            hashMap.remove(java.lang.Integer.valueOf(i17));
            return;
        }
        ((xd3.c) callback).b(-1, "id: " + i17 + " not contain in current playIdList");
    }

    @Override // ve3.r
    public boolean H1(int i17) {
        return !this.f445272d.containsKey(java.lang.Integer.valueOf(i17));
    }

    @Override // ve3.r
    public void Id(int i17, org.json.JSONObject extraData, android.view.Surface surface, ve3.o callback) {
        kotlin.jvm.internal.o.g(extraData, "extraData");
        kotlin.jvm.internal.o.g(surface, "surface");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.HashMap hashMap = this.f445272d;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBExternalFinderLive", "id duplicated, registerFinderLiveTexture failed, id: " + i17);
            ((xd3.c) callback).b(-1, "id duplicated, registerFinderLiveTexture failed, id: " + i17);
            return;
        }
        java.lang.String optString = extraData.optString("finder_export_id");
        java.lang.String optString2 = extraData.optString("finder_object_id");
        int optInt = extraData.optInt("containerWidth");
        int optInt2 = extraData.optInt("containerHeight");
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        we3.k kVar = new we3.k(optString, optString2, i17, optInt, optInt2);
        hashMap.put(java.lang.Integer.valueOf(i17), kVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOutsideSurface, width:");
        int i18 = kVar.f445281c;
        sb6.append(i18);
        sb6.append(", height: ");
        int i19 = kVar.f445282d;
        sb6.append(i19);
        sb6.append(", playId: ");
        sb6.append(kVar.f445280b);
        com.tencent.mars.xlog.Log.i("MicroMsg.MBFinderLivePlayerItem", sb6.toString());
        ((nn0.c) kVar.f445283e).v(surface, i18, i19);
        if (!extraData.optBoolean("autoPlay", true)) {
            ve3.o.a(callback, null, 1, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBExternalFinderLive", "autoPlay trigger startPlay");
            kVar.e(callback);
        }
    }

    @Override // ve3.r
    public void R7(int i17, ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        we3.k kVar = (we3.k) this.f445272d.get(java.lang.Integer.valueOf(i17));
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBExternalFinderLive", "startPlay, playId: " + kVar.f445280b);
            kVar.e(callback);
        } else {
            kVar = null;
        }
        if (kVar == null) {
            ((xd3.c) callback).b(-1, "no item, start play failed, please register again, id: " + i17);
        }
    }

    @Override // ve3.r
    public void r4(int i17, ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        we3.k kVar = (we3.k) this.f445272d.get(java.lang.Integer.valueOf(i17));
        if (kVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlay, playId: ");
            int i18 = kVar.f445280b;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.MBExternalFinderLive", sb6.toString());
            mn0.b0 b0Var = kVar.f445283e;
            if (((mn0.y) b0Var).b(false)) {
                kVar.f445284f = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MBFinderLivePlayerItem", "stopPlay, playId: " + i18);
                mn0.b0.C(b0Var, false, false, false, 6, null);
                ve3.o.a(callback, null, 1, null);
            } else {
                ((xd3.c) callback).b(-1, "not playing");
            }
        } else {
            kVar = null;
        }
        if (kVar == null) {
            ((xd3.c) callback).b(-1, "no item, stop play failed id: " + i17);
        }
    }
}
