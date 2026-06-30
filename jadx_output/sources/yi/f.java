package yi;

/* loaded from: classes15.dex */
public class f extends yi.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.g f462451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yi.g gVar) {
        super(null);
        this.f462451b = gVar;
    }

    @Override // yi.j
    public void a() {
        yi.g gVar = this.f462451b;
        java.util.Set<java.util.Map.Entry> entrySet = ((java.util.HashMap) gVar.f462453b).entrySet();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : entrySet) {
            zi.b bVar = (zi.b) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (((java.util.HashSet) gVar.f462452a).contains(bVar)) {
                try {
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (byte b17 : digest) {
                        char[] cArr = vi.a.f437246a;
                        if (b17 < 0 || b17 > 15) {
                            sb6.append(cArr[15 & (b17 >> 4)]);
                            sb6.append(cArr[b17 & 15]);
                        } else {
                            sb6.append('0');
                            sb6.append(cArr[b17]);
                        }
                    }
                    java.lang.String sb7 = sb6.toString();
                    zi.b bVar2 = (zi.b) hashMap.get(sb7);
                    if (bVar2 == null) {
                        hashMap.put(sb7, bVar);
                    } else {
                        ((java.util.HashMap) gVar.f462454c).put(bVar2, bVar2);
                        ((java.util.HashMap) gVar.f462454c).put(bVar, bVar2);
                    }
                } catch (java.security.NoSuchAlgorithmException e17) {
                    throw new java.lang.IllegalStateException(e17);
                }
            }
        }
        ((java.util.HashMap) gVar.f462453b).clear();
    }

    @Override // yi.j
    public yi.h c(int i17, int i18, long j17) {
        return new yi.e(this, null);
    }
}
