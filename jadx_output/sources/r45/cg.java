package r45;

/* loaded from: classes7.dex */
public class cg extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371534d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f371535e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f371536f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f371537g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cg)) {
            return false;
        }
        r45.cg cgVar = (r45.cg) fVar;
        return n51.f.a(this.BaseRequest, cgVar.BaseRequest) && n51.f.a(this.f371534d, cgVar.f371534d) && n51.f.a(this.f371535e, cgVar.f371535e) && n51.f.a(java.lang.Integer.valueOf(this.f371536f), java.lang.Integer.valueOf(cgVar.f371536f)) && n51.f.a(java.lang.Boolean.valueOf(this.f371537g), java.lang.Boolean.valueOf(cgVar.f371537g));
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
            java.lang.String str = this.f371534d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f371535e);
            fVar.e(4, this.f371536f);
            fVar.a(5, this.f371537g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f371534d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 8, this.f371535e) + b36.f.e(4, this.f371536f) + b36.f.a(5, this.f371537g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371535e.clear();
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
        r45.cg cgVar = (r45.cg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                cgVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cgVar.f371534d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                cgVar.f371536f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            cgVar.f371537g = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.dz dzVar = new r45.dz();
            if (bArr3 != null && bArr3.length > 0) {
                dzVar.parseFrom(bArr3);
            }
            cgVar.f371535e.add(dzVar);
        }
        return 0;
    }
}
