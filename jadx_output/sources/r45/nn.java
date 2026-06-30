package r45;

/* loaded from: classes8.dex */
public class nn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f381521d;

    /* renamed from: e, reason: collision with root package name */
    public r45.uk4 f381522e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381523f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nn)) {
            return false;
        }
        r45.nn nnVar = (r45.nn) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f381521d), java.lang.Boolean.valueOf(nnVar.f381521d)) && n51.f.a(this.f381522e, nnVar.f381522e) && n51.f.a(this.f381523f, nnVar.f381523f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f381521d);
            r45.uk4 uk4Var = this.f381522e;
            if (uk4Var != null) {
                fVar.i(2, uk4Var.computeSize());
                this.f381522e.writeFields(fVar);
            }
            java.lang.String str = this.f381523f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f381521d) + 0;
            r45.uk4 uk4Var2 = this.f381522e;
            if (uk4Var2 != null) {
                a17 += b36.f.i(2, uk4Var2.computeSize());
            }
            java.lang.String str2 = this.f381523f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.nn nnVar = (r45.nn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nnVar.f381521d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            nnVar.f381523f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.uk4 uk4Var3 = new r45.uk4();
            if (bArr != null && bArr.length > 0) {
                uk4Var3.parseFrom(bArr);
            }
            nnVar.f381522e = uk4Var3;
        }
        return 0;
    }
}
