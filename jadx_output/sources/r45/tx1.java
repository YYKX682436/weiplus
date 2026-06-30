package r45;

/* loaded from: classes10.dex */
public class tx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f386842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386843e;

    /* renamed from: f, reason: collision with root package name */
    public long f386844f;

    /* renamed from: g, reason: collision with root package name */
    public long f386845g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386846h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386847i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386848m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386849n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386850o;

    /* renamed from: p, reason: collision with root package name */
    public int f386851p;

    /* renamed from: q, reason: collision with root package name */
    public long f386852q;

    /* renamed from: r, reason: collision with root package name */
    public int f386853r;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 15821;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivektvsearchmusic";
        lVar.f70664a = this;
        lVar.f70665b = new r45.ux1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tx1)) {
            return false;
        }
        r45.tx1 tx1Var = (r45.tx1) fVar;
        return n51.f.a(this.BaseRequest, tx1Var.BaseRequest) && n51.f.a(this.f386842d, tx1Var.f386842d) && n51.f.a(this.f386843e, tx1Var.f386843e) && n51.f.a(java.lang.Long.valueOf(this.f386844f), java.lang.Long.valueOf(tx1Var.f386844f)) && n51.f.a(java.lang.Long.valueOf(this.f386845g), java.lang.Long.valueOf(tx1Var.f386845g)) && n51.f.a(this.f386846h, tx1Var.f386846h) && n51.f.a(this.f386847i, tx1Var.f386847i) && n51.f.a(this.f386848m, tx1Var.f386848m) && n51.f.a(this.f386849n, tx1Var.f386849n) && n51.f.a(this.f386850o, tx1Var.f386850o) && n51.f.a(java.lang.Integer.valueOf(this.f386851p), java.lang.Integer.valueOf(tx1Var.f386851p)) && n51.f.a(java.lang.Long.valueOf(this.f386852q), java.lang.Long.valueOf(tx1Var.f386852q)) && n51.f.a(java.lang.Integer.valueOf(this.f386853r), java.lang.Integer.valueOf(tx1Var.f386853r));
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
            r45.kv0 kv0Var = this.f386842d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f386842d.writeFields(fVar);
            }
            java.lang.String str = this.f386843e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f386844f);
            fVar.h(5, this.f386845g);
            java.lang.String str2 = this.f386846h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f386847i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f386848m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f386849n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f386850o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            fVar.e(11, this.f386851p);
            fVar.h(12, this.f386852q);
            fVar.e(13, this.f386853r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f386842d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str5 = this.f386843e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f386844f) + b36.f.h(5, this.f386845g);
            java.lang.String str6 = this.f386846h;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f386847i;
            if (str7 != null) {
                h17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f386848m;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f386849n;
            if (gVar3 != null) {
                h17 += b36.f.b(9, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f386850o;
            if (gVar4 != null) {
                h17 += b36.f.b(10, gVar4);
            }
            return h17 + b36.f.e(11, this.f386851p) + b36.f.h(12, this.f386852q) + b36.f.e(13, this.f386853r);
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
        r45.tx1 tx1Var = (r45.tx1) objArr[1];
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
                    tx1Var.BaseRequest = heVar3;
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
                    tx1Var.f386842d = kv0Var3;
                }
                return 0;
            case 3:
                tx1Var.f386843e = aVar2.k(intValue);
                return 0;
            case 4:
                tx1Var.f386844f = aVar2.i(intValue);
                return 0;
            case 5:
                tx1Var.f386845g = aVar2.i(intValue);
                return 0;
            case 6:
                tx1Var.f386846h = aVar2.k(intValue);
                return 0;
            case 7:
                tx1Var.f386847i = aVar2.k(intValue);
                return 0;
            case 8:
                tx1Var.f386848m = aVar2.k(intValue);
                return 0;
            case 9:
                tx1Var.f386849n = aVar2.d(intValue);
                return 0;
            case 10:
                tx1Var.f386850o = aVar2.d(intValue);
                return 0;
            case 11:
                tx1Var.f386851p = aVar2.g(intValue);
                return 0;
            case 12:
                tx1Var.f386852q = aVar2.i(intValue);
                return 0;
            case 13:
                tx1Var.f386853r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
