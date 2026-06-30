package com.tencent.mm.plugin.story.proxy;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0007J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002J \u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016RD\u0010\u001e\u001a$\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/story/proxy/StoryCaptureProxy;", "Lk55/b;", "", "", "getAccPath", "getAccPathRemote", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoPara", "getVideoParaRemote", "Lcom/tencent/mm/storage/u3;", "key", "defva", "Ljz5/f0;", "set", "get", "methodName", "Landroid/os/Bundle;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "clientCall", "onCallback", "Lkotlin/Function4;", "", "Lr45/jh4;", "f", "Lyz5/r;", "getMusicCallback", "()Lyz5/r;", "setMusicCallback", "(Lyz5/r;)V", "musicCallback", "Lk55/k;", "serverProxy", "<init>", "(Lk55/k;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryCaptureProxy extends k55.b {

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.plugin.story.proxy.StoryCaptureProxy f171860g;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.r musicCallback;

    public StoryCaptureProxy(k55.k kVar) {
        super(kVar);
    }

    public static final /* synthetic */ java.lang.String access$getTAG$cp() {
        return "MicroMsg.StoryCaptureProxy";
    }

    public static final void createInstance(k55.k kVar) {
        f171860g = new com.tencent.mm.plugin.story.proxy.StoryCaptureProxy(kVar);
    }

    public java.lang.Object get(com.tencent.mm.storage.u3 key, java.lang.Object defva) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defva, "defva");
        com.tencent.mm.storage.u3[] u3VarArr = (com.tencent.mm.storage.u3[]) com.tencent.mm.storage.u3.class.getEnumConstants();
        com.tencent.mm.storage.u3 u3Var = u3VarArr != null ? u3VarArr[key.ordinal()] : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCaptureProxy", "getConfigStorage, %s %s", u3Var, defva);
        java.lang.Object m17 = gm0.j1.u().c().m(u3Var, defva);
        kotlin.jvm.internal.o.f(m17, "get(...)");
        return m17;
    }

    public java.lang.String getAccPath() {
        return REMOTE_CALL("getAccPathRemote", new java.lang.Object[0]).toString();
    }

    @k55.m
    public final java.lang.String getAccPathRemote() {
        java.lang.String d17 = gm0.j1.u().d();
        kotlin.jvm.internal.o.f(d17, "getExternalAccountPath(...)");
        return d17;
    }

    public final yz5.r getMusicCallback() {
        return this.musicCallback;
    }

    public com.tencent.mm.modelcontrol.VideoTransPara getVideoPara() {
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = (com.tencent.mm.modelcontrol.VideoTransPara) REMOTE_CALL("getVideoParaRemote", new java.lang.Object[0]);
        kotlin.jvm.internal.o.d(videoTransPara);
        return videoTransPara;
    }

    @k55.m
    public final com.tencent.mm.modelcontrol.VideoTransPara getVideoParaRemote() {
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        return d11.s.fj().rj();
    }

    @Override // k55.b, k55.e
    public void onCallback(java.lang.String methodName, android.os.Bundle data, boolean z17) {
        java.lang.reflect.Method method;
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCaptureProxy", "class:%s, method:%s, clientCall:%B", com.tencent.mm.plugin.story.proxy.StoryCaptureProxy.class.getName(), methodName, java.lang.Boolean.valueOf(z17));
        try {
            java.lang.reflect.Method[] methods = com.tencent.mm.plugin.story.proxy.StoryCaptureProxy.class.getMethods();
            kotlin.jvm.internal.o.d(methods);
            int length = methods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    method = null;
                    break;
                }
                method = methods[i17];
                if (r26.i0.p(method.getName(), methodName, true)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (method != null) {
                if (method.isAnnotationPresent(z17 ? k55.l.class : k55.m.class)) {
                    java.lang.Object[] args = getArgs(data);
                    java.lang.Object invoke = method.invoke(this, java.util.Arrays.copyOf(args, args.length));
                    if (kotlin.jvm.internal.o.b(method.getReturnType(), java.lang.Void.TYPE)) {
                        return;
                    }
                    if (invoke instanceof android.os.Parcelable) {
                        data.putParcelable("result_key", (android.os.Parcelable) invoke);
                    } else {
                        kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type java.io.Serializable");
                        data.putSerializable("result_key", (java.io.Serializable) invoke);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.StoryCaptureProxy", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public void set(com.tencent.mm.storage.u3 key, java.lang.Object defva) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defva, "defva");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCaptureProxy", "get %s %s", key, defva);
        com.tencent.mm.storage.u3[] u3VarArr = (com.tencent.mm.storage.u3[]) com.tencent.mm.storage.u3.class.getEnumConstants();
        com.tencent.mm.storage.u3 u3Var = u3VarArr != null ? u3VarArr[key.ordinal()] : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCaptureProxy", "setConfigStorage, %s %s", u3Var, defva);
        gm0.j1.u().c().x(u3Var, defva);
    }

    public final void setMusicCallback(yz5.r rVar) {
        this.musicCallback = rVar;
    }
}
