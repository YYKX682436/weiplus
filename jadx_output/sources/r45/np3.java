package r45;

/* loaded from: classes4.dex */
public class np3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381567d;

    /* renamed from: e, reason: collision with root package name */
    public int f381568e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381569f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381570g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381571h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381572i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.np3)) {
            return false;
        }
        r45.np3 np3Var = (r45.np3) fVar;
        return n51.f.a(this.BaseRequest, np3Var.BaseRequest) && n51.f.a(this.f381567d, np3Var.f381567d) && n51.f.a(java.lang.Integer.valueOf(this.f381568e), java.lang.Integer.valueOf(np3Var.f381568e)) && n51.f.a(this.f381569f, np3Var.f381569f) && n51.f.a(this.f381570g, np3Var.f381570g) && n51.f.a(this.f381571h, np3Var.f381571h) && n51.f.a(this.f381572i, np3Var.f381572i);
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
            java.lang.String str = this.f381567d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381568e);
            java.lang.String str2 = this.f381569f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381570g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f381571h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f381572i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f381567d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            int e17 = i18 + b36.f.e(3, this.f381568e);
            java.lang.String str7 = this.f381569f;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f381570g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f381571h;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f381572i;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.np3 np3Var = (r45.np3) objArr[1];
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
                    np3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                np3Var.f381567d = aVar2.k(intValue);
                return 0;
            case 3:
                np3Var.f381568e = aVar2.g(intValue);
                return 0;
            case 4:
                np3Var.f381569f = aVar2.k(intValue);
                return 0;
            case 5:
                np3Var.f381570g = aVar2.k(intValue);
                return 0;
            case 6:
                np3Var.f381571h = aVar2.k(intValue);
                return 0;
            case 7:
                np3Var.f381572i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
