package r45;

/* loaded from: classes9.dex */
public class gx1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zx1 f375593d;

    /* renamed from: e, reason: collision with root package name */
    public int f375594e;

    /* renamed from: f, reason: collision with root package name */
    public int f375595f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ox1 f375596g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gx1)) {
            return false;
        }
        r45.gx1 gx1Var = (r45.gx1) fVar;
        return n51.f.a(this.BaseResponse, gx1Var.BaseResponse) && n51.f.a(this.f375593d, gx1Var.f375593d) && n51.f.a(java.lang.Integer.valueOf(this.f375594e), java.lang.Integer.valueOf(gx1Var.f375594e)) && n51.f.a(java.lang.Integer.valueOf(this.f375595f), java.lang.Integer.valueOf(gx1Var.f375595f)) && n51.f.a(this.f375596g, gx1Var.f375596g);
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
            r45.zx1 zx1Var = this.f375593d;
            if (zx1Var != null) {
                fVar.i(2, zx1Var.computeSize());
                this.f375593d.writeFields(fVar);
            }
            fVar.e(3, this.f375594e);
            fVar.e(4, this.f375595f);
            r45.ox1 ox1Var = this.f375596g;
            if (ox1Var != null) {
                fVar.i(5, ox1Var.computeSize());
                this.f375596g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.zx1 zx1Var2 = this.f375593d;
            if (zx1Var2 != null) {
                i18 += b36.f.i(2, zx1Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f375594e) + b36.f.e(4, this.f375595f);
            r45.ox1 ox1Var2 = this.f375596g;
            return ox1Var2 != null ? e17 + b36.f.i(5, ox1Var2.computeSize()) : e17;
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
        r45.gx1 gx1Var = (r45.gx1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                gx1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.zx1 zx1Var3 = new r45.zx1();
                if (bArr2 != null && bArr2.length > 0) {
                    zx1Var3.parseFrom(bArr2);
                }
                gx1Var.f375593d = zx1Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            gx1Var.f375594e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            gx1Var.f375595f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.ox1 ox1Var3 = new r45.ox1();
            if (bArr3 != null && bArr3.length > 0) {
                ox1Var3.parseFrom(bArr3);
            }
            gx1Var.f375596g = ox1Var3;
        }
        return 0;
    }
}
