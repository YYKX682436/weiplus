package r45;

/* loaded from: classes8.dex */
public class o43 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381898d;

    /* renamed from: e, reason: collision with root package name */
    public int f381899e;

    /* renamed from: f, reason: collision with root package name */
    public int f381900f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381901g;

    /* renamed from: h, reason: collision with root package name */
    public int f381902h;

    /* renamed from: i, reason: collision with root package name */
    public int f381903i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o43)) {
            return false;
        }
        r45.o43 o43Var = (r45.o43) fVar;
        return n51.f.a(this.BaseRequest, o43Var.BaseRequest) && n51.f.a(this.f381898d, o43Var.f381898d) && n51.f.a(java.lang.Integer.valueOf(this.f381899e), java.lang.Integer.valueOf(o43Var.f381899e)) && n51.f.a(java.lang.Integer.valueOf(this.f381900f), java.lang.Integer.valueOf(o43Var.f381900f)) && n51.f.a(this.f381901g, o43Var.f381901g) && n51.f.a(java.lang.Integer.valueOf(this.f381902h), java.lang.Integer.valueOf(o43Var.f381902h)) && n51.f.a(java.lang.Integer.valueOf(this.f381903i), java.lang.Integer.valueOf(o43Var.f381903i));
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
            java.lang.String str = this.f381898d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381899e);
            fVar.e(4, this.f381900f);
            java.lang.String str2 = this.f381901g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f381902h);
            fVar.e(7, this.f381903i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f381898d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f381899e) + b36.f.e(4, this.f381900f);
            java.lang.String str4 = this.f381901g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f381902h) + b36.f.e(7, this.f381903i);
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
        r45.o43 o43Var = (r45.o43) objArr[1];
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
                    o43Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                o43Var.f381898d = aVar2.k(intValue);
                return 0;
            case 3:
                o43Var.f381899e = aVar2.g(intValue);
                return 0;
            case 4:
                o43Var.f381900f = aVar2.g(intValue);
                return 0;
            case 5:
                o43Var.f381901g = aVar2.k(intValue);
                return 0;
            case 6:
                o43Var.f381902h = aVar2.g(intValue);
                return 0;
            case 7:
                o43Var.f381903i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
