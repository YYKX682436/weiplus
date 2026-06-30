package r45;

/* loaded from: classes2.dex */
public class aq6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370209f;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4956;
        lVar.f70666c = "/cgi-bin/micromsg-bin/translatemsgbadcase";
        lVar.f70664a = this;
        lVar.f70665b = new r45.bq6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq6)) {
            return false;
        }
        r45.aq6 aq6Var = (r45.aq6) fVar;
        return n51.f.a(this.BaseRequest, aq6Var.BaseRequest) && n51.f.a(this.f370207d, aq6Var.f370207d) && n51.f.a(this.f370208e, aq6Var.f370208e) && n51.f.a(this.f370209f, aq6Var.f370209f);
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
            java.lang.String str = this.f370207d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370208e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f370209f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f370207d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f370208e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f370209f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.aq6 aq6Var = (r45.aq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                aq6Var.f370207d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                aq6Var.f370208e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            aq6Var.f370209f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            aq6Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
