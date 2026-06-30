package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.v f328116e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.v f328117f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.v f328118g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.v f328119h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.v[] f328120i;

    /* renamed from: d, reason: collision with root package name */
    public final int f328121d;

    static {
        ml2.v vVar = new ml2.v("LOCK_SCREEN_CREATED", 0, 1);
        f328116e = vVar;
        ml2.v vVar2 = new ml2.v("LOCK_SCREEN_END", 1, 2);
        f328117f = vVar2;
        ml2.v vVar3 = new ml2.v("CLICK_COVER_EXPAND", 2, 3);
        ml2.v vVar4 = new ml2.v("CLICK_PAUSE", 3, 4);
        f328118g = vVar4;
        ml2.v vVar5 = new ml2.v("CLICK_PLAY", 4, 5);
        f328119h = vVar5;
        ml2.v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5};
        f328120i = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17, int i18) {
        this.f328121d = i18;
    }

    public static ml2.v valueOf(java.lang.String str) {
        return (ml2.v) java.lang.Enum.valueOf(ml2.v.class, str);
    }

    public static ml2.v[] values() {
        return (ml2.v[]) f328120i.clone();
    }
}
