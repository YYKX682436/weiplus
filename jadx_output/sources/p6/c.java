package p6;

/* loaded from: classes16.dex */
public class c extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f352121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f352122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f352123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.d f352124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p6.d dVar, android.os.Looper looper, int i17, int i18) {
        super(looper);
        this.f352124d = dVar;
        this.f352122b = i17;
        this.f352123c = i18;
        this.f352121a = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17;
        int i18;
        p6.d dVar = this.f352124d;
        try {
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
        if (dVar.f352127c != null && dVar.f352128d != null && dVar.f352129e != null) {
            switch (message.what) {
                case 100:
                    long longValue = ((java.lang.Long) message.obj).longValue();
                    q6.a aVar = dVar.f352130f;
                    if (aVar == null) {
                        q6.d dVar2 = dVar.f352129e;
                        dVar2.f360220a = longValue;
                        dVar2.a(longValue, longValue);
                        return;
                    }
                    int currentPosition = aVar.getCurrentPosition();
                    if (currentPosition > 0 && currentPosition >= this.f352121a) {
                        q6.d dVar3 = dVar.f352129e;
                        long j17 = currentPosition;
                        dVar3.f360220a = j17;
                        dVar3.a(j17, longValue);
                    } else if (currentPosition < 0 || currentPosition >= this.f352121a || dVar.f352131g.f352109c <= 0) {
                        dVar.f352127c.sendMessage(android.os.Message.obtain(message));
                    } else {
                        dVar.seekTo(currentPosition);
                    }
                    this.f352121a = currentPosition;
                    return;
                case 101:
                    java.lang.Object obj = message.obj;
                    if (obj instanceof android.os.Parcel) {
                        android.os.Parcel parcel = (android.os.Parcel) obj;
                        q6.a aVar2 = dVar.f352130f;
                        if (aVar2 != null) {
                            aVar2.getCurrentPosition();
                        }
                        java.lang.String str = "{\"Metadata\": {\"Version\": 1}," + new com.appaac.haptic.sync.VibrationPattern(parcel).f43917d + "}";
                        p6.d dVar4 = this.f352124d;
                        l6.l lVar = dVar4.f352132h;
                        if (lVar != null) {
                            synchronized (lVar) {
                                i18 = lVar.f316734c;
                            }
                            i17 = i18;
                        } else {
                            i17 = this.f352122b;
                        }
                        dVar4.a(str, 1, 0, i17, this.f352123c);
                        parcel.recycle();
                        return;
                    }
                    return;
                case 102:
                    p6.a aVar3 = dVar.f352131g;
                    if (aVar3.f352109c <= 0) {
                        aVar3.f352115i = 9;
                        return;
                    }
                    q6.a aVar4 = dVar.f352130f;
                    if (aVar4 == null || aVar4.getCurrentPosition() <= l6.m.d(dVar.f352131g.f352107a)) {
                        dVar.seekTo(0);
                        return;
                    } else {
                        dVar.f352127c.sendEmptyMessageDelayed(102, 10L);
                        return;
                    }
                default:
                    return;
            }
            e17.toString();
        }
    }
}
