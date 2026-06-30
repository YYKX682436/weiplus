package r45;

/* loaded from: classes10.dex */
public class sl4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385832e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385833f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385834g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385835h;

    /* renamed from: i, reason: collision with root package name */
    public r45.pl4 f385836i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sl4)) {
            return false;
        }
        r45.sl4 sl4Var = (r45.sl4) fVar;
        return n51.f.a(this.f385831d, sl4Var.f385831d) && n51.f.a(this.f385832e, sl4Var.f385832e) && n51.f.a(this.f385833f, sl4Var.f385833f) && n51.f.a(this.f385834g, sl4Var.f385834g) && n51.f.a(this.f385835h, sl4Var.f385835h) && n51.f.a(this.f385836i, sl4Var.f385836i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385833f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385831d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385832e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f385834g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f385835h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.pl4 pl4Var = this.f385836i;
            if (pl4Var != null) {
                fVar.i(6, pl4Var.computeSize());
                this.f385836i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f385831d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f385832e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f385834g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f385835h;
            if (str8 != null) {
                g17 += b36.f.j(5, str8);
            }
            r45.pl4 pl4Var2 = this.f385836i;
            return pl4Var2 != null ? g17 + b36.f.i(6, pl4Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.sl4 sl4Var = (r45.sl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sl4Var.f385831d = aVar2.k(intValue);
                return 0;
            case 2:
                sl4Var.f385832e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.l30 l30Var = new r45.l30();
                    if (bArr2 != null && bArr2.length > 0) {
                        l30Var.parseFrom(bArr2);
                    }
                    sl4Var.f385833f.add(l30Var);
                }
                return 0;
            case 4:
                sl4Var.f385834g = aVar2.k(intValue);
                return 0;
            case 5:
                sl4Var.f385835h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.pl4 pl4Var3 = new r45.pl4();
                    if (bArr3 != null && bArr3.length > 0) {
                        pl4Var3.parseFrom(bArr3);
                    }
                    sl4Var.f385836i = pl4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
