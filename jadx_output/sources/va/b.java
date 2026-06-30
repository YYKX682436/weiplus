package va;

/* loaded from: classes16.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public va.p f434179a;

    public java.lang.String toString() {
        ua.f fVar = new ua.f(va.b.class.getSimpleName(), null);
        va.p pVar = this.f434179a;
        if (pVar != null) {
            java.lang.String obj = pVar.toString();
            int length = obj.length();
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                char charAt = obj.charAt(i17);
                if (charAt >= 'A' && charAt <= 'Z') {
                    char[] charArray = obj.toCharArray();
                    while (i17 < length) {
                        char c17 = charArray[i17];
                        if (c17 >= 'A' && c17 <= 'Z') {
                            charArray[i17] = (char) (c17 ^ ' ');
                        }
                        i17++;
                    }
                    obj = java.lang.String.valueOf(charArray);
                } else {
                    i17++;
                }
            }
            ua.e eVar = new ua.e(null);
            fVar.f425899c.f425896c = eVar;
            fVar.f425899c = eVar;
            eVar.f425895b = obj;
            eVar.f425894a = "valueStrength";
        }
        return fVar.toString();
    }
}
