package r45;

/* loaded from: classes4.dex */
public class ps5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f383390d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383391e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383393g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ps5)) {
            return false;
        }
        r45.ps5 ps5Var = (r45.ps5) fVar;
        return n51.f.a(this.BaseRequest, ps5Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f383390d), java.lang.Long.valueOf(ps5Var.f383390d)) && n51.f.a(this.f383391e, ps5Var.f383391e) && n51.f.a(this.f383392f, ps5Var.f383392f) && n51.f.a(this.f383393g, ps5Var.f383393g);
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
            fVar.h(2, this.f383390d);
            java.lang.String str = this.f383391e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383392f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383393g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f383390d);
            java.lang.String str4 = this.f383391e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f383392f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f383393g;
            return str6 != null ? i18 + b36.f.j(5, str6) : i18;
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
        r45.ps5 ps5Var = (r45.ps5) objArr[1];
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
                ps5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ps5Var.f383390d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            ps5Var.f383391e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ps5Var.f383392f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ps5Var.f383393g = aVar2.k(intValue);
        return 0;
    }
}
