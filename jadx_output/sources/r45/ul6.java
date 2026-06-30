package r45;

/* loaded from: classes4.dex */
public class ul6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387469d;

    /* renamed from: e, reason: collision with root package name */
    public int f387470e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387471f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f387472g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ul6)) {
            return false;
        }
        r45.ul6 ul6Var = (r45.ul6) fVar;
        return n51.f.a(this.BaseRequest, ul6Var.BaseRequest) && n51.f.a(this.f387469d, ul6Var.f387469d) && n51.f.a(java.lang.Integer.valueOf(this.f387470e), java.lang.Integer.valueOf(ul6Var.f387470e)) && n51.f.a(this.f387471f, ul6Var.f387471f) && n51.f.a(this.f387472g, ul6Var.f387472g);
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
            java.lang.String str = this.f387469d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f387470e);
            java.lang.String str2 = this.f387471f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.cu5 cu5Var = this.f387472g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f387472g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f387469d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f387470e);
            java.lang.String str4 = this.f387471f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f387472g;
            return cu5Var2 != null ? e17 + b36.f.i(5, cu5Var2.computeSize()) : e17;
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
        r45.ul6 ul6Var = (r45.ul6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                ul6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ul6Var.f387469d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ul6Var.f387470e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ul6Var.f387471f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            ul6Var.f387472g = cu5Var3;
        }
        return 0;
    }
}
