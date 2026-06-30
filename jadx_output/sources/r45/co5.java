package r45;

/* loaded from: classes14.dex */
public class co5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371724d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371725e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371726f;

    /* renamed from: g, reason: collision with root package name */
    public int f371727g;

    /* renamed from: h, reason: collision with root package name */
    public int f371728h;

    /* renamed from: i, reason: collision with root package name */
    public int f371729i;

    /* renamed from: m, reason: collision with root package name */
    public r45.c27 f371730m;

    /* renamed from: n, reason: collision with root package name */
    public r45.c27 f371731n;

    /* renamed from: o, reason: collision with root package name */
    public int f371732o;

    /* renamed from: p, reason: collision with root package name */
    public int f371733p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co5)) {
            return false;
        }
        r45.co5 co5Var = (r45.co5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371724d), java.lang.Integer.valueOf(co5Var.f371724d)) && n51.f.a(this.f371725e, co5Var.f371725e) && n51.f.a(this.f371726f, co5Var.f371726f) && n51.f.a(java.lang.Integer.valueOf(this.f371727g), java.lang.Integer.valueOf(co5Var.f371727g)) && n51.f.a(java.lang.Integer.valueOf(this.f371728h), java.lang.Integer.valueOf(co5Var.f371728h)) && n51.f.a(java.lang.Integer.valueOf(this.f371729i), java.lang.Integer.valueOf(co5Var.f371729i)) && n51.f.a(this.f371730m, co5Var.f371730m) && n51.f.a(this.f371731n, co5Var.f371731n) && n51.f.a(java.lang.Integer.valueOf(this.f371732o), java.lang.Integer.valueOf(co5Var.f371732o)) && n51.f.a(java.lang.Integer.valueOf(this.f371733p), java.lang.Integer.valueOf(co5Var.f371733p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371724d);
            java.lang.String str = this.f371725e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f371726f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f371727g);
            fVar.e(5, this.f371728h);
            fVar.e(6, this.f371729i);
            r45.c27 c27Var = this.f371730m;
            if (c27Var != null) {
                fVar.i(7, c27Var.computeSize());
                this.f371730m.writeFields(fVar);
            }
            r45.c27 c27Var2 = this.f371731n;
            if (c27Var2 != null) {
                fVar.i(8, c27Var2.computeSize());
                this.f371731n.writeFields(fVar);
            }
            fVar.e(9, this.f371732o);
            fVar.e(10, this.f371733p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371724d) + 0;
            java.lang.String str3 = this.f371725e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f371726f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f371727g) + b36.f.e(5, this.f371728h) + b36.f.e(6, this.f371729i);
            r45.c27 c27Var3 = this.f371730m;
            if (c27Var3 != null) {
                e18 += b36.f.i(7, c27Var3.computeSize());
            }
            r45.c27 c27Var4 = this.f371731n;
            if (c27Var4 != null) {
                e18 += b36.f.i(8, c27Var4.computeSize());
            }
            return e18 + b36.f.e(9, this.f371732o) + b36.f.e(10, this.f371733p);
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
        r45.co5 co5Var = (r45.co5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                co5Var.f371724d = aVar2.g(intValue);
                return 0;
            case 2:
                co5Var.f371725e = aVar2.k(intValue);
                return 0;
            case 3:
                co5Var.f371726f = aVar2.k(intValue);
                return 0;
            case 4:
                co5Var.f371727g = aVar2.g(intValue);
                return 0;
            case 5:
                co5Var.f371728h = aVar2.g(intValue);
                return 0;
            case 6:
                co5Var.f371729i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.c27 c27Var5 = new r45.c27();
                    if (bArr != null && bArr.length > 0) {
                        c27Var5.parseFrom(bArr);
                    }
                    co5Var.f371730m = c27Var5;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.c27 c27Var6 = new r45.c27();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27Var6.parseFrom(bArr2);
                    }
                    co5Var.f371731n = c27Var6;
                }
                return 0;
            case 9:
                co5Var.f371732o = aVar2.g(intValue);
                return 0;
            case 10:
                co5Var.f371733p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
