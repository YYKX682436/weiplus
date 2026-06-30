package in;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public in.c f292718d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f292719e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f292720f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof in.b)) {
            return false;
        }
        in.b bVar = (in.b) fVar;
        return n51.f.a(this.f292718d, bVar.f292718d) && n51.f.a(this.f292719e, bVar.f292719e) && n51.f.a(this.f292720f, bVar.f292720f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f292720f;
        java.util.LinkedList linkedList2 = this.f292719e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            in.c cVar = this.f292718d;
            if (cVar != null) {
                fVar.i(1, cVar.computeSize());
                this.f292718d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            in.c cVar2 = this.f292718d;
            return (cVar2 != null ? 0 + b36.f.i(1, cVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        in.b bVar = (in.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                in.c cVar3 = new in.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar3.parseFrom(bArr2);
                }
                bVar.f292718d = cVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                in.c cVar4 = new in.c();
                if (bArr3 != null && bArr3.length > 0) {
                    cVar4.parseFrom(bArr3);
                }
                bVar.f292719e.add(cVar4);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            in.a aVar3 = new in.a();
            if (bArr4 != null && bArr4.length > 0) {
                aVar3.parseFrom(bArr4);
            }
            bVar.f292720f.add(aVar3);
        }
        return 0;
    }
}
