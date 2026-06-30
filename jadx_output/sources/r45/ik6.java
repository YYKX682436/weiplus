package r45;

/* loaded from: classes4.dex */
public class ik6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377116d;

    /* renamed from: e, reason: collision with root package name */
    public long f377117e;

    /* renamed from: f, reason: collision with root package name */
    public int f377118f;

    /* renamed from: g, reason: collision with root package name */
    public int f377119g;

    /* renamed from: h, reason: collision with root package name */
    public int f377120h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ik6)) {
            return false;
        }
        r45.ik6 ik6Var = (r45.ik6) fVar;
        return n51.f.a(this.BaseRequest, ik6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377116d), java.lang.Integer.valueOf(ik6Var.f377116d)) && n51.f.a(java.lang.Long.valueOf(this.f377117e), java.lang.Long.valueOf(ik6Var.f377117e)) && n51.f.a(java.lang.Integer.valueOf(this.f377118f), java.lang.Integer.valueOf(ik6Var.f377118f)) && n51.f.a(java.lang.Integer.valueOf(this.f377119g), java.lang.Integer.valueOf(ik6Var.f377119g)) && n51.f.a(java.lang.Integer.valueOf(this.f377120h), java.lang.Integer.valueOf(ik6Var.f377120h));
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
            fVar.e(2, this.f377116d);
            fVar.h(3, this.f377117e);
            fVar.e(4, this.f377118f);
            fVar.e(5, this.f377119g);
            fVar.e(6, this.f377120h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377116d) + b36.f.h(3, this.f377117e) + b36.f.e(4, this.f377118f) + b36.f.e(5, this.f377119g) + b36.f.e(6, this.f377120h);
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
        r45.ik6 ik6Var = (r45.ik6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ik6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ik6Var.f377116d = aVar2.g(intValue);
                return 0;
            case 3:
                ik6Var.f377117e = aVar2.i(intValue);
                return 0;
            case 4:
                ik6Var.f377118f = aVar2.g(intValue);
                return 0;
            case 5:
                ik6Var.f377119g = aVar2.g(intValue);
                return 0;
            case 6:
                ik6Var.f377120h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
