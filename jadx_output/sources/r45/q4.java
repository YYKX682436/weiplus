package r45;

/* loaded from: classes4.dex */
public class q4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383651e;

    /* renamed from: f, reason: collision with root package name */
    public long f383652f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383653g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383654h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f383655i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q4)) {
            return false;
        }
        r45.q4 q4Var = (r45.q4) fVar;
        return n51.f.a(this.f383650d, q4Var.f383650d) && n51.f.a(this.f383651e, q4Var.f383651e) && n51.f.a(java.lang.Long.valueOf(this.f383652f), java.lang.Long.valueOf(q4Var.f383652f)) && n51.f.a(this.f383653g, q4Var.f383653g) && n51.f.a(this.f383654h, q4Var.f383654h) && n51.f.a(this.f383655i, q4Var.f383655i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383650d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383651e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f383652f);
            com.tencent.mm.protobuf.g gVar = this.f383653g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str3 = this.f383654h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.g(8, 8, this.f383655i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f383650d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f383651e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int h17 = j17 + b36.f.h(3, this.f383652f);
            com.tencent.mm.protobuf.g gVar2 = this.f383653g;
            if (gVar2 != null) {
                h17 += b36.f.b(4, gVar2);
            }
            java.lang.String str6 = this.f383654h;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            return h17 + b36.f.g(8, 8, this.f383655i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383655i.clear();
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
        r45.q4 q4Var = (r45.q4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q4Var.f383650d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            q4Var.f383651e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            q4Var.f383652f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            q4Var.f383653g = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 7) {
            q4Var.f383654h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 8) {
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
            q4Var.f383655i.add(k15Var);
        }
        return 0;
    }
}
