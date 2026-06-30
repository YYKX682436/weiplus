package r45;

/* loaded from: classes8.dex */
public class tu extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386804d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f386805e;

    /* renamed from: f, reason: collision with root package name */
    public r45.w54 f386806f;

    /* renamed from: g, reason: collision with root package name */
    public int f386807g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tu)) {
            return false;
        }
        r45.tu tuVar = (r45.tu) fVar;
        return n51.f.a(this.BaseRequest, tuVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386804d), java.lang.Integer.valueOf(tuVar.f386804d)) && n51.f.a(this.f386805e, tuVar.f386805e) && n51.f.a(this.f386806f, tuVar.f386806f) && n51.f.a(java.lang.Integer.valueOf(this.f386807g), java.lang.Integer.valueOf(tuVar.f386807g));
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
            fVar.e(2, this.f386804d);
            r45.cu5 cu5Var = this.f386805e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f386805e.writeFields(fVar);
            }
            r45.w54 w54Var = this.f386806f;
            if (w54Var != null) {
                fVar.i(4, w54Var.computeSize());
                this.f386806f.writeFields(fVar);
            }
            fVar.e(5, this.f386807g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386804d);
            r45.cu5 cu5Var2 = this.f386805e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            r45.w54 w54Var2 = this.f386806f;
            if (w54Var2 != null) {
                i18 += b36.f.i(4, w54Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f386807g);
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
        r45.tu tuVar = (r45.tu) objArr[1];
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
                tuVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            tuVar.f386804d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var3.b(bArr2);
                }
                tuVar.f386805e = cu5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            tuVar.f386807g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.w54 w54Var3 = new r45.w54();
            if (bArr3 != null && bArr3.length > 0) {
                w54Var3.parseFrom(bArr3);
            }
            tuVar.f386806f = w54Var3;
        }
        return 0;
    }
}
