package r45;

/* loaded from: classes11.dex */
public class ga extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375030d;

    /* renamed from: e, reason: collision with root package name */
    public int f375031e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375032f;

    /* renamed from: g, reason: collision with root package name */
    public r45.la f375033g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ha f375034h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ga)) {
            return false;
        }
        r45.ga gaVar = (r45.ga) fVar;
        return n51.f.a(this.BaseResponse, gaVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f375030d), java.lang.Integer.valueOf(gaVar.f375030d)) && n51.f.a(java.lang.Integer.valueOf(this.f375031e), java.lang.Integer.valueOf(gaVar.f375031e)) && n51.f.a(this.f375032f, gaVar.f375032f) && n51.f.a(this.f375033g, gaVar.f375033g) && n51.f.a(this.f375034h, gaVar.f375034h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f375030d);
            fVar.e(3, this.f375031e);
            com.tencent.mm.protobuf.g gVar = this.f375032f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            r45.la laVar = this.f375033g;
            if (laVar != null) {
                fVar.i(5, laVar.computeSize());
                this.f375033g.writeFields(fVar);
            }
            r45.ha haVar = this.f375034h;
            if (haVar != null) {
                fVar.i(6, haVar.computeSize());
                this.f375034h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f375030d) + b36.f.e(3, this.f375031e);
            com.tencent.mm.protobuf.g gVar2 = this.f375032f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            r45.la laVar2 = this.f375033g;
            if (laVar2 != null) {
                i18 += b36.f.i(5, laVar2.computeSize());
            }
            r45.ha haVar2 = this.f375034h;
            return haVar2 != null ? i18 + b36.f.i(6, haVar2.computeSize()) : i18;
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
        r45.ga gaVar = (r45.ga) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    gaVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                gaVar.f375030d = aVar2.g(intValue);
                return 0;
            case 3:
                gaVar.f375031e = aVar2.g(intValue);
                return 0;
            case 4:
                gaVar.f375032f = aVar2.d(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.la laVar3 = new r45.la();
                    if (bArr2 != null && bArr2.length > 0) {
                        laVar3.parseFrom(bArr2);
                    }
                    gaVar.f375033g = laVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ha haVar3 = new r45.ha();
                    if (bArr3 != null && bArr3.length > 0) {
                        haVar3.parseFrom(bArr3);
                    }
                    gaVar.f375034h = haVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
