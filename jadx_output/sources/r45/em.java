package r45;

/* loaded from: classes4.dex */
public class em extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373597e;

    /* renamed from: f, reason: collision with root package name */
    public int f373598f;

    /* renamed from: g, reason: collision with root package name */
    public int f373599g;

    /* renamed from: h, reason: collision with root package name */
    public r45.im f373600h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.em)) {
            return false;
        }
        r45.em emVar = (r45.em) fVar;
        return n51.f.a(this.BaseRequest, emVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f373596d), java.lang.Integer.valueOf(emVar.f373596d)) && n51.f.a(this.f373597e, emVar.f373597e) && n51.f.a(java.lang.Integer.valueOf(this.f373598f), java.lang.Integer.valueOf(emVar.f373598f)) && n51.f.a(java.lang.Integer.valueOf(this.f373599g), java.lang.Integer.valueOf(emVar.f373599g)) && n51.f.a(this.f373600h, emVar.f373600h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f373596d);
            java.lang.String str = this.f373597e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f373598f);
            fVar.e(5, this.f373599g);
            r45.im imVar = this.f373600h;
            if (imVar != null) {
                fVar.i(6, imVar.computeSize());
                this.f373600h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f373596d);
            java.lang.String str2 = this.f373597e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f373598f) + b36.f.e(5, this.f373599g);
            r45.im imVar2 = this.f373600h;
            return imVar2 != null ? e17 + b36.f.i(6, imVar2.computeSize()) : e17;
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
        r45.em emVar = (r45.em) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    emVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                emVar.f373596d = aVar2.g(intValue);
                return 0;
            case 3:
                emVar.f373597e = aVar2.k(intValue);
                return 0;
            case 4:
                emVar.f373598f = aVar2.g(intValue);
                return 0;
            case 5:
                emVar.f373599g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.im imVar3 = new r45.im();
                    if (bArr2 != null && bArr2.length > 0) {
                        imVar3.parseFrom(bArr2);
                    }
                    emVar.f373600h = imVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
