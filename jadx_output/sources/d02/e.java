package d02;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225304d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225306f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225307g;

    /* renamed from: i, reason: collision with root package name */
    public d02.n f225309i;

    /* renamed from: m, reason: collision with root package name */
    public d02.f f225310m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f225305e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f225308h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.e)) {
            return false;
        }
        d02.e eVar = (d02.e) fVar;
        return n51.f.a(this.f225304d, eVar.f225304d) && n51.f.a(this.f225305e, eVar.f225305e) && n51.f.a(this.f225306f, eVar.f225306f) && n51.f.a(this.f225307g, eVar.f225307g) && n51.f.a(this.f225308h, eVar.f225308h) && n51.f.a(this.f225309i, eVar.f225309i) && n51.f.a(this.f225310m, eVar.f225310m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f225308h;
        java.util.LinkedList linkedList2 = this.f225305e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f225304d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            java.lang.String str2 = this.f225306f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f225307g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 1, linkedList);
            d02.n nVar = this.f225309i;
            if (nVar != null) {
                fVar.i(6, nVar.computeSize());
                this.f225309i.writeFields(fVar);
            }
            d02.f fVar2 = this.f225310m;
            if (fVar2 != null) {
                fVar.i(7, fVar2.computeSize());
                this.f225310m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f225304d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 1, linkedList2);
            java.lang.String str5 = this.f225306f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f225307g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            int g17 = j17 + b36.f.g(5, 1, linkedList);
            d02.n nVar2 = this.f225309i;
            if (nVar2 != null) {
                g17 += b36.f.i(6, nVar2.computeSize());
            }
            d02.f fVar3 = this.f225310m;
            return fVar3 != null ? g17 + b36.f.i(7, fVar3.computeSize()) : g17;
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
        d02.e eVar = (d02.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eVar.f225304d = aVar2.k(intValue);
                return 0;
            case 2:
                eVar.f225305e.add(aVar2.k(intValue));
                return 0;
            case 3:
                eVar.f225306f = aVar2.k(intValue);
                return 0;
            case 4:
                eVar.f225307g = aVar2.k(intValue);
                return 0;
            case 5:
                eVar.f225308h.add(aVar2.k(intValue));
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    d02.n nVar3 = new d02.n();
                    if (bArr2 != null && bArr2.length > 0) {
                        nVar3.parseFrom(bArr2);
                    }
                    eVar.f225309i = nVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    d02.f fVar4 = new d02.f();
                    if (bArr3 != null && bArr3.length > 0) {
                        fVar4.parseFrom(bArr3);
                    }
                    eVar.f225310m = fVar4;
                }
                return 0;
            default:
                return -1;
        }
    }
}
