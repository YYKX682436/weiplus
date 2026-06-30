package l4;

/* loaded from: classes13.dex */
public class l extends l4.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.room.MultiInstanceInvalidationService f315729d;

    public l(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f315729d = multiInstanceInvalidationService;
    }

    public void d(int i17, java.lang.String[] strArr) {
        synchronized (this.f315729d.f12320f) {
            java.lang.String str = (java.lang.String) this.f315729d.f12319e.get(java.lang.Integer.valueOf(i17));
            if (str == null) {
                return;
            }
            int beginBroadcast = this.f315729d.f12320f.beginBroadcast();
            for (int i18 = 0; i18 < beginBroadcast; i18++) {
                try {
                    int intValue = ((java.lang.Integer) this.f315729d.f12320f.getBroadcastCookie(i18)).intValue();
                    java.lang.String str2 = (java.lang.String) this.f315729d.f12319e.get(java.lang.Integer.valueOf(intValue));
                    if (i17 != intValue && str.equals(str2)) {
                        try {
                            ((l4.d) this.f315729d.f12320f.getBroadcastItem(i18)).h2(strArr);
                        } catch (android.os.RemoteException unused) {
                        }
                    }
                } finally {
                    this.f315729d.f12320f.finishBroadcast();
                }
            }
        }
    }

    public int e(l4.d dVar, java.lang.String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f315729d.f12320f) {
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = this.f315729d;
            int i17 = multiInstanceInvalidationService.f12318d + 1;
            multiInstanceInvalidationService.f12318d = i17;
            if (multiInstanceInvalidationService.f12320f.register(dVar, java.lang.Integer.valueOf(i17))) {
                this.f315729d.f12319e.put(java.lang.Integer.valueOf(i17), str);
                return i17;
            }
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f315729d;
            multiInstanceInvalidationService2.f12318d--;
            return 0;
        }
    }
}
