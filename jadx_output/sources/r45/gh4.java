package r45;

/* loaded from: classes8.dex */
public class gh4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375246d;

    /* renamed from: e, reason: collision with root package name */
    public int f375247e;

    /* renamed from: f, reason: collision with root package name */
    public int f375248f;

    /* renamed from: g, reason: collision with root package name */
    public int f375249g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375250h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f375251i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gh4)) {
            return false;
        }
        r45.gh4 gh4Var = (r45.gh4) fVar;
        return n51.f.a(this.BaseResponse, gh4Var.BaseResponse) && n51.f.a(this.f375246d, gh4Var.f375246d) && n51.f.a(java.lang.Integer.valueOf(this.f375247e), java.lang.Integer.valueOf(gh4Var.f375247e)) && n51.f.a(java.lang.Integer.valueOf(this.f375248f), java.lang.Integer.valueOf(gh4Var.f375248f)) && n51.f.a(java.lang.Integer.valueOf(this.f375249g), java.lang.Integer.valueOf(gh4Var.f375249g)) && n51.f.a(this.f375250h, gh4Var.f375250h) && n51.f.a(this.f375251i, gh4Var.f375251i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375251i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f375246d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375247e);
            fVar.e(4, this.f375248f);
            fVar.e(5, this.f375249g);
            java.lang.String str2 = this.f375250h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f375246d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f375247e) + b36.f.e(4, this.f375248f) + b36.f.e(5, this.f375249g);
            java.lang.String str4 = this.f375250h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.gh4 gh4Var = (r45.gh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    gh4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                gh4Var.f375246d = aVar2.k(intValue);
                return 0;
            case 3:
                gh4Var.f375247e = aVar2.g(intValue);
                return 0;
            case 4:
                gh4Var.f375248f = aVar2.g(intValue);
                return 0;
            case 5:
                gh4Var.f375249g = aVar2.g(intValue);
                return 0;
            case 6:
                gh4Var.f375250h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.eh4 eh4Var = new r45.eh4();
                    if (bArr3 != null && bArr3.length > 0) {
                        eh4Var.parseFrom(bArr3);
                    }
                    gh4Var.f375251i.add(eh4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
