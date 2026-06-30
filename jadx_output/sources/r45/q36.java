package r45;

/* loaded from: classes4.dex */
public class q36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f383633d;

    /* renamed from: e, reason: collision with root package name */
    public int f383634e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f383635f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f383636g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q36)) {
            return false;
        }
        r45.q36 q36Var = (r45.q36) fVar;
        return n51.f.a(this.BaseRequest, q36Var.BaseRequest) && n51.f.a(this.f383633d, q36Var.f383633d) && n51.f.a(java.lang.Integer.valueOf(this.f383634e), java.lang.Integer.valueOf(q36Var.f383634e)) && n51.f.a(this.f383635f, q36Var.f383635f) && n51.f.a(this.f383636g, q36Var.f383636g);
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
            r45.cu5 cu5Var = this.f383633d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f383633d.writeFields(fVar);
            }
            fVar.e(3, this.f383634e);
            r45.cu5 cu5Var2 = this.f383635f;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.computeSize());
                this.f383635f.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f383636g;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.computeSize());
                this.f383636g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var4 = this.f383633d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f383634e);
            r45.cu5 cu5Var5 = this.f383635f;
            if (cu5Var5 != null) {
                e17 += b36.f.i(4, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f383636g;
            return cu5Var6 != null ? e17 + b36.f.i(5, cu5Var6.computeSize()) : e17;
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
        r45.q36 q36Var = (r45.q36) objArr[1];
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
                q36Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var7 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var7.b(bArr2);
                }
                q36Var.f383633d = cu5Var7;
            }
            return 0;
        }
        if (intValue == 3) {
            q36Var.f383634e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.cu5 cu5Var8 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var8.b(bArr3);
                }
                q36Var.f383635f = cu5Var8;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.cu5 cu5Var9 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var9.b(bArr4);
            }
            q36Var.f383636g = cu5Var9;
        }
        return 0;
    }
}
