package v53;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f433323d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433324e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433325f;

    /* renamed from: g, reason: collision with root package name */
    public int f433326g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f433327h;

    /* renamed from: i, reason: collision with root package name */
    public v53.l f433328i;

    /* renamed from: m, reason: collision with root package name */
    public int f433329m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof v53.b)) {
            return false;
        }
        v53.b bVar = (v53.b) fVar;
        return n51.f.a(this.f433323d, bVar.f433323d) && n51.f.a(this.f433324e, bVar.f433324e) && n51.f.a(this.f433325f, bVar.f433325f) && n51.f.a(java.lang.Integer.valueOf(this.f433326g), java.lang.Integer.valueOf(bVar.f433326g)) && n51.f.a(this.f433327h, bVar.f433327h) && n51.f.a(this.f433328i, bVar.f433328i) && n51.f.a(java.lang.Integer.valueOf(this.f433329m), java.lang.Integer.valueOf(bVar.f433329m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f433323d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f433324e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f433325f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f433326g);
            java.lang.String str4 = this.f433327h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            v53.l lVar = this.f433328i;
            if (lVar != null) {
                fVar.i(6, lVar.computeSize());
                this.f433328i.writeFields(fVar);
            }
            fVar.e(7, this.f433329m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f433323d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f433324e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f433325f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f433326g);
            java.lang.String str8 = this.f433327h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            v53.l lVar2 = this.f433328i;
            if (lVar2 != null) {
                e17 += b36.f.i(6, lVar2.computeSize());
            }
            return e17 + b36.f.e(7, this.f433329m);
        }
        if (i17 == 2) {
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
        v53.b bVar = (v53.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f433323d = aVar2.k(intValue);
                return 0;
            case 2:
                bVar.f433324e = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f433325f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f433326g = aVar2.g(intValue);
                return 0;
            case 5:
                bVar.f433327h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    v53.l lVar3 = new v53.l();
                    if (bArr != null && bArr.length > 0) {
                        lVar3.parseFrom(bArr);
                    }
                    bVar.f433328i = lVar3;
                }
                return 0;
            case 7:
                bVar.f433329m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
