package xv5;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457457d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457458e;

    /* renamed from: f, reason: collision with root package name */
    public xv5.d f457459f;

    /* renamed from: g, reason: collision with root package name */
    public xv5.i f457460g;

    /* renamed from: h, reason: collision with root package name */
    public int f457461h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f457462i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f457463m = new boolean[7];

    static {
        new xv5.e();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public xv5.e parseFrom(byte[] bArr) {
        return (xv5.e) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.e)) {
            return false;
        }
        xv5.e eVar = (xv5.e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457457d), java.lang.Integer.valueOf(eVar.f457457d)) && n51.f.a(this.f457458e, eVar.f457458e) && n51.f.a(this.f457459f, eVar.f457459f) && n51.f.a(this.f457460g, eVar.f457460g) && n51.f.a(java.lang.Integer.valueOf(this.f457461h), java.lang.Integer.valueOf(eVar.f457461h)) && n51.f.a(this.f457462i, eVar.f457462i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new xv5.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457462i;
        boolean[] zArr = this.f457463m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f457457d);
            }
            java.lang.String str = this.f457458e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            xv5.d dVar = this.f457459f;
            if (dVar != null && zArr[3]) {
                fVar.i(3, dVar.computeSize());
                this.f457459f.writeFields(fVar);
            }
            xv5.i iVar = this.f457460g;
            if (iVar != null && zArr[4]) {
                fVar.i(4, iVar.computeSize());
                this.f457460g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f457461h);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f457457d) : 0;
            java.lang.String str2 = this.f457458e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            xv5.d dVar2 = this.f457459f;
            if (dVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, dVar2.computeSize());
            }
            xv5.i iVar2 = this.f457460g;
            if (iVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, iVar2.computeSize());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f457461h);
            }
            return e17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f457457d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f457458e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    xv5.d dVar3 = new xv5.d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.parseFrom(bArr);
                    }
                    this.f457459f = dVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    xv5.i iVar3 = new xv5.i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar3.parseFrom(bArr2);
                    }
                    this.f457460g = iVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f457461h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    xv5.b bVar = new xv5.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.parseFrom(bArr3);
                    }
                    linkedList.add(bVar);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
