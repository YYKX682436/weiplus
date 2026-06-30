package r45;

/* loaded from: classes7.dex */
public class ph6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383060d;

    /* renamed from: e, reason: collision with root package name */
    public r45.od7 f383061e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pd7 f383062f;

    /* renamed from: g, reason: collision with root package name */
    public r45.qd7 f383063g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cg7 f383064h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ph6)) {
            return false;
        }
        r45.ph6 ph6Var = (r45.ph6) fVar;
        return n51.f.a(this.BaseRequest, ph6Var.BaseRequest) && n51.f.a(this.f383060d, ph6Var.f383060d) && n51.f.a(this.f383061e, ph6Var.f383061e) && n51.f.a(this.f383062f, ph6Var.f383062f) && n51.f.a(this.f383063g, ph6Var.f383063g) && n51.f.a(this.f383064h, ph6Var.f383064h);
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
            java.lang.String str = this.f383060d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.od7 od7Var = this.f383061e;
            if (od7Var != null) {
                fVar.i(3, od7Var.computeSize());
                this.f383061e.writeFields(fVar);
            }
            r45.pd7 pd7Var = this.f383062f;
            if (pd7Var != null) {
                fVar.i(6, pd7Var.computeSize());
                this.f383062f.writeFields(fVar);
            }
            r45.qd7 qd7Var = this.f383063g;
            if (qd7Var != null) {
                fVar.i(7, qd7Var.computeSize());
                this.f383063g.writeFields(fVar);
            }
            r45.cg7 cg7Var = this.f383064h;
            if (cg7Var != null) {
                fVar.i(8, cg7Var.computeSize());
                this.f383064h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f383060d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.od7 od7Var2 = this.f383061e;
            if (od7Var2 != null) {
                i18 += b36.f.i(3, od7Var2.computeSize());
            }
            r45.pd7 pd7Var2 = this.f383062f;
            if (pd7Var2 != null) {
                i18 += b36.f.i(6, pd7Var2.computeSize());
            }
            r45.qd7 qd7Var2 = this.f383063g;
            if (qd7Var2 != null) {
                i18 += b36.f.i(7, qd7Var2.computeSize());
            }
            r45.cg7 cg7Var2 = this.f383064h;
            return cg7Var2 != null ? i18 + b36.f.i(8, cg7Var2.computeSize()) : i18;
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
        r45.ph6 ph6Var = (r45.ph6) objArr[1];
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
                ph6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ph6Var.f383060d = aVar2.k(intValue);
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
                ph6Var.f383061e = od7Var3;
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
                ph6Var.f383062f = pd7Var3;
            }
            return 0;
        }
        if (intValue == 7) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.qd7 qd7Var3 = new r45.qd7();
                if (bArr4 != null && bArr4.length > 0) {
                    qd7Var3.parseFrom(bArr4);
                }
                ph6Var.f383063g = qd7Var3;
            }
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.cg7 cg7Var3 = new r45.cg7();
            if (bArr5 != null && bArr5.length > 0) {
                cg7Var3.parseFrom(bArr5);
            }
            ph6Var.f383064h = cg7Var3;
        }
        return 0;
    }
}
