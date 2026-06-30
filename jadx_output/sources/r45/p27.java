package r45;

/* loaded from: classes8.dex */
public class p27 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382688d;

    /* renamed from: e, reason: collision with root package name */
    public long f382689e;

    /* renamed from: f, reason: collision with root package name */
    public int f382690f;

    /* renamed from: g, reason: collision with root package name */
    public int f382691g;

    /* renamed from: h, reason: collision with root package name */
    public int f382692h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p27)) {
            return false;
        }
        r45.p27 p27Var = (r45.p27) fVar;
        return n51.f.a(this.BaseResponse, p27Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382688d), java.lang.Integer.valueOf(p27Var.f382688d)) && n51.f.a(java.lang.Long.valueOf(this.f382689e), java.lang.Long.valueOf(p27Var.f382689e)) && n51.f.a(java.lang.Integer.valueOf(this.f382690f), java.lang.Integer.valueOf(p27Var.f382690f)) && n51.f.a(java.lang.Integer.valueOf(this.f382691g), java.lang.Integer.valueOf(p27Var.f382691g)) && n51.f.a(java.lang.Integer.valueOf(this.f382692h), java.lang.Integer.valueOf(p27Var.f382692h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f382688d);
            fVar.h(3, this.f382689e);
            fVar.e(4, this.f382690f);
            fVar.e(5, this.f382691g);
            fVar.e(6, this.f382692h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382688d) + b36.f.h(3, this.f382689e) + b36.f.e(4, this.f382690f) + b36.f.e(5, this.f382691g) + b36.f.e(6, this.f382692h);
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
        r45.p27 p27Var = (r45.p27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    p27Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                p27Var.f382688d = aVar2.g(intValue);
                return 0;
            case 3:
                p27Var.f382689e = aVar2.i(intValue);
                return 0;
            case 4:
                p27Var.f382690f = aVar2.g(intValue);
                return 0;
            case 5:
                p27Var.f382691g = aVar2.g(intValue);
                return 0;
            case 6:
                p27Var.f382692h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
