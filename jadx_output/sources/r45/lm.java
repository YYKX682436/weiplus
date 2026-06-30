package r45;

/* loaded from: classes8.dex */
public class lm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379586d;

    /* renamed from: e, reason: collision with root package name */
    public int f379587e;

    /* renamed from: f, reason: collision with root package name */
    public int f379588f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f379589g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f379590h;

    /* renamed from: i, reason: collision with root package name */
    public int f379591i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm)) {
            return false;
        }
        r45.lm lmVar = (r45.lm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379586d), java.lang.Integer.valueOf(lmVar.f379586d)) && n51.f.a(java.lang.Integer.valueOf(this.f379587e), java.lang.Integer.valueOf(lmVar.f379587e)) && n51.f.a(java.lang.Integer.valueOf(this.f379588f), java.lang.Integer.valueOf(lmVar.f379588f)) && n51.f.a(this.f379589g, lmVar.f379589g) && n51.f.a(java.lang.Integer.valueOf(this.f379590h), java.lang.Integer.valueOf(lmVar.f379590h)) && n51.f.a(java.lang.Integer.valueOf(this.f379591i), java.lang.Integer.valueOf(lmVar.f379591i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379589g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379586d);
            fVar.e(2, this.f379587e);
            fVar.e(3, this.f379588f);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f379590h);
            fVar.e(6, this.f379591i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f379586d) + 0 + b36.f.e(2, this.f379587e) + b36.f.e(3, this.f379588f) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f379590h) + b36.f.e(6, this.f379591i);
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
        r45.lm lmVar = (r45.lm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lmVar.f379586d = aVar2.g(intValue);
                return 0;
            case 2:
                lmVar.f379587e = aVar2.g(intValue);
                return 0;
            case 3:
                lmVar.f379588f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mm mmVar = new r45.mm();
                    if (bArr2 != null && bArr2.length > 0) {
                        mmVar.parseFrom(bArr2);
                    }
                    lmVar.f379589g.add(mmVar);
                }
                return 0;
            case 5:
                lmVar.f379590h = aVar2.g(intValue);
                return 0;
            case 6:
                lmVar.f379591i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
