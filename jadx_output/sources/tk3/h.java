package tk3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final tk3.h f419922d;

    /* renamed from: e, reason: collision with root package name */
    public static final tk3.h f419923e;

    /* renamed from: f, reason: collision with root package name */
    public static final tk3.h f419924f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tk3.h[] f419925g;

    static {
        tk3.h hVar = new tk3.h(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0);
        f419922d = hVar;
        tk3.h hVar2 = new tk3.h("VIRTUAL", 1);
        f419923e = hVar2;
        tk3.h hVar3 = new tk3.h("REAL", 2);
        f419924f = hVar3;
        tk3.h[] hVarArr = {hVar, hVar2, hVar3};
        f419925g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static tk3.h valueOf(java.lang.String str) {
        return (tk3.h) java.lang.Enum.valueOf(tk3.h.class, str);
    }

    public static tk3.h[] values() {
        return (tk3.h[]) f419925g.clone();
    }
}
