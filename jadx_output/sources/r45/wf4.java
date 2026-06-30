package r45;

/* loaded from: classes15.dex */
public class wf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389125d;

    /* renamed from: e, reason: collision with root package name */
    public int f389126e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389127f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389128g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389129h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389130i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389131m;

    /* renamed from: n, reason: collision with root package name */
    public int f389132n;

    /* renamed from: o, reason: collision with root package name */
    public int f389133o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sx3 f389134p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wf4)) {
            return false;
        }
        r45.wf4 wf4Var = (r45.wf4) fVar;
        return n51.f.a(this.f389125d, wf4Var.f389125d) && n51.f.a(java.lang.Integer.valueOf(this.f389126e), java.lang.Integer.valueOf(wf4Var.f389126e)) && n51.f.a(this.f389127f, wf4Var.f389127f) && n51.f.a(this.f389128g, wf4Var.f389128g) && n51.f.a(this.f389129h, wf4Var.f389129h) && n51.f.a(this.f389130i, wf4Var.f389130i) && n51.f.a(this.f389131m, wf4Var.f389131m) && n51.f.a(java.lang.Integer.valueOf(this.f389132n), java.lang.Integer.valueOf(wf4Var.f389132n)) && n51.f.a(java.lang.Integer.valueOf(this.f389133o), java.lang.Integer.valueOf(wf4Var.f389133o)) && n51.f.a(this.f389134p, wf4Var.f389134p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389125d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f389126e);
            java.lang.String str2 = this.f389127f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f389128g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f389129h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f389130i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f389131m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f389132n);
            fVar.e(9, this.f389133o);
            r45.sx3 sx3Var = this.f389134p;
            if (sx3Var != null) {
                fVar.i(10, sx3Var.computeSize());
                this.f389134p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f389125d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f389126e);
            java.lang.String str8 = this.f389127f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f389128g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f389129h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f389130i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f389131m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            int e17 = j17 + b36.f.e(8, this.f389132n) + b36.f.e(9, this.f389133o);
            r45.sx3 sx3Var2 = this.f389134p;
            return sx3Var2 != null ? e17 + b36.f.i(10, sx3Var2.computeSize()) : e17;
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
        r45.wf4 wf4Var = (r45.wf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wf4Var.f389125d = aVar2.k(intValue);
                return 0;
            case 2:
                wf4Var.f389126e = aVar2.g(intValue);
                return 0;
            case 3:
                wf4Var.f389127f = aVar2.k(intValue);
                return 0;
            case 4:
                wf4Var.f389128g = aVar2.k(intValue);
                return 0;
            case 5:
                wf4Var.f389129h = aVar2.k(intValue);
                return 0;
            case 6:
                wf4Var.f389130i = aVar2.k(intValue);
                return 0;
            case 7:
                wf4Var.f389131m = aVar2.k(intValue);
                return 0;
            case 8:
                wf4Var.f389132n = aVar2.g(intValue);
                return 0;
            case 9:
                wf4Var.f389133o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sx3 sx3Var3 = new r45.sx3();
                    if (bArr != null && bArr.length > 0) {
                        sx3Var3.parseFrom(bArr);
                    }
                    wf4Var.f389134p = sx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
