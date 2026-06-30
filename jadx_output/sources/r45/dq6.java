package r45;

/* loaded from: classes4.dex */
public class dq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372669e;

    /* renamed from: f, reason: collision with root package name */
    public int f372670f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372671g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f372672h;

    /* renamed from: i, reason: collision with root package name */
    public int f372673i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dq6)) {
            return false;
        }
        r45.dq6 dq6Var = (r45.dq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372668d), java.lang.Integer.valueOf(dq6Var.f372668d)) && n51.f.a(this.f372669e, dq6Var.f372669e) && n51.f.a(java.lang.Integer.valueOf(this.f372670f), java.lang.Integer.valueOf(dq6Var.f372670f)) && n51.f.a(this.f372671g, dq6Var.f372671g) && n51.f.a(this.f372672h, dq6Var.f372672h) && n51.f.a(java.lang.Integer.valueOf(this.f372673i), java.lang.Integer.valueOf(dq6Var.f372673i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372668d);
            java.lang.String str = this.f372669e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f372670f);
            java.lang.String str2 = this.f372671g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.cu5 cu5Var = this.f372672h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f372672h.writeFields(fVar);
            }
            fVar.e(6, this.f372673i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372668d) + 0;
            java.lang.String str3 = this.f372669e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f372670f);
            java.lang.String str4 = this.f372671g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f372672h;
            if (cu5Var2 != null) {
                e18 += b36.f.i(5, cu5Var2.computeSize());
            }
            return e18 + b36.f.e(6, this.f372673i);
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
        r45.dq6 dq6Var = (r45.dq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dq6Var.f372668d = aVar2.g(intValue);
                return 0;
            case 2:
                dq6Var.f372669e = aVar2.k(intValue);
                return 0;
            case 3:
                dq6Var.f372670f = aVar2.g(intValue);
                return 0;
            case 4:
                dq6Var.f372671g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    dq6Var.f372672h = cu5Var3;
                }
                return 0;
            case 6:
                dq6Var.f372673i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
