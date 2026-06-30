package d02;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225272d;

    /* renamed from: e, reason: collision with root package name */
    public d02.r f225273e;

    /* renamed from: f, reason: collision with root package name */
    public d02.r f225274f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225275g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.b)) {
            return false;
        }
        d02.b bVar = (d02.b) fVar;
        return n51.f.a(this.f225272d, bVar.f225272d) && n51.f.a(this.f225273e, bVar.f225273e) && n51.f.a(this.f225274f, bVar.f225274f) && n51.f.a(this.f225275g, bVar.f225275g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f225272d;
            if (str != null) {
                fVar.j(1, str);
            }
            d02.r rVar = this.f225273e;
            if (rVar != null) {
                fVar.i(2, rVar.computeSize());
                this.f225273e.writeFields(fVar);
            }
            d02.r rVar2 = this.f225274f;
            if (rVar2 != null) {
                fVar.i(3, rVar2.computeSize());
                this.f225274f.writeFields(fVar);
            }
            java.lang.String str2 = this.f225275g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f225272d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            d02.r rVar3 = this.f225273e;
            if (rVar3 != null) {
                j17 += b36.f.i(2, rVar3.computeSize());
            }
            d02.r rVar4 = this.f225274f;
            if (rVar4 != null) {
                j17 += b36.f.i(3, rVar4.computeSize());
            }
            java.lang.String str4 = this.f225275g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        d02.b bVar = (d02.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f225272d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                d02.r rVar5 = new d02.r();
                if (bArr != null && bArr.length > 0) {
                    rVar5.parseFrom(bArr);
                }
                bVar.f225273e = rVar5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            bVar.f225275g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            d02.r rVar6 = new d02.r();
            if (bArr2 != null && bArr2.length > 0) {
                rVar6.parseFrom(bArr2);
            }
            bVar.f225274f = rVar6;
        }
        return 0;
    }
}
