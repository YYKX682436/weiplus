package r45;

/* loaded from: classes8.dex */
public class ut1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f387632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387633e;

    /* renamed from: f, reason: collision with root package name */
    public long f387634f;

    /* renamed from: g, reason: collision with root package name */
    public long f387635g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387636h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387637i;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 14940;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetnewsongplayinfo";
        lVar.f70664a = this;
        lVar.f70665b = new r45.vt1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ut1)) {
            return false;
        }
        r45.ut1 ut1Var = (r45.ut1) fVar;
        return n51.f.a(this.BaseRequest, ut1Var.BaseRequest) && n51.f.a(this.f387632d, ut1Var.f387632d) && n51.f.a(this.f387633e, ut1Var.f387633e) && n51.f.a(java.lang.Long.valueOf(this.f387634f), java.lang.Long.valueOf(ut1Var.f387634f)) && n51.f.a(java.lang.Long.valueOf(this.f387635g), java.lang.Long.valueOf(ut1Var.f387635g)) && n51.f.a(this.f387636h, ut1Var.f387636h) && n51.f.a(this.f387637i, ut1Var.f387637i);
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
            r45.kv0 kv0Var = this.f387632d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f387632d.writeFields(fVar);
            }
            java.lang.String str = this.f387633e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f387634f);
            fVar.h(5, this.f387635g);
            com.tencent.mm.protobuf.g gVar = this.f387636h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.f387637i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f387632d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f387633e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f387634f) + b36.f.h(5, this.f387635g);
            com.tencent.mm.protobuf.g gVar2 = this.f387636h;
            if (gVar2 != null) {
                h17 += b36.f.b(6, gVar2);
            }
            java.lang.String str4 = this.f387637i;
            return str4 != null ? h17 + b36.f.j(7, str4) : h17;
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
        r45.ut1 ut1Var = (r45.ut1) objArr[1];
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
                    ut1Var.BaseRequest = heVar3;
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
                    ut1Var.f387632d = kv0Var3;
                }
                return 0;
            case 3:
                ut1Var.f387633e = aVar2.k(intValue);
                return 0;
            case 4:
                ut1Var.f387634f = aVar2.i(intValue);
                return 0;
            case 5:
                ut1Var.f387635g = aVar2.i(intValue);
                return 0;
            case 6:
                ut1Var.f387636h = aVar2.d(intValue);
                return 0;
            case 7:
                ut1Var.f387637i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
