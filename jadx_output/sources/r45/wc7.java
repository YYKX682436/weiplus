package r45;

/* loaded from: classes9.dex */
public class wc7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qa f389072d;

    /* renamed from: e, reason: collision with root package name */
    public int f389073e;

    /* renamed from: f, reason: collision with root package name */
    public int f389074f;

    /* renamed from: g, reason: collision with root package name */
    public int f389075g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wc7)) {
            return false;
        }
        r45.wc7 wc7Var = (r45.wc7) fVar;
        return n51.f.a(this.f389072d, wc7Var.f389072d) && n51.f.a(java.lang.Integer.valueOf(this.f389073e), java.lang.Integer.valueOf(wc7Var.f389073e)) && n51.f.a(java.lang.Integer.valueOf(this.f389074f), java.lang.Integer.valueOf(wc7Var.f389074f)) && n51.f.a(java.lang.Integer.valueOf(this.f389075g), java.lang.Integer.valueOf(wc7Var.f389075g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qa qaVar = this.f389072d;
            if (qaVar != null) {
                fVar.i(1, qaVar.computeSize());
                this.f389072d.writeFields(fVar);
            }
            fVar.e(2, this.f389073e);
            fVar.e(3, this.f389074f);
            fVar.e(4, this.f389075g);
            return 0;
        }
        if (i17 == 1) {
            r45.qa qaVar2 = this.f389072d;
            return (qaVar2 != null ? 0 + b36.f.i(1, qaVar2.computeSize()) : 0) + b36.f.e(2, this.f389073e) + b36.f.e(3, this.f389074f) + b36.f.e(4, this.f389075g);
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
        r45.wc7 wc7Var = (r45.wc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                wc7Var.f389073e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 3) {
                wc7Var.f389074f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wc7Var.f389075g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.qa qaVar3 = new r45.qa();
            if (bArr != null && bArr.length > 0) {
                qaVar3.parseFrom(bArr);
            }
            wc7Var.f389072d = qaVar3;
        }
        return 0;
    }
}
