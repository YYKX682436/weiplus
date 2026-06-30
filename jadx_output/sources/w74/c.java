package w74;

/* loaded from: classes4.dex */
public class c implements g74.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f443523a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f443524b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f443525c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f443526d;

    /* renamed from: e, reason: collision with root package name */
    public final e74.h f443527e;

    public c(android.app.Activity activity, android.widget.TextView textView, androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (activity != null) {
            this.f443523a = new java.lang.ref.WeakReference(activity);
            this.f443527e = new f74.a(activity);
        }
        this.f443524b = textView;
        this.f443525c = recyclerView;
    }

    public void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        try {
            b(snsInfo, z17);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.TopicCardDynamic", "doDynamicRequest failed!!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        android.app.Activity activity;
        java.lang.String T;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDynamic", "Are you OK??? The input sns info or listener is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        e74.h hVar = this.f443527e;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDynamic", "Are you OK??? I think the activity is null, which is input in constructor!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        java.lang.String T2 = ca4.z0.T(snsInfo);
        if (android.text.TextUtils.isEmpty(T2) || "0".equals(T2)) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDynamic", "the sns id is empty!! Are you sure?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        java.lang.ref.WeakReference weakReference = this.f443523a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            activity = null;
        } else {
            activity = (android.app.Activity) weakReference.get();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
        }
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDynamic", "the context is null! Is activity destroyed?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager a17 = com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager.a(activity);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDynamic", "OK, i fu le you!!! the activity is not life cycle owner!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        g74.b bVar = a17.f163189d;
        if (bVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            if (android.text.TextUtils.isEmpty(T2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
            } else {
                java.util.HashMap hashMap = (java.util.HashMap) bVar.f269345a;
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap.get(T2);
                if (weakReference2 == null || weakReference2.get() != this) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            str = null;
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        if (entry != null && entry.getValue() == this) {
                            str = (java.lang.String) entry.getKey();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueToKey", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                            break;
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(str) && !str.equals(T2)) {
                        hashMap.remove(str);
                    }
                    hashMap.put(T2, new java.lang.ref.WeakReference(this));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.ResultWeakListenerCache");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.listener.RequestListenerManager");
        e74.i f17 = e74.i.f();
        if (f17 == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDynamic", "OK, i fule you!!! the request manager is null. Isn't the RequestManager singleton?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
            return;
        }
        this.f443526d = snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        if (snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.DynamicUpdate", "the sns info or request action is null, please check it !!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        } else {
            try {
                T = ca4.z0.T(snsInfo);
            } catch (java.lang.Throwable unused) {
            }
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                f74.a aVar = (f74.a) hVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("acquireActionType", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.action.TopicCardRequestAction");
                if (f17.g(T, 3, adXml.adDynamicUpdateInfo, z17)) {
                    aVar.b(0, snsInfo);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                } else {
                    com.tencent.mars.xlog.Log.i("SnsAd.DynamicUpdate", "the request is too frequently, snsId is " + T);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
                }
            }
            com.tencent.mars.xlog.Log.w("SnsAd.DynamicUpdate", "the sns id is empty, is it right?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestAction", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequestInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardDynamicRequestHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w74.c.c(java.lang.String, java.lang.Object):void");
    }
}
