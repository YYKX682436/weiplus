package r45;

/* loaded from: classes4.dex */
public class uu extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.c50 f387645d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f387646e;

    /* renamed from: f, reason: collision with root package name */
    public int f387647f;

    /* renamed from: g, reason: collision with root package name */
    public int f387648g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uu)) {
            return false;
        }
        r45.uu uuVar = (r45.uu) fVar;
        return n51.f.a(this.BaseResponse, uuVar.BaseResponse) && n51.f.a(this.f387645d, uuVar.f387645d) && n51.f.a(this.f387646e, uuVar.f387646e) && n51.f.a(java.lang.Integer.valueOf(this.f387647f), java.lang.Integer.valueOf(uuVar.f387647f)) && n51.f.a(java.lang.Integer.valueOf(this.f387648g), java.lang.Integer.valueOf(uuVar.f387648g));
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
            r45.c50 c50Var = this.f387645d;
            if (c50Var != null) {
                fVar.i(2, c50Var.computeSize());
                this.f387645d.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f387646e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f387646e.writeFields(fVar);
            }
            fVar.e(4, this.f387647f);
            fVar.e(5, this.f387648g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.c50 c50Var2 = this.f387645d;
            if (c50Var2 != null) {
                i18 += b36.f.i(2, c50Var2.computeSize());
            }
            r45.cu5 cu5Var2 = this.f387646e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(4, this.f387647f) + b36.f.e(5, this.f387648g);
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
        r45.uu uuVar = (r45.uu) objArr[1];
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
                uuVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.c50 c50Var3 = new r45.c50();
                if (bArr2 != null && bArr2.length > 0) {
                    c50Var3.parseFrom(bArr2);
                }
                uuVar.f387645d = c50Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                uuVar.f387647f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            uuVar.f387648g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var3.b(bArr3);
            }
            uuVar.f387646e = cu5Var3;
        }
        return 0;
    }
}
