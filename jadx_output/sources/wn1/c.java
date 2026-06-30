package wn1;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447402d;

    /* renamed from: e, reason: collision with root package name */
    public long f447403e;

    /* renamed from: f, reason: collision with root package name */
    public int f447404f;

    /* renamed from: g, reason: collision with root package name */
    public long f447405g;

    /* renamed from: i, reason: collision with root package name */
    public int f447407i;

    /* renamed from: m, reason: collision with root package name */
    public long f447408m;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f447406h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f447409n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.c)) {
            return false;
        }
        wn1.c cVar = (wn1.c) fVar;
        return n51.f.a(this.f447402d, cVar.f447402d) && n51.f.a(java.lang.Long.valueOf(this.f447403e), java.lang.Long.valueOf(cVar.f447403e)) && n51.f.a(java.lang.Integer.valueOf(this.f447404f), java.lang.Integer.valueOf(cVar.f447404f)) && n51.f.a(java.lang.Long.valueOf(this.f447405g), java.lang.Long.valueOf(cVar.f447405g)) && n51.f.a(this.f447406h, cVar.f447406h) && n51.f.a(java.lang.Integer.valueOf(this.f447407i), java.lang.Integer.valueOf(cVar.f447407i)) && n51.f.a(java.lang.Long.valueOf(this.f447408m), java.lang.Long.valueOf(cVar.f447408m)) && n51.f.a(this.f447409n, cVar.f447409n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f447409n;
        java.util.LinkedList linkedList2 = this.f447406h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447402d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f447403e);
            fVar.e(3, this.f447404f);
            fVar.h(4, this.f447405g);
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f447407i);
            fVar.h(7, this.f447408m);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f447402d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f447403e) + b36.f.e(3, this.f447404f) + b36.f.h(4, this.f447405g) + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f447407i) + b36.f.h(7, this.f447408m) + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wn1.c cVar = (wn1.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f447402d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f447403e = aVar2.i(intValue);
                return 0;
            case 3:
                cVar.f447404f = aVar2.g(intValue);
                return 0;
            case 4:
                cVar.f447405g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wn1.b bVar = new wn1.b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.parseFrom(bArr2);
                    }
                    cVar.f447406h.add(bVar);
                }
                return 0;
            case 6:
                cVar.f447407i = aVar2.g(intValue);
                return 0;
            case 7:
                cVar.f447408m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    wn1.b bVar2 = new wn1.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar2.parseFrom(bArr3);
                    }
                    cVar.f447409n.add(bVar2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
