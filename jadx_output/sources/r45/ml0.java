package r45;

/* loaded from: classes8.dex */
public class ml0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380623e;

    /* renamed from: f, reason: collision with root package name */
    public int f380624f;

    /* renamed from: g, reason: collision with root package name */
    public r45.r1 f380625g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ml0)) {
            return false;
        }
        r45.ml0 ml0Var = (r45.ml0) fVar;
        return n51.f.a(this.BaseRequest, ml0Var.BaseRequest) && n51.f.a(this.f380622d, ml0Var.f380622d) && n51.f.a(this.f380623e, ml0Var.f380623e) && n51.f.a(java.lang.Integer.valueOf(this.f380624f), java.lang.Integer.valueOf(ml0Var.f380624f)) && n51.f.a(this.f380625g, ml0Var.f380625g);
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
            java.lang.String str = this.f380622d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380623e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f380624f);
            r45.r1 r1Var = this.f380625g;
            if (r1Var != null) {
                fVar.i(5, r1Var.computeSize());
                this.f380625g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f380622d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f380623e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f380624f);
            r45.r1 r1Var2 = this.f380625g;
            return r1Var2 != null ? e17 + b36.f.i(5, r1Var2.computeSize()) : e17;
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
        r45.ml0 ml0Var = (r45.ml0) objArr[1];
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
                ml0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ml0Var.f380622d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ml0Var.f380623e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ml0Var.f380624f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.r1 r1Var3 = new r45.r1();
            if (bArr2 != null && bArr2.length > 0) {
                r1Var3.parseFrom(bArr2);
            }
            ml0Var.f380625g = r1Var3;
        }
        return 0;
    }
}
