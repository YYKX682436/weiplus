package p6;

/* loaded from: classes16.dex */
public class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public int f352133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f352134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f352135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.h f352136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p6.h hVar, android.os.Looper looper, int i17, int i18) {
        super(looper);
        this.f352136d = hVar;
        this.f352134b = i17;
        this.f352135c = i18;
        this.f352133a = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        p6.h hVar = this.f352136d;
        try {
            if (hVar.f352139c != null && hVar.f352140d != null && hVar.f352141e != null) {
                switch (message.what) {
                    case 100:
                        long longValue = ((java.lang.Long) message.obj).longValue();
                        q6.a aVar = hVar.f352142f;
                        if (aVar == null) {
                            q6.d dVar = hVar.f352141e;
                            dVar.f360220a = longValue;
                            dVar.a(longValue, longValue);
                            return;
                        }
                        int currentPosition = aVar.getCurrentPosition();
                        if (currentPosition > 0 && currentPosition >= this.f352133a) {
                            q6.d dVar2 = hVar.f352141e;
                            long j17 = currentPosition;
                            dVar2.f360220a = j17;
                            dVar2.a(j17, longValue);
                        } else if (currentPosition < 0 || currentPosition >= this.f352133a || hVar.f352143g.f352109c <= 0) {
                            hVar.f352139c.sendMessage(android.os.Message.obtain(message));
                        } else {
                            hVar.seekTo(currentPosition);
                        }
                        this.f352133a = currentPosition;
                        return;
                    case 101:
                        java.lang.Object obj = message.obj;
                        if (obj instanceof android.os.Parcel) {
                            android.os.Parcel parcel = (android.os.Parcel) obj;
                            q6.a aVar2 = hVar.f352142f;
                            if (aVar2 != null) {
                                aVar2.getCurrentPosition();
                            }
                            java.lang.String str = new com.appaac.haptic.sync.VibrationPattern(parcel).f43917d;
                            if (l6.m.f316739a >= 24) {
                                java.lang.String replace = "{\n    \"Metadata\": {\n        \"Created\": \"2020-08-10\",\n        \"Description\": \"Haptic editor design\",\n        \"Version\": 2\n    },\n    \"PatternList\": [\n       {\n        \"AbsoluteTime\": 0,\n          ReplaceMe\n       }\n    ]\n}".replace("ReplaceMe", str);
                                l6.c c17 = l6.c.c(hVar.f352137a);
                                hVar.getClass();
                                c17.a(replace, 1, 0, this.f352134b, this.f352135c);
                            } else {
                                l6.c c18 = l6.c.c(hVar.f352137a);
                                hVar.getClass();
                                c18.b("{\"Metadata\": {\"Version\": 1}," + str + "}", 1, 0, this.f352134b, this.f352135c);
                            }
                            parcel.recycle();
                            return;
                        }
                        return;
                    case 102:
                        p6.a aVar3 = hVar.f352143g;
                        if (aVar3.f352109c <= 0) {
                            aVar3.f352115i = 9;
                            hVar.getClass();
                            return;
                        }
                        q6.a aVar4 = hVar.f352142f;
                        if (aVar4 == null || aVar4.getCurrentPosition() <= l6.m.d(hVar.f352143g.f352107a)) {
                            hVar.seekTo(0);
                            return;
                        } else {
                            hVar.f352139c.sendEmptyMessageDelayed(102, 10L);
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
