package r45;

/* loaded from: classes10.dex */
public class yw1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f391438d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391439e;

    /* renamed from: f, reason: collision with root package name */
    public long f391440f;

    /* renamed from: g, reason: collision with root package name */
    public long f391441g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391442h;

    /* renamed from: i, reason: collision with root package name */
    public int f391443i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391444m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391445n;

    /* renamed from: o, reason: collision with root package name */
    public int f391446o;

    /* renamed from: p, reason: collision with root package name */
    public int f391447p;

    /* renamed from: q, reason: collision with root package name */
    public long f391448q;

    /* renamed from: r, reason: collision with root package name */
    public int f391449r;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 20854;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivektvgetmusicboard";
        lVar.f70664a = this;
        lVar.f70665b = new r45.zw1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yw1)) {
            return false;
        }
        r45.yw1 yw1Var = (r45.yw1) fVar;
        return n51.f.a(this.BaseRequest, yw1Var.BaseRequest) && n51.f.a(this.f391438d, yw1Var.f391438d) && n51.f.a(this.f391439e, yw1Var.f391439e) && n51.f.a(java.lang.Long.valueOf(this.f391440f), java.lang.Long.valueOf(yw1Var.f391440f)) && n51.f.a(java.lang.Long.valueOf(this.f391441g), java.lang.Long.valueOf(yw1Var.f391441g)) && n51.f.a(this.f391442h, yw1Var.f391442h) && n51.f.a(java.lang.Integer.valueOf(this.f391443i), java.lang.Integer.valueOf(yw1Var.f391443i)) && n51.f.a(this.f391444m, yw1Var.f391444m) && n51.f.a(this.f391445n, yw1Var.f391445n) && n51.f.a(java.lang.Integer.valueOf(this.f391446o), java.lang.Integer.valueOf(yw1Var.f391446o)) && n51.f.a(java.lang.Integer.valueOf(this.f391447p), java.lang.Integer.valueOf(yw1Var.f391447p)) && n51.f.a(java.lang.Long.valueOf(this.f391448q), java.lang.Long.valueOf(yw1Var.f391448q)) && n51.f.a(java.lang.Integer.valueOf(this.f391449r), java.lang.Integer.valueOf(yw1Var.f391449r));
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
            r45.kv0 kv0Var = this.f391438d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f391438d.writeFields(fVar);
            }
            java.lang.String str = this.f391439e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f391440f);
            fVar.h(5, this.f391441g);
            java.lang.String str2 = this.f391442h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f391443i);
            com.tencent.mm.protobuf.g gVar = this.f391444m;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391445n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            fVar.e(10, this.f391446o);
            fVar.e(11, this.f391447p);
            fVar.h(12, this.f391448q);
            fVar.e(13, this.f391449r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f391438d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f391439e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f391440f) + b36.f.h(5, this.f391441g);
            java.lang.String str4 = this.f391442h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            int e17 = h17 + b36.f.e(7, this.f391443i);
            com.tencent.mm.protobuf.g gVar3 = this.f391444m;
            if (gVar3 != null) {
                e17 += b36.f.b(8, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f391445n;
            if (gVar4 != null) {
                e17 += b36.f.b(9, gVar4);
            }
            return e17 + b36.f.e(10, this.f391446o) + b36.f.e(11, this.f391447p) + b36.f.h(12, this.f391448q) + b36.f.e(13, this.f391449r);
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
        r45.yw1 yw1Var = (r45.yw1) objArr[1];
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
                    yw1Var.BaseRequest = heVar3;
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
                    yw1Var.f391438d = kv0Var3;
                }
                return 0;
            case 3:
                yw1Var.f391439e = aVar2.k(intValue);
                return 0;
            case 4:
                yw1Var.f391440f = aVar2.i(intValue);
                return 0;
            case 5:
                yw1Var.f391441g = aVar2.i(intValue);
                return 0;
            case 6:
                yw1Var.f391442h = aVar2.k(intValue);
                return 0;
            case 7:
                yw1Var.f391443i = aVar2.g(intValue);
                return 0;
            case 8:
                yw1Var.f391444m = aVar2.d(intValue);
                return 0;
            case 9:
                yw1Var.f391445n = aVar2.d(intValue);
                return 0;
            case 10:
                yw1Var.f391446o = aVar2.g(intValue);
                return 0;
            case 11:
                yw1Var.f391447p = aVar2.g(intValue);
                return 0;
            case 12:
                yw1Var.f391448q = aVar2.i(intValue);
                return 0;
            case 13:
                yw1Var.f391449r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
