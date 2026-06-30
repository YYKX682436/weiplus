package r45;

/* loaded from: classes4.dex */
public class ju6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378118d;

    /* renamed from: e, reason: collision with root package name */
    public int f378119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f378120f;

    /* renamed from: g, reason: collision with root package name */
    public int f378121g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ju6)) {
            return false;
        }
        r45.ju6 ju6Var = (r45.ju6) fVar;
        return n51.f.a(this.BaseRequest, ju6Var.BaseRequest) && n51.f.a(this.f378118d, ju6Var.f378118d) && n51.f.a(java.lang.Integer.valueOf(this.f378119e), java.lang.Integer.valueOf(ju6Var.f378119e)) && n51.f.a(java.lang.Boolean.valueOf(this.f378120f), java.lang.Boolean.valueOf(ju6Var.f378120f)) && n51.f.a(java.lang.Integer.valueOf(this.f378121g), java.lang.Integer.valueOf(ju6Var.f378121g));
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
            java.lang.String str = this.f378118d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f378119e);
            fVar.a(4, this.f378120f);
            fVar.e(5, this.f378121g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f378118d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f378119e) + b36.f.a(4, this.f378120f) + b36.f.e(5, this.f378121g);
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
        r45.ju6 ju6Var = (r45.ju6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                ju6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ju6Var.f378118d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ju6Var.f378119e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ju6Var.f378120f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ju6Var.f378121g = aVar2.g(intValue);
        return 0;
    }
}
