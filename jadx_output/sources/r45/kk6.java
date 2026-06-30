package r45;

/* loaded from: classes4.dex */
public class kk6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378793d;

    /* renamed from: e, reason: collision with root package name */
    public long f378794e;

    /* renamed from: f, reason: collision with root package name */
    public int f378795f;

    /* renamed from: g, reason: collision with root package name */
    public int f378796g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kk6)) {
            return false;
        }
        r45.kk6 kk6Var = (r45.kk6) fVar;
        return n51.f.a(this.BaseRequest, kk6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f378793d), java.lang.Integer.valueOf(kk6Var.f378793d)) && n51.f.a(java.lang.Long.valueOf(this.f378794e), java.lang.Long.valueOf(kk6Var.f378794e)) && n51.f.a(java.lang.Integer.valueOf(this.f378795f), java.lang.Integer.valueOf(kk6Var.f378795f)) && n51.f.a(java.lang.Integer.valueOf(this.f378796g), java.lang.Integer.valueOf(kk6Var.f378796g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f378793d);
            fVar.h(3, this.f378794e);
            fVar.e(4, this.f378795f);
            fVar.e(5, this.f378796g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f378793d) + b36.f.h(3, this.f378794e) + b36.f.e(4, this.f378795f) + b36.f.e(5, this.f378796g);
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
        r45.kk6 kk6Var = (r45.kk6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                kk6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            kk6Var.f378793d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kk6Var.f378794e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            kk6Var.f378795f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kk6Var.f378796g = aVar2.g(intValue);
        return 0;
    }
}
