package r45;

/* loaded from: classes7.dex */
public class i57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.a47 f376748d;

    /* renamed from: e, reason: collision with root package name */
    public int f376749e;

    /* renamed from: f, reason: collision with root package name */
    public int f376750f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i57)) {
            return false;
        }
        r45.i57 i57Var = (r45.i57) fVar;
        return n51.f.a(this.f376748d, i57Var.f376748d) && n51.f.a(java.lang.Integer.valueOf(this.f376749e), java.lang.Integer.valueOf(i57Var.f376749e)) && n51.f.a(java.lang.Integer.valueOf(this.f376750f), java.lang.Integer.valueOf(i57Var.f376750f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.a47 a47Var = this.f376748d;
            if (a47Var != null) {
                fVar.i(1, a47Var.computeSize());
                this.f376748d.writeFields(fVar);
            }
            fVar.e(2, this.f376749e);
            fVar.e(3, this.f376750f);
            return 0;
        }
        if (i17 == 1) {
            r45.a47 a47Var2 = this.f376748d;
            return (a47Var2 != null ? 0 + b36.f.i(1, a47Var2.computeSize()) : 0) + b36.f.e(2, this.f376749e) + b36.f.e(3, this.f376750f);
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
        r45.i57 i57Var = (r45.i57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                i57Var.f376749e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            i57Var.f376750f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.a47 a47Var3 = new r45.a47();
            if (bArr != null && bArr.length > 0) {
                a47Var3.parseFrom(bArr);
            }
            i57Var.f376748d = a47Var3;
        }
        return 0;
    }
}
