package r45;

/* loaded from: classes9.dex */
public class kh6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gc f378701d;

    /* renamed from: e, reason: collision with root package name */
    public int f378702e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kc f378703f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378704g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kh6)) {
            return false;
        }
        r45.kh6 kh6Var = (r45.kh6) fVar;
        return n51.f.a(this.BaseResponse, kh6Var.BaseResponse) && n51.f.a(this.f378701d, kh6Var.f378701d) && n51.f.a(java.lang.Integer.valueOf(this.f378702e), java.lang.Integer.valueOf(kh6Var.f378702e)) && n51.f.a(this.f378703f, kh6Var.f378703f) && n51.f.a(this.f378704g, kh6Var.f378704g);
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
            r45.gc gcVar = this.f378701d;
            if (gcVar != null) {
                fVar.i(2, gcVar.computeSize());
                this.f378701d.writeFields(fVar);
            }
            fVar.e(3, this.f378702e);
            r45.kc kcVar = this.f378703f;
            if (kcVar != null) {
                fVar.i(4, kcVar.computeSize());
                this.f378703f.writeFields(fVar);
            }
            java.lang.String str = this.f378704g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.gc gcVar2 = this.f378701d;
            if (gcVar2 != null) {
                i18 += b36.f.i(2, gcVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f378702e);
            r45.kc kcVar2 = this.f378703f;
            if (kcVar2 != null) {
                e17 += b36.f.i(4, kcVar2.computeSize());
            }
            java.lang.String str2 = this.f378704g;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.kh6 kh6Var = (r45.kh6) objArr[1];
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
                kh6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.gc gcVar3 = new r45.gc();
                if (bArr2 != null && bArr2.length > 0) {
                    gcVar3.parseFrom(bArr2);
                }
                kh6Var.f378701d = gcVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            kh6Var.f378702e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            kh6Var.f378704g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.kc kcVar3 = new r45.kc();
            if (bArr3 != null && bArr3.length > 0) {
                kcVar3.parseFrom(bArr3);
            }
            kh6Var.f378703f = kcVar3;
        }
        return 0;
    }
}
