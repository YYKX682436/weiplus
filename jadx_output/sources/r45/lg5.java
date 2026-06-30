package r45;

/* loaded from: classes2.dex */
public class lg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379457d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379458e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379459f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f379460g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public r45.ka5 f379461h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379462i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lg5)) {
            return false;
        }
        r45.lg5 lg5Var = (r45.lg5) fVar;
        return n51.f.a(this.BaseResponse, lg5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379457d), java.lang.Integer.valueOf(lg5Var.f379457d)) && n51.f.a(this.f379458e, lg5Var.f379458e) && n51.f.a(this.f379459f, lg5Var.f379459f) && n51.f.a(this.f379460g, lg5Var.f379460g) && n51.f.a(this.f379461h, lg5Var.f379461h) && n51.f.a(this.f379462i, lg5Var.f379462i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379460g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379457d);
            java.lang.String str = this.f379458e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379459f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            r45.ka5 ka5Var = this.f379461h;
            if (ka5Var != null) {
                fVar.i(6, ka5Var.computeSize());
                this.f379461h.writeFields(fVar);
            }
            java.lang.String str3 = this.f379462i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379457d);
            java.lang.String str4 = this.f379458e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f379459f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            r45.ka5 ka5Var2 = this.f379461h;
            if (ka5Var2 != null) {
                g17 += b36.f.i(6, ka5Var2.computeSize());
            }
            java.lang.String str6 = this.f379462i;
            return str6 != null ? g17 + b36.f.j(7, str6) : g17;
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
        r45.lg5 lg5Var = (r45.lg5) objArr[1];
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
                    lg5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lg5Var.f379457d = aVar2.g(intValue);
                return 0;
            case 3:
                lg5Var.f379458e = aVar2.k(intValue);
                return 0;
            case 4:
                lg5Var.f379459f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.od odVar = new r45.od();
                    if (bArr3 != null && bArr3.length > 0) {
                        odVar.parseFrom(bArr3);
                    }
                    lg5Var.f379460g.add(odVar);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ka5 ka5Var3 = new r45.ka5();
                    if (bArr4 != null && bArr4.length > 0) {
                        ka5Var3.parseFrom(bArr4);
                    }
                    lg5Var.f379461h = ka5Var3;
                }
                return 0;
            case 7:
                lg5Var.f379462i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
