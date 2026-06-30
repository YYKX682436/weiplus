package r45;

/* loaded from: classes8.dex */
public class ln5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f379661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379664g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f379665h;

    /* renamed from: i, reason: collision with root package name */
    public int f379666i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ln5)) {
            return false;
        }
        r45.ln5 ln5Var = (r45.ln5) fVar;
        return n51.f.a(this.BaseRequest, ln5Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f379661d), java.lang.Long.valueOf(ln5Var.f379661d)) && n51.f.a(this.f379662e, ln5Var.f379662e) && n51.f.a(this.f379663f, ln5Var.f379663f) && n51.f.a(this.f379664g, ln5Var.f379664g) && n51.f.a(this.f379665h, ln5Var.f379665h) && n51.f.a(java.lang.Integer.valueOf(this.f379666i), java.lang.Integer.valueOf(ln5Var.f379666i));
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
            fVar.h(2, this.f379661d);
            java.lang.String str = this.f379662e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379663f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f379664g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.cu5 cu5Var = this.f379665h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f379665h.writeFields(fVar);
            }
            fVar.e(7, this.f379666i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f379661d);
            java.lang.String str4 = this.f379662e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f379663f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f379664g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.cu5 cu5Var2 = this.f379665h;
            if (cu5Var2 != null) {
                i18 += b36.f.i(6, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(7, this.f379666i);
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
        r45.ln5 ln5Var = (r45.ln5) objArr[1];
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
                    ln5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ln5Var.f379661d = aVar2.i(intValue);
                return 0;
            case 3:
                ln5Var.f379662e = aVar2.k(intValue);
                return 0;
            case 4:
                ln5Var.f379663f = aVar2.k(intValue);
                return 0;
            case 5:
                ln5Var.f379664g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    ln5Var.f379665h = cu5Var3;
                }
                return 0;
            case 7:
                ln5Var.f379666i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
