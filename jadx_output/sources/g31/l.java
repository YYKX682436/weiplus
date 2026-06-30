package g31;

/* loaded from: classes9.dex */
public abstract class l implements e31.k {

    /* renamed from: h, reason: collision with root package name */
    public static final g31.a f268085h = new g31.a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f268086i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f268087j = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final k31.a f268088a;

    /* renamed from: b, reason: collision with root package name */
    public final k31.b f268089b;

    /* renamed from: c, reason: collision with root package name */
    public final g31.p f268090c;

    /* renamed from: d, reason: collision with root package name */
    public final g31.y f268091d;

    /* renamed from: e, reason: collision with root package name */
    public final g31.c0 f268092e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f268093f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f268094g;

    public l(k31.a aVar) {
        g31.d dVar = new g31.d(this);
        this.f268088a = aVar;
        this.f268089b = new k31.b(aVar);
        this.f268090c = new g31.p(this);
        g31.y yVar = new g31.y(aVar);
        this.f268091d = yVar;
        java.lang.String key = java.lang.String.valueOf(hashCode());
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Map map = yVar.f268132d;
        map.put(key, dVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeSwitchInfoBatchFetcher", "registerCallback: key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
        this.f268092e = new g31.c0(aVar);
        this.f268094g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.mmbiz_service_biz_auto_notify_enable, false);
    }

    public static final void j(g31.l lVar, java.lang.String str, e31.j jVar) {
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "onUpdatedWrapper templateId: %s, isSubscribed: %b, switchOpen: %b, isShowVoipSetting: %b", str, java.lang.Boolean.valueOf(jVar.f247075a), java.lang.Boolean.valueOf(jVar.f247076b), java.lang.Boolean.valueOf(jVar.f247085k));
        lVar.k(str, new g31.g(str, jVar));
        lVar.r(new g31.h(str, jVar));
    }

    @Override // e31.k
    public void a(java.lang.String bizUsername, java.util.List subscribeMsgList, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(subscribeMsgList, "subscribeMsgList");
        this.f268089b.a(bizUsername, subscribeMsgList, z17, z18, z19);
    }

    @Override // e31.k
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle extra) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extra, "extra");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "clickSubscribeMsgSpan bizUsername: %s, url: %s", str, str2);
        if (str == null || str2 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.class);
        intent.putExtra("key_biz_username", str);
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_subscribe_url", str2);
        intent.putExtra("key_action", 3);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
        intent.putExtra("key_extra_info", jSONObject.toString());
        intent.putExtras(extra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "clickSubscribeMsgSpan", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "clickSubscribeMsgSpan", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // e31.k
    public void d(java.lang.String bizUsername, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        q(bizUsername, templateId, 0);
    }

    @Override // e31.k
    public void f(java.lang.String bizUsername, boolean z17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "updateLocalSwitchOpened bizUsername: %s, switchOpened: %b", bizUsername, java.lang.Boolean.valueOf(z17));
        k31.b bVar = this.f268089b;
        bVar.getClass();
        bVar.a(bizUsername, new java.util.ArrayList(), z17, true, false);
    }

    @Override // e31.k
    public void g(android.content.Context context, int i17, int i18, java.lang.String bizAppId, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizAppId, "bizAppId");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "requestSubscribeMsgForResult scene: %d, bizAppId: %s, requestCode: %s", java.lang.Integer.valueOf(i17), bizAppId, java.lang.Integer.valueOf(i18));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.msgsubscription.ui.SubscribeMsgRequestProxyUI.class);
        intent.putExtra("key_need_result", true);
        intent.putExtra("key_biz_app_id", bizAppId);
        intent.putExtra("key_scene", i17);
        intent.putExtra("key_action", 3);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseSubscribeMsgService", "requestSubscribeMsgForResult context is not activity");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/msgsubscription/model/SubscribeMsgService", "requestSubscribeMsgForResult", "(Landroid/content/Context;IILjava/lang/String;Landroid/os/Bundle;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // e31.k
    public void h(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem tmpItem, e31.i iVar) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(tmpItem, "tmpItem");
        g31.j jVar = new g31.j(this, tmpItem, iVar);
        g31.p pVar = this.f268090c;
        pVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeStatusUpdateManager", "switchSubscribeStatus templateId: %s, settingStatus: %d, switchOpened: %b", tmpItem.f71803f, java.lang.Integer.valueOf(tmpItem.f71807m), java.lang.Boolean.valueOf(tmpItem.f71808n));
        java.util.ArrayList d17 = kz5.c0.d(tmpItem);
        e31.k kVar = pVar.f268107b;
        if (kVar != null) {
            e31.k.i(kVar, bizUsername, d17, false, false, false, 4, null);
        }
        e31.o oVar = new e31.o();
        oVar.f247089a = bizUsername;
        ((java.util.ArrayList) oVar.f247091c).addAll(d17);
        oVar.f247092d = tmpItem.f71808n;
        oVar.f247097i = new g31.o(tmpItem, pVar, jVar, bizUsername);
        if (kVar != null) {
            ((g31.l) kVar).x(oVar);
        }
    }

    public final void k(java.lang.String str, yz5.l lVar) {
        java.util.HashMap hashMap = (java.util.HashMap) f268086i.get(str);
        java.util.Set keySet = hashMap != null ? hashMap.keySet() : null;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = keySet != null ? java.lang.Integer.valueOf(keySet.size()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "callbackWrapper templateId: %s, callback size: %s", objArr);
        if (keySet != null) {
            java.util.Iterator it = keySet.iterator();
            while (it.hasNext()) {
                lVar.invoke(hashMap.get((java.lang.String) it.next()));
            }
        }
    }

    public int l(java.lang.String bizUsername) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        if (this.f268088a == null || (num = (java.lang.Integer) k31.h.f303842d.get(bizUsername)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public void m(java.lang.String username, e31.l lVar) {
        kotlin.jvm.internal.o.g(username, "username");
        k31.b bVar = this.f268089b;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgDataLoader", "getLocalSubscribeList username: %s", username);
        k31.a aVar = bVar.f303822a;
        if (aVar == null) {
            return;
        }
        k31.o.f303850a.b(aVar, new l31.j(username, aVar, lVar));
    }

    public boolean n(java.lang.String bizUsername) {
        java.lang.Boolean bool;
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        k31.b bVar = this.f268089b;
        bVar.getClass();
        if (bVar.f303822a == null || (bool = (java.lang.Boolean) k31.h.f303841c.get(bizUsername)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public com.tencent.mm.msgsubscription.SubscribeMsgTmpItem o(java.lang.String bizUsername, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        k31.b bVar = this.f268089b;
        bVar.getClass();
        if (bVar.f303822a != null) {
            return (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) k31.h.f303840b.get(bizUsername.concat(templateId));
        }
        return null;
    }

    public void p(java.lang.String username, e31.l lVar) {
        kotlin.jvm.internal.o.g(username, "username");
        k31.b bVar = this.f268089b;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgDataLoader", "getSubscribeMsgListByUsername %s", username);
        k31.a aVar = bVar.f303822a;
        if (aVar == null) {
            return;
        }
        k31.o.f303850a.b(aVar, new l31.e(username, aVar, lVar));
    }

    public void q(java.lang.String bizUsername, java.lang.String templateId, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        g31.c cVar = new g31.c(this, templateId);
        g31.p pVar = this.f268090c;
        pVar.getClass();
        e31.k kVar = pVar.f268107b;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem o17 = kVar != null ? ((g31.l) kVar).o(bizUsername, templateId) : null;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = o17;
        boolean n17 = kVar != null ? ((g31.l) kVar).n(bizUsername) : false;
        if (o17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeStatusUpdateManager", "isTemplateMsgSubscribed read from local");
            if (kVar != null) {
                ((g31.l) kVar).m(bizUsername, new g31.n(pVar, h0Var, templateId, i17, cVar));
                return;
            }
            return;
        }
        e31.j jVar = new e31.j(o17.f71807m == 1, n17);
        jVar.f247077c = o17.f71814t;
        jVar.f247078d = o17.f71815u;
        jVar.f247079e = o17.f71817w;
        jVar.f247080f = o17.f71818x;
        jVar.f247081g = o17.B;
        jVar.f247082h = o17.C;
        jVar.f247083i = i17;
        jVar.f247085k = o17.A;
        cVar.b(templateId, jVar);
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) h0Var.f310123d;
        g31.b bVar = new g31.b(bizUsername, templateId, subscribeMsgTmpItem != null ? subscribeMsgTmpItem.f71807m : -1, i17);
        bVar.f268065e = cVar;
        pVar.a(subscribeMsgTmpItem, bVar);
    }

    public final void r(yz5.l lVar) {
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f268093f).entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            e31.i iVar = (e31.i) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (iVar == null) {
                it.remove();
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "notifySubscribeStatusCallback: callback for key %s has been garbage collected", entry.getKey());
            } else {
                lVar.invoke(iVar);
            }
        }
    }

    public final void s(java.lang.String str, boolean z17, int i17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.util.Map map = f268087j;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "onNotifySwitchInfoCallback: username=%s, isOpened=%b, importantNotifyNum=%d, callbacks.size=%d", str, valueOf, valueOf2, java.lang.Integer.valueOf(map.size()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            if (((java.lang.ref.WeakReference) entry.getValue()).get() == null) {
                arrayList.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((java.lang.String) it.next());
        }
        if (!arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseSubscribeMsgService", "onNotifySwitchInfoCallback: removed %d dead callbacks: %s", java.lang.Integer.valueOf(arrayList.size()), arrayList);
        }
        for (java.util.Map.Entry entry2 : ((java.util.LinkedHashMap) map).entrySet()) {
            e31.h hVar = (e31.h) ((java.lang.ref.WeakReference) entry2.getValue()).get();
            if (hVar != null) {
                hVar.a(str, z17, i17);
            }
        }
    }

    public void t(java.lang.String key, e31.h callback) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Map map = f268087j;
        map.put(key, new java.lang.ref.WeakReference(callback));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "registerNotifySwitchInfoCallback: key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public void u(java.lang.String key, e31.i callback) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Map map = this.f268093f;
        map.put(key, new java.lang.ref.WeakReference(callback));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "[registerSubscribeStatusCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public void v(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Map map = f268087j;
        map.remove(key);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "unregisterNotifySwitchInfoCallback: key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public void w(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Map map = this.f268093f;
        map.remove(key);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "[unregisterGlobalCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
    }

    public long x(e31.o updateRequest) {
        kotlin.jvm.internal.o.g(updateRequest, "updateRequest");
        g31.k kVar = new g31.k(this);
        k31.b bVar = this.f268089b;
        bVar.getClass();
        k31.a aVar = bVar.f303822a;
        if (aVar == null) {
            return -1L;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgDataLoader", "updateSubscribeList username: " + updateRequest.f247089a + ", appId: " + updateRequest.f247090b + ", size: " + ((java.util.ArrayList) updateRequest.f247091c).size());
        l31.f0 f0Var = new l31.f0(updateRequest, aVar, kVar);
        f0Var.f315314b = updateRequest.f247098j;
        f0Var.f315315c = updateRequest.f247099k;
        k31.o.f303850a.b(aVar, f0Var);
        return f0Var.hashCode();
    }
}
