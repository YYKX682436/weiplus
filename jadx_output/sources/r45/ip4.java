package r45;

/* loaded from: classes2.dex */
public class ip4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377255d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377256e = new java.util.LinkedList();

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 638;
        lVar.f70666c = "/cgi-bin/micromsg-bin/modifycontactlabellist";
        lVar.f70664a = this;
        lVar.f70665b = new r45.jp4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ip4)) {
            return false;
        }
        r45.ip4 ip4Var = (r45.ip4) fVar;
        return n51.f.a(this.BaseRequest, ip4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377255d), java.lang.Integer.valueOf(ip4Var.f377255d)) && n51.f.a(this.f377256e, ip4Var.f377256e);
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
            fVar.e(2, this.f377255d);
            fVar.g(3, 8, this.f377256e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377255d) + b36.f.g(3, 8, this.f377256e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377256e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ip4 ip4Var = (r45.ip4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                ip4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ip4Var.f377255d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.gw6 gw6Var = new r45.gw6();
            if (bArr3 != null && bArr3.length > 0) {
                gw6Var.parseFrom(bArr3);
            }
            ip4Var.f377256e.add(gw6Var);
        }
        return 0;
    }
}
