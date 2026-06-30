package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.a f364869e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.a f364870f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qn.a[] f364871g;

    /* renamed from: d, reason: collision with root package name */
    public final int f364872d;

    static {
        qn.a aVar = new qn.a("SingleChat", 0, 1);
        f364869e = aVar;
        qn.a aVar2 = new qn.a("ChatRoom", 1, 2);
        f364870f = aVar2;
        qn.a[] aVarArr = {aVar, aVar2};
        f364871g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f364872d = i18;
    }

    public static qn.a valueOf(java.lang.String str) {
        return (qn.a) java.lang.Enum.valueOf(qn.a.class, str);
    }

    public static qn.a[] values() {
        return (qn.a[]) f364871g.clone();
    }
}
