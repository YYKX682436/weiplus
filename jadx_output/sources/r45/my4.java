package r45;

/* loaded from: classes4.dex */
public class my4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380924d;

    /* renamed from: e, reason: collision with root package name */
    public int f380925e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380926f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380927g;

    /* renamed from: h, reason: collision with root package name */
    public long f380928h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380929i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.my4)) {
            return false;
        }
        r45.my4 my4Var = (r45.my4) fVar;
        return n51.f.a(this.BaseRequest, my4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f380924d), java.lang.Integer.valueOf(my4Var.f380924d)) && n51.f.a(java.lang.Integer.valueOf(this.f380925e), java.lang.Integer.valueOf(my4Var.f380925e)) && n51.f.a(this.f380926f, my4Var.f380926f) && n51.f.a(this.f380927g, my4Var.f380927g) && n51.f.a(java.lang.Long.valueOf(this.f380928h), java.lang.Long.valueOf(my4Var.f380928h)) && n51.f.a(this.f380929i, my4Var.f380929i);
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
            fVar.e(2, this.f380924d);
            fVar.e(3, this.f380925e);
            java.lang.String str = this.f380926f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f380927g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f380928h);
            java.lang.String str3 = this.f380929i;
            if (str3 != null) {
                fVar.j(100, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f380924d) + b36.f.e(3, this.f380925e);
            java.lang.String str4 = this.f380926f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f380927g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f380928h);
            java.lang.String str6 = this.f380929i;
            return str6 != null ? h17 + b36.f.j(100, str6) : h17;
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
        r45.my4 my4Var = (r45.my4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            my4Var.f380929i = aVar2.k(intValue);
            return 0;
        }
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
                    my4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                my4Var.f380924d = aVar2.g(intValue);
                return 0;
            case 3:
                my4Var.f380925e = aVar2.g(intValue);
                return 0;
            case 4:
                my4Var.f380926f = aVar2.k(intValue);
                return 0;
            case 5:
                my4Var.f380927g = aVar2.k(intValue);
                return 0;
            case 6:
                my4Var.f380928h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
