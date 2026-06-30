package r45;

/* loaded from: classes2.dex */
public class jm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377921d;

    /* renamed from: e, reason: collision with root package name */
    public int f377922e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377923f;

    /* renamed from: g, reason: collision with root package name */
    public int f377924g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f377925h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jm)) {
            return false;
        }
        r45.jm jmVar = (r45.jm) fVar;
        return n51.f.a(this.f377921d, jmVar.f377921d) && n51.f.a(java.lang.Integer.valueOf(this.f377922e), java.lang.Integer.valueOf(jmVar.f377922e)) && n51.f.a(this.f377923f, jmVar.f377923f) && n51.f.a(java.lang.Integer.valueOf(this.f377924g), java.lang.Integer.valueOf(jmVar.f377924g)) && n51.f.a(this.f377925h, jmVar.f377925h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377925h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377921d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377922e);
            java.lang.String str2 = this.f377923f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f377924g);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f377921d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f377922e);
            java.lang.String str4 = this.f377923f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f377924g) + b36.f.g(5, 8, linkedList);
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
        r45.jm jmVar = (r45.jm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jmVar.f377921d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jmVar.f377922e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            jmVar.f377923f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            jmVar.f377924g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.dj djVar = new r45.dj();
            if (bArr2 != null && bArr2.length > 0) {
                djVar.parseFrom(bArr2);
            }
            jmVar.f377925h.add(djVar);
        }
        return 0;
    }
}
