package vp3;

/* loaded from: classes12.dex */
public final /* synthetic */ class c$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.Integer, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker> entry : com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.getTrackingMap().entrySet()) {
            com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker value = entry.getValue();
            java.lang.String str = android.text.TextUtils.isEmpty(value.stack) ? value.scene : value.stack;
            java.util.List list = (java.util.List) hashMap.get(str);
            if (list == null) {
                list = new java.util.ArrayList();
                hashMap.put(str, list);
            }
            list.add(entry.getKey());
        }
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            com.tencent.mars.xlog.Log.i(vp3.c.f438969r, "TP count of stack: %s, id: %s, stack: %s", java.lang.Integer.valueOf(((java.util.List) entry2.getValue()).size()), entry2.getValue(), entry2.getKey());
        }
        if (hashMap.isEmpty()) {
            return;
        }
        ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).wi();
    }
}
