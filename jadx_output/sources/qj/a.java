package qj;

/* loaded from: classes12.dex */
public class a implements wu5.j {
    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "SyncBarrierWatchDogPlus";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (qj.c.f363863g) {
            try {
                try {
                    java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
                } finally {
                    qj.c.f363863g = true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("timerTask run error, message : %s", e17.getMessage());
            }
            if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
                com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "check Sync Barrier");
                android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
                java.lang.reflect.Field declaredField = queue.getClass().getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                android.os.Message message = (android.os.Message) declaredField.get(queue);
                if (message != null) {
                    try {
                        java.lang.String message2 = message.toString();
                        qj.c.f363860d = message2;
                        com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "mMessage = %s", message2);
                    } catch (java.lang.Exception e18) {
                        qj.c.f363860d = "";
                        com.tencent.mars.xlog.Log.e("SyncBarrierWatchDogPlus", "mMessage Exception e : " + e18.getMessage());
                    }
                    if (message.getWhen() - android.os.SystemClock.uptimeMillis() < -3000) {
                        if (message.getTarget() == null) {
                            int i17 = message.arg1;
                            if (i17 == qj.c.f363862f) {
                                return;
                            }
                            java.lang.String str2 = qj.c.f363860d;
                            if (str2 != null && str2.contains("barrier=")) {
                                qj.c.a(i17);
                                qj.c.f363862f = i17;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("SyncBarrierWatchDogPlus", "Maybe Happens Lag");
                        }
                    }
                }
            }
        }
    }
}
