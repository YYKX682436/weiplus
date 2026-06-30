package r45;

/* loaded from: classes7.dex */
public class pq3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kw6 f383305d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383306e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383307f;

    /* renamed from: g, reason: collision with root package name */
    public r45.i7 f383308g;

    /* renamed from: h, reason: collision with root package name */
    public r45.pw6 f383309h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pq3)) {
            return false;
        }
        r45.pq3 pq3Var = (r45.pq3) fVar;
        return n51.f.a(this.BaseResponse, pq3Var.BaseResponse) && n51.f.a(this.f383305d, pq3Var.f383305d) && n51.f.a(this.f383306e, pq3Var.f383306e) && n51.f.a(this.f383307f, pq3Var.f383307f) && n51.f.a(this.f383308g, pq3Var.f383308g) && n51.f.a(this.f383309h, pq3Var.f383309h);
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
            r45.kw6 kw6Var = this.f383305d;
            if (kw6Var != null) {
                fVar.i(2, kw6Var.computeSize());
                this.f383305d.writeFields(fVar);
            }
            java.lang.String str = this.f383306e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383307f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.i7 i7Var = this.f383308g;
            if (i7Var != null) {
                fVar.i(5, i7Var.computeSize());
                this.f383308g.writeFields(fVar);
            }
            r45.pw6 pw6Var = this.f383309h;
            if (pw6Var != null) {
                fVar.i(6, pw6Var.computeSize());
                this.f383309h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.kw6 kw6Var2 = this.f383305d;
            if (kw6Var2 != null) {
                i18 += b36.f.i(2, kw6Var2.computeSize());
            }
            java.lang.String str3 = this.f383306e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f383307f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.i7 i7Var2 = this.f383308g;
            if (i7Var2 != null) {
                i18 += b36.f.i(5, i7Var2.computeSize());
            }
            r45.pw6 pw6Var2 = this.f383309h;
            return pw6Var2 != null ? i18 + b36.f.i(6, pw6Var2.computeSize()) : i18;
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
        r45.pq3 pq3Var = (r45.pq3) objArr[1];
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
                    pq3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kw6 kw6Var3 = new r45.kw6();
                    if (bArr2 != null && bArr2.length > 0) {
                        kw6Var3.parseFrom(bArr2);
                    }
                    pq3Var.f383305d = kw6Var3;
                }
                return 0;
            case 3:
                pq3Var.f383306e = aVar2.k(intValue);
                return 0;
            case 4:
                pq3Var.f383307f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.i7 i7Var3 = new r45.i7();
                    if (bArr3 != null && bArr3.length > 0) {
                        i7Var3.parseFrom(bArr3);
                    }
                    pq3Var.f383308g = i7Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.pw6 pw6Var3 = new r45.pw6();
                    if (bArr4 != null && bArr4.length > 0) {
                        pw6Var3.parseFrom(bArr4);
                    }
                    pq3Var.f383309h = pw6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
