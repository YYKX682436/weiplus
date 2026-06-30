package r45;

/* loaded from: classes4.dex */
public class uz3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gi5 f387749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387750e;

    /* renamed from: f, reason: collision with root package name */
    public int f387751f;

    /* renamed from: g, reason: collision with root package name */
    public r45.j53 f387752g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xj f387753h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387754i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387755m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uz3)) {
            return false;
        }
        r45.uz3 uz3Var = (r45.uz3) fVar;
        return n51.f.a(this.BaseResponse, uz3Var.BaseResponse) && n51.f.a(this.f387749d, uz3Var.f387749d) && n51.f.a(this.f387750e, uz3Var.f387750e) && n51.f.a(java.lang.Integer.valueOf(this.f387751f), java.lang.Integer.valueOf(uz3Var.f387751f)) && n51.f.a(this.f387752g, uz3Var.f387752g) && n51.f.a(this.f387753h, uz3Var.f387753h) && n51.f.a(this.f387754i, uz3Var.f387754i) && n51.f.a(this.f387755m, uz3Var.f387755m);
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
            r45.gi5 gi5Var = this.f387749d;
            if (gi5Var != null) {
                fVar.i(2, gi5Var.computeSize());
                this.f387749d.writeFields(fVar);
            }
            java.lang.String str = this.f387750e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f387751f);
            r45.j53 j53Var = this.f387752g;
            if (j53Var != null) {
                fVar.i(5, j53Var.computeSize());
                this.f387752g.writeFields(fVar);
            }
            r45.xj xjVar = this.f387753h;
            if (xjVar != null) {
                fVar.i(6, xjVar.computeSize());
                this.f387753h.writeFields(fVar);
            }
            java.lang.String str2 = this.f387754i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f387755m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.gi5 gi5Var2 = this.f387749d;
            if (gi5Var2 != null) {
                i18 += b36.f.i(2, gi5Var2.computeSize());
            }
            java.lang.String str4 = this.f387750e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f387751f);
            r45.j53 j53Var2 = this.f387752g;
            if (j53Var2 != null) {
                e17 += b36.f.i(5, j53Var2.computeSize());
            }
            r45.xj xjVar2 = this.f387753h;
            if (xjVar2 != null) {
                e17 += b36.f.i(6, xjVar2.computeSize());
            }
            java.lang.String str5 = this.f387754i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f387755m;
            return str6 != null ? e17 + b36.f.j(8, str6) : e17;
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
        r45.uz3 uz3Var = (r45.uz3) objArr[1];
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
                    uz3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.gi5 gi5Var3 = new r45.gi5();
                    if (bArr2 != null && bArr2.length > 0) {
                        gi5Var3.parseFrom(bArr2);
                    }
                    uz3Var.f387749d = gi5Var3;
                }
                return 0;
            case 3:
                uz3Var.f387750e = aVar2.k(intValue);
                return 0;
            case 4:
                uz3Var.f387751f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.j53 j53Var3 = new r45.j53();
                    if (bArr3 != null && bArr3.length > 0) {
                        j53Var3.parseFrom(bArr3);
                    }
                    uz3Var.f387752g = j53Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.xj xjVar3 = new r45.xj();
                    if (bArr4 != null && bArr4.length > 0) {
                        xjVar3.parseFrom(bArr4);
                    }
                    uz3Var.f387753h = xjVar3;
                }
                return 0;
            case 7:
                uz3Var.f387754i = aVar2.k(intValue);
                return 0;
            case 8:
                uz3Var.f387755m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
