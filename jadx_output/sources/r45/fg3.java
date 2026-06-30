package r45;

/* loaded from: classes8.dex */
public class fg3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374308d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374309e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374310f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tp f374311g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg3)) {
            return false;
        }
        r45.fg3 fg3Var = (r45.fg3) fVar;
        return n51.f.a(this.BaseRequest, fg3Var.BaseRequest) && n51.f.a(this.f374308d, fg3Var.f374308d) && n51.f.a(this.f374309e, fg3Var.f374309e) && n51.f.a(this.f374310f, fg3Var.f374310f) && n51.f.a(this.f374311g, fg3Var.f374311g);
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
            java.lang.String str = this.f374308d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374309e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374310f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.tp tpVar = this.f374311g;
            if (tpVar != null) {
                fVar.i(5, tpVar.computeSize());
                this.f374311g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f374308d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f374309e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f374310f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            r45.tp tpVar2 = this.f374311g;
            return tpVar2 != null ? i18 + b36.f.i(5, tpVar2.computeSize()) : i18;
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
        r45.fg3 fg3Var = (r45.fg3) objArr[1];
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
                fg3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            fg3Var.f374308d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fg3Var.f374309e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            fg3Var.f374310f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.tp tpVar3 = new r45.tp();
            if (bArr2 != null && bArr2.length > 0) {
                tpVar3.parseFrom(bArr2);
            }
            fg3Var.f374311g = tpVar3;
        }
        return 0;
    }
}
