package r45;

/* loaded from: classes8.dex */
public class oc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382144d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382145e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yu f382146f;

    /* renamed from: g, reason: collision with root package name */
    public int f382147g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ay5 f382148h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oc3)) {
            return false;
        }
        r45.oc3 oc3Var = (r45.oc3) fVar;
        return n51.f.a(this.BaseResponse, oc3Var.BaseResponse) && n51.f.a(this.f382144d, oc3Var.f382144d) && n51.f.a(this.f382145e, oc3Var.f382145e) && n51.f.a(this.f382146f, oc3Var.f382146f) && n51.f.a(java.lang.Integer.valueOf(this.f382147g), java.lang.Integer.valueOf(oc3Var.f382147g)) && n51.f.a(this.f382148h, oc3Var.f382148h);
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
            java.lang.String str = this.f382144d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382145e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.yu yuVar = this.f382146f;
            if (yuVar != null) {
                fVar.i(4, yuVar.computeSize());
                this.f382146f.writeFields(fVar);
            }
            fVar.e(5, this.f382147g);
            r45.ay5 ay5Var = this.f382148h;
            if (ay5Var != null) {
                fVar.i(6, ay5Var.computeSize());
                this.f382148h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f382144d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f382145e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.yu yuVar2 = this.f382146f;
            if (yuVar2 != null) {
                i18 += b36.f.i(4, yuVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f382147g);
            r45.ay5 ay5Var2 = this.f382148h;
            return ay5Var2 != null ? e17 + b36.f.i(6, ay5Var2.computeSize()) : e17;
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
        r45.oc3 oc3Var = (r45.oc3) objArr[1];
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
                    oc3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                oc3Var.f382144d = aVar2.k(intValue);
                return 0;
            case 3:
                oc3Var.f382145e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.yu yuVar3 = new r45.yu();
                    if (bArr2 != null && bArr2.length > 0) {
                        yuVar3.parseFrom(bArr2);
                    }
                    oc3Var.f382146f = yuVar3;
                }
                return 0;
            case 5:
                oc3Var.f382147g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ay5 ay5Var3 = new r45.ay5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ay5Var3.parseFrom(bArr3);
                    }
                    oc3Var.f382148h = ay5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
