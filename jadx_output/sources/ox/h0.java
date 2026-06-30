package ox;

@j95.b
/* loaded from: classes4.dex */
public final class h0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f349483d = new java.util.concurrent.ConcurrentHashMap();

    public final java.lang.Long Ai(java.lang.String poiId) {
        java.lang.Long l17;
        kotlin.jvm.internal.o.g(poiId, "poiId");
        if ((poiId.length() == 0) || (l17 = (java.lang.Long) this.f349483d.get(poiId)) == null) {
            return null;
        }
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - l17.longValue());
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        wi();
    }

    public final void wi() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f349483d;
        if (!concurrentHashMap.isEmpty()) {
            int size = concurrentHashMap.size();
            concurrentHashMap.clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishMonitor", "clearAll: cleared " + size + " monitoring records");
        }
    }
}
