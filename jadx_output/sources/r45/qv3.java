package r45;

/* loaded from: classes4.dex */
public class qv3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f384294d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f384295e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f384296f;

    /* renamed from: g, reason: collision with root package name */
    public int f384297g;

    /* renamed from: h, reason: collision with root package name */
    public int f384298h;

    /* renamed from: i, reason: collision with root package name */
    public int f384299i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qv3)) {
            return false;
        }
        r45.qv3 qv3Var = (r45.qv3) fVar;
        return n51.f.a(this.BaseResponse, qv3Var.BaseResponse) && n51.f.a(this.f384294d, qv3Var.f384294d) && n51.f.a(this.f384295e, qv3Var.f384295e) && n51.f.a(this.f384296f, qv3Var.f384296f) && n51.f.a(java.lang.Integer.valueOf(this.f384297g), java.lang.Integer.valueOf(qv3Var.f384297g)) && n51.f.a(java.lang.Integer.valueOf(this.f384298h), java.lang.Integer.valueOf(qv3Var.f384298h)) && n51.f.a(java.lang.Integer.valueOf(this.f384299i), java.lang.Integer.valueOf(qv3Var.f384299i));
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
            r45.cu5 cu5Var = this.f384294d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f384294d.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f384295e;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.computeSize());
                this.f384295e.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f384296f;
            if (cu5Var3 != null) {
                fVar.i(4, cu5Var3.computeSize());
                this.f384296f.writeFields(fVar);
            }
            fVar.e(5, this.f384297g);
            fVar.e(6, this.f384298h);
            fVar.e(7, this.f384299i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var4 = this.f384294d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.computeSize());
            }
            r45.cu5 cu5Var5 = this.f384295e;
            if (cu5Var5 != null) {
                i18 += b36.f.i(3, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f384296f;
            if (cu5Var6 != null) {
                i18 += b36.f.i(4, cu5Var6.computeSize());
            }
            return i18 + b36.f.e(5, this.f384297g) + b36.f.e(6, this.f384298h) + b36.f.e(7, this.f384299i);
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
        r45.qv3 qv3Var = (r45.qv3) objArr[1];
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
                    qv3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var7.b(bArr2);
                    }
                    qv3Var.f384294d = cu5Var7;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var8.b(bArr3);
                    }
                    qv3Var.f384295e = cu5Var8;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var9.b(bArr4);
                    }
                    qv3Var.f384296f = cu5Var9;
                }
                return 0;
            case 5:
                qv3Var.f384297g = aVar2.g(intValue);
                return 0;
            case 6:
                qv3Var.f384298h = aVar2.g(intValue);
                return 0;
            case 7:
                qv3Var.f384299i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
