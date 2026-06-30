package r64;

/* loaded from: classes4.dex */
public final class b implements q64.b, q64.a {

    /* renamed from: a, reason: collision with root package name */
    public p64.b f393064a;

    /* renamed from: b, reason: collision with root package name */
    public p64.a f393065b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy f393066c;

    public final void a(android.os.Bundle bundle) {
        java.lang.reflect.Method[] methods;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callbackFromServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        p64.a aVar = this.f393065b;
        if (bundle != null && aVar != null) {
            bundle.setClassLoader(r64.b.class.getClassLoader());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            p64.a aVar2 = this.f393065b;
            boolean z17 = false;
            if (aVar2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            } else {
                try {
                    methods = p64.a.class.getMethods();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("SimpleRemoteRequest", th6, "shouldCallbackToClientInMainThread error", new java.lang.Object[0]);
                }
                if (a84.b0.d(methods)) {
                    com.tencent.mars.xlog.Log.e("SimpleRemoteRequest", "shouldCallbackToClientInMainThread, the interface is empty!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                } else {
                    java.lang.reflect.Method method = aVar2.getClass().getMethod(methods[0].getName(), android.os.Bundle.class);
                    com.tencent.mars.xlog.Log.i("SimpleRemoteRequest", "shouldCallbackToClientInMainThread, onCallbackFromServerMethod is " + method);
                    if (method != null) {
                        o64.b bVar = (o64.b) method.getAnnotation(o64.b.class);
                        if (bVar != null) {
                            z17 = bVar.value();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                        } else {
                            com.tencent.mars.xlog.Log.e("SimpleRemoteRequest", "shouldCallbackToClientInMainThread, annotation is null");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                }
            }
            if (z17) {
                ((ku5.t0) ku5.t0.f312615d).B(new r64.a(this, aVar, bundle));
            } else {
                aVar.onCallbackFromServer(bundle);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callbackFromServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
    }

    public final android.os.Bundle b(q64.b bVar, android.os.Bundle bundle) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        if (bundle != null) {
            bundle.setClassLoader(r64.b.class.getClassLoader());
            java.lang.String k17 = com.tencent.mm.sdk.platformtools.c2.k(bundle, "key_server_class");
            if (!android.text.TextUtils.isEmpty(k17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                try {
                    obj = java.lang.Class.forName(k17).newInstance();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("SimpleRemoteRequest", th6, "objectFromString error", new java.lang.Object[0]);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    obj = null;
                }
                if (obj instanceof p64.b) {
                    com.tencent.mars.xlog.Log.i("SimpleRemoteRequest", "calledOnServer the onServer is called.");
                    android.os.Bundle a17 = ((p64.b) obj).a(bVar, bundle);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    return a17;
                }
                com.tencent.mars.xlog.Log.w("SimpleRemoteRequest", "calledOnServer the object is not IOnIPCServerCall" + k17);
            }
        }
        com.tencent.mars.xlog.Log.w("SimpleRemoteRequest", "calledOnServer the params is null ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return null;
    }

    public final android.os.Bundle c(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        android.os.Bundle bundle2 = null;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.w("SimpleRemoteRequest", "the input args is null, are you sure?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getServerName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        p64.b bVar = this.f393064a;
        if (bVar != null) {
            str = bVar.getClass().getName();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            str = "";
        }
        com.tencent.mars.xlog.Log.i("SimpleRemoteRequest", "put serverName = ".concat(str));
        bundle.putCharSequence("key_server_class", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callToRemoteServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy iPCRemoteProxy = this.f393066c;
        if (iPCRemoteProxy != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClassName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            java.lang.String name = r64.b.class.getName();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClassName", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            java.lang.Object REMOTE_CALL = iPCRemoteProxy.REMOTE_CALL("calledOnServer", name, bundle);
            if (REMOTE_CALL instanceof android.os.Bundle) {
                bundle2 = (android.os.Bundle) REMOTE_CALL;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callToRemoteServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                return bundle2;
            }
        }
        com.tencent.mars.xlog.Log.e("SimpleRemoteRequest", "callToRemoteServer return null with mRemoteProxy = " + this.f393066c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callToRemoteServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clientRequestToServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return bundle2;
    }

    public k55.e d() {
        k55.e eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy iPCRemoteProxy = this.f393066c;
        if (iPCRemoteProxy != null && (eVar = iPCRemoteProxy.f304464e) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            return eVar;
        }
        com.tencent.mars.xlog.Log.e("SimpleRemoteRequest", "getClientCallback return null with mRemoteProxy = " + this.f393066c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClientCallback", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return null;
    }

    public final void e(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy iPCRemoteProxy;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("serverResponseToClient", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        if (bundle != null && (iPCRemoteProxy = this.f393066c) != null) {
            iPCRemoteProxy.CLIENT_CALL("callbackFromServer", bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("serverResponseToClient", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
    }
}
