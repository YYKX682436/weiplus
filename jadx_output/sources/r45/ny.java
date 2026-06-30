package r45;

/* loaded from: classes4.dex */
public class ny extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381740d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381741e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f381742f;

    /* renamed from: g, reason: collision with root package name */
    public int f381743g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381744h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ny)) {
            return false;
        }
        r45.ny nyVar = (r45.ny) fVar;
        return n51.f.a(this.BaseRequest, nyVar.BaseRequest) && n51.f.a(this.f381740d, nyVar.f381740d) && n51.f.a(this.f381741e, nyVar.f381741e) && n51.f.a(java.lang.Boolean.valueOf(this.f381742f), java.lang.Boolean.valueOf(nyVar.f381742f)) && n51.f.a(java.lang.Integer.valueOf(this.f381743g), java.lang.Integer.valueOf(nyVar.f381743g)) && n51.f.a(this.f381744h, nyVar.f381744h);
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
            java.lang.String str = this.f381740d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381741e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f381742f);
            fVar.e(5, this.f381743g);
            java.lang.String str3 = this.f381744h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f381740d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f381741e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(4, this.f381742f) + b36.f.e(5, this.f381743g);
            java.lang.String str6 = this.f381744h;
            return str6 != null ? a17 + b36.f.j(6, str6) : a17;
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
        r45.ny nyVar = (r45.ny) objArr[1];
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
                    nyVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                nyVar.f381740d = aVar2.k(intValue);
                return 0;
            case 3:
                nyVar.f381741e = aVar2.k(intValue);
                return 0;
            case 4:
                nyVar.f381742f = aVar2.c(intValue);
                return 0;
            case 5:
                nyVar.f381743g = aVar2.g(intValue);
                return 0;
            case 6:
                nyVar.f381744h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
