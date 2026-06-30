package r45;

/* loaded from: classes8.dex */
public class dj5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f372531d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yi5 f372532e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dj5)) {
            return false;
        }
        r45.dj5 dj5Var = (r45.dj5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372531d), java.lang.Integer.valueOf(dj5Var.f372531d)) && n51.f.a(this.f372532e, dj5Var.f372532e) && n51.f.a(this.BaseResponse, dj5Var.BaseResponse);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372531d);
            r45.yi5 yi5Var = this.f372532e;
            if (yi5Var != null) {
                fVar.i(2, yi5Var.computeSize());
                this.f372532e.writeFields(fVar);
            }
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(3, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372531d) + 0;
            r45.yi5 yi5Var2 = this.f372532e;
            if (yi5Var2 != null) {
                e17 += b36.f.i(2, yi5Var2.computeSize());
            }
            r45.ie ieVar2 = this.BaseResponse;
            return ieVar2 != null ? e17 + b36.f.i(3, ieVar2.computeSize()) : e17;
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
        r45.dj5 dj5Var = (r45.dj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dj5Var.f372531d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.yi5 yi5Var3 = new r45.yi5();
                if (bArr != null && bArr.length > 0) {
                    yi5Var3.parseFrom(bArr);
                }
                dj5Var.f372532e = yi5Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr2 != null && bArr2.length > 0) {
                ieVar3.parseFrom(bArr2);
            }
            dj5Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
