package r45;

/* loaded from: classes11.dex */
public class sl extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f385821e;

    /* renamed from: g, reason: collision with root package name */
    public int f385823g;

    /* renamed from: h, reason: collision with root package name */
    public int f385824h;

    /* renamed from: m, reason: collision with root package name */
    public int f385826m;

    /* renamed from: n, reason: collision with root package name */
    public int f385827n;

    /* renamed from: o, reason: collision with root package name */
    public int f385828o;

    /* renamed from: p, reason: collision with root package name */
    public int f385829p;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f385820d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385822f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f385825i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sl)) {
            return false;
        }
        r45.sl slVar = (r45.sl) fVar;
        return n51.f.a(this.f385820d, slVar.f385820d) && n51.f.a(java.lang.Integer.valueOf(this.f385821e), java.lang.Integer.valueOf(slVar.f385821e)) && n51.f.a(this.f385822f, slVar.f385822f) && n51.f.a(java.lang.Integer.valueOf(this.f385823g), java.lang.Integer.valueOf(slVar.f385823g)) && n51.f.a(java.lang.Integer.valueOf(this.f385824h), java.lang.Integer.valueOf(slVar.f385824h)) && n51.f.a(this.f385825i, slVar.f385825i) && n51.f.a(java.lang.Integer.valueOf(this.f385826m), java.lang.Integer.valueOf(slVar.f385826m)) && n51.f.a(java.lang.Integer.valueOf(this.f385827n), java.lang.Integer.valueOf(slVar.f385827n)) && n51.f.a(java.lang.Integer.valueOf(this.f385828o), java.lang.Integer.valueOf(slVar.f385828o)) && n51.f.a(java.lang.Integer.valueOf(this.f385829p), java.lang.Integer.valueOf(slVar.f385829p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385825i;
        java.util.LinkedList linkedList2 = this.f385822f;
        java.util.LinkedList linkedList3 = this.f385820d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.e(2, this.f385821e);
            fVar.g(3, 8, linkedList2);
            fVar.e(4, this.f385823g);
            fVar.e(5, this.f385824h);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f385826m);
            fVar.e(8, this.f385827n);
            fVar.e(9, this.f385828o);
            fVar.e(10, this.f385829p);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList3) + 0 + b36.f.e(2, this.f385821e) + b36.f.g(3, 8, linkedList2) + b36.f.e(4, this.f385823g) + b36.f.e(5, this.f385824h) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f385826m) + b36.f.e(8, this.f385827n) + b36.f.e(9, this.f385828o) + b36.f.e(10, this.f385829p);
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
        r45.sl slVar = (r45.sl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.kv kvVar = new r45.kv();
                    if (bArr2 != null && bArr2.length > 0) {
                        kvVar.parseFrom(bArr2);
                    }
                    slVar.f385820d.add(kvVar);
                }
                return 0;
            case 2:
                slVar.f385821e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.jv jvVar = new r45.jv();
                    if (bArr3 != null && bArr3.length > 0) {
                        jvVar.parseFrom(bArr3);
                    }
                    slVar.f385822f.add(jvVar);
                }
                return 0;
            case 4:
                slVar.f385823g = aVar2.g(intValue);
                return 0;
            case 5:
                slVar.f385824h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.sm smVar = new r45.sm();
                    if (bArr4 != null && bArr4.length > 0) {
                        smVar.parseFrom(bArr4);
                    }
                    slVar.f385825i.add(smVar);
                }
                return 0;
            case 7:
                slVar.f385826m = aVar2.g(intValue);
                return 0;
            case 8:
                slVar.f385827n = aVar2.g(intValue);
                return 0;
            case 9:
                slVar.f385828o = aVar2.g(intValue);
                return 0;
            case 10:
                slVar.f385829p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
