package r45;

/* loaded from: classes2.dex */
public class a61 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f369769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369770e;

    /* renamed from: f, reason: collision with root package name */
    public int f369771f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369772g;

    /* renamed from: h, reason: collision with root package name */
    public long f369773h;

    /* renamed from: i, reason: collision with root package name */
    public int f369774i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a61)) {
            return false;
        }
        r45.a61 a61Var = (r45.a61) fVar;
        return n51.f.a(this.BaseRequest, a61Var.BaseRequest) && n51.f.a(this.f369769d, a61Var.f369769d) && n51.f.a(this.f369770e, a61Var.f369770e) && n51.f.a(java.lang.Integer.valueOf(this.f369771f), java.lang.Integer.valueOf(a61Var.f369771f)) && n51.f.a(this.f369772g, a61Var.f369772g) && n51.f.a(java.lang.Long.valueOf(this.f369773h), java.lang.Long.valueOf(a61Var.f369773h)) && n51.f.a(java.lang.Integer.valueOf(this.f369774i), java.lang.Integer.valueOf(a61Var.f369774i));
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
            r45.kv0 kv0Var = this.f369769d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f369769d.writeFields(fVar);
            }
            java.lang.String str = this.f369770e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f369771f);
            com.tencent.mm.protobuf.g gVar = this.f369772g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.h(6, this.f369773h);
            fVar.e(7, this.f369774i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f369769d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str2 = this.f369770e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f369771f);
            com.tencent.mm.protobuf.g gVar2 = this.f369772g;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            return e17 + b36.f.h(6, this.f369773h) + b36.f.e(7, this.f369774i);
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
        r45.a61 a61Var = (r45.a61) objArr[1];
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
                    a61Var.BaseRequest = heVar3;
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
                    a61Var.f369769d = kv0Var3;
                }
                return 0;
            case 3:
                a61Var.f369770e = aVar2.k(intValue);
                return 0;
            case 4:
                a61Var.f369771f = aVar2.g(intValue);
                return 0;
            case 5:
                a61Var.f369772g = aVar2.d(intValue);
                return 0;
            case 6:
                a61Var.f369773h = aVar2.i(intValue);
                return 0;
            case 7:
                a61Var.f369774i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
