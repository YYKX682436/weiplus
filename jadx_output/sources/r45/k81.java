package r45;

/* loaded from: classes2.dex */
public class k81 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f378482d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378483e;

    /* renamed from: f, reason: collision with root package name */
    public int f378484f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f378485g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k81)) {
            return false;
        }
        r45.k81 k81Var = (r45.k81) fVar;
        return n51.f.a(this.BaseRequest, k81Var.BaseRequest) && n51.f.a(this.f378482d, k81Var.f378482d) && n51.f.a(this.f378483e, k81Var.f378483e) && n51.f.a(java.lang.Integer.valueOf(this.f378484f), java.lang.Integer.valueOf(k81Var.f378484f)) && n51.f.a(this.f378485g, k81Var.f378485g);
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
            r45.kv0 kv0Var = this.f378482d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f378482d.writeFields(fVar);
            }
            java.lang.String str = this.f378483e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f378484f);
            com.tencent.mm.protobuf.g gVar = this.f378485g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f378482d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str2 = this.f378483e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f378484f);
            com.tencent.mm.protobuf.g gVar2 = this.f378485g;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        r45.k81 k81Var = (r45.k81) objArr[1];
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
                k81Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                k81Var.f378483e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                k81Var.f378484f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            k81Var.f378485g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.kv0 kv0Var3 = new r45.kv0();
            if (bArr2 != null && bArr2.length > 0) {
                kv0Var3.parseFrom(bArr2);
            }
            k81Var.f378482d = kv0Var3;
        }
        return 0;
    }
}
