package s50;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final s50.w0 f403129e;

    /* renamed from: f, reason: collision with root package name */
    public static final s50.w0 f403130f;

    /* renamed from: g, reason: collision with root package name */
    public static final s50.w0 f403131g;

    /* renamed from: h, reason: collision with root package name */
    public static final s50.w0 f403132h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s50.w0[] f403133i;

    /* renamed from: d, reason: collision with root package name */
    public final int f403134d;

    static {
        s50.w0 w0Var = new s50.w0("WSStreamVoiceInputErrCode_Success", 0, 0);
        s50.w0 w0Var2 = new s50.w0("WSStreamVoiceInputErrCode_AudioConflict", 1, 1);
        f403129e = w0Var2;
        s50.w0 w0Var3 = new s50.w0("WSStreamVoiceInputErrCode_SystemDenied", 2, 2);
        f403130f = w0Var3;
        s50.w0 w0Var4 = new s50.w0("WSStreamVoiceInputErrCode_NoNetwork", 3, 3);
        f403131g = w0Var4;
        s50.w0 w0Var5 = new s50.w0("WSStreamVoiceInputErrCode_VoiceInputError", 4, 4);
        f403132h = w0Var5;
        s50.w0[] w0VarArr = {w0Var, w0Var2, w0Var3, w0Var4, w0Var5, new s50.w0("WSStreamVoiceInputErrCode_VoiceHalfStreamError", 5, 5), new s50.w0("WSStreamVoiceInputErrCode_VoiceResultPageError", 6, 6), new s50.w0("WSStreamVoiceInputErrCode_AlreadyRunning", 7, 100)};
        f403133i = w0VarArr;
        rz5.b.a(w0VarArr);
    }

    public w0(java.lang.String str, int i17, int i18) {
        this.f403134d = i18;
    }

    public static s50.w0 valueOf(java.lang.String str) {
        return (s50.w0) java.lang.Enum.valueOf(s50.w0.class, str);
    }

    public static s50.w0[] values() {
        return (s50.w0[]) f403133i.clone();
    }
}
