package r45;

/* loaded from: classes9.dex */
public class wo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f389326d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f389327e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389328f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389329g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389330h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wo)) {
            return false;
        }
        r45.wo woVar = (r45.wo) fVar;
        return n51.f.a(this.f389326d, woVar.f389326d) && n51.f.a(this.f389327e, woVar.f389327e) && n51.f.a(this.f389328f, woVar.f389328f) && n51.f.a(this.f389329g, woVar.f389329g) && n51.f.a(this.f389330h, woVar.f389330h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f389326d);
            fVar.g(2, 8, this.f389327e);
            java.lang.String str = this.f389328f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389329g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f389330h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f389326d) + 0 + b36.f.g(2, 8, this.f389327e);
            java.lang.String str4 = this.f389328f;
            if (str4 != null) {
                g17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f389329g;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f389330h;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f389326d.clear();
            this.f389327e.clear();
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
        r45.wo woVar = (r45.wo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.vq0 vq0Var = new r45.vq0();
                if (bArr2 != null && bArr2.length > 0) {
                    vq0Var.parseFrom(bArr2);
                }
                woVar.f389326d.add(vq0Var);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                woVar.f389328f = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                woVar.f389329g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            woVar.f389330h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.uq0 uq0Var = new r45.uq0();
            if (bArr3 != null && bArr3.length > 0) {
                uq0Var.parseFrom(bArr3);
            }
            woVar.f389327e.add(uq0Var);
        }
        return 0;
    }
}
