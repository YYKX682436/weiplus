package r45;

/* loaded from: classes2.dex */
public class ei4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f373534d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373535e;

    /* renamed from: f, reason: collision with root package name */
    public int f373536f;

    /* renamed from: g, reason: collision with root package name */
    public int f373537g;

    /* renamed from: h, reason: collision with root package name */
    public long f373538h;

    /* renamed from: i, reason: collision with root package name */
    public long f373539i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ei4)) {
            return false;
        }
        r45.ei4 ei4Var = (r45.ei4) fVar;
        return n51.f.a(this.BaseRequest, ei4Var.BaseRequest) && n51.f.a(this.f373534d, ei4Var.f373534d) && n51.f.a(this.f373535e, ei4Var.f373535e) && n51.f.a(java.lang.Integer.valueOf(this.f373536f), java.lang.Integer.valueOf(ei4Var.f373536f)) && n51.f.a(java.lang.Integer.valueOf(this.f373537g), java.lang.Integer.valueOf(ei4Var.f373537g)) && n51.f.a(java.lang.Long.valueOf(this.f373538h), java.lang.Long.valueOf(ei4Var.f373538h)) && n51.f.a(java.lang.Long.valueOf(this.f373539i), java.lang.Long.valueOf(ei4Var.f373539i));
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
            r45.kv0 kv0Var = this.f373534d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f373534d.writeFields(fVar);
            }
            java.lang.String str = this.f373535e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f373536f);
            fVar.e(5, this.f373537g);
            fVar.h(6, this.f373538h);
            fVar.h(7, this.f373539i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f373534d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str2 = this.f373535e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f373536f) + b36.f.e(5, this.f373537g) + b36.f.h(6, this.f373538h) + b36.f.h(7, this.f373539i);
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
        r45.ei4 ei4Var = (r45.ei4) objArr[1];
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
                    ei4Var.BaseRequest = heVar3;
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
                    ei4Var.f373534d = kv0Var3;
                }
                return 0;
            case 3:
                ei4Var.f373535e = aVar2.k(intValue);
                return 0;
            case 4:
                ei4Var.f373536f = aVar2.g(intValue);
                return 0;
            case 5:
                ei4Var.f373537g = aVar2.g(intValue);
                return 0;
            case 6:
                ei4Var.f373538h = aVar2.i(intValue);
                return 0;
            case 7:
                ei4Var.f373539i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
