package r45;

/* loaded from: classes2.dex */
public class d00 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f371975d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371976e;

    /* renamed from: f, reason: collision with root package name */
    public int f371977f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371978g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d00)) {
            return false;
        }
        r45.d00 d00Var = (r45.d00) fVar;
        return n51.f.a(this.BaseResponse, d00Var.BaseResponse) && n51.f.a(this.f371975d, d00Var.f371975d) && n51.f.a(this.f371976e, d00Var.f371976e) && n51.f.a(java.lang.Integer.valueOf(this.f371977f), java.lang.Integer.valueOf(d00Var.f371977f)) && n51.f.a(this.f371978g, d00Var.f371978g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371975d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f371976e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f371977f);
            java.lang.String str2 = this.f371978g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str3 = this.f371976e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f371977f);
            java.lang.String str4 = this.f371978g;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.d00 d00Var = (r45.d00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                d00Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                d00Var.f371976e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                d00Var.f371977f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            d00Var.f371978g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.e00 e00Var = new r45.e00();
            if (bArr3 != null && bArr3.length > 0) {
                e00Var.parseFrom(bArr3);
            }
            d00Var.f371975d.add(e00Var);
        }
        return 0;
    }
}
