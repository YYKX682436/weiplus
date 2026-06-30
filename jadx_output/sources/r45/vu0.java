package r45;

/* loaded from: classes2.dex */
public class vu0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f388573d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388574e;

    /* renamed from: f, reason: collision with root package name */
    public r45.dx0 f388575f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388576g;

    /* renamed from: h, reason: collision with root package name */
    public long f388577h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vu0)) {
            return false;
        }
        r45.vu0 vu0Var = (r45.vu0) fVar;
        return n51.f.a(this.BaseRequest, vu0Var.BaseRequest) && n51.f.a(this.f388573d, vu0Var.f388573d) && n51.f.a(this.f388574e, vu0Var.f388574e) && n51.f.a(this.f388575f, vu0Var.f388575f) && n51.f.a(this.f388576g, vu0Var.f388576g) && n51.f.a(java.lang.Long.valueOf(this.f388577h), java.lang.Long.valueOf(vu0Var.f388577h));
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
            r45.kv0 kv0Var = this.f388573d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f388573d.writeFields(fVar);
            }
            java.lang.String str = this.f388574e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.dx0 dx0Var = this.f388575f;
            if (dx0Var != null) {
                fVar.i(4, dx0Var.computeSize());
                this.f388575f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f388576g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.h(6, this.f388577h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f388573d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str2 = this.f388574e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.dx0 dx0Var2 = this.f388575f;
            if (dx0Var2 != null) {
                i18 += b36.f.i(4, dx0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388576g;
            if (gVar2 != null) {
                i18 += b36.f.b(5, gVar2);
            }
            return i18 + b36.f.h(6, this.f388577h);
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
        r45.vu0 vu0Var = (r45.vu0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    vu0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    vu0Var.f388573d = kv0Var3;
                }
                return 0;
            case 3:
                vu0Var.f388574e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dx0Var3.parseFrom(bArr3);
                    }
                    vu0Var.f388575f = dx0Var3;
                }
                return 0;
            case 5:
                vu0Var.f388576g = aVar2.d(intValue);
                return 0;
            case 6:
                vu0Var.f388577h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
