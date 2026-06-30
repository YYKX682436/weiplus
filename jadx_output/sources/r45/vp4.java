package r45;

/* loaded from: classes8.dex */
public class vp4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388421d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388422e;

    /* renamed from: f, reason: collision with root package name */
    public r45.dm6 f388423f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388424g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vp4)) {
            return false;
        }
        r45.vp4 vp4Var = (r45.vp4) fVar;
        return n51.f.a(this.BaseRequest, vp4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388421d), java.lang.Integer.valueOf(vp4Var.f388421d)) && n51.f.a(this.f388422e, vp4Var.f388422e) && n51.f.a(this.f388423f, vp4Var.f388423f) && n51.f.a(this.f388424g, vp4Var.f388424g);
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
            fVar.e(2, this.f388421d);
            java.lang.String str = this.f388422e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.dm6 dm6Var = this.f388423f;
            if (dm6Var != null) {
                fVar.i(4, dm6Var.computeSize());
                this.f388423f.writeFields(fVar);
            }
            java.lang.String str2 = this.f388424g;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388421d);
            java.lang.String str3 = this.f388422e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.dm6 dm6Var2 = this.f388423f;
            if (dm6Var2 != null) {
                i18 += b36.f.i(4, dm6Var2.computeSize());
            }
            java.lang.String str4 = this.f388424g;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.vp4 vp4Var = (r45.vp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                vp4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            vp4Var.f388421d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            vp4Var.f388422e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 100) {
                return -1;
            }
            vp4Var.f388424g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.dm6 dm6Var3 = new r45.dm6();
            if (bArr2 != null && bArr2.length > 0) {
                dm6Var3.parseFrom(bArr2);
            }
            vp4Var.f388423f = dm6Var3;
        }
        return 0;
    }
}
