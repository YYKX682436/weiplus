package r45;

/* loaded from: classes2.dex */
public class fi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.an6 f374378d;

    /* renamed from: e, reason: collision with root package name */
    public int f374379e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374380f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374381g;

    /* renamed from: h, reason: collision with root package name */
    public r45.di4 f374382h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fi3)) {
            return false;
        }
        r45.fi3 fi3Var = (r45.fi3) fVar;
        return n51.f.a(this.BaseResponse, fi3Var.BaseResponse) && n51.f.a(this.f374378d, fi3Var.f374378d) && n51.f.a(java.lang.Integer.valueOf(this.f374379e), java.lang.Integer.valueOf(fi3Var.f374379e)) && n51.f.a(this.f374380f, fi3Var.f374380f) && n51.f.a(this.f374381g, fi3Var.f374381g) && n51.f.a(this.f374382h, fi3Var.f374382h);
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
            r45.an6 an6Var = this.f374378d;
            if (an6Var != null) {
                fVar.i(2, an6Var.computeSize());
                this.f374378d.writeFields(fVar);
            }
            fVar.e(3, this.f374379e);
            java.lang.String str = this.f374380f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f374381g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.di4 di4Var = this.f374382h;
            if (di4Var != null) {
                fVar.i(6, di4Var.computeSize());
                this.f374382h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.an6 an6Var2 = this.f374378d;
            if (an6Var2 != null) {
                i18 += b36.f.i(2, an6Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f374379e);
            java.lang.String str3 = this.f374380f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f374381g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.di4 di4Var2 = this.f374382h;
            return di4Var2 != null ? e17 + b36.f.i(6, di4Var2.computeSize()) : e17;
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
        r45.fi3 fi3Var = (r45.fi3) objArr[1];
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
                    fi3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr2 != null && bArr2.length > 0) {
                        an6Var3.parseFrom(bArr2);
                    }
                    fi3Var.f374378d = an6Var3;
                }
                return 0;
            case 3:
                fi3Var.f374379e = aVar2.g(intValue);
                return 0;
            case 4:
                fi3Var.f374380f = aVar2.k(intValue);
                return 0;
            case 5:
                fi3Var.f374381g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.di4 di4Var3 = new r45.di4();
                    if (bArr3 != null && bArr3.length > 0) {
                        di4Var3.parseFrom(bArr3);
                    }
                    fi3Var.f374382h = di4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
