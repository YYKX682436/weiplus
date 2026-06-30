package r45;

/* loaded from: classes4.dex */
public class vb0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388068d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f388069e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388070f;

    /* renamed from: g, reason: collision with root package name */
    public int f388071g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb0)) {
            return false;
        }
        r45.vb0 vb0Var = (r45.vb0) fVar;
        return n51.f.a(this.BaseRequest, vb0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388068d), java.lang.Integer.valueOf(vb0Var.f388068d)) && n51.f.a(this.f388069e, vb0Var.f388069e) && n51.f.a(this.f388070f, vb0Var.f388070f) && n51.f.a(java.lang.Integer.valueOf(this.f388071g), java.lang.Integer.valueOf(vb0Var.f388071g));
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
            fVar.e(2, this.f388068d);
            fVar.g(3, 8, this.f388069e);
            java.lang.String str = this.f388070f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f388071g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388068d) + b36.f.g(3, 8, this.f388069e);
            java.lang.String str2 = this.f388070f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f388071g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388069e.clear();
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
        r45.vb0 vb0Var = (r45.vb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                vb0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            vb0Var.f388068d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                vb0Var.f388070f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            vb0Var.f388071g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.gc0 gc0Var = new r45.gc0();
            if (bArr3 != null && bArr3.length > 0) {
                gc0Var.parseFrom(bArr3);
            }
            vb0Var.f388069e.add(gc0Var);
        }
        return 0;
    }
}
