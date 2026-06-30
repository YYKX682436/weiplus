package q45;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f360124d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f360125e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360126f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f360127g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f360128h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof q45.b)) {
            return false;
        }
        q45.b bVar = (q45.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f360124d), java.lang.Integer.valueOf(bVar.f360124d)) && n51.f.a(this.f360125e, bVar.f360125e) && n51.f.a(this.f360126f, bVar.f360126f) && n51.f.a(this.f360127g, bVar.f360127g) && n51.f.a(java.lang.Integer.valueOf(this.f360128h), java.lang.Integer.valueOf(bVar.f360128h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f360124d);
            java.lang.String str = this.f360125e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f360126f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f360127g);
            fVar.e(5, this.f360128h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f360124d) + 0;
            java.lang.String str3 = this.f360125e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f360126f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.g(4, 8, this.f360127g) + b36.f.e(5, this.f360128h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f360127g.clear();
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
        q45.b bVar = (q45.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f360124d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bVar.f360125e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bVar.f360126f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            bVar.f360128h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            q45.a aVar3 = new q45.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.parseFrom(bArr2);
            }
            bVar.f360127g.add(aVar3);
        }
        return 0;
    }
}
