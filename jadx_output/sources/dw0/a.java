package dw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final dw0.a f244078e;

    /* renamed from: f, reason: collision with root package name */
    public static final dw0.a f244079f;

    /* renamed from: g, reason: collision with root package name */
    public static final dw0.a f244080g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dw0.a[] f244081h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f244082d;

    static {
        dw0.a aVar = new dw0.a("ORIGIN_TIMBRE", 0, "OriginTimbre");
        f244078e = aVar;
        dw0.a aVar2 = new dw0.a("TTS", 1, "publisher_tts_");
        f244079f = aVar2;
        dw0.a aVar3 = new dw0.a("SPEECH_ENHANCE", 2, "publisher_speech_enhance_");
        f244080g = aVar3;
        dw0.a[] aVarArr = {aVar, aVar2, aVar3};
        f244081h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f244082d = str2;
    }

    public static dw0.a valueOf(java.lang.String str) {
        return (dw0.a) java.lang.Enum.valueOf(dw0.a.class, str);
    }

    public static dw0.a[] values() {
        return (dw0.a[]) f244081h.clone();
    }
}
