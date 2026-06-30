package r45;

/* loaded from: classes8.dex */
public class td3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386321d;

    /* renamed from: e, reason: collision with root package name */
    public int f386322e;

    /* renamed from: f, reason: collision with root package name */
    public double f386323f;

    /* renamed from: g, reason: collision with root package name */
    public double f386324g;

    /* renamed from: h, reason: collision with root package name */
    public int f386325h;

    /* renamed from: i, reason: collision with root package name */
    public int f386326i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.td3)) {
            return false;
        }
        r45.td3 td3Var = (r45.td3) fVar;
        return n51.f.a(this.BaseRequest, td3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386321d), java.lang.Integer.valueOf(td3Var.f386321d)) && n51.f.a(java.lang.Integer.valueOf(this.f386322e), java.lang.Integer.valueOf(td3Var.f386322e)) && n51.f.a(java.lang.Double.valueOf(this.f386323f), java.lang.Double.valueOf(td3Var.f386323f)) && n51.f.a(java.lang.Double.valueOf(this.f386324g), java.lang.Double.valueOf(td3Var.f386324g)) && n51.f.a(java.lang.Integer.valueOf(this.f386325h), java.lang.Integer.valueOf(td3Var.f386325h)) && n51.f.a(java.lang.Integer.valueOf(this.f386326i), java.lang.Integer.valueOf(td3Var.f386326i));
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
            fVar.e(2, this.f386321d);
            fVar.e(3, this.f386322e);
            fVar.c(4, this.f386323f);
            fVar.c(5, this.f386324g);
            fVar.e(6, this.f386325h);
            fVar.e(7, this.f386326i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386321d) + b36.f.e(3, this.f386322e) + b36.f.c(4, this.f386323f) + b36.f.c(5, this.f386324g) + b36.f.e(6, this.f386325h) + b36.f.e(7, this.f386326i);
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
        r45.td3 td3Var = (r45.td3) objArr[1];
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
                    td3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                td3Var.f386321d = aVar2.g(intValue);
                return 0;
            case 3:
                td3Var.f386322e = aVar2.g(intValue);
                return 0;
            case 4:
                td3Var.f386323f = aVar2.e(intValue);
                return 0;
            case 5:
                td3Var.f386324g = aVar2.e(intValue);
                return 0;
            case 6:
                td3Var.f386325h = aVar2.g(intValue);
                return 0;
            case 7:
                td3Var.f386326i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
