package r45;

/* loaded from: classes2.dex */
public class lz5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380010e;

    /* renamed from: f, reason: collision with root package name */
    public long f380011f;

    /* renamed from: g, reason: collision with root package name */
    public int f380012g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lz5)) {
            return false;
        }
        r45.lz5 lz5Var = (r45.lz5) fVar;
        return n51.f.a(this.BaseResponse, lz5Var.BaseResponse) && n51.f.a(this.f380009d, lz5Var.f380009d) && n51.f.a(this.f380010e, lz5Var.f380010e) && n51.f.a(java.lang.Long.valueOf(this.f380011f), java.lang.Long.valueOf(lz5Var.f380011f)) && n51.f.a(java.lang.Integer.valueOf(this.f380012g), java.lang.Integer.valueOf(lz5Var.f380012g));
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
            java.lang.String str = this.f380009d;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380010e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f380011f);
            fVar.e(6, this.f380012g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f380009d;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f380010e;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.h(5, this.f380011f) + b36.f.e(6, this.f380012g);
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
        r45.lz5 lz5Var = (r45.lz5) objArr[1];
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
                lz5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            lz5Var.f380009d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            lz5Var.f380010e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            lz5Var.f380011f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        lz5Var.f380012g = aVar2.g(intValue);
        return 0;
    }
}
