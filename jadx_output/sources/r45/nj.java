package r45;

/* loaded from: classes2.dex */
public class nj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f381433d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f381434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381435f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nj)) {
            return false;
        }
        r45.nj njVar = (r45.nj) fVar;
        return n51.f.a(this.f381433d, njVar.f381433d) && n51.f.a(java.lang.Integer.valueOf(this.f381434e), java.lang.Integer.valueOf(njVar.f381434e)) && n51.f.a(this.f381435f, njVar.f381435f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381433d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.e(2, this.f381434e);
            java.lang.String str = this.f381435f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.e(2, this.f381434e);
            java.lang.String str2 = this.f381435f;
            return str2 != null ? g17 + b36.f.j(3, str2) : g17;
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
        r45.nj njVar = (r45.nj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                njVar.f381434e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            njVar.f381435f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.mj mjVar = new r45.mj();
            if (bArr2 != null && bArr2.length > 0) {
                mjVar.parseFrom(bArr2);
            }
            njVar.f381433d.add(mjVar);
        }
        return 0;
    }
}
