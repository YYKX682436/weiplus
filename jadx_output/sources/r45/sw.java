package r45;

/* loaded from: classes4.dex */
public class sw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385992d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385993e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385994f;

    /* renamed from: g, reason: collision with root package name */
    public int f385995g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sw)) {
            return false;
        }
        r45.sw swVar = (r45.sw) fVar;
        return n51.f.a(this.BaseResponse, swVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385992d), java.lang.Integer.valueOf(swVar.f385992d)) && n51.f.a(this.f385993e, swVar.f385993e) && n51.f.a(this.f385994f, swVar.f385994f) && n51.f.a(java.lang.Integer.valueOf(this.f385995g), java.lang.Integer.valueOf(swVar.f385995g));
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
            fVar.e(2, this.f385992d);
            java.lang.String str = this.f385993e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f385994f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f385995g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385992d);
            java.lang.String str2 = this.f385993e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f385994f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            return i18 + b36.f.e(5, this.f385995g);
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
        r45.sw swVar = (r45.sw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                swVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            swVar.f385992d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            swVar.f385993e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            swVar.f385994f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        swVar.f385995g = aVar2.g(intValue);
        return 0;
    }
}
