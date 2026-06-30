package r45;

/* loaded from: classes4.dex */
public class qx6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384347e;

    /* renamed from: f, reason: collision with root package name */
    public r45.m74 f384348f;

    /* renamed from: g, reason: collision with root package name */
    public r45.f7 f384349g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384350h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qx6)) {
            return false;
        }
        r45.qx6 qx6Var = (r45.qx6) fVar;
        return n51.f.a(this.BaseResponse, qx6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384346d), java.lang.Integer.valueOf(qx6Var.f384346d)) && n51.f.a(this.f384347e, qx6Var.f384347e) && n51.f.a(this.f384348f, qx6Var.f384348f) && n51.f.a(this.f384349g, qx6Var.f384349g) && n51.f.a(this.f384350h, qx6Var.f384350h);
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
            fVar.e(2, this.f384346d);
            java.lang.String str = this.f384347e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.m74 m74Var = this.f384348f;
            if (m74Var != null) {
                fVar.i(4, m74Var.computeSize());
                this.f384348f.writeFields(fVar);
            }
            r45.f7 f7Var = this.f384349g;
            if (f7Var != null) {
                fVar.i(5, f7Var.computeSize());
                this.f384349g.writeFields(fVar);
            }
            java.lang.String str2 = this.f384350h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384346d);
            java.lang.String str3 = this.f384347e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.m74 m74Var2 = this.f384348f;
            if (m74Var2 != null) {
                i18 += b36.f.i(4, m74Var2.computeSize());
            }
            r45.f7 f7Var2 = this.f384349g;
            if (f7Var2 != null) {
                i18 += b36.f.i(5, f7Var2.computeSize());
            }
            java.lang.String str4 = this.f384350h;
            return str4 != null ? i18 + b36.f.j(6, str4) : i18;
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
        r45.qx6 qx6Var = (r45.qx6) objArr[1];
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
                    qx6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                qx6Var.f384346d = aVar2.g(intValue);
                return 0;
            case 3:
                qx6Var.f384347e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.m74 m74Var3 = new r45.m74();
                    if (bArr2 != null && bArr2.length > 0) {
                        m74Var3.parseFrom(bArr2);
                    }
                    qx6Var.f384348f = m74Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.f7 f7Var3 = new r45.f7();
                    if (bArr3 != null && bArr3.length > 0) {
                        f7Var3.parseFrom(bArr3);
                    }
                    qx6Var.f384349g = f7Var3;
                }
                return 0;
            case 6:
                qx6Var.f384350h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
