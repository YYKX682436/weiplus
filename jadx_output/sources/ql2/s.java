package ql2;

/* loaded from: classes10.dex */
public final class s implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql2.u f364553a;

    public s(ql2.u uVar) {
        this.f364553a = uVar;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        ql2.u uVar = this.f364553a;
        uVar.f364557c = i17;
        java.lang.ref.WeakReference weakReference = uVar.f364558d;
        uVar.s(weakReference != null ? (android.widget.ImageView) weakReference.get() : null);
        uVar.getClass();
        if (i17 == 1) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.B;
            ml2.v1 v1Var = ml2.v1.f328140e;
            concurrentHashMap.put("live_enter_status", 1L);
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = p52.h.B;
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            concurrentHashMap2.put("live_enter_status", 2L);
        }
    }
}
