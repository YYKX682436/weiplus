package r45;

/* loaded from: classes2.dex */
public class uw5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.tn4 f387696d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nv3 f387697e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ov3 f387698f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387699g;

    /* renamed from: h, reason: collision with root package name */
    public int f387700h;

    /* renamed from: i, reason: collision with root package name */
    public r45.b7 f387701i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uw5)) {
            return false;
        }
        r45.uw5 uw5Var = (r45.uw5) fVar;
        return n51.f.a(this.BaseResponse, uw5Var.BaseResponse) && n51.f.a(this.f387696d, uw5Var.f387696d) && n51.f.a(this.f387697e, uw5Var.f387697e) && n51.f.a(this.f387698f, uw5Var.f387698f) && n51.f.a(this.f387699g, uw5Var.f387699g) && n51.f.a(java.lang.Integer.valueOf(this.f387700h), java.lang.Integer.valueOf(uw5Var.f387700h)) && n51.f.a(this.f387701i, uw5Var.f387701i);
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
            r45.tn4 tn4Var = this.f387696d;
            if (tn4Var != null) {
                fVar.i(2, tn4Var.computeSize());
                this.f387696d.writeFields(fVar);
            }
            r45.nv3 nv3Var = this.f387697e;
            if (nv3Var != null) {
                fVar.i(3, nv3Var.computeSize());
                this.f387697e.writeFields(fVar);
            }
            r45.ov3 ov3Var = this.f387698f;
            if (ov3Var != null) {
                fVar.i(4, ov3Var.computeSize());
                this.f387698f.writeFields(fVar);
            }
            java.lang.String str = this.f387699g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f387700h);
            r45.b7 b7Var = this.f387701i;
            if (b7Var != null) {
                fVar.i(7, b7Var.computeSize());
                this.f387701i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.tn4 tn4Var2 = this.f387696d;
            if (tn4Var2 != null) {
                i18 += b36.f.i(2, tn4Var2.computeSize());
            }
            r45.nv3 nv3Var2 = this.f387697e;
            if (nv3Var2 != null) {
                i18 += b36.f.i(3, nv3Var2.computeSize());
            }
            r45.ov3 ov3Var2 = this.f387698f;
            if (ov3Var2 != null) {
                i18 += b36.f.i(4, ov3Var2.computeSize());
            }
            java.lang.String str2 = this.f387699g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            int e17 = i18 + b36.f.e(6, this.f387700h);
            r45.b7 b7Var2 = this.f387701i;
            return b7Var2 != null ? e17 + b36.f.i(7, b7Var2.computeSize()) : e17;
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
        r45.uw5 uw5Var = (r45.uw5) objArr[1];
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
                    uw5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tn4 tn4Var3 = new r45.tn4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tn4Var3.parseFrom(bArr2);
                    }
                    uw5Var.f387696d = tn4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.nv3 nv3Var3 = new r45.nv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        nv3Var3.parseFrom(bArr3);
                    }
                    uw5Var.f387697e = nv3Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ov3 ov3Var3 = new r45.ov3();
                    if (bArr4 != null && bArr4.length > 0) {
                        ov3Var3.parseFrom(bArr4);
                    }
                    uw5Var.f387698f = ov3Var3;
                }
                return 0;
            case 5:
                uw5Var.f387699g = aVar2.k(intValue);
                return 0;
            case 6:
                uw5Var.f387700h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.b7 b7Var3 = new r45.b7();
                    if (bArr5 != null && bArr5.length > 0) {
                        b7Var3.parseFrom(bArr5);
                    }
                    uw5Var.f387701i = b7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
