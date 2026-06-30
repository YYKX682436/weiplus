package hk0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final hk0.l f281763d;

    /* renamed from: e, reason: collision with root package name */
    public static final hk0.l f281764e;

    /* renamed from: f, reason: collision with root package name */
    public static final hk0.l f281765f;

    /* renamed from: g, reason: collision with root package name */
    public static final hk0.l f281766g;

    /* renamed from: h, reason: collision with root package name */
    public static final hk0.l f281767h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ hk0.l[] f281768i;

    static {
        hk0.l lVar = new hk0.l("BRUSH", 0);
        f281763d = lVar;
        hk0.l lVar2 = new hk0.l("MOSAIC", 1);
        f281764e = lVar2;
        hk0.l lVar3 = new hk0.l("CROP", 2);
        f281765f = lVar3;
        hk0.l lVar4 = new hk0.l("TEXT", 3);
        f281766g = lVar4;
        hk0.l lVar5 = new hk0.l("EMOJI", 4);
        f281767h = lVar5;
        hk0.l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        f281768i = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static hk0.l valueOf(java.lang.String str) {
        return (hk0.l) java.lang.Enum.valueOf(hk0.l.class, str);
    }

    public static hk0.l[] values() {
        return (hk0.l[]) f281768i.clone();
    }
}
