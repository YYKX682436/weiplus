package d02;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225296d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225297e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225298f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225299g;

    /* renamed from: h, reason: collision with root package name */
    public int f225300h;

    /* renamed from: i, reason: collision with root package name */
    public int f225301i;

    /* renamed from: m, reason: collision with root package name */
    public d02.h f225302m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f225303n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.d)) {
            return false;
        }
        d02.d dVar = (d02.d) fVar;
        return n51.f.a(this.f225296d, dVar.f225296d) && n51.f.a(this.f225297e, dVar.f225297e) && n51.f.a(this.f225298f, dVar.f225298f) && n51.f.a(this.f225299g, dVar.f225299g) && n51.f.a(java.lang.Integer.valueOf(this.f225300h), java.lang.Integer.valueOf(dVar.f225300h)) && n51.f.a(java.lang.Integer.valueOf(this.f225301i), java.lang.Integer.valueOf(dVar.f225301i)) && n51.f.a(this.f225302m, dVar.f225302m) && n51.f.a(this.f225303n, dVar.f225303n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f225296d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f225297e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f225298f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f225299g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f225300h);
            fVar.e(6, this.f225301i);
            d02.h hVar = this.f225302m;
            if (hVar != null) {
                fVar.i(7, hVar.computeSize());
                this.f225302m.writeFields(fVar);
            }
            java.lang.String str5 = this.f225303n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f225296d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f225297e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f225298f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f225299g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f225300h) + b36.f.e(6, this.f225301i);
            d02.h hVar2 = this.f225302m;
            if (hVar2 != null) {
                e17 += b36.f.i(7, hVar2.computeSize());
            }
            java.lang.String str10 = this.f225303n;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        d02.d dVar = (d02.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dVar.f225296d = aVar2.k(intValue);
                return 0;
            case 2:
                dVar.f225297e = aVar2.k(intValue);
                return 0;
            case 3:
                dVar.f225298f = aVar2.k(intValue);
                return 0;
            case 4:
                dVar.f225299g = aVar2.k(intValue);
                return 0;
            case 5:
                dVar.f225300h = aVar2.g(intValue);
                return 0;
            case 6:
                dVar.f225301i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    d02.h hVar3 = new d02.h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    dVar.f225302m = hVar3;
                }
                return 0;
            case 8:
                dVar.f225303n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
