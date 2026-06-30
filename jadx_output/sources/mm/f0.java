package mm;

/* loaded from: classes.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f328480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f328481e;

    public f0(long j17, int i17) {
        this.f328480d = j17;
        this.f328481e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        try {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("reported-crash-tids", 4);
            java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
            kotlin.jvm.internal.o.d(all);
            java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j17 = this.f328480d;
                if (!hasNext) {
                    break;
                }
                java.util.Map.Entry<java.lang.String, ?> next = it.next();
                java.lang.String key = next.getKey();
                java.lang.Object value = next.getValue();
                long F1 = com.tencent.mm.sdk.platformtools.t8.F1(key, 0L);
                if (F1 >= j17 - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER && F1 < j17) {
                    kotlin.jvm.internal.o.d(value);
                    if (value instanceof java.lang.Integer) {
                        linkedHashMap.put(java.lang.String.valueOf(F1), value);
                    }
                }
            }
            linkedHashMap.put(java.lang.String.valueOf(j17), java.lang.Integer.valueOf(this.f328481e));
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                edit.putInt((java.lang.String) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue());
            }
            edit.commit();
            com.tencent.mars.xlog.Log.i("MiroMsg.proc.ProcLifeTracker", "noteReportedPidList: " + linkedHashMap.values());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MiroMsg.proc.ProcLifeTracker", "noteReportedPidList err: " + e17);
        }
    }
}
