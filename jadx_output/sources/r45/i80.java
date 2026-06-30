package r45;

/* loaded from: classes4.dex */
public class i80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376805d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376806e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376807f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376808g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i80)) {
            return false;
        }
        r45.i80 i80Var = (r45.i80) fVar;
        return n51.f.a(this.BaseRequest, i80Var.BaseRequest) && n51.f.a(this.f376805d, i80Var.f376805d) && n51.f.a(this.f376806e, i80Var.f376806e) && n51.f.a(this.f376807f, i80Var.f376807f) && n51.f.a(this.f376808g, i80Var.f376808g);
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
            java.lang.String str = this.f376805d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376806e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f376807f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f376808g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f376805d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f376806e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f376807f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f376808g;
            return str8 != null ? i18 + b36.f.j(5, str8) : i18;
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
        r45.i80 i80Var = (r45.i80) objArr[1];
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
                i80Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            i80Var.f376805d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i80Var.f376806e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            i80Var.f376807f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        i80Var.f376808g = aVar2.k(intValue);
        return 0;
    }
}
