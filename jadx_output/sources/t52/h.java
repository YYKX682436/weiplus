package t52;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final t52.h f415714d;

    /* renamed from: e, reason: collision with root package name */
    public static final t52.h f415715e;

    /* renamed from: f, reason: collision with root package name */
    public static final t52.h f415716f;

    /* renamed from: g, reason: collision with root package name */
    public static final t52.h f415717g;

    /* renamed from: h, reason: collision with root package name */
    public static final t52.h f415718h;

    /* renamed from: i, reason: collision with root package name */
    public static final t52.h f415719i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ t52.h[] f415720m;

    static {
        t52.h hVar = new t52.h("MATCH_INVALIDATE", 0);
        t52.h hVar2 = new t52.h("MATCH_PAGE_RESUME", 1);
        f415714d = hVar2;
        t52.h hVar3 = new t52.h("MATCH_PAGE_FINISH", 2);
        f415715e = hVar3;
        t52.h hVar4 = new t52.h("MATCH_PAGE_SLIENCE_POP_STACK", 3);
        f415716f = hVar4;
        t52.h hVar5 = new t52.h("MATCH_PAGE_8_EVENT", 4);
        f415717g = hVar5;
        t52.h hVar6 = new t52.h("MATCH_PAGE_MM_PROCESS_RESTEART", 5);
        f415718h = hVar6;
        t52.h hVar7 = new t52.h("MATCH_PAGE_SESSION_CLOSE", 6);
        f415719i = hVar7;
        t52.h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
        f415720m = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static t52.h valueOf(java.lang.String str) {
        return (t52.h) java.lang.Enum.valueOf(t52.h.class, str);
    }

    public static t52.h[] values() {
        return (t52.h[]) f415720m.clone();
    }
}
