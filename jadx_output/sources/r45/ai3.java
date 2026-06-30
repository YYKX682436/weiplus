package r45;

/* loaded from: classes4.dex */
public class ai3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f370019d;

    /* renamed from: e, reason: collision with root package name */
    public int f370020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370021f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370022g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f370023h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ai3)) {
            return false;
        }
        r45.ai3 ai3Var = (r45.ai3) fVar;
        return n51.f.a(this.BaseRequest, ai3Var.BaseRequest) && n51.f.a(this.f370019d, ai3Var.f370019d) && n51.f.a(java.lang.Integer.valueOf(this.f370020e), java.lang.Integer.valueOf(ai3Var.f370020e)) && n51.f.a(this.f370021f, ai3Var.f370021f) && n51.f.a(this.f370022g, ai3Var.f370022g) && n51.f.a(this.f370023h, ai3Var.f370023h);
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
            r45.cu5 cu5Var = this.f370019d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f370019d.writeFields(fVar);
            }
            fVar.e(3, this.f370020e);
            java.lang.String str = this.f370021f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f370022g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.cu5 cu5Var2 = this.f370023h;
            if (cu5Var2 != null) {
                fVar.i(11, cu5Var2.computeSize());
                this.f370023h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var3 = this.f370019d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f370020e);
            java.lang.String str3 = this.f370021f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f370022g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            r45.cu5 cu5Var4 = this.f370023h;
            return cu5Var4 != null ? e17 + b36.f.i(11, cu5Var4.computeSize()) : e17;
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
        r45.ai3 ai3Var = (r45.ai3) objArr[1];
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
                ai3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var5.b(bArr2);
                }
                ai3Var.f370019d = cu5Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            ai3Var.f370020e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ai3Var.f370021f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            ai3Var.f370022g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 11) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var6.b(bArr3);
            }
            ai3Var.f370023h = cu5Var6;
        }
        return 0;
    }
}
