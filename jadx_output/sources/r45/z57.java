package r45;

/* loaded from: classes9.dex */
public class z57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391739d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391740e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391741f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f391742g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z57)) {
            return false;
        }
        r45.z57 z57Var = (r45.z57) fVar;
        return n51.f.a(this.f391739d, z57Var.f391739d) && n51.f.a(this.f391740e, z57Var.f391740e) && n51.f.a(this.f391741f, z57Var.f391741f) && n51.f.a(this.f391742g, z57Var.f391742g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391739d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391740e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391741f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.cu5 cu5Var = this.f391742g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f391742g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f391739d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f391740e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f391741f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            r45.cu5 cu5Var2 = this.f391742g;
            return cu5Var2 != null ? j17 + b36.f.i(4, cu5Var2.computeSize()) : j17;
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
        r45.z57 z57Var = (r45.z57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z57Var.f391739d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            z57Var.f391740e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z57Var.f391741f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            z57Var.f391742g = cu5Var3;
        }
        return 0;
    }
}
