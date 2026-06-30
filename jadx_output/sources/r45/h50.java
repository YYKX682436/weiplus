package r45;

/* loaded from: classes8.dex */
public class h50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375848d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375849e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f375850f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h50)) {
            return false;
        }
        r45.h50 h50Var = (r45.h50) fVar;
        return n51.f.a(this.f375848d, h50Var.f375848d) && n51.f.a(this.f375849e, h50Var.f375849e) && n51.f.a(this.f375850f, h50Var.f375850f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375848d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375849e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f375850f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f375848d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f375849e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, this.f375850f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f375850f.clear();
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
        r45.h50 h50Var = (r45.h50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h50Var.f375848d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            h50Var.f375849e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.nm4 nm4Var = new r45.nm4();
            if (bArr2 != null && bArr2.length > 0) {
                nm4Var.parseFrom(bArr2);
            }
            h50Var.f375850f.add(nm4Var);
        }
        return 0;
    }
}
