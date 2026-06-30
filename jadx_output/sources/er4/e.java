package er4;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final er4.e f256072h = new er4.e();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f256073d;

    /* renamed from: f, reason: collision with root package name */
    public er4.f f256075f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f256074e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f256076g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.e)) {
            return false;
        }
        er4.e eVar = (er4.e) fVar;
        return n51.f.a(this.f256073d, eVar.f256073d) && n51.f.a(this.f256074e, eVar.f256074e) && n51.f.a(this.f256075f, eVar.f256075f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f256074e;
        boolean[] zArr = this.f256076g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f256073d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList);
            er4.f fVar2 = this.f256075f;
            if (fVar2 != null && zArr[3]) {
                fVar.e(3, fVar2.f256081d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f256073d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList);
            er4.f fVar3 = this.f256075f;
            return (fVar3 == null || !zArr[3]) ? g17 : g17 + b36.f.e(3, fVar3.f256081d);
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f256073d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g18 = aVar2.g(intValue);
        this.f256075f = g18 != 0 ? g18 != 1 ? g18 != 2 ? null : er4.f.BANNER_STATUS_WAIT : er4.f.BANNER_STATUS_ENTER : er4.f.BANNER_STATUS_EXIT;
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.e) super.parseFrom(bArr);
    }
}
