package r45;

/* loaded from: classes8.dex */
public class wc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389057d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f389058e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f389059f;

    /* renamed from: g, reason: collision with root package name */
    public int f389060g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wc)) {
            return false;
        }
        r45.wc wcVar = (r45.wc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389057d), java.lang.Integer.valueOf(wcVar.f389057d)) && n51.f.a(this.f389058e, wcVar.f389058e) && n51.f.a(java.lang.Integer.valueOf(this.f389059f), java.lang.Integer.valueOf(wcVar.f389059f)) && n51.f.a(java.lang.Integer.valueOf(this.f389060g), java.lang.Integer.valueOf(wcVar.f389060g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389058e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389057d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f389059f);
            fVar.e(4, this.f389060g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f389057d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f389059f) + b36.f.e(4, this.f389060g);
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
        r45.wc wcVar = (r45.wc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wcVar.f389057d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                wcVar.f389059f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wcVar.f389060g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.vc vcVar = new r45.vc();
            if (bArr2 != null && bArr2.length > 0) {
                vcVar.parseFrom(bArr2);
            }
            wcVar.f389058e.add(vcVar);
        }
        return 0;
    }
}
