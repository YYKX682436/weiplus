package r45;

/* loaded from: classes9.dex */
public class ex5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cx5 f373787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373789f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex5)) {
            return false;
        }
        r45.ex5 ex5Var = (r45.ex5) fVar;
        return n51.f.a(this.BaseResponse, ex5Var.BaseResponse) && n51.f.a(this.f373787d, ex5Var.f373787d) && n51.f.a(this.f373788e, ex5Var.f373788e) && n51.f.a(this.f373789f, ex5Var.f373789f);
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
            r45.cx5 cx5Var = this.f373787d;
            if (cx5Var != null) {
                fVar.i(2, cx5Var.computeSize());
                this.f373787d.writeFields(fVar);
            }
            java.lang.String str = this.f373788e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373789f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cx5 cx5Var2 = this.f373787d;
            if (cx5Var2 != null) {
                i18 += b36.f.i(2, cx5Var2.computeSize());
            }
            java.lang.String str3 = this.f373788e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f373789f;
            return str4 != null ? i18 + b36.f.j(4, str4) : i18;
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
        r45.ex5 ex5Var = (r45.ex5) objArr[1];
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
                ex5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ex5Var.f373788e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ex5Var.f373789f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cx5 cx5Var3 = new r45.cx5();
            if (bArr2 != null && bArr2.length > 0) {
                cx5Var3.parseFrom(bArr2);
            }
            ex5Var.f373787d = cx5Var3;
        }
        return 0;
    }
}
