package r45;

/* loaded from: classes8.dex */
public class c63 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371303e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371304f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371305g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371306h;

    /* renamed from: i, reason: collision with root package name */
    public r45.m63 f371307i;

    /* renamed from: m, reason: collision with root package name */
    public int f371308m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371309n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c63)) {
            return false;
        }
        r45.c63 c63Var = (r45.c63) fVar;
        return n51.f.a(this.f371302d, c63Var.f371302d) && n51.f.a(this.f371303e, c63Var.f371303e) && n51.f.a(this.f371304f, c63Var.f371304f) && n51.f.a(this.f371305g, c63Var.f371305g) && n51.f.a(this.f371306h, c63Var.f371306h) && n51.f.a(this.f371307i, c63Var.f371307i) && n51.f.a(java.lang.Integer.valueOf(this.f371308m), java.lang.Integer.valueOf(c63Var.f371308m)) && n51.f.a(this.f371309n, c63Var.f371309n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371302d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f371303e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f371304f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f371305g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f371306h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            r45.m63 m63Var = this.f371307i;
            if (m63Var != null) {
                fVar.i(6, m63Var.computeSize());
                this.f371307i.writeFields(fVar);
            }
            fVar.e(7, this.f371308m);
            java.lang.String str6 = this.f371309n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f371302d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f371303e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f371304f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f371305g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f371306h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            r45.m63 m63Var2 = this.f371307i;
            if (m63Var2 != null) {
                j17 += b36.f.i(6, m63Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(7, this.f371308m);
            java.lang.String str12 = this.f371309n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.c63 c63Var = (r45.c63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c63Var.f371302d = aVar2.k(intValue);
                return 0;
            case 2:
                c63Var.f371303e = aVar2.k(intValue);
                return 0;
            case 3:
                c63Var.f371304f = aVar2.k(intValue);
                return 0;
            case 4:
                c63Var.f371305g = aVar2.k(intValue);
                return 0;
            case 5:
                c63Var.f371306h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.m63 m63Var3 = new r45.m63();
                    if (bArr != null && bArr.length > 0) {
                        m63Var3.parseFrom(bArr);
                    }
                    c63Var.f371307i = m63Var3;
                }
                return 0;
            case 7:
                c63Var.f371308m = aVar2.g(intValue);
                return 0;
            case 8:
                c63Var.f371309n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
