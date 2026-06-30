package wf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final wf2.a f445553d;

    /* renamed from: e, reason: collision with root package name */
    public static final wf2.a f445554e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wf2.a[] f445555f;

    static {
        wf2.a aVar = new wf2.a("ProcessByLive", 0);
        f445553d = aVar;
        wf2.a aVar2 = new wf2.a("ProcessByGlobal", 1);
        f445554e = aVar2;
        wf2.a[] aVarArr = {aVar, aVar2};
        f445555f = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static wf2.a valueOf(java.lang.String str) {
        return (wf2.a) java.lang.Enum.valueOf(wf2.a.class, str);
    }

    public static wf2.a[] values() {
        return (wf2.a[]) f445555f.clone();
    }
}
