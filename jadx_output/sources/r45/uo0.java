package r45;

/* loaded from: classes4.dex */
public class uo0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f387521d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387522e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387523f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387524g;

    /* renamed from: h, reason: collision with root package name */
    public int f387525h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uo0)) {
            return false;
        }
        r45.uo0 uo0Var = (r45.uo0) fVar;
        return n51.f.a(this.BaseRequest, uo0Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f387521d), java.lang.Long.valueOf(uo0Var.f387521d)) && n51.f.a(this.f387522e, uo0Var.f387522e) && n51.f.a(this.f387523f, uo0Var.f387523f) && n51.f.a(this.f387524g, uo0Var.f387524g) && n51.f.a(java.lang.Integer.valueOf(this.f387525h), java.lang.Integer.valueOf(uo0Var.f387525h));
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
            fVar.h(2, this.f387521d);
            java.lang.String str = this.f387522e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387523f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387524g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f387525h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f387521d);
            java.lang.String str4 = this.f387522e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f387523f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f387524g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f387525h);
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
        r45.uo0 uo0Var = (r45.uo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    uo0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                uo0Var.f387521d = aVar2.i(intValue);
                return 0;
            case 3:
                uo0Var.f387522e = aVar2.k(intValue);
                return 0;
            case 4:
                uo0Var.f387523f = aVar2.k(intValue);
                return 0;
            case 5:
                uo0Var.f387524g = aVar2.k(intValue);
                return 0;
            case 6:
                uo0Var.f387525h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
