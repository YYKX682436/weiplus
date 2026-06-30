package r45;

/* loaded from: classes8.dex */
public class hx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376522d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376523e;

    /* renamed from: f, reason: collision with root package name */
    public int f376524f;

    /* renamed from: g, reason: collision with root package name */
    public r45.jv3 f376525g;

    /* renamed from: h, reason: collision with root package name */
    public r45.nu5 f376526h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx)) {
            return false;
        }
        r45.hx hxVar = (r45.hx) fVar;
        return n51.f.a(this.BaseResponse, hxVar.BaseResponse) && n51.f.a(this.f376522d, hxVar.f376522d) && n51.f.a(this.f376523e, hxVar.f376523e) && n51.f.a(java.lang.Integer.valueOf(this.f376524f), java.lang.Integer.valueOf(hxVar.f376524f)) && n51.f.a(this.f376525g, hxVar.f376525g) && n51.f.a(this.f376526h, hxVar.f376526h);
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
            java.lang.String str = this.f376522d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376523e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f376524f);
            r45.jv3 jv3Var = this.f376525g;
            if (jv3Var != null) {
                fVar.i(5, jv3Var.computeSize());
                this.f376525g.writeFields(fVar);
            }
            r45.nu5 nu5Var = this.f376526h;
            if (nu5Var != null) {
                fVar.i(6, nu5Var.computeSize());
                this.f376526h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f376522d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f376523e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f376524f);
            r45.jv3 jv3Var2 = this.f376525g;
            if (jv3Var2 != null) {
                e17 += b36.f.i(5, jv3Var2.computeSize());
            }
            r45.nu5 nu5Var2 = this.f376526h;
            return nu5Var2 != null ? e17 + b36.f.i(6, nu5Var2.computeSize()) : e17;
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
        r45.hx hxVar = (r45.hx) objArr[1];
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
                    hxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hxVar.f376522d = aVar2.k(intValue);
                return 0;
            case 3:
                hxVar.f376523e = aVar2.k(intValue);
                return 0;
            case 4:
                hxVar.f376524f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.jv3 jv3Var3 = new r45.jv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        jv3Var3.parseFrom(bArr2);
                    }
                    hxVar.f376525g = jv3Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.nu5 nu5Var3 = new r45.nu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        nu5Var3.parseFrom(bArr3);
                    }
                    hxVar.f376526h = nu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
