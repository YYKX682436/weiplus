package r45;

/* loaded from: classes2.dex */
public class va extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388017d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xz4 f388018e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f388019f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388020g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va)) {
            return false;
        }
        r45.va vaVar = (r45.va) fVar;
        return n51.f.a(this.f388017d, vaVar.f388017d) && n51.f.a(this.f388018e, vaVar.f388018e) && n51.f.a(this.f388019f, vaVar.f388019f) && n51.f.a(this.f388020g, vaVar.f388020g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388017d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.xz4 xz4Var = this.f388018e;
            if (xz4Var != null) {
                fVar.i(2, xz4Var.computeSize());
                this.f388018e.writeFields(fVar);
            }
            fVar.g(3, 8, this.f388019f);
            java.lang.String str2 = this.f388020g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f388017d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.xz4 xz4Var2 = this.f388018e;
            if (xz4Var2 != null) {
                j17 += b36.f.i(2, xz4Var2.computeSize());
            }
            int g17 = j17 + b36.f.g(3, 8, this.f388019f);
            java.lang.String str4 = this.f388020g;
            return str4 != null ? g17 + b36.f.j(4, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388019f.clear();
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
        r45.va vaVar = (r45.va) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vaVar.f388017d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.xz4 xz4Var3 = new r45.xz4();
                if (bArr2 != null && bArr2.length > 0) {
                    xz4Var3.parseFrom(bArr2);
                }
                vaVar.f388018e = xz4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            vaVar.f388020g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.xz4 xz4Var4 = new r45.xz4();
            if (bArr3 != null && bArr3.length > 0) {
                xz4Var4.parseFrom(bArr3);
            }
            vaVar.f388019f.add(xz4Var4);
        }
        return 0;
    }
}
