package wn1;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447381d;

    /* renamed from: e, reason: collision with root package name */
    public long f447382e;

    /* renamed from: f, reason: collision with root package name */
    public int f447383f;

    /* renamed from: h, reason: collision with root package name */
    public long f447385h;

    /* renamed from: i, reason: collision with root package name */
    public int f447386i;

    /* renamed from: m, reason: collision with root package name */
    public long f447387m;

    /* renamed from: o, reason: collision with root package name */
    public int f447389o;

    /* renamed from: p, reason: collision with root package name */
    public long f447390p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f447384g = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f447388n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f447391q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.a)) {
            return false;
        }
        wn1.a aVar = (wn1.a) fVar;
        return n51.f.a(this.f447381d, aVar.f447381d) && n51.f.a(java.lang.Long.valueOf(this.f447382e), java.lang.Long.valueOf(aVar.f447382e)) && n51.f.a(java.lang.Integer.valueOf(this.f447383f), java.lang.Integer.valueOf(aVar.f447383f)) && n51.f.a(this.f447384g, aVar.f447384g) && n51.f.a(java.lang.Long.valueOf(this.f447385h), java.lang.Long.valueOf(aVar.f447385h)) && n51.f.a(java.lang.Integer.valueOf(this.f447386i), java.lang.Integer.valueOf(aVar.f447386i)) && n51.f.a(java.lang.Long.valueOf(this.f447387m), java.lang.Long.valueOf(aVar.f447387m)) && n51.f.a(this.f447388n, aVar.f447388n) && n51.f.a(java.lang.Integer.valueOf(this.f447389o), java.lang.Integer.valueOf(aVar.f447389o)) && n51.f.a(java.lang.Long.valueOf(this.f447390p), java.lang.Long.valueOf(aVar.f447390p)) && n51.f.a(this.f447391q, aVar.f447391q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f447391q;
        java.util.LinkedList linkedList2 = this.f447388n;
        java.util.LinkedList linkedList3 = this.f447384g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447381d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f447382e);
            fVar.e(3, this.f447383f);
            fVar.g(4, 8, linkedList3);
            fVar.h(5, this.f447385h);
            fVar.e(6, this.f447386i);
            fVar.h(7, this.f447387m);
            fVar.g(8, 8, linkedList2);
            fVar.e(9, this.f447389o);
            fVar.h(10, this.f447390p);
            fVar.g(11, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f447381d;
            return (str2 != null ? b36.f.j(1, str2) + 0 : 0) + b36.f.h(2, this.f447382e) + b36.f.e(3, this.f447383f) + b36.f.g(4, 8, linkedList3) + b36.f.h(5, this.f447385h) + b36.f.e(6, this.f447386i) + b36.f.h(7, this.f447387m) + b36.f.g(8, 8, linkedList2) + b36.f.e(9, this.f447389o) + b36.f.h(10, this.f447390p) + b36.f.g(11, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        wn1.a aVar3 = (wn1.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f447381d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f447382e = aVar2.i(intValue);
                return 0;
            case 3:
                aVar3.f447383f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wn1.c cVar = new wn1.c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar.parseFrom(bArr2);
                    }
                    aVar3.f447384g.add(cVar);
                }
                return 0;
            case 5:
                aVar3.f447385h = aVar2.i(intValue);
                return 0;
            case 6:
                aVar3.f447386i = aVar2.g(intValue);
                return 0;
            case 7:
                aVar3.f447387m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    wn1.b bVar = new wn1.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.parseFrom(bArr3);
                    }
                    aVar3.f447388n.add(bVar);
                }
                return 0;
            case 9:
                aVar3.f447389o = aVar2.g(intValue);
                return 0;
            case 10:
                aVar3.f447390p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    wn1.b bVar2 = new wn1.b();
                    if (bArr4 != null && bArr4.length > 0) {
                        bVar2.parseFrom(bArr4);
                    }
                    aVar3.f447391q.add(bVar2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
