package r45;

/* loaded from: classes9.dex */
public class qz4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384366d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384367e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384368f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384369g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384370h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ka5 f384371i;

    /* renamed from: m, reason: collision with root package name */
    public r45.x15 f384372m;

    /* renamed from: n, reason: collision with root package name */
    public r45.wz3 f384373n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz4)) {
            return false;
        }
        r45.qz4 qz4Var = (r45.qz4) fVar;
        return n51.f.a(this.BaseResponse, qz4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384366d), java.lang.Integer.valueOf(qz4Var.f384366d)) && n51.f.a(this.f384367e, qz4Var.f384367e) && n51.f.a(this.f384368f, qz4Var.f384368f) && n51.f.a(this.f384369g, qz4Var.f384369g) && n51.f.a(this.f384370h, qz4Var.f384370h) && n51.f.a(this.f384371i, qz4Var.f384371i) && n51.f.a(this.f384372m, qz4Var.f384372m) && n51.f.a(this.f384373n, qz4Var.f384373n);
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
            fVar.e(2, this.f384366d);
            java.lang.String str = this.f384367e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384368f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f384369g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f384370h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.ka5 ka5Var = this.f384371i;
            if (ka5Var != null) {
                fVar.i(7, ka5Var.computeSize());
                this.f384371i.writeFields(fVar);
            }
            r45.x15 x15Var = this.f384372m;
            if (x15Var != null) {
                fVar.i(8, x15Var.computeSize());
                this.f384372m.writeFields(fVar);
            }
            r45.wz3 wz3Var = this.f384373n;
            if (wz3Var != null) {
                fVar.i(9, wz3Var.computeSize());
                this.f384373n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384366d);
            java.lang.String str5 = this.f384367e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f384368f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f384369g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f384370h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            r45.ka5 ka5Var2 = this.f384371i;
            if (ka5Var2 != null) {
                i18 += b36.f.i(7, ka5Var2.computeSize());
            }
            r45.x15 x15Var2 = this.f384372m;
            if (x15Var2 != null) {
                i18 += b36.f.i(8, x15Var2.computeSize());
            }
            r45.wz3 wz3Var2 = this.f384373n;
            return wz3Var2 != null ? i18 + b36.f.i(9, wz3Var2.computeSize()) : i18;
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
        r45.qz4 qz4Var = (r45.qz4) objArr[1];
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
                    qz4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                qz4Var.f384366d = aVar2.g(intValue);
                return 0;
            case 3:
                qz4Var.f384367e = aVar2.k(intValue);
                return 0;
            case 4:
                qz4Var.f384368f = aVar2.k(intValue);
                return 0;
            case 5:
                qz4Var.f384369g = aVar2.k(intValue);
                return 0;
            case 6:
                qz4Var.f384370h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ka5 ka5Var3 = new r45.ka5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ka5Var3.parseFrom(bArr2);
                    }
                    qz4Var.f384371i = ka5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.x15 x15Var3 = new r45.x15();
                    if (bArr3 != null && bArr3.length > 0) {
                        x15Var3.parseFrom(bArr3);
                    }
                    qz4Var.f384372m = x15Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.wz3 wz3Var3 = new r45.wz3();
                    if (bArr4 != null && bArr4.length > 0) {
                        wz3Var3.parseFrom(bArr4);
                    }
                    qz4Var.f384373n = wz3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
