package gz1;

/* loaded from: classes13.dex */
public final class c implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (obj instanceof androidx.fragment.app.Fragment) {
            if (!kotlin.jvm.internal.o.b(str2, gz1.d.f277721n)) {
                if (kotlin.jvm.internal.o.b(str2, gz1.d.f277722o)) {
                    com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "chatting fragment onPause");
                    gz1.d.f277714d.p((androidx.fragment.app.Fragment) obj, false);
                    return;
                }
                return;
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
            if (!fragment.isResumed() || fragment.isHidden()) {
                return;
            }
            gz1.d dVar = gz1.d.f277714d;
            if (gz1.d.f277724q == null) {
                gz1.d.f277724q = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_sdk_filter_chatting, false));
                com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "isFilterFirstChattingUI : " + gz1.d.f277724q);
            }
            java.lang.Boolean bool = gz1.d.f277724q;
            if ((bool != null ? bool.booleanValue() : false) && gz1.d.f277725r) {
                gz1.d.f277725r = false;
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz1.d.f277717g;
            if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(fragment.hashCode()))) {
                concurrentHashMap.put(java.lang.Integer.valueOf(fragment.hashCode()), new gz1.b(new java.lang.ref.WeakReference(obj), true));
            }
            com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "chatting fragment onResume");
            dVar.s(fragment);
        }
    }
}
