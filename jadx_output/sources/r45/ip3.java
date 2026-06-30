package r45;

/* loaded from: classes8.dex */
public class ip3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f377249d;

    /* renamed from: e, reason: collision with root package name */
    public int f377250e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f377251f;

    /* renamed from: g, reason: collision with root package name */
    public int f377252g;

    /* renamed from: h, reason: collision with root package name */
    public int f377253h;

    /* renamed from: i, reason: collision with root package name */
    public int f377254i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ip3)) {
            return false;
        }
        r45.ip3 ip3Var = (r45.ip3) fVar;
        return n51.f.a(this.BaseResponse, ip3Var.BaseResponse) && n51.f.a(java.lang.Boolean.valueOf(this.f377249d), java.lang.Boolean.valueOf(ip3Var.f377249d)) && n51.f.a(java.lang.Integer.valueOf(this.f377250e), java.lang.Integer.valueOf(ip3Var.f377250e)) && n51.f.a(java.lang.Boolean.valueOf(this.f377251f), java.lang.Boolean.valueOf(ip3Var.f377251f)) && n51.f.a(java.lang.Integer.valueOf(this.f377252g), java.lang.Integer.valueOf(ip3Var.f377252g)) && n51.f.a(java.lang.Integer.valueOf(this.f377253h), java.lang.Integer.valueOf(ip3Var.f377253h)) && n51.f.a(java.lang.Integer.valueOf(this.f377254i), java.lang.Integer.valueOf(ip3Var.f377254i));
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
            fVar.a(2, this.f377249d);
            fVar.e(3, this.f377250e);
            fVar.a(4, this.f377251f);
            fVar.e(5, this.f377252g);
            fVar.e(6, this.f377253h);
            fVar.e(7, this.f377254i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.a(2, this.f377249d) + b36.f.e(3, this.f377250e) + b36.f.a(4, this.f377251f) + b36.f.e(5, this.f377252g) + b36.f.e(6, this.f377253h) + b36.f.e(7, this.f377254i);
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
        r45.ip3 ip3Var = (r45.ip3) objArr[1];
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
                    ip3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ip3Var.f377249d = aVar2.c(intValue);
                return 0;
            case 3:
                ip3Var.f377250e = aVar2.g(intValue);
                return 0;
            case 4:
                ip3Var.f377251f = aVar2.c(intValue);
                return 0;
            case 5:
                ip3Var.f377252g = aVar2.g(intValue);
                return 0;
            case 6:
                ip3Var.f377253h = aVar2.g(intValue);
                return 0;
            case 7:
                ip3Var.f377254i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
