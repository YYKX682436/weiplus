package ik5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final ik5.a f291968d;

    /* renamed from: e, reason: collision with root package name */
    public static final ik5.a f291969e;

    /* renamed from: f, reason: collision with root package name */
    public static final ik5.a f291970f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ik5.a[] f291971g;

    static {
        ik5.a aVar = new ik5.a("UNKNOWN", 0);
        f291968d = aVar;
        ik5.a aVar2 = new ik5.a(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 1);
        f291969e = aVar2;
        ik5.a aVar3 = new ik5.a(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_FINISH, 2);
        f291970f = aVar3;
        ik5.a[] aVarArr = {aVar, aVar2, aVar3};
        f291971g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static ik5.a valueOf(java.lang.String str) {
        return (ik5.a) java.lang.Enum.valueOf(ik5.a.class, str);
    }

    public static ik5.a[] values() {
        return (ik5.a[]) f291971g.clone();
    }
}
