package yi;

/* loaded from: classes15.dex */
public class a extends yi.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi.b f462446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yi.b bVar, yi.h hVar) {
        super(hVar);
        this.f462446b = bVar;
    }

    @Override // yi.h
    public void e(zi.b bVar, int i17, zi.b bVar2, byte[] bArr) {
        zi.b bVar3;
        zi.b bVar4;
        yi.b bVar5 = this.f462446b;
        try {
            if (bVar2.equals(bVar5.f462447b.f462457f)) {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
                zi.a[] aVarArr = bVar5.f462447b.f462465n;
                int length = aVarArr.length;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (i18 >= length) {
                        bVar3 = null;
                        break;
                    }
                    zi.a aVar = aVarArr[i18];
                    zi.b bVar6 = aVar.f473074b;
                    int i27 = aVar.f473073a;
                    zi.c a17 = zi.c.a(i27);
                    if (a17 == null) {
                        throw new java.lang.IllegalStateException("visit instance failed, lost type def of typeId: " + i27);
                    }
                    if (bVar5.f462447b.f462458g.equals(bVar6)) {
                        bVar3 = (zi.b) aj.a.f(byteArrayInputStream, a17, bVar5.f462447b.f462463l);
                        break;
                    }
                    int i28 = bVar5.f462447b.f462463l;
                    int i29 = a17.f473080e;
                    if (i29 != 0) {
                        i28 = i29;
                    }
                    aj.a.g(byteArrayInputStream, i28);
                    i19 += i28;
                    i18++;
                }
                if (bVar3 != null && (bVar4 = (zi.b) ((java.util.HashMap) bVar5.f462447b.f462454c).get(bVar3)) != null && !bVar3.equals(bVar4) && !bVar3.equals(bVar5.f462447b.f462464m)) {
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                    wrap.position(i19);
                    wrap.put(bVar4.f473076a);
                }
            }
            super.e(bVar, i17, bVar2, bArr);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    @Override // yi.h
    public void k(int i17, zi.b bVar, int i18, int i19, int i27, byte[] bArr) {
        yi.b bVar2 = this.f462446b;
        zi.b bVar3 = (zi.b) ((java.util.HashMap) bVar2.f462447b.f462454c).get(bVar);
        if ((bVar3 == null || !bVar.equals(bVar3)) && !((java.util.HashSet) bVar2.f462447b.f462455d).contains(bVar)) {
            return;
        }
        super.k(i17, bVar, i18, i19, i27, bArr);
    }
}
