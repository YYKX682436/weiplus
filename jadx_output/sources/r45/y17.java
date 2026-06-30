package r45;

/* loaded from: classes9.dex */
public class y17 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390715d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f390716e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f390717f;

    /* renamed from: g, reason: collision with root package name */
    public int f390718g;

    /* renamed from: h, reason: collision with root package name */
    public int f390719h;

    /* renamed from: i, reason: collision with root package name */
    public int f390720i;

    /* renamed from: m, reason: collision with root package name */
    public int f390721m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390722n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390723o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y17)) {
            return false;
        }
        r45.y17 y17Var = (r45.y17) fVar;
        return n51.f.a(this.BaseResponse, y17Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f390715d), java.lang.Integer.valueOf(y17Var.f390715d)) && n51.f.a(this.f390716e, y17Var.f390716e) && n51.f.a(java.lang.Integer.valueOf(this.f390717f), java.lang.Integer.valueOf(y17Var.f390717f)) && n51.f.a(java.lang.Integer.valueOf(this.f390718g), java.lang.Integer.valueOf(y17Var.f390718g)) && n51.f.a(java.lang.Integer.valueOf(this.f390719h), java.lang.Integer.valueOf(y17Var.f390719h)) && n51.f.a(java.lang.Integer.valueOf(this.f390720i), java.lang.Integer.valueOf(y17Var.f390720i)) && n51.f.a(java.lang.Integer.valueOf(this.f390721m), java.lang.Integer.valueOf(y17Var.f390721m)) && n51.f.a(this.f390722n, y17Var.f390722n) && n51.f.a(this.f390723o, y17Var.f390723o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390716e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f390715d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f390717f);
            fVar.e(5, this.f390718g);
            fVar.e(6, this.f390719h);
            fVar.e(7, this.f390720i);
            fVar.e(8, this.f390721m);
            java.lang.String str = this.f390722n;
            if (str != null) {
                fVar.j(9, str);
            }
            java.lang.String str2 = this.f390723o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f390715d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f390717f) + b36.f.e(5, this.f390718g) + b36.f.e(6, this.f390719h) + b36.f.e(7, this.f390720i) + b36.f.e(8, this.f390721m);
            java.lang.String str3 = this.f390722n;
            if (str3 != null) {
                i18 += b36.f.j(9, str3);
            }
            java.lang.String str4 = this.f390723o;
            return str4 != null ? i18 + b36.f.j(10, str4) : i18;
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
        r45.y17 y17Var = (r45.y17) objArr[1];
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
                    y17Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                y17Var.f390715d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.v17 v17Var = new r45.v17();
                    if (bArr3 != null && bArr3.length > 0) {
                        v17Var.parseFrom(bArr3);
                    }
                    y17Var.f390716e.add(v17Var);
                }
                return 0;
            case 4:
                y17Var.f390717f = aVar2.g(intValue);
                return 0;
            case 5:
                y17Var.f390718g = aVar2.g(intValue);
                return 0;
            case 6:
                y17Var.f390719h = aVar2.g(intValue);
                return 0;
            case 7:
                y17Var.f390720i = aVar2.g(intValue);
                return 0;
            case 8:
                y17Var.f390721m = aVar2.g(intValue);
                return 0;
            case 9:
                y17Var.f390722n = aVar2.k(intValue);
                return 0;
            case 10:
                y17Var.f390723o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
