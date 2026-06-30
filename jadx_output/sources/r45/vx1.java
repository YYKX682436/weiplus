package r45;

/* loaded from: classes10.dex */
public class vx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f388634d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388635e;

    /* renamed from: f, reason: collision with root package name */
    public long f388636f;

    /* renamed from: g, reason: collision with root package name */
    public long f388637g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388638h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388639i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388640m;

    /* renamed from: n, reason: collision with root package name */
    public int f388641n;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 9223;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivektvsearchmusicsmartbox";
        lVar.f70664a = this;
        lVar.f70665b = new r45.wx1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx1)) {
            return false;
        }
        r45.vx1 vx1Var = (r45.vx1) fVar;
        return n51.f.a(this.BaseRequest, vx1Var.BaseRequest) && n51.f.a(this.f388634d, vx1Var.f388634d) && n51.f.a(this.f388635e, vx1Var.f388635e) && n51.f.a(java.lang.Long.valueOf(this.f388636f), java.lang.Long.valueOf(vx1Var.f388636f)) && n51.f.a(java.lang.Long.valueOf(this.f388637g), java.lang.Long.valueOf(vx1Var.f388637g)) && n51.f.a(this.f388638h, vx1Var.f388638h) && n51.f.a(this.f388639i, vx1Var.f388639i) && n51.f.a(this.f388640m, vx1Var.f388640m) && n51.f.a(java.lang.Integer.valueOf(this.f388641n), java.lang.Integer.valueOf(vx1Var.f388641n));
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
            r45.kv0 kv0Var = this.f388634d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f388634d.writeFields(fVar);
            }
            java.lang.String str = this.f388635e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f388636f);
            fVar.h(5, this.f388637g);
            java.lang.String str2 = this.f388638h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f388639i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f388640m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f388641n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f388634d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str5 = this.f388635e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f388636f) + b36.f.h(5, this.f388637g);
            java.lang.String str6 = this.f388638h;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f388639i;
            if (str7 != null) {
                h17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f388640m;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            return h17 + b36.f.e(9, this.f388641n);
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
        r45.vx1 vx1Var = (r45.vx1) objArr[1];
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
                    vx1Var.BaseRequest = heVar3;
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
                    vx1Var.f388634d = kv0Var3;
                }
                return 0;
            case 3:
                vx1Var.f388635e = aVar2.k(intValue);
                return 0;
            case 4:
                vx1Var.f388636f = aVar2.i(intValue);
                return 0;
            case 5:
                vx1Var.f388637g = aVar2.i(intValue);
                return 0;
            case 6:
                vx1Var.f388638h = aVar2.k(intValue);
                return 0;
            case 7:
                vx1Var.f388639i = aVar2.k(intValue);
                return 0;
            case 8:
                vx1Var.f388640m = aVar2.k(intValue);
                return 0;
            case 9:
                vx1Var.f388641n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
