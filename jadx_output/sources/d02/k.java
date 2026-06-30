package d02;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.d f225328d;

    /* renamed from: e, reason: collision with root package name */
    public d02.e f225329e;

    /* renamed from: f, reason: collision with root package name */
    public d02.g f225330f;

    /* renamed from: g, reason: collision with root package name */
    public d02.l f225331g;

    /* renamed from: h, reason: collision with root package name */
    public d02.b f225332h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.k)) {
            return false;
        }
        d02.k kVar = (d02.k) fVar;
        return n51.f.a(this.f225328d, kVar.f225328d) && n51.f.a(this.f225329e, kVar.f225329e) && n51.f.a(this.f225330f, kVar.f225330f) && n51.f.a(this.f225331g, kVar.f225331g) && n51.f.a(this.f225332h, kVar.f225332h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.d dVar = this.f225328d;
            if (dVar != null) {
                fVar.i(1, dVar.computeSize());
                this.f225328d.writeFields(fVar);
            }
            d02.e eVar = this.f225329e;
            if (eVar != null) {
                fVar.i(2, eVar.computeSize());
                this.f225329e.writeFields(fVar);
            }
            d02.g gVar = this.f225330f;
            if (gVar != null) {
                fVar.i(3, gVar.computeSize());
                this.f225330f.writeFields(fVar);
            }
            d02.l lVar = this.f225331g;
            if (lVar != null) {
                fVar.i(4, lVar.computeSize());
                this.f225331g.writeFields(fVar);
            }
            d02.b bVar = this.f225332h;
            if (bVar != null) {
                fVar.i(5, bVar.computeSize());
                this.f225332h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            d02.d dVar2 = this.f225328d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.computeSize()) : 0;
            d02.e eVar2 = this.f225329e;
            if (eVar2 != null) {
                i18 += b36.f.i(2, eVar2.computeSize());
            }
            d02.g gVar2 = this.f225330f;
            if (gVar2 != null) {
                i18 += b36.f.i(3, gVar2.computeSize());
            }
            d02.l lVar2 = this.f225331g;
            if (lVar2 != null) {
                i18 += b36.f.i(4, lVar2.computeSize());
            }
            d02.b bVar2 = this.f225332h;
            return bVar2 != null ? i18 + b36.f.i(5, bVar2.computeSize()) : i18;
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
        d02.k kVar = (d02.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.d dVar3 = new d02.d();
                if (bArr != null && bArr.length > 0) {
                    dVar3.parseFrom(bArr);
                }
                kVar.f225328d = dVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                d02.e eVar3 = new d02.e();
                if (bArr2 != null && bArr2.length > 0) {
                    eVar3.parseFrom(bArr2);
                }
                kVar.f225329e = eVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                d02.g gVar3 = new d02.g();
                if (bArr3 != null && bArr3.length > 0) {
                    gVar3.parseFrom(bArr3);
                }
                kVar.f225330f = gVar3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                d02.l lVar3 = new d02.l();
                if (bArr4 != null && bArr4.length > 0) {
                    lVar3.parseFrom(bArr4);
                }
                kVar.f225331g = lVar3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            d02.b bVar3 = new d02.b();
            if (bArr5 != null && bArr5.length > 0) {
                bVar3.parseFrom(bArr5);
            }
            kVar.f225332h = bVar3;
        }
        return 0;
    }
}
