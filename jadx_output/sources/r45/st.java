package r45;

/* loaded from: classes9.dex */
public class st extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385967d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385968e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385969f;

    /* renamed from: g, reason: collision with root package name */
    public int f385970g;

    /* renamed from: h, reason: collision with root package name */
    public r45.iu f385971h;

    /* renamed from: i, reason: collision with root package name */
    public int f385972i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.st)) {
            return false;
        }
        r45.st stVar = (r45.st) fVar;
        return n51.f.a(this.f385967d, stVar.f385967d) && n51.f.a(this.f385968e, stVar.f385968e) && n51.f.a(this.f385969f, stVar.f385969f) && n51.f.a(java.lang.Integer.valueOf(this.f385970g), java.lang.Integer.valueOf(stVar.f385970g)) && n51.f.a(this.f385971h, stVar.f385971h) && n51.f.a(java.lang.Integer.valueOf(this.f385972i), java.lang.Integer.valueOf(stVar.f385972i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385967d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385968e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385969f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f385970g);
            r45.iu iuVar = this.f385971h;
            if (iuVar != null) {
                fVar.i(5, iuVar.computeSize());
                this.f385971h.writeFields(fVar);
            }
            fVar.e(6, this.f385972i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f385967d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f385968e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f385969f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f385970g);
            r45.iu iuVar2 = this.f385971h;
            if (iuVar2 != null) {
                e17 += b36.f.i(5, iuVar2.computeSize());
            }
            return e17 + b36.f.e(6, this.f385972i);
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
        r45.st stVar = (r45.st) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                stVar.f385967d = aVar2.k(intValue);
                return 0;
            case 2:
                stVar.f385968e = aVar2.k(intValue);
                return 0;
            case 3:
                stVar.f385969f = aVar2.k(intValue);
                return 0;
            case 4:
                stVar.f385970g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    stVar.f385971h = iuVar3;
                }
                return 0;
            case 6:
                stVar.f385972i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
