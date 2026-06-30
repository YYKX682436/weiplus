package r45;

/* loaded from: classes8.dex */
public class s27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385449d;

    /* renamed from: e, reason: collision with root package name */
    public long f385450e;

    /* renamed from: f, reason: collision with root package name */
    public int f385451f;

    /* renamed from: g, reason: collision with root package name */
    public long f385452g;

    /* renamed from: h, reason: collision with root package name */
    public int f385453h;

    /* renamed from: i, reason: collision with root package name */
    public int f385454i;

    /* renamed from: m, reason: collision with root package name */
    public int f385455m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s27)) {
            return false;
        }
        r45.s27 s27Var = (r45.s27) fVar;
        return n51.f.a(this.BaseRequest, s27Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f385449d), java.lang.Integer.valueOf(s27Var.f385449d)) && n51.f.a(java.lang.Long.valueOf(this.f385450e), java.lang.Long.valueOf(s27Var.f385450e)) && n51.f.a(java.lang.Integer.valueOf(this.f385451f), java.lang.Integer.valueOf(s27Var.f385451f)) && n51.f.a(java.lang.Long.valueOf(this.f385452g), java.lang.Long.valueOf(s27Var.f385452g)) && n51.f.a(java.lang.Integer.valueOf(this.f385453h), java.lang.Integer.valueOf(s27Var.f385453h)) && n51.f.a(java.lang.Integer.valueOf(this.f385454i), java.lang.Integer.valueOf(s27Var.f385454i)) && n51.f.a(java.lang.Integer.valueOf(this.f385455m), java.lang.Integer.valueOf(s27Var.f385455m));
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
            fVar.e(2, this.f385449d);
            fVar.h(3, this.f385450e);
            fVar.e(4, this.f385451f);
            fVar.h(5, this.f385452g);
            fVar.e(6, this.f385453h);
            fVar.e(7, this.f385454i);
            fVar.e(8, this.f385455m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f385449d) + b36.f.h(3, this.f385450e) + b36.f.e(4, this.f385451f) + b36.f.h(5, this.f385452g) + b36.f.e(6, this.f385453h) + b36.f.e(7, this.f385454i) + b36.f.e(8, this.f385455m);
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
        r45.s27 s27Var = (r45.s27) objArr[1];
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
                    s27Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                s27Var.f385449d = aVar2.g(intValue);
                return 0;
            case 3:
                s27Var.f385450e = aVar2.i(intValue);
                return 0;
            case 4:
                s27Var.f385451f = aVar2.g(intValue);
                return 0;
            case 5:
                s27Var.f385452g = aVar2.i(intValue);
                return 0;
            case 6:
                s27Var.f385453h = aVar2.g(intValue);
                return 0;
            case 7:
                s27Var.f385454i = aVar2.g(intValue);
                return 0;
            case 8:
                s27Var.f385455m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
