package r45;

/* loaded from: classes4.dex */
public class oa6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382104e;

    /* renamed from: f, reason: collision with root package name */
    public int f382105f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f382106g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f382107h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oa6)) {
            return false;
        }
        r45.oa6 oa6Var = (r45.oa6) fVar;
        return n51.f.a(this.BaseResponse, oa6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382103d), java.lang.Integer.valueOf(oa6Var.f382103d)) && n51.f.a(this.f382104e, oa6Var.f382104e) && n51.f.a(java.lang.Integer.valueOf(this.f382105f), java.lang.Integer.valueOf(oa6Var.f382105f)) && n51.f.a(this.f382106g, oa6Var.f382106g) && n51.f.a(java.lang.Integer.valueOf(this.f382107h), java.lang.Integer.valueOf(oa6Var.f382107h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382106g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f382103d);
            java.lang.String str = this.f382104e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f382105f);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f382107h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382103d);
            java.lang.String str2 = this.f382104e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f382105f) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f382107h);
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
        r45.oa6 oa6Var = (r45.oa6) objArr[1];
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
                    oa6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                oa6Var.f382103d = aVar2.g(intValue);
                return 0;
            case 3:
                oa6Var.f382104e = aVar2.k(intValue);
                return 0;
            case 4:
                oa6Var.f382105f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ma6 ma6Var = new r45.ma6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ma6Var.parseFrom(bArr3);
                    }
                    oa6Var.f382106g.add(ma6Var);
                }
                return 0;
            case 6:
                oa6Var.f382107h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
