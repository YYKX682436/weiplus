package r45;

/* loaded from: classes4.dex */
public class bl4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370852d;

    /* renamed from: e, reason: collision with root package name */
    public long f370853e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370854f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370855g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370856h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl4)) {
            return false;
        }
        r45.bl4 bl4Var = (r45.bl4) fVar;
        return n51.f.a(this.BaseRequest, bl4Var.BaseRequest) && n51.f.a(this.f370852d, bl4Var.f370852d) && n51.f.a(java.lang.Long.valueOf(this.f370853e), java.lang.Long.valueOf(bl4Var.f370853e)) && n51.f.a(this.f370854f, bl4Var.f370854f) && n51.f.a(this.f370855g, bl4Var.f370855g) && n51.f.a(this.f370856h, bl4Var.f370856h);
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
            java.lang.String str = this.f370852d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f370853e);
            java.lang.String str2 = this.f370854f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f370855g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f370856h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f370852d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f370853e);
            java.lang.String str6 = this.f370854f;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f370855g;
            if (str7 != null) {
                h17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f370856h;
            return str8 != null ? h17 + b36.f.j(6, str8) : h17;
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
        r45.bl4 bl4Var = (r45.bl4) objArr[1];
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
                    bl4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                bl4Var.f370852d = aVar2.k(intValue);
                return 0;
            case 3:
                bl4Var.f370853e = aVar2.i(intValue);
                return 0;
            case 4:
                bl4Var.f370854f = aVar2.k(intValue);
                return 0;
            case 5:
                bl4Var.f370855g = aVar2.k(intValue);
                return 0;
            case 6:
                bl4Var.f370856h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
