package r45;

/* loaded from: classes4.dex */
public class g93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375010e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375011f;

    /* renamed from: g, reason: collision with root package name */
    public long f375012g;

    /* renamed from: h, reason: collision with root package name */
    public long f375013h;

    /* renamed from: i, reason: collision with root package name */
    public long f375014i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375015m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g93)) {
            return false;
        }
        r45.g93 g93Var = (r45.g93) fVar;
        return n51.f.a(this.BaseRequest, g93Var.BaseRequest) && n51.f.a(this.f375009d, g93Var.f375009d) && n51.f.a(this.f375010e, g93Var.f375010e) && n51.f.a(this.f375011f, g93Var.f375011f) && n51.f.a(java.lang.Long.valueOf(this.f375012g), java.lang.Long.valueOf(g93Var.f375012g)) && n51.f.a(java.lang.Long.valueOf(this.f375013h), java.lang.Long.valueOf(g93Var.f375013h)) && n51.f.a(java.lang.Long.valueOf(this.f375014i), java.lang.Long.valueOf(g93Var.f375014i)) && n51.f.a(this.f375015m, g93Var.f375015m);
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
            java.lang.String str = this.f375009d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375010e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f375011f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f375012g);
            fVar.h(6, this.f375013h);
            fVar.h(7, this.f375014i);
            java.lang.String str4 = this.f375015m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f375009d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f375010e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f375011f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int h17 = i18 + b36.f.h(5, this.f375012g) + b36.f.h(6, this.f375013h) + b36.f.h(7, this.f375014i);
            java.lang.String str8 = this.f375015m;
            return str8 != null ? h17 + b36.f.j(8, str8) : h17;
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
        r45.g93 g93Var = (r45.g93) objArr[1];
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
                    g93Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                g93Var.f375009d = aVar2.k(intValue);
                return 0;
            case 3:
                g93Var.f375010e = aVar2.k(intValue);
                return 0;
            case 4:
                g93Var.f375011f = aVar2.k(intValue);
                return 0;
            case 5:
                g93Var.f375012g = aVar2.i(intValue);
                return 0;
            case 6:
                g93Var.f375013h = aVar2.i(intValue);
                return 0;
            case 7:
                g93Var.f375014i = aVar2.i(intValue);
                return 0;
            case 8:
                g93Var.f375015m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
