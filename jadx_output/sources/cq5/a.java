package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.a f221490e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.a f221491f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.a f221492g;

    /* renamed from: h, reason: collision with root package name */
    public static final cq5.a f221493h;

    /* renamed from: i, reason: collision with root package name */
    public static final cq5.a f221494i;

    /* renamed from: m, reason: collision with root package name */
    public static final cq5.a f221495m;

    /* renamed from: n, reason: collision with root package name */
    public static final cq5.a f221496n;

    /* renamed from: o, reason: collision with root package name */
    public static final cq5.a f221497o;

    /* renamed from: p, reason: collision with root package name */
    public static final cq5.a f221498p;

    /* renamed from: q, reason: collision with root package name */
    public static final cq5.a f221499q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ cq5.a[] f221500r;

    /* renamed from: d, reason: collision with root package name */
    public final int f221501d;

    static {
        cq5.a aVar = new cq5.a("SEND_MEDIA_THUMB", 0, 1);
        f221490e = aVar;
        cq5.a aVar2 = new cq5.a("SEND_FILE_THUMB", 1, 2);
        f221491f = aVar2;
        cq5.a aVar3 = new cq5.a("SEND_MEDIA_DONE_THUMB", 2, 3);
        f221492g = aVar3;
        cq5.a aVar4 = new cq5.a("SEND_FILE_DONE_THUMB", 3, 4);
        f221493h = aVar4;
        cq5.a aVar5 = new cq5.a("RECV_MEDIA_THUMB", 4, 5);
        f221494i = aVar5;
        cq5.a aVar6 = new cq5.a("RECV_FILE_THUMB", 5, 6);
        f221495m = aVar6;
        cq5.a aVar7 = new cq5.a("RECV_MEDIA_DONE_THUMB", 6, 7);
        f221496n = aVar7;
        cq5.a aVar8 = new cq5.a("RECV_FILE_DONE_THUMB", 7, 8);
        f221497o = aVar8;
        cq5.a aVar9 = new cq5.a("CLICK_GOTO_ALBUM", 8, 9);
        f221498p = aVar9;
        cq5.a aVar10 = new cq5.a("CLICK_GOTO_FILE", 9, 10);
        f221499q = aVar10;
        cq5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        f221500r = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f221501d = i18;
    }

    public static cq5.a valueOf(java.lang.String str) {
        return (cq5.a) java.lang.Enum.valueOf(cq5.a.class, str);
    }

    public static cq5.a[] values() {
        return (cq5.a[]) f221500r.clone();
    }
}
