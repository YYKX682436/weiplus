package yi;

/* loaded from: classes15.dex */
public class e extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.f f462450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yi.f fVar, yi.h hVar) {
        super(hVar);
        this.f462450b = fVar;
    }

    @Override // yi.h
    public void e(zi.b bVar, int i17, zi.b bVar2, byte[] bArr) {
        yi.f fVar = this.f462450b;
        try {
            zi.b bVar3 = fVar.f462451b.f462457f;
            yi.g gVar = fVar.f462451b;
            zi.b bVar4 = null;
            if (bVar3 == null || !bVar3.equals(bVar2)) {
                zi.b bVar5 = gVar.f462461j;
                if (bVar5 == null || !bVar5.equals(bVar2)) {
                    return;
                }
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                zi.a[] aVarArr = gVar.f462466o;
                int length = aVarArr.length;
                while (r0 < length) {
                    zi.a aVar = aVarArr[r0];
                    zi.b bVar6 = aVar.f473074b;
                    int i18 = aVar.f473073a;
                    zi.c a17 = zi.c.a(i18);
                    if (a17 == null) {
                        throw new java.lang.IllegalStateException("visit string instance failed, lost type def of typeId: " + i18);
                    }
                    if (!gVar.f462462k.equals(bVar6)) {
                        if (bVar4 != null) {
                            break;
                        }
                        int i19 = gVar.f462463l;
                        int i27 = a17.f473080e;
                        if (i27 != 0) {
                            i19 = i27;
                        }
                        aj.a.g(byteArrayInputStream, i19);
                    } else {
                        bVar4 = (zi.b) aj.a.f(byteArrayInputStream, a17, gVar.f462463l);
                    }
                    r0++;
                }
                byteArrayInputStream.close();
                if (bVar4 == null || bVar4.equals(gVar.f462464m)) {
                    return;
                }
                ((java.util.HashSet) gVar.f462455d).add(bVar4);
                return;
            }
            java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(bArr);
            java.lang.Boolean bool = null;
            for (zi.a aVar2 : gVar.f462465n) {
                zi.b bVar7 = aVar2.f473074b;
                int i28 = aVar2.f473073a;
                zi.c a18 = zi.c.a(i28);
                if (a18 == null) {
                    throw new java.lang.IllegalStateException("visit bmp instance failed, lost type def of typeId: " + i28);
                }
                if (gVar.f462458g.equals(bVar7)) {
                    bVar4 = (zi.b) aj.a.f(byteArrayInputStream2, a18, gVar.f462463l);
                } else if (!gVar.f462459h.equals(bVar7)) {
                    if (bVar4 != null && bool != null) {
                        break;
                    }
                    int i29 = gVar.f462463l;
                    int i37 = a18.f473080e;
                    if (i37 != 0) {
                        i29 = i37;
                    }
                    aj.a.g(byteArrayInputStream2, i29);
                } else {
                    bool = (java.lang.Boolean) aj.a.f(byteArrayInputStream2, a18, gVar.f462463l);
                }
            }
            byteArrayInputStream2.close();
            r0 = (bool == null || !bool.booleanValue()) ? 1 : 0;
            if (bVar4 == null || r0 == 0 || bVar4.equals(gVar.f462464m)) {
                return;
            }
            ((java.util.HashSet) gVar.f462452a).add(bVar4);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void k(int i17, zi.b bVar, int i18, int i19, int i27, byte[] bArr) {
        ((java.util.HashMap) this.f462450b.f462451b.f462453b).put(bVar, bArr);
    }
}
