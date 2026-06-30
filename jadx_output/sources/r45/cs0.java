package r45;

/* loaded from: classes4.dex */
public class cs0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f371802d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371803e;

    /* renamed from: f, reason: collision with root package name */
    public int f371804f;

    /* renamed from: g, reason: collision with root package name */
    public int f371805g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371806h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371807i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cs0)) {
            return false;
        }
        r45.cs0 cs0Var = (r45.cs0) fVar;
        return n51.f.a(this.BaseRequest, cs0Var.BaseRequest) && n51.f.a(this.f371802d, cs0Var.f371802d) && n51.f.a(this.f371803e, cs0Var.f371803e) && n51.f.a(java.lang.Integer.valueOf(this.f371804f), java.lang.Integer.valueOf(cs0Var.f371804f)) && n51.f.a(java.lang.Integer.valueOf(this.f371805g), java.lang.Integer.valueOf(cs0Var.f371805g)) && n51.f.a(this.f371806h, cs0Var.f371806h) && n51.f.a(this.f371807i, cs0Var.f371807i);
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
            r45.kv0 kv0Var = this.f371802d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f371802d.writeFields(fVar);
            }
            java.lang.String str = this.f371803e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f371804f);
            fVar.e(5, this.f371805g);
            com.tencent.mm.protobuf.g gVar = this.f371806h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.f371807i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f371802d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f371803e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f371804f) + b36.f.e(5, this.f371805g);
            com.tencent.mm.protobuf.g gVar2 = this.f371806h;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str4 = this.f371807i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.cs0 cs0Var = (r45.cs0) objArr[1];
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
                    cs0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    cs0Var.f371802d = kv0Var3;
                }
                return 0;
            case 3:
                cs0Var.f371803e = aVar2.k(intValue);
                return 0;
            case 4:
                cs0Var.f371804f = aVar2.g(intValue);
                return 0;
            case 5:
                cs0Var.f371805g = aVar2.g(intValue);
                return 0;
            case 6:
                cs0Var.f371806h = aVar2.d(intValue);
                return 0;
            case 7:
                cs0Var.f371807i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
