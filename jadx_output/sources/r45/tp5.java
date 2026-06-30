package r45;

/* loaded from: classes9.dex */
public class tp5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f386655d;

    /* renamed from: e, reason: collision with root package name */
    public long f386656e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f386657f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.je0 f386658g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp5)) {
            return false;
        }
        r45.tp5 tp5Var = (r45.tp5) fVar;
        return n51.f.a(this.BaseRequest, tp5Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f386655d), java.lang.Long.valueOf(tp5Var.f386655d)) && n51.f.a(java.lang.Long.valueOf(this.f386656e), java.lang.Long.valueOf(tp5Var.f386656e)) && n51.f.a(this.f386657f, tp5Var.f386657f) && n51.f.a(this.f386658g, tp5Var.f386658g);
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
            fVar.h(2, this.f386655d);
            fVar.h(3, this.f386656e);
            fVar.g(4, 8, this.f386657f);
            r45.je0 je0Var = this.f386658g;
            if (je0Var != null) {
                fVar.i(5, je0Var.computeSize());
                this.f386658g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f386655d) + b36.f.h(3, this.f386656e) + b36.f.g(4, 8, this.f386657f);
            r45.je0 je0Var2 = this.f386658g;
            return je0Var2 != null ? i18 + b36.f.i(5, je0Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386657f.clear();
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
        r45.tp5 tp5Var = (r45.tp5) objArr[1];
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
                tp5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            tp5Var.f386655d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            tp5Var.f386656e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.im0 im0Var = new r45.im0();
                if (bArr3 != null && bArr3.length > 0) {
                    im0Var.parseFrom(bArr3);
                }
                tp5Var.f386657f.add(im0Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.je0 je0Var3 = new r45.je0();
            if (bArr4 != null && bArr4.length > 0) {
                je0Var3.parseFrom(bArr4);
            }
            tp5Var.f386658g = je0Var3;
        }
        return 0;
    }
}
