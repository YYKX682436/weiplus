package com.tencent.mm.plugin.mmsight.model;

/* loaded from: classes10.dex */
public class CaptureMMProxy extends k55.b implements r90.i {

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.plugin.mmsight.model.CaptureMMProxy f148833g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f148834h = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f148835f;

    public CaptureMMProxy(k55.k kVar) {
        super(kVar);
        this.f148835f = false;
    }

    public static void createProxy(com.tencent.mm.plugin.mmsight.model.CaptureMMProxy captureMMProxy) {
        f148833g = captureMMProxy;
    }

    public static com.tencent.mm.plugin.mmsight.model.CaptureMMProxy getInstance() {
        return f148833g;
    }

    public boolean checkUseMMVideoPlayer() {
        java.lang.Object REMOTE_CALL = REMOTE_CALL("checkUseMMVideoPlayerInMM", new java.lang.Object[0]);
        if (REMOTE_CALL == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayer[%b]", REMOTE_CALL);
        return ((java.lang.Boolean) REMOTE_CALL).booleanValue();
    }

    @k55.m
    public boolean checkUseMMVideoPlayerInMM() {
        d11.s.fj();
        d11.s.Ai();
        return true;
    }

    public void clearArtistCache() {
        REMOTE_CALL("clearArtistCacheInMM", new java.lang.Object[0]);
    }

    @k55.m
    public void clearArtistCacheInMM() {
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        new rj.l().a();
    }

    @Override // k55.b
    public android.os.Bundle d(java.lang.Object... objArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        int length = objArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            if (obj instanceof android.os.Bundle) {
                bundle.putBundle("" + i17, (android.os.Bundle) objArr[i17]);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable("" + i17, (android.os.Parcelable) objArr[i17]);
            } else if (obj instanceof com.tencent.mm.storage.u3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "objectsToBundle: %s", java.lang.Integer.valueOf(((com.tencent.mm.storage.u3) obj).ordinal()));
                bundle.putInt("" + i17, ((com.tencent.mm.storage.u3) objArr[i17]).ordinal());
            } else {
                bundle.putSerializable("" + i17, (java.io.Serializable) objArr[i17]);
            }
        }
        return bundle;
    }

    public java.lang.Object get(com.tencent.mm.storage.u3 u3Var, java.lang.Object obj) {
        if (!this.f148835f || gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "get %s %s", u3Var, obj);
            java.lang.Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", u3Var, obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "get %s %s and get val %s", u3Var, obj, REMOTE_CALL);
            return REMOTE_CALL == null ? obj : REMOTE_CALL;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "account not ready, return getBoolean default: " + obj);
        return obj;
    }

    public java.lang.String getAccVideoPath() {
        java.lang.String str;
        if (!this.f148835f || gm0.j1.b().m()) {
            str = (java.lang.String) REMOTE_CALL("getAccVideoPathInMM", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM " + str + " accVideoPath: " + f148834h);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "account not ready, use temp getAccVideoPath: ");
            str = lp0.b.h0("/temp_capture_video").o();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            f148834h = str;
        }
        return !com.tencent.mm.sdk.platformtools.t8.K0(f148834h) ? f148834h : str;
    }

    @k55.m
    public java.lang.String getAccVideoPathInMM() {
        return t21.o2.Bi().Ai();
    }

    public boolean getBoolean(com.tencent.mm.storage.u3 u3Var, boolean z17) {
        if (!this.f148835f || gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s", u3Var, java.lang.Boolean.valueOf(z17));
            java.lang.Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", u3Var, java.lang.Boolean.valueOf(z17));
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s and get val %s", u3Var, java.lang.Boolean.valueOf(z17), REMOTE_CALL);
            return REMOTE_CALL == null ? z17 : com.tencent.mm.sdk.platformtools.t8.y(REMOTE_CALL.toString(), z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "account not ready, return getBoolean default: " + z17);
        return z17;
    }

    @k55.m
    public java.lang.Object getConfigStorage(int i17, java.lang.Object obj) {
        com.tencent.mm.storage.u3 u3Var = ((com.tencent.mm.storage.u3[]) com.tencent.mm.storage.u3.class.getEnumConstants())[i17];
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getConfigStorage, %s %s", u3Var, obj);
        gm0.j1.i();
        return gm0.j1.u().c().m(u3Var, obj);
    }

    public java.lang.String getDeviceInfoConfig() {
        java.lang.String str = (java.lang.String) REMOTE_CALL("getDeviceInfoConfigInMM", new java.lang.Object[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getDeviceInfoConfig return: %s", str);
        return str;
    }

    @k55.m
    public java.lang.String getDeviceInfoConfigInMM() {
        gm0.j1.i();
        return gm0.j1.u().j().n0(77825);
    }

    @Override // r90.i
    public java.lang.String getDynamicConfig(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) REMOTE_CALL("getDynamicConfigInMM", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getDynamicConfig, key: %s, value: %s", str, str2);
        return str2;
    }

    @k55.m
    public java.lang.String getDynamicConfigInMM(java.lang.String str) {
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
    }

    public com.tencent.mm.modelcontrol.VideoTransPara getGameVideoTransPara(int i17) {
        android.os.Parcelable parcelable = (android.os.Parcelable) REMOTE_CALL("getGameVideoTransParaInMM", java.lang.Integer.valueOf(i17));
        java.util.Objects.toString(parcelable);
        return (com.tencent.mm.modelcontrol.VideoTransPara) parcelable;
    }

    @k55.m
    public com.tencent.mm.modelcontrol.VideoTransPara getGameVideoTransParaInMM(int i17) {
        com.tencent.mm.modelcontrol.VideoTransPara mj6 = d11.s.fj().mj(i17);
        mj6.toString();
        return mj6;
    }

    public int getInt(com.tencent.mm.storage.u3 u3Var, int i17) {
        if (!this.f148835f || gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getInt %s %s", u3Var, java.lang.Integer.valueOf(i17));
            java.lang.Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", u3Var, java.lang.Integer.valueOf(i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getInt %s %s and get val %s", u3Var, java.lang.Integer.valueOf(i17), REMOTE_CALL);
            return REMOTE_CALL == null ? i17 : com.tencent.mm.sdk.platformtools.t8.P(REMOTE_CALL.toString(), i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "account not ready, return default: " + i17);
        return i17;
    }

    public com.tencent.mm.modelcontrol.VideoTransPara getSnsAlbumVideoTransPara() {
        android.os.Parcelable parcelable = (android.os.Parcelable) REMOTE_CALL("getSnsAlbumVideoTransParaInMM", new java.lang.Object[0]);
        java.util.Objects.toString(parcelable);
        return (com.tencent.mm.modelcontrol.VideoTransPara) parcelable;
    }

    @k55.m
    public com.tencent.mm.modelcontrol.VideoTransPara getSnsAlbumVideoTransParaInMM() {
        com.tencent.mm.modelcontrol.VideoTransPara nj6 = d11.s.fj().nj();
        nj6.toString();
        return nj6;
    }

    public java.lang.String getSubCoreImageFullPath(java.lang.String str) {
        java.lang.String str2 = (java.lang.String) REMOTE_CALL("getSubCoreImageFullPathInMM", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPath " + str2);
        return str2;
    }

    @k55.m
    public java.lang.String getSubCoreImageFullPathInMM(java.lang.String str) {
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).Zi(null, bm5.f0.f22561f, str);
    }

    public byte[] getWeixinMeta() {
        byte[] bArr = (byte[]) REMOTE_CALL("getWeixinMetaDataInMM", new java.lang.Object[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "getWeixinMeta result: %s", bArr);
        return bArr;
    }

    @k55.m
    public byte[] getWeixinMetaDataInMM() {
        return d11.s.fj().sj();
    }

    @Override // k55.b, k55.e
    public void onCallback(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        java.lang.reflect.Method method;
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "class:%s, method:%s, clientCall:%B", getClass().getName(), str, java.lang.Boolean.valueOf(z17));
        try {
            java.lang.reflect.Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    method = null;
                    break;
                }
                method = methods[i17];
                if (method.getName().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (method != null) {
                if (method.isAnnotationPresent(z17 ? k55.l.class : k55.m.class)) {
                    java.lang.Object invoke = method.invoke(this, getArgs(bundle));
                    if (method.getReturnType() != java.lang.Void.TYPE) {
                        if (invoke instanceof android.os.Parcelable) {
                            bundle.putParcelable("result_key", (android.os.Parcelable) invoke);
                            return;
                        }
                        if ("getConfigStorage".equals(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "put result as Serializable: %s", (java.io.Serializable) invoke);
                        }
                        bundle.putSerializable("result_key", (java.io.Serializable) invoke);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.CaptureMMProxy", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public boolean set(com.tencent.mm.storage.u3 u3Var, java.lang.Object obj) {
        if (!this.f148835f || gm0.j1.b().m()) {
            return ((java.lang.Boolean) REMOTE_CALL("setConfigStorage", u3Var, obj)).booleanValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "account not ready, abort set: " + u3Var + " -> " + obj);
        return false;
    }

    public void setCompatNotLogin(boolean z17) {
        this.f148835f = z17;
    }

    @k55.m
    public boolean setConfigStorage(int i17, java.lang.Object obj) {
        com.tencent.mm.storage.u3 u3Var = ((com.tencent.mm.storage.u3[]) com.tencent.mm.storage.u3.class.getEnumConstants())[i17];
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", u3Var, obj);
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, obj);
        return true;
    }

    public boolean useMediaRecordNew() {
        java.lang.Object REMOTE_CALL = REMOTE_CALL("useMediaRecordNewInMM", new java.lang.Object[0]);
        if (REMOTE_CALL == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptureMMProxy", "useMediaRecordNewInMM[%b]", REMOTE_CALL);
        return ((java.lang.Boolean) REMOTE_CALL).booleanValue();
    }

    @k55.m
    public java.lang.Boolean useMediaRecordNewInMM() {
        return java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true));
    }
}
