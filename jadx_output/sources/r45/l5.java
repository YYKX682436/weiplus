package r45;

/* loaded from: classes8.dex */
public class l5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379138d;

    /* renamed from: e, reason: collision with root package name */
    public int f379139e;

    /* renamed from: f, reason: collision with root package name */
    public int f379140f;

    /* renamed from: g, reason: collision with root package name */
    public int f379141g;

    /* renamed from: h, reason: collision with root package name */
    public int f379142h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f379143i;

    static {
        new r45.l5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.l5 parseFrom(byte[] bArr) {
        return (r45.l5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l5)) {
            return false;
        }
        r45.l5 l5Var = (r45.l5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379138d), java.lang.Integer.valueOf(l5Var.f379138d)) && n51.f.a(java.lang.Integer.valueOf(this.f379139e), java.lang.Integer.valueOf(l5Var.f379139e)) && n51.f.a(java.lang.Integer.valueOf(this.f379140f), java.lang.Integer.valueOf(l5Var.f379140f)) && n51.f.a(java.lang.Integer.valueOf(this.f379141g), java.lang.Integer.valueOf(l5Var.f379141g)) && n51.f.a(java.lang.Integer.valueOf(this.f379142h), java.lang.Integer.valueOf(l5Var.f379142h)) && n51.f.a(java.lang.Boolean.valueOf(this.f379143i), java.lang.Boolean.valueOf(l5Var.f379143i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.l5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379138d);
            fVar.e(2, this.f379139e);
            fVar.e(3, this.f379140f);
            fVar.e(4, this.f379141g);
            fVar.e(5, this.f379142h);
            fVar.a(900, this.f379143i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379138d) + 0 + b36.f.e(2, this.f379139e) + b36.f.e(3, this.f379140f) + b36.f.e(4, this.f379141g) + b36.f.e(5, this.f379142h) + b36.f.a(900, this.f379143i);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f379138d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f379139e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f379140f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f379141g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            this.f379142h = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 900) {
            return -1;
        }
        this.f379143i = aVar2.c(intValue);
        return 0;
    }
}
