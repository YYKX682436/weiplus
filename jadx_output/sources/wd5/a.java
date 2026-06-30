package wd5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final wd5.a f445078e;

    /* renamed from: f, reason: collision with root package name */
    public static final wd5.a f445079f;

    /* renamed from: g, reason: collision with root package name */
    public static final wd5.a f445080g;

    /* renamed from: h, reason: collision with root package name */
    public static final wd5.a f445081h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ wd5.a[] f445082i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445083d;

    static {
        wd5.a aVar = new wd5.a("QuoteFromEmoji", 0, "handleEmojiQuoteMsgFillingFrom");
        wd5.a aVar2 = new wd5.a("QuoteFromVoice", 1, "handleVoiceQuoteMsgFillingFrom");
        f445078e = aVar2;
        wd5.a aVar3 = new wd5.a("QuoteFromImg", 2, "handleImgQuoteMsgFillingFrom");
        f445079f = aVar3;
        wd5.a aVar4 = new wd5.a("QuoteFromVideo", 3, "handleVideoQuoteMsgFillingFrom");
        f445080g = aVar4;
        wd5.a aVar5 = new wd5.a("UnKnown", 4, com.eclipsesource.mmv8.Platform.UNKNOWN);
        f445081h = aVar5;
        wd5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f445082i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f445083d = str2;
    }

    public static wd5.a valueOf(java.lang.String str) {
        return (wd5.a) java.lang.Enum.valueOf(wd5.a.class, str);
    }

    public static wd5.a[] values() {
        return (wd5.a[]) f445082i.clone();
    }
}
