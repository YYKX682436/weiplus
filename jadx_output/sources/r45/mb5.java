package r45;

/* loaded from: classes7.dex */
public class mb5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380329d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380330e;

    /* renamed from: f, reason: collision with root package name */
    public int f380331f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380332g;

    /* renamed from: h, reason: collision with root package name */
    public int f380333h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f380334i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mb5)) {
            return false;
        }
        r45.mb5 mb5Var = (r45.mb5) fVar;
        return n51.f.a(this.BaseRequest, mb5Var.BaseRequest) && n51.f.a(this.f380329d, mb5Var.f380329d) && n51.f.a(this.f380330e, mb5Var.f380330e) && n51.f.a(java.lang.Integer.valueOf(this.f380331f), java.lang.Integer.valueOf(mb5Var.f380331f)) && n51.f.a(this.f380332g, mb5Var.f380332g) && n51.f.a(java.lang.Integer.valueOf(this.f380333h), java.lang.Integer.valueOf(mb5Var.f380333h)) && n51.f.a(java.lang.Boolean.valueOf(this.f380334i), java.lang.Boolean.valueOf(mb5Var.f380334i));
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
            java.lang.String str = this.f380329d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380330e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f380331f);
            java.lang.String str3 = this.f380332g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f380333h);
            fVar.a(7, this.f380334i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f380329d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f380330e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f380331f);
            java.lang.String str6 = this.f380332g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f380333h) + b36.f.a(7, this.f380334i);
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
        r45.mb5 mb5Var = (r45.mb5) objArr[1];
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
                    mb5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                mb5Var.f380329d = aVar2.k(intValue);
                return 0;
            case 3:
                mb5Var.f380330e = aVar2.k(intValue);
                return 0;
            case 4:
                mb5Var.f380331f = aVar2.g(intValue);
                return 0;
            case 5:
                mb5Var.f380332g = aVar2.k(intValue);
                return 0;
            case 6:
                mb5Var.f380333h = aVar2.g(intValue);
                return 0;
            case 7:
                mb5Var.f380334i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
