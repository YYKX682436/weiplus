package r45;

/* loaded from: classes4.dex */
public class n04 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380972d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f380973e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380974f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380975g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380976h;

    /* renamed from: i, reason: collision with root package name */
    public int f380977i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n04)) {
            return false;
        }
        r45.n04 n04Var = (r45.n04) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380972d), java.lang.Integer.valueOf(n04Var.f380972d)) && n51.f.a(this.f380973e, n04Var.f380973e) && n51.f.a(this.f380974f, n04Var.f380974f) && n51.f.a(this.f380975g, n04Var.f380975g) && n51.f.a(this.f380976h, n04Var.f380976h) && n51.f.a(java.lang.Integer.valueOf(this.f380977i), java.lang.Integer.valueOf(n04Var.f380977i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380972d);
            r45.du5 du5Var = this.f380973e;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f380973e.writeFields(fVar);
            }
            java.lang.String str = this.f380974f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380975g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f380976h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f380977i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380972d) + 0;
            r45.du5 du5Var2 = this.f380973e;
            if (du5Var2 != null) {
                e17 += b36.f.i(2, du5Var2.computeSize());
            }
            java.lang.String str4 = this.f380974f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f380975g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f380976h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f380977i);
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
        r45.n04 n04Var = (r45.n04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n04Var.f380972d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    n04Var.f380973e = du5Var3;
                }
                return 0;
            case 3:
                n04Var.f380974f = aVar2.k(intValue);
                return 0;
            case 4:
                n04Var.f380975g = aVar2.k(intValue);
                return 0;
            case 5:
                n04Var.f380976h = aVar2.k(intValue);
                return 0;
            case 6:
                n04Var.f380977i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
