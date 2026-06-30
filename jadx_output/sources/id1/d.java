package id1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final id1.b f290459h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f290460i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f290461m;

    /* renamed from: n, reason: collision with root package name */
    public static final id1.d f290462n;

    /* renamed from: o, reason: collision with root package name */
    public static final id1.d f290463o;

    /* renamed from: p, reason: collision with root package name */
    public static final id1.d f290464p;

    /* renamed from: q, reason: collision with root package name */
    public static final id1.d f290465q;

    /* renamed from: r, reason: collision with root package name */
    public static final id1.d f290466r;

    /* renamed from: s, reason: collision with root package name */
    public static final id1.d f290467s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ id1.d[] f290468t;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f290469d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f290470e;

    /* renamed from: f, reason: collision with root package name */
    public final hd1.e f290471f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.ArrayMap f290472g = new android.util.ArrayMap();

    static {
        id1.d dVar = new id1.d("NFC_A", 0, "NFC-A", android.nfc.tech.NfcA.class.getName(), hd1.b0.f280391a);
        f290462n = dVar;
        id1.d dVar2 = new id1.d("NFC_B", 1, "NFC-B", android.nfc.tech.NfcB.class.getName(), null);
        f290463o = dVar2;
        id1.d dVar3 = new id1.d("ISO_DEP", 2, "ISO-DEP", android.nfc.tech.IsoDep.class.getName(), hd1.f.f280398a);
        f290464p = dVar3;
        id1.d dVar4 = new id1.d("NFC_F", 3, "NFC-F", android.nfc.tech.NfcF.class.getName(), null);
        f290465q = dVar4;
        id1.d dVar5 = new id1.d("NFC_V", 4, "NFC-V", android.nfc.tech.NfcV.class.getName(), null);
        f290466r = dVar5;
        id1.d dVar6 = new id1.d("MIFARE_CLASSIC", 5, "MIFARE Classic", android.nfc.tech.MifareClassic.class.getName(), null);
        id1.d dVar7 = new id1.d("MIFARE_ULTRALIGHT", 6, "MIFARE Ultralight", android.nfc.tech.MifareUltralight.class.getName(), null);
        id1.d dVar8 = new id1.d("NDEF", 7, "NDEF", android.nfc.tech.Ndef.class.getName(), null);
        f290467s = dVar8;
        id1.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        f290468t = dVarArr;
        rz5.b.a(dVarArr);
        f290459h = new id1.b(null);
        id1.d[] values = values();
        java.util.ArrayList arrayList = new java.util.ArrayList(values.length);
        for (id1.d dVar9 : values) {
            arrayList.add(new jz5.l(dVar9.f290469d, dVar9));
        }
        f290460i = kz5.c1.q(arrayList);
        id1.d[] values2 = values();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(values2.length);
        for (id1.d dVar10 : values2) {
            arrayList2.add(new jz5.l(dVar10.f290470e, dVar10.f290469d));
        }
        f290461m = kz5.c1.q(arrayList2);
    }

    public d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, hd1.e eVar) {
        this.f290469d = str2;
        this.f290470e = str3;
        this.f290471f = eVar;
    }

    public static id1.d valueOf(java.lang.String str) {
        return (id1.d) java.lang.Enum.valueOf(id1.d.class, str);
    }

    public static id1.d[] values() {
        return (id1.d[]) f290468t.clone();
    }
}
