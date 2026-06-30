package r45;

/* loaded from: classes11.dex */
public class ir5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f377283d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377284e;

    /* renamed from: f, reason: collision with root package name */
    public int f377285f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377286g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f377287h;

    /* renamed from: i, reason: collision with root package name */
    public int f377288i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377289m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f377290n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f377291o;

    /* renamed from: p, reason: collision with root package name */
    public r45.hg0 f377292p;

    /* renamed from: q, reason: collision with root package name */
    public r45.xc f377293q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f377294r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f377295s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ir5)) {
            return false;
        }
        r45.ir5 ir5Var = (r45.ir5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f377283d), java.lang.Long.valueOf(ir5Var.f377283d)) && n51.f.a(this.f377284e, ir5Var.f377284e) && n51.f.a(java.lang.Integer.valueOf(this.f377285f), java.lang.Integer.valueOf(ir5Var.f377285f)) && n51.f.a(java.lang.Boolean.valueOf(this.f377286g), java.lang.Boolean.valueOf(ir5Var.f377286g)) && n51.f.a(java.lang.Boolean.valueOf(this.f377287h), java.lang.Boolean.valueOf(ir5Var.f377287h)) && n51.f.a(java.lang.Integer.valueOf(this.f377288i), java.lang.Integer.valueOf(ir5Var.f377288i)) && n51.f.a(this.f377289m, ir5Var.f377289m) && n51.f.a(java.lang.Boolean.valueOf(this.f377290n), java.lang.Boolean.valueOf(ir5Var.f377290n)) && n51.f.a(java.lang.Boolean.valueOf(this.f377291o), java.lang.Boolean.valueOf(ir5Var.f377291o)) && n51.f.a(this.f377292p, ir5Var.f377292p) && n51.f.a(this.f377293q, ir5Var.f377293q) && n51.f.a(java.lang.Boolean.valueOf(this.f377294r), java.lang.Boolean.valueOf(ir5Var.f377294r)) && n51.f.a(java.lang.Boolean.valueOf(this.f377295s), java.lang.Boolean.valueOf(ir5Var.f377295s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f377283d);
            com.tencent.mm.protobuf.g gVar = this.f377284e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f377285f);
            fVar.a(4, this.f377286g);
            fVar.a(5, this.f377287h);
            fVar.e(6, this.f377288i);
            com.tencent.mm.protobuf.g gVar2 = this.f377289m;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            fVar.a(8, this.f377290n);
            fVar.a(9, this.f377291o);
            r45.hg0 hg0Var = this.f377292p;
            if (hg0Var != null) {
                fVar.i(10, hg0Var.computeSize());
                this.f377292p.writeFields(fVar);
            }
            r45.xc xcVar = this.f377293q;
            if (xcVar != null) {
                fVar.i(11, xcVar.computeSize());
                this.f377293q.writeFields(fVar);
            }
            fVar.a(12, this.f377294r);
            fVar.a(13, this.f377295s);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f377283d) + 0;
            com.tencent.mm.protobuf.g gVar3 = this.f377284e;
            if (gVar3 != null) {
                h17 += b36.f.b(2, gVar3);
            }
            int e17 = h17 + b36.f.e(3, this.f377285f) + b36.f.a(4, this.f377286g) + b36.f.a(5, this.f377287h) + b36.f.e(6, this.f377288i);
            com.tencent.mm.protobuf.g gVar4 = this.f377289m;
            if (gVar4 != null) {
                e17 += b36.f.b(7, gVar4);
            }
            int a17 = e17 + b36.f.a(8, this.f377290n) + b36.f.a(9, this.f377291o);
            r45.hg0 hg0Var2 = this.f377292p;
            if (hg0Var2 != null) {
                a17 += b36.f.i(10, hg0Var2.computeSize());
            }
            r45.xc xcVar2 = this.f377293q;
            if (xcVar2 != null) {
                a17 += b36.f.i(11, xcVar2.computeSize());
            }
            return a17 + b36.f.a(12, this.f377294r) + b36.f.a(13, this.f377295s);
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
        r45.ir5 ir5Var = (r45.ir5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ir5Var.f377283d = aVar2.i(intValue);
                return 0;
            case 2:
                ir5Var.f377284e = aVar2.d(intValue);
                return 0;
            case 3:
                ir5Var.f377285f = aVar2.g(intValue);
                return 0;
            case 4:
                ir5Var.f377286g = aVar2.c(intValue);
                return 0;
            case 5:
                ir5Var.f377287h = aVar2.c(intValue);
                return 0;
            case 6:
                ir5Var.f377288i = aVar2.g(intValue);
                return 0;
            case 7:
                ir5Var.f377289m = aVar2.d(intValue);
                return 0;
            case 8:
                ir5Var.f377290n = aVar2.c(intValue);
                return 0;
            case 9:
                ir5Var.f377291o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.hg0 hg0Var3 = new r45.hg0();
                    if (bArr != null && bArr.length > 0) {
                        hg0Var3.parseFrom(bArr);
                    }
                    ir5Var.f377292p = hg0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.xc xcVar3 = new r45.xc();
                    if (bArr2 != null && bArr2.length > 0) {
                        xcVar3.parseFrom(bArr2);
                    }
                    ir5Var.f377293q = xcVar3;
                }
                return 0;
            case 12:
                ir5Var.f377294r = aVar2.c(intValue);
                return 0;
            case 13:
                ir5Var.f377295s = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
