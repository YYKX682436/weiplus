package r45;

/* loaded from: classes2.dex */
public class o4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381895d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f381896e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381897f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o4)) {
            return false;
        }
        r45.o4 o4Var = (r45.o4) fVar;
        return n51.f.a(this.f381895d, o4Var.f381895d) && n51.f.a(this.f381896e, o4Var.f381896e) && n51.f.a(this.f381897f, o4Var.f381897f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381895d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f381896e);
            java.lang.String str2 = this.f381897f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f381895d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, this.f381896e);
            java.lang.String str4 = this.f381897f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381896e.clear();
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
        r45.o4 o4Var = (r45.o4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o4Var.f381895d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            o4Var.f381897f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.xz4 xz4Var = new r45.xz4();
            if (bArr2 != null && bArr2.length > 0) {
                xz4Var.parseFrom(bArr2);
            }
            o4Var.f381896e.add(xz4Var);
        }
        return 0;
    }
}
