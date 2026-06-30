package r45;

/* loaded from: classes4.dex */
public class do4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372620d;

    /* renamed from: e, reason: collision with root package name */
    public int f372621e;

    /* renamed from: f, reason: collision with root package name */
    public int f372622f;

    /* renamed from: g, reason: collision with root package name */
    public int f372623g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.do4)) {
            return false;
        }
        r45.do4 do4Var = (r45.do4) fVar;
        return n51.f.a(this.BaseResponse, do4Var.BaseResponse) && n51.f.a(this.f372620d, do4Var.f372620d) && n51.f.a(java.lang.Integer.valueOf(this.f372621e), java.lang.Integer.valueOf(do4Var.f372621e)) && n51.f.a(java.lang.Integer.valueOf(this.f372622f), java.lang.Integer.valueOf(do4Var.f372622f)) && n51.f.a(java.lang.Integer.valueOf(this.f372623g), java.lang.Integer.valueOf(do4Var.f372623g));
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
            java.lang.String str = this.f372620d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f372621e);
            fVar.e(4, this.f372622f);
            fVar.e(5, this.f372623g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f372620d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f372621e) + b36.f.e(4, this.f372622f) + b36.f.e(5, this.f372623g);
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
        r45.do4 do4Var = (r45.do4) objArr[1];
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
                do4Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            do4Var.f372620d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            do4Var.f372621e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            do4Var.f372622f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        do4Var.f372623g = aVar2.g(intValue);
        return 0;
    }
}
