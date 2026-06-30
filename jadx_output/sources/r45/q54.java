package r45;

/* loaded from: classes7.dex */
public class q54 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383688e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f383689f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f383690g;

    /* renamed from: h, reason: collision with root package name */
    public int f383691h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383692i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ge7 f383693m;

    /* renamed from: n, reason: collision with root package name */
    public r45.j14 f383694n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q54)) {
            return false;
        }
        r45.q54 q54Var = (r45.q54) fVar;
        return n51.f.a(this.BaseResponse, q54Var.BaseResponse) && n51.f.a(this.f383687d, q54Var.f383687d) && n51.f.a(this.f383688e, q54Var.f383688e) && n51.f.a(java.lang.Boolean.valueOf(this.f383689f), java.lang.Boolean.valueOf(q54Var.f383689f)) && n51.f.a(java.lang.Boolean.valueOf(this.f383690g), java.lang.Boolean.valueOf(q54Var.f383690g)) && n51.f.a(java.lang.Integer.valueOf(this.f383691h), java.lang.Integer.valueOf(q54Var.f383691h)) && n51.f.a(this.f383692i, q54Var.f383692i) && n51.f.a(this.f383693m, q54Var.f383693m) && n51.f.a(this.f383694n, q54Var.f383694n);
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
            java.lang.String str = this.f383687d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383688e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f383689f);
            fVar.a(5, this.f383690g);
            fVar.e(6, this.f383691h);
            java.lang.String str3 = this.f383692i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.ge7 ge7Var = this.f383693m;
            if (ge7Var != null) {
                fVar.i(8, ge7Var.computeSize());
                this.f383693m.writeFields(fVar);
            }
            r45.j14 j14Var = this.f383694n;
            if (j14Var != null) {
                fVar.i(9, j14Var.computeSize());
                this.f383694n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f383687d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f383688e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(4, this.f383689f) + b36.f.a(5, this.f383690g) + b36.f.e(6, this.f383691h);
            java.lang.String str6 = this.f383692i;
            if (str6 != null) {
                a17 += b36.f.j(7, str6);
            }
            r45.ge7 ge7Var2 = this.f383693m;
            if (ge7Var2 != null) {
                a17 += b36.f.i(8, ge7Var2.computeSize());
            }
            r45.j14 j14Var2 = this.f383694n;
            return j14Var2 != null ? a17 + b36.f.i(9, j14Var2.computeSize()) : a17;
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
        r45.q54 q54Var = (r45.q54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    q54Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                q54Var.f383687d = aVar2.k(intValue);
                return 0;
            case 3:
                q54Var.f383688e = aVar2.k(intValue);
                return 0;
            case 4:
                q54Var.f383689f = aVar2.c(intValue);
                return 0;
            case 5:
                q54Var.f383690g = aVar2.c(intValue);
                return 0;
            case 6:
                q54Var.f383691h = aVar2.g(intValue);
                return 0;
            case 7:
                q54Var.f383692i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ge7 ge7Var3 = new r45.ge7();
                    if (bArr2 != null && bArr2.length > 0) {
                        ge7Var3.parseFrom(bArr2);
                    }
                    q54Var.f383693m = ge7Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.parseFrom(bArr3);
                    }
                    q54Var.f383694n = j14Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
