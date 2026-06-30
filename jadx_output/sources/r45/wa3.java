package r45;

/* loaded from: classes8.dex */
public class wa3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f389005d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389006e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vt4 f389007f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ni f389008g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389009h;

    /* renamed from: i, reason: collision with root package name */
    public float f389010i = 0.5f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wa3)) {
            return false;
        }
        r45.wa3 wa3Var = (r45.wa3) fVar;
        return n51.f.a(this.BaseResponse, wa3Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f389005d), java.lang.Long.valueOf(wa3Var.f389005d)) && n51.f.a(this.f389006e, wa3Var.f389006e) && n51.f.a(this.f389007f, wa3Var.f389007f) && n51.f.a(this.f389008g, wa3Var.f389008g) && n51.f.a(this.f389009h, wa3Var.f389009h) && n51.f.a(java.lang.Float.valueOf(this.f389010i), java.lang.Float.valueOf(wa3Var.f389010i));
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
            fVar.h(2, this.f389005d);
            com.tencent.mm.protobuf.g gVar = this.f389006e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.vt4 vt4Var = this.f389007f;
            if (vt4Var != null) {
                fVar.i(4, vt4Var.computeSize());
                this.f389007f.writeFields(fVar);
            }
            r45.ni niVar = this.f389008g;
            if (niVar != null) {
                fVar.i(5, niVar.computeSize());
                this.f389008g.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389009h;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            fVar.d(7, this.f389010i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f389005d);
            com.tencent.mm.protobuf.g gVar3 = this.f389006e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            r45.vt4 vt4Var2 = this.f389007f;
            if (vt4Var2 != null) {
                i18 += b36.f.i(4, vt4Var2.computeSize());
            }
            r45.ni niVar2 = this.f389008g;
            if (niVar2 != null) {
                i18 += b36.f.i(5, niVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f389009h;
            if (gVar4 != null) {
                i18 += b36.f.b(6, gVar4);
            }
            return i18 + b36.f.d(7, this.f389010i);
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
        r45.wa3 wa3Var = (r45.wa3) objArr[1];
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
                    wa3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                wa3Var.f389005d = aVar2.i(intValue);
                return 0;
            case 3:
                wa3Var.f389006e = aVar2.d(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.vt4 vt4Var3 = new r45.vt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        vt4Var3.parseFrom(bArr2);
                    }
                    wa3Var.f389007f = vt4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ni niVar3 = new r45.ni();
                    if (bArr3 != null && bArr3.length > 0) {
                        niVar3.parseFrom(bArr3);
                    }
                    wa3Var.f389008g = niVar3;
                }
                return 0;
            case 6:
                wa3Var.f389009h = aVar2.d(intValue);
                return 0;
            case 7:
                wa3Var.f389010i = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
