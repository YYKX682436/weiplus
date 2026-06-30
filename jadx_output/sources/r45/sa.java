package r45;

/* loaded from: classes4.dex */
public class sa extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385591d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385592e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qd f385593f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385594g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sa)) {
            return false;
        }
        r45.sa saVar = (r45.sa) fVar;
        return n51.f.a(this.BaseResponse, saVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385591d), java.lang.Integer.valueOf(saVar.f385591d)) && n51.f.a(this.f385592e, saVar.f385592e) && n51.f.a(this.f385593f, saVar.f385593f) && n51.f.a(this.f385594g, saVar.f385594g);
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
            fVar.e(2, this.f385591d);
            java.lang.String str = this.f385592e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.qd qdVar = this.f385593f;
            if (qdVar != null) {
                fVar.i(4, qdVar.computeSize());
                this.f385593f.writeFields(fVar);
            }
            java.lang.String str2 = this.f385594g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385591d);
            java.lang.String str3 = this.f385592e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.qd qdVar2 = this.f385593f;
            if (qdVar2 != null) {
                i18 += b36.f.i(4, qdVar2.computeSize());
            }
            java.lang.String str4 = this.f385594g;
            return str4 != null ? i18 + b36.f.j(5, str4) : i18;
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
        r45.sa saVar = (r45.sa) objArr[1];
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
                saVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            saVar.f385591d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            saVar.f385592e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            saVar.f385594g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.qd qdVar3 = new r45.qd();
            if (bArr2 != null && bArr2.length > 0) {
                qdVar3.parseFrom(bArr2);
            }
            saVar.f385593f = qdVar3;
        }
        return 0;
    }
}
