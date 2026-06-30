package r45;

/* loaded from: classes9.dex */
public class xe extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390001d;

    /* renamed from: e, reason: collision with root package name */
    public int f390002e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f390003f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f390004g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390005h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390006i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f390007m;

    /* renamed from: n, reason: collision with root package name */
    public int f390008n;

    static {
        new r45.xe();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xe)) {
            return false;
        }
        r45.xe xeVar = (r45.xe) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390001d), java.lang.Integer.valueOf(xeVar.f390001d)) && n51.f.a(java.lang.Integer.valueOf(this.f390002e), java.lang.Integer.valueOf(xeVar.f390002e)) && n51.f.a(this.f390003f, xeVar.f390003f) && n51.f.a(java.lang.Integer.valueOf(this.f390004g), java.lang.Integer.valueOf(xeVar.f390004g)) && n51.f.a(this.f390005h, xeVar.f390005h) && n51.f.a(this.f390006i, xeVar.f390006i) && n51.f.a(java.lang.Boolean.valueOf(this.f390007m), java.lang.Boolean.valueOf(xeVar.f390007m)) && n51.f.a(java.lang.Integer.valueOf(this.f390008n), java.lang.Integer.valueOf(xeVar.f390008n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.xe();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390001d);
            fVar.e(2, this.f390002e);
            fVar.g(3, 1, this.f390003f);
            fVar.e(4, this.f390004g);
            com.tencent.mm.protobuf.g gVar = this.f390005h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f390006i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            fVar.a(7, this.f390007m);
            fVar.e(8, this.f390008n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390001d) + 0 + b36.f.e(2, this.f390002e) + b36.f.g(3, 1, this.f390003f) + b36.f.e(4, this.f390004g);
            com.tencent.mm.protobuf.g gVar3 = this.f390005h;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f390006i;
            if (gVar4 != null) {
                e17 += b36.f.b(6, gVar4);
            }
            return e17 + b36.f.a(7, this.f390007m) + b36.f.e(8, this.f390008n);
        }
        if (i17 == 2) {
            this.f390003f.clear();
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
        switch (intValue) {
            case 1:
                this.f390001d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f390002e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f390003f.add(aVar2.k(intValue));
                return 0;
            case 4:
                this.f390004g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f390005h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f390006i = aVar2.d(intValue);
                return 0;
            case 7:
                this.f390007m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f390008n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.xe) super.parseFrom(bArr);
    }
}
