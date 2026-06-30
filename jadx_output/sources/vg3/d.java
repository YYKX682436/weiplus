package vg3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final vg3.d f436679e;

    /* renamed from: f, reason: collision with root package name */
    public static final vg3.d f436680f;

    /* renamed from: g, reason: collision with root package name */
    public static final vg3.d f436681g;

    /* renamed from: h, reason: collision with root package name */
    public static final vg3.d f436682h;

    /* renamed from: i, reason: collision with root package name */
    public static final vg3.d f436683i;

    /* renamed from: m, reason: collision with root package name */
    public static final vg3.d f436684m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ vg3.d[] f436685n;

    /* renamed from: d, reason: collision with root package name */
    public final int f436686d;

    static {
        vg3.d dVar = new vg3.d("INITIATE_FRIEND_REQUEST", 0, 1);
        f436679e = dVar;
        vg3.d dVar2 = new vg3.d("ACCEPT_FRIEND_REQUEST", 1, 2);
        f436680f = dVar2;
        vg3.d dVar3 = new vg3.d("PROFILE_SETTINGS", 2, 3);
        f436681g = dVar3;
        vg3.d dVar4 = new vg3.d("CHAT_DETAIL", 3, 4);
        f436682h = dVar4;
        vg3.d dVar5 = new vg3.d("FRIEND_PROFILE", 4, 5);
        f436683i = dVar5;
        vg3.d dVar6 = new vg3.d("CONTACTS_TAG", 5, 6);
        f436684m = dVar6;
        vg3.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        f436685n = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f436686d = i18;
    }

    public static vg3.d valueOf(java.lang.String str) {
        return (vg3.d) java.lang.Enum.valueOf(vg3.d.class, str);
    }

    public static vg3.d[] values() {
        return (vg3.d[]) f436685n.clone();
    }
}
