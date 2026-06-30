package r45;

/* loaded from: classes11.dex */
public class zv5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f392410d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ov3 f392411e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392412f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tn4 f392413g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zv5)) {
            return false;
        }
        r45.zv5 zv5Var = (r45.zv5) fVar;
        return n51.f.a(this.BaseResponse, zv5Var.BaseResponse) && n51.f.a(this.f392410d, zv5Var.f392410d) && n51.f.a(this.f392411e, zv5Var.f392411e) && n51.f.a(this.f392412f, zv5Var.f392412f) && n51.f.a(this.f392413g, zv5Var.f392413g);
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
            r45.nv3 nv3Var = this.f392410d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f392410d.writeFields(fVar);
            }
            r45.ov3 ov3Var = this.f392411e;
            if (ov3Var != null) {
                fVar.i(3, ov3Var.computeSize());
                this.f392411e.writeFields(fVar);
            }
            java.lang.String str = this.f392412f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.tn4 tn4Var = this.f392413g;
            if (tn4Var != null) {
                fVar.i(5, tn4Var.computeSize());
                this.f392413g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f392410d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            r45.ov3 ov3Var2 = this.f392411e;
            if (ov3Var2 != null) {
                i18 += b36.f.i(3, ov3Var2.computeSize());
            }
            java.lang.String str2 = this.f392412f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.tn4 tn4Var2 = this.f392413g;
            return tn4Var2 != null ? i18 + b36.f.i(5, tn4Var2.computeSize()) : i18;
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
        r45.zv5 zv5Var = (r45.zv5) objArr[1];
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
                zv5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr2 != null && bArr2.length > 0) {
                    nv3Var3.parseFrom(bArr2);
                }
                zv5Var.f392410d = nv3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.ov3 ov3Var3 = new r45.ov3();
                if (bArr3 != null && bArr3.length > 0) {
                    ov3Var3.parseFrom(bArr3);
                }
                zv5Var.f392411e = ov3Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            zv5Var.f392412f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.tn4 tn4Var3 = new r45.tn4();
            if (bArr4 != null && bArr4.length > 0) {
                tn4Var3.parseFrom(bArr4);
            }
            zv5Var.f392413g = tn4Var3;
        }
        return 0;
    }
}
