package k72;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final k72.b f304704a = new k72.b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f304705b;

    public final java.lang.String a(java.lang.String enc_str) {
        kotlin.jvm.internal.o.g(enc_str, "enc_str");
        java.util.ArrayList arrayList = new java.util.ArrayList(enc_str.length());
        for (int i17 = 0; i17 < enc_str.length(); i17++) {
            arrayList.add(java.lang.Character.valueOf((char) (enc_str.charAt(i17) ^ '#')));
        }
        return kz5.n0.g0(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        k72.b bVar = f304704a;
        sb7.append(bVar.a("JP|FNV\u0019"));
        sb7.append(k72.c.f304706a);
        sb7.append(bVar.a("\u000fFNV|FQQLQ\u0019"));
        sb7.append(k72.c.f304707b);
        sb7.append(bVar.a("\u000fFNV|JMEL\u0019"));
        sb7.append(k72.c.f304708c);
        sb7.append(';');
        sb6.append(sb7.toString());
        sb6.append(bVar.a("\u0003JP|UB\u0019") + k72.e0.f304720a + bVar.a("\u000fUB|FQQLQ\u0019") + k72.e0.f304721b + bVar.a("\u000fUB|JMEL\u0019") + k72.e0.f304722c + ';');
        return sb6.toString();
    }
}
