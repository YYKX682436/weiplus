package r45;

/* loaded from: classes7.dex */
public class ws3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389412d;

    /* renamed from: e, reason: collision with root package name */
    public r45.od7 f389413e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pd7 f389414f;

    /* renamed from: g, reason: collision with root package name */
    public r45.qd7 f389415g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ws3)) {
            return false;
        }
        r45.ws3 ws3Var = (r45.ws3) fVar;
        return n51.f.a(this.BaseRequest, ws3Var.BaseRequest) && n51.f.a(this.f389412d, ws3Var.f389412d) && n51.f.a(this.f389413e, ws3Var.f389413e) && n51.f.a(this.f389414f, ws3Var.f389414f) && n51.f.a(this.f389415g, ws3Var.f389415g);
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
            java.lang.String str = this.f389412d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.od7 od7Var = this.f389413e;
            if (od7Var != null) {
                fVar.i(3, od7Var.computeSize());
                this.f389413e.writeFields(fVar);
            }
            r45.pd7 pd7Var = this.f389414f;
            if (pd7Var != null) {
                fVar.i(6, pd7Var.computeSize());
                this.f389414f.writeFields(fVar);
            }
            r45.qd7 qd7Var = this.f389415g;
            if (qd7Var != null) {
                fVar.i(7, qd7Var.computeSize());
                this.f389415g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f389412d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.od7 od7Var2 = this.f389413e;
            if (od7Var2 != null) {
                i18 += b36.f.i(3, od7Var2.computeSize());
            }
            r45.pd7 pd7Var2 = this.f389414f;
            if (pd7Var2 != null) {
                i18 += b36.f.i(6, pd7Var2.computeSize());
            }
            r45.qd7 qd7Var2 = this.f389415g;
            return qd7Var2 != null ? i18 + b36.f.i(7, qd7Var2.computeSize()) : i18;
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
        r45.ws3 ws3Var = (r45.ws3) objArr[1];
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
                ws3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ws3Var.f389412d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.od7 od7Var3 = new r45.od7();
                if (bArr2 != null && bArr2.length > 0) {
                    od7Var3.parseFrom(bArr2);
                }
                ws3Var.f389413e = od7Var3;
            }
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.pd7 pd7Var3 = new r45.pd7();
                if (bArr3 != null && bArr3.length > 0) {
                    pd7Var3.parseFrom(bArr3);
                }
                ws3Var.f389414f = pd7Var3;
            }
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.qd7 qd7Var3 = new r45.qd7();
            if (bArr4 != null && bArr4.length > 0) {
                qd7Var3.parseFrom(bArr4);
            }
            ws3Var.f389415g = qd7Var3;
        }
        return 0;
    }
}
