package r45;

/* loaded from: classes7.dex */
public class in4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377169f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377170g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377171h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in4)) {
            return false;
        }
        r45.in4 in4Var = (r45.in4) fVar;
        return n51.f.a(this.BaseRequest, in4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377167d), java.lang.Integer.valueOf(in4Var.f377167d)) && n51.f.a(this.f377168e, in4Var.f377168e) && n51.f.a(this.f377169f, in4Var.f377169f) && n51.f.a(this.f377170g, in4Var.f377170g) && n51.f.a(this.f377171h, in4Var.f377171h);
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
            fVar.e(2, this.f377167d);
            java.lang.String str = this.f377168e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377169f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377170g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f377171h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377167d);
            java.lang.String str5 = this.f377168e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f377169f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f377170g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f377171h;
            return str8 != null ? i18 + b36.f.j(6, str8) : i18;
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
        r45.in4 in4Var = (r45.in4) objArr[1];
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
                    in4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                in4Var.f377167d = aVar2.g(intValue);
                return 0;
            case 3:
                in4Var.f377168e = aVar2.k(intValue);
                return 0;
            case 4:
                in4Var.f377169f = aVar2.k(intValue);
                return 0;
            case 5:
                in4Var.f377170g = aVar2.k(intValue);
                return 0;
            case 6:
                in4Var.f377171h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
