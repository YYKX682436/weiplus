package com.tencent.wechat.aff.local_connection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class ZIDL_tTtjjalFKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217355a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217356b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217357c = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_JI(byte[] bArr, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217355a;
        com.tencent.wechat.zlog.Zlog.a("NearConnectionManagerKE", "onConnectedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("NearConnectionManagerKE", "onConnectedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.local_connection.b bVar = (com.tencent.wechat.aff.local_connection.b) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            kp.o oVar = (kp.o) bVar;
            oVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", "Connected: ip = " + str + ", port = " + i17);
            gz.k kVar = oVar.f310804a.f310831d;
            if (kVar != null) {
                kVar.a(str, i17);
            }
        }
    }

    private void ZIDL_KI(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217356b;
        com.tencent.wechat.zlog.Zlog.a("NearConnectionManagerKE", "onDisconnectedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("NearConnectionManagerKE", "onDisconnectedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.local_connection.c cVar = (com.tencent.wechat.aff.local_connection.c) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            kp.p pVar = (kp.p) cVar;
            pVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", "Disconnected: reason = " + i17 + ", errMsg = " + str);
            gz.k kVar = pVar.f310810a.f310831d;
            if (kVar != null) {
                kVar.b(i17, str);
            }
        }
    }

    private void ZIDL_LI(int i17, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217357c;
        com.tencent.wechat.zlog.Zlog.a("NearConnectionManagerKE", "onConnectFailedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.tencent.wechat.zlog.Zlog.a("NearConnectionManagerKE", "onConnectFailedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.tencent.wechat.aff.local_connection.a aVar = (com.tencent.wechat.aff.local_connection.a) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            kp.q qVar = (kp.q) aVar;
            qVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", "ConnectFailed: reason = " + i17 + ", errMsg = " + str);
            gz.k kVar = qVar.f310813a.f310831d;
            if (kVar != null) {
                kVar.c(i17, str);
            }
        }
    }
}
