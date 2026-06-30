package r45;

/* loaded from: classes4.dex */
public class hz5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376573e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376574f;

    /* renamed from: g, reason: collision with root package name */
    public long f376575g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376576h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f376577i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hz5)) {
            return false;
        }
        r45.hz5 hz5Var = (r45.hz5) fVar;
        return n51.f.a(this.f376572d, hz5Var.f376572d) && n51.f.a(this.f376573e, hz5Var.f376573e) && n51.f.a(this.f376574f, hz5Var.f376574f) && n51.f.a(java.lang.Long.valueOf(this.f376575g), java.lang.Long.valueOf(hz5Var.f376575g)) && n51.f.a(this.f376576h, hz5Var.f376576h) && n51.f.a(this.f376577i, hz5Var.f376577i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376572d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376573e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376574f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f376575g);
            java.lang.String str4 = this.f376576h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 8, this.f376577i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f376572d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f376573e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f376574f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int h17 = j17 + b36.f.h(4, this.f376575g);
            java.lang.String str8 = this.f376576h;
            if (str8 != null) {
                h17 += b36.f.j(6, str8);
            }
            return h17 + b36.f.g(7, 8, this.f376577i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376577i.clear();
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
        r45.hz5 hz5Var = (r45.hz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hz5Var.f376572d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hz5Var.f376573e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hz5Var.f376574f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hz5Var.f376575g = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 6) {
            hz5Var.f376576h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.k15 k15Var = new r45.k15();
            if (bArr2 != null && bArr2.length > 0) {
                k15Var.parseFrom(bArr2);
            }
            hz5Var.f376577i.add(k15Var);
        }
        return 0;
    }
}
