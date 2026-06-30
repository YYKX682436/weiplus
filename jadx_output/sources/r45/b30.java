package r45;

/* loaded from: classes4.dex */
public class b30 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370491d;

    /* renamed from: e, reason: collision with root package name */
    public r45.x17 f370492e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zu6 f370493f;

    /* renamed from: g, reason: collision with root package name */
    public r45.oh5 f370494g;

    /* renamed from: h, reason: collision with root package name */
    public int f370495h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b30)) {
            return false;
        }
        r45.b30 b30Var = (r45.b30) fVar;
        return n51.f.a(this.BaseResponse, b30Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370491d), java.lang.Integer.valueOf(b30Var.f370491d)) && n51.f.a(this.f370492e, b30Var.f370492e) && n51.f.a(this.f370493f, b30Var.f370493f) && n51.f.a(this.f370494g, b30Var.f370494g) && n51.f.a(java.lang.Integer.valueOf(this.f370495h), java.lang.Integer.valueOf(b30Var.f370495h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f370491d);
            r45.x17 x17Var = this.f370492e;
            if (x17Var != null) {
                fVar.i(3, x17Var.computeSize());
                this.f370492e.writeFields(fVar);
            }
            r45.zu6 zu6Var = this.f370493f;
            if (zu6Var != null) {
                fVar.i(4, zu6Var.computeSize());
                this.f370493f.writeFields(fVar);
            }
            r45.oh5 oh5Var = this.f370494g;
            if (oh5Var != null) {
                fVar.i(5, oh5Var.computeSize());
                this.f370494g.writeFields(fVar);
            }
            fVar.e(6, this.f370495h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370491d);
            r45.x17 x17Var2 = this.f370492e;
            if (x17Var2 != null) {
                i18 += b36.f.i(3, x17Var2.computeSize());
            }
            r45.zu6 zu6Var2 = this.f370493f;
            if (zu6Var2 != null) {
                i18 += b36.f.i(4, zu6Var2.computeSize());
            }
            r45.oh5 oh5Var2 = this.f370494g;
            if (oh5Var2 != null) {
                i18 += b36.f.i(5, oh5Var2.computeSize());
            }
            return i18 + b36.f.e(6, this.f370495h);
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
        r45.b30 b30Var = (r45.b30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    b30Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                b30Var.f370491d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.x17 x17Var3 = new r45.x17();
                    if (bArr2 != null && bArr2.length > 0) {
                        x17Var3.parseFrom(bArr2);
                    }
                    b30Var.f370492e = x17Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zu6 zu6Var3 = new r45.zu6();
                    if (bArr3 != null && bArr3.length > 0) {
                        zu6Var3.parseFrom(bArr3);
                    }
                    b30Var.f370493f = zu6Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.oh5 oh5Var3 = new r45.oh5();
                    if (bArr4 != null && bArr4.length > 0) {
                        oh5Var3.parseFrom(bArr4);
                    }
                    b30Var.f370494g = oh5Var3;
                }
                return 0;
            case 6:
                b30Var.f370495h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
