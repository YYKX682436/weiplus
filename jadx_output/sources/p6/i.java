package p6;

/* loaded from: classes16.dex */
public class i extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f352144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f352145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f352146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.j f352147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p6.j jVar, android.os.Looper looper, int i17, int i18) {
        super(looper);
        this.f352147d = jVar;
        this.f352145b = i17;
        this.f352146c = i18;
        this.f352144a = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        p6.j jVar = this.f352147d;
        try {
            if (jVar.f352149b != null && jVar.f352150c != null && jVar.f352151d != null) {
                switch (message.what) {
                    case 100:
                        long longValue = ((java.lang.Long) message.obj).longValue();
                        q6.a aVar = jVar.f352152e;
                        if (aVar == null) {
                            q6.d dVar = jVar.f352151d;
                            dVar.f360220a = longValue;
                            dVar.a(longValue, longValue);
                            return;
                        }
                        int currentPosition = aVar.getCurrentPosition();
                        if (currentPosition > 0 && currentPosition >= this.f352144a) {
                            q6.d dVar2 = jVar.f352151d;
                            long j17 = currentPosition;
                            dVar2.f360220a = j17;
                            dVar2.a(j17, longValue);
                        } else if (currentPosition < 0 || currentPosition >= this.f352144a || jVar.f352153f.f352109c <= 0) {
                            jVar.f352149b.sendMessage(android.os.Message.obtain(message));
                        } else {
                            jVar.seekTo(currentPosition);
                        }
                        this.f352144a = currentPosition;
                        return;
                    case 101:
                        java.lang.Object obj = message.obj;
                        if (obj instanceof android.os.Parcel) {
                            android.os.Parcel parcel = (android.os.Parcel) obj;
                            q6.a aVar2 = jVar.f352152e;
                            if (aVar2 != null) {
                                aVar2.getCurrentPosition();
                            }
                            java.lang.String str = "{\"Metadata\": {\"Version\": 1}," + new com.appaac.haptic.sync.VibrationPattern(parcel).f43917d + "}";
                            try {
                                if (android.os.HapticPlayer.isAvailable()) {
                                    jVar.f352148a = new android.os.HapticPlayer(android.os.DynamicEffect.create(str));
                                    try {
                                        android.os.HapticPlayer hapticPlayer = jVar.f352148a;
                                        jVar.getClass();
                                        hapticPlayer.start(1, 0, this.f352145b, this.f352146c);
                                    } catch (java.lang.NoSuchMethodError unused) {
                                        jVar.f352148a.start(1);
                                    }
                                }
                            } catch (java.lang.Throwable unused2) {
                            }
                            parcel.recycle();
                            return;
                        }
                        return;
                    case 102:
                        p6.a aVar3 = jVar.f352153f;
                        if (aVar3.f352109c <= 0) {
                            aVar3.f352115i = 9;
                            jVar.getClass();
                            return;
                        }
                        q6.a aVar4 = jVar.f352152e;
                        if (aVar4 == null || aVar4.getCurrentPosition() <= l6.m.d(jVar.f352153f.f352107a)) {
                            jVar.seekTo(0);
                            return;
                        } else {
                            jVar.f352149b.sendEmptyMessageDelayed(102, 10L);
                            return;
                        }
                    default:
                        return;
                }
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
    }
}
