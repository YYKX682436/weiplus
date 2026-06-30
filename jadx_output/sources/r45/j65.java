package r45;

/* loaded from: classes8.dex */
public class j65 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377608d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377611g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377612h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j65)) {
            return false;
        }
        r45.j65 j65Var = (r45.j65) fVar;
        return n51.f.a(this.BaseRequest, j65Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377608d), java.lang.Integer.valueOf(j65Var.f377608d)) && n51.f.a(this.f377609e, j65Var.f377609e) && n51.f.a(this.f377610f, j65Var.f377610f) && n51.f.a(this.f377611g, j65Var.f377611g) && n51.f.a(this.f377612h, j65Var.f377612h);
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
            fVar.e(2, this.f377608d);
            java.lang.String str = this.f377609e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377610f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377611g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f377612h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377608d);
            java.lang.String str5 = this.f377609e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f377610f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f377611g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f377612h;
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
        r45.j65 j65Var = (r45.j65) objArr[1];
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
                    j65Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                j65Var.f377608d = aVar2.g(intValue);
                return 0;
            case 3:
                j65Var.f377609e = aVar2.k(intValue);
                return 0;
            case 4:
                j65Var.f377610f = aVar2.k(intValue);
                return 0;
            case 5:
                j65Var.f377611g = aVar2.k(intValue);
                return 0;
            case 6:
                j65Var.f377612h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
