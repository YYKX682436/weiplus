package r45;

/* loaded from: classes9.dex */
public class i67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376770e;

    /* renamed from: f, reason: collision with root package name */
    public long f376771f;

    /* renamed from: g, reason: collision with root package name */
    public long f376772g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i67)) {
            return false;
        }
        r45.i67 i67Var = (r45.i67) fVar;
        return n51.f.a(this.f376769d, i67Var.f376769d) && n51.f.a(this.f376770e, i67Var.f376770e) && n51.f.a(java.lang.Long.valueOf(this.f376771f), java.lang.Long.valueOf(i67Var.f376771f)) && n51.f.a(java.lang.Long.valueOf(this.f376772g), java.lang.Long.valueOf(i67Var.f376772g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376769d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376770e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f376771f);
            fVar.h(4, this.f376772g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f376769d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f376770e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f376771f) + b36.f.h(4, this.f376772g);
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
        r45.i67 i67Var = (r45.i67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i67Var.f376769d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            i67Var.f376770e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i67Var.f376771f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        i67Var.f376772g = aVar2.i(intValue);
        return 0;
    }
}
