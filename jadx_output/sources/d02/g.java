package d02;

/* loaded from: classes2.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.c f225313d;

    /* renamed from: e, reason: collision with root package name */
    public d02.j f225314e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f225315f;

    /* renamed from: g, reason: collision with root package name */
    public int f225316g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225317h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.g)) {
            return false;
        }
        d02.g gVar = (d02.g) fVar;
        return n51.f.a(this.f225313d, gVar.f225313d) && n51.f.a(this.f225314e, gVar.f225314e) && n51.f.a(java.lang.Boolean.valueOf(this.f225315f), java.lang.Boolean.valueOf(gVar.f225315f)) && n51.f.a(java.lang.Integer.valueOf(this.f225316g), java.lang.Integer.valueOf(gVar.f225316g)) && n51.f.a(java.lang.Boolean.valueOf(this.f225317h), java.lang.Boolean.valueOf(gVar.f225317h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.c cVar = this.f225313d;
            if (cVar != null) {
                fVar.i(1, cVar.computeSize());
                this.f225313d.writeFields(fVar);
            }
            d02.j jVar = this.f225314e;
            if (jVar != null) {
                fVar.i(2, jVar.computeSize());
                this.f225314e.writeFields(fVar);
            }
            fVar.a(3, this.f225315f);
            fVar.e(4, this.f225316g);
            fVar.a(5, this.f225317h);
            return 0;
        }
        if (i17 == 1) {
            d02.c cVar2 = this.f225313d;
            int i18 = cVar2 != null ? 0 + b36.f.i(1, cVar2.computeSize()) : 0;
            d02.j jVar2 = this.f225314e;
            if (jVar2 != null) {
                i18 += b36.f.i(2, jVar2.computeSize());
            }
            return i18 + b36.f.a(3, this.f225315f) + b36.f.e(4, this.f225316g) + b36.f.a(5, this.f225317h);
        }
        if (i17 == 2) {
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
        d02.g gVar = (d02.g) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.c cVar3 = new d02.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.parseFrom(bArr);
                }
                gVar.f225313d = cVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                gVar.f225315f = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 4) {
                gVar.f225316g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            gVar.f225317h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            d02.j jVar3 = new d02.j();
            if (bArr2 != null && bArr2.length > 0) {
                jVar3.parseFrom(bArr2);
            }
            gVar.f225314e = jVar3;
        }
        return 0;
    }
}
