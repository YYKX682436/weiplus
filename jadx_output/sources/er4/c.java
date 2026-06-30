package er4;

/* loaded from: classes14.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final er4.c f256059i = new er4.c();

    /* renamed from: d, reason: collision with root package name */
    public er4.d f256060d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f256061e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f256062f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f256063g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f256064h = new boolean[5];

    public er4.d b() {
        return this.f256064h[1] ? this.f256060d : er4.d.SPEAKER;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.c)) {
            return false;
        }
        er4.c cVar = (er4.c) fVar;
        return n51.f.a(this.f256060d, cVar.f256060d) && n51.f.a(this.f256061e, cVar.f256061e) && n51.f.a(java.lang.Boolean.valueOf(this.f256062f), java.lang.Boolean.valueOf(cVar.f256062f)) && n51.f.a(this.f256063g, cVar.f256063g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f256064h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            er4.d dVar = this.f256060d;
            if (dVar != null && zArr[1]) {
                fVar.e(1, dVar.f256071d);
            }
            java.lang.String str = this.f256061e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f256062f);
            }
            java.lang.String str2 = this.f256063g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            er4.d dVar2 = this.f256060d;
            if (dVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, dVar2.f256071d);
            }
            java.lang.String str3 = this.f256061e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f256062f);
            }
            java.lang.String str4 = this.f256063g;
            return (str4 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str4);
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
            this.f256060d = er4.d.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f256061e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f256062f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f256063g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.c) super.parseFrom(bArr);
    }
}
