package kp1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final kp1.o f310926d;

    /* renamed from: e, reason: collision with root package name */
    public static final kp1.o f310927e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kp1.o[] f310928f;

    static {
        kp1.o oVar = new kp1.o(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f310926d = oVar;
        kp1.o oVar2 = new kp1.o(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_FOREGROUND_PATTERN, 1);
        kp1.o oVar3 = new kp1.o("HEADER_OPEN", 2);
        f310927e = oVar3;
        kp1.o[] oVarArr = {oVar, oVar2, oVar3};
        f310928f = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static kp1.o valueOf(java.lang.String str) {
        return (kp1.o) java.lang.Enum.valueOf(kp1.o.class, str);
    }

    public static kp1.o[] values() {
        return (kp1.o[]) f310928f.clone();
    }
}
