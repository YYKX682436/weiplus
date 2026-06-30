package r45;

/* loaded from: classes9.dex */
public class o27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381852d;

    /* renamed from: e, reason: collision with root package name */
    public long f381853e;

    /* renamed from: f, reason: collision with root package name */
    public int f381854f;

    /* renamed from: g, reason: collision with root package name */
    public int f381855g;

    /* renamed from: h, reason: collision with root package name */
    public int f381856h;

    /* renamed from: i, reason: collision with root package name */
    public int f381857i;

    /* renamed from: m, reason: collision with root package name */
    public int f381858m;

    /* renamed from: n, reason: collision with root package name */
    public int f381859n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f381860o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o27)) {
            return false;
        }
        r45.o27 o27Var = (r45.o27) fVar;
        return n51.f.a(this.BaseRequest, o27Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f381852d), java.lang.Integer.valueOf(o27Var.f381852d)) && n51.f.a(java.lang.Long.valueOf(this.f381853e), java.lang.Long.valueOf(o27Var.f381853e)) && n51.f.a(java.lang.Integer.valueOf(this.f381854f), java.lang.Integer.valueOf(o27Var.f381854f)) && n51.f.a(java.lang.Integer.valueOf(this.f381855g), java.lang.Integer.valueOf(o27Var.f381855g)) && n51.f.a(java.lang.Integer.valueOf(this.f381856h), java.lang.Integer.valueOf(o27Var.f381856h)) && n51.f.a(java.lang.Integer.valueOf(this.f381857i), java.lang.Integer.valueOf(o27Var.f381857i)) && n51.f.a(java.lang.Integer.valueOf(this.f381858m), java.lang.Integer.valueOf(o27Var.f381858m)) && n51.f.a(java.lang.Integer.valueOf(this.f381859n), java.lang.Integer.valueOf(o27Var.f381859n)) && n51.f.a(this.f381860o, o27Var.f381860o);
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
            fVar.e(2, this.f381852d);
            fVar.h(3, this.f381853e);
            fVar.e(4, this.f381854f);
            fVar.e(5, this.f381855g);
            fVar.e(6, this.f381856h);
            fVar.e(7, this.f381857i);
            fVar.e(8, this.f381858m);
            fVar.e(9, this.f381859n);
            r45.cu5 cu5Var = this.f381860o;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.computeSize());
                this.f381860o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f381852d) + b36.f.h(3, this.f381853e) + b36.f.e(4, this.f381854f) + b36.f.e(5, this.f381855g) + b36.f.e(6, this.f381856h) + b36.f.e(7, this.f381857i) + b36.f.e(8, this.f381858m) + b36.f.e(9, this.f381859n);
            r45.cu5 cu5Var2 = this.f381860o;
            return cu5Var2 != null ? i18 + b36.f.i(10, cu5Var2.computeSize()) : i18;
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
        r45.o27 o27Var = (r45.o27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    o27Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                o27Var.f381852d = aVar2.g(intValue);
                return 0;
            case 3:
                o27Var.f381853e = aVar2.i(intValue);
                return 0;
            case 4:
                o27Var.f381854f = aVar2.g(intValue);
                return 0;
            case 5:
                o27Var.f381855g = aVar2.g(intValue);
                return 0;
            case 6:
                o27Var.f381856h = aVar2.g(intValue);
                return 0;
            case 7:
                o27Var.f381857i = aVar2.g(intValue);
                return 0;
            case 8:
                o27Var.f381858m = aVar2.g(intValue);
                return 0;
            case 9:
                o27Var.f381859n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    o27Var.f381860o = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
