package r45;

/* loaded from: classes7.dex */
public class k24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378325d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f378326e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f378327f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378328g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378329h;

    /* renamed from: i, reason: collision with root package name */
    public int f378330i;

    /* renamed from: m, reason: collision with root package name */
    public r45.nd7 f378331m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k24)) {
            return false;
        }
        r45.k24 k24Var = (r45.k24) fVar;
        return n51.f.a(this.BaseRequest, k24Var.BaseRequest) && n51.f.a(this.f378325d, k24Var.f378325d) && n51.f.a(this.f378326e, k24Var.f378326e) && n51.f.a(java.lang.Integer.valueOf(this.f378327f), java.lang.Integer.valueOf(k24Var.f378327f)) && n51.f.a(this.f378328g, k24Var.f378328g) && n51.f.a(this.f378329h, k24Var.f378329h) && n51.f.a(java.lang.Integer.valueOf(this.f378330i), java.lang.Integer.valueOf(k24Var.f378330i)) && n51.f.a(this.f378331m, k24Var.f378331m);
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
            java.lang.String str = this.f378325d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f378326e);
            fVar.e(4, this.f378327f);
            java.lang.String str2 = this.f378328g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f378329h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f378330i);
            r45.nd7 nd7Var = this.f378331m;
            if (nd7Var != null) {
                fVar.i(8, nd7Var.computeSize());
                this.f378331m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f378325d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, this.f378326e) + b36.f.e(4, this.f378327f);
            java.lang.String str5 = this.f378328g;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f378329h;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            int e17 = g17 + b36.f.e(7, this.f378330i);
            r45.nd7 nd7Var2 = this.f378331m;
            return nd7Var2 != null ? e17 + b36.f.i(8, nd7Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378326e.clear();
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
        r45.k24 k24Var = (r45.k24) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    k24Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                k24Var.f378325d = aVar2.k(intValue);
                return 0;
            case 3:
                k24Var.f378326e.add(aVar2.k(intValue));
                return 0;
            case 4:
                k24Var.f378327f = aVar2.g(intValue);
                return 0;
            case 5:
                k24Var.f378328g = aVar2.k(intValue);
                return 0;
            case 6:
                k24Var.f378329h = aVar2.k(intValue);
                return 0;
            case 7:
                k24Var.f378330i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.nd7 nd7Var3 = new r45.nd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        nd7Var3.parseFrom(bArr3);
                    }
                    k24Var.f378331m = nd7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
