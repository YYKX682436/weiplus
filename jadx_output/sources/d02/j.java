package d02;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225322d;

    /* renamed from: e, reason: collision with root package name */
    public long f225323e;

    /* renamed from: f, reason: collision with root package name */
    public d02.m f225324f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225325g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f225326h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f225327i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.j)) {
            return false;
        }
        d02.j jVar = (d02.j) fVar;
        return n51.f.a(this.f225322d, jVar.f225322d) && n51.f.a(java.lang.Long.valueOf(this.f225323e), java.lang.Long.valueOf(jVar.f225323e)) && n51.f.a(this.f225324f, jVar.f225324f) && n51.f.a(this.f225325g, jVar.f225325g) && n51.f.a(this.f225326h, jVar.f225326h) && n51.f.a(this.f225327i, jVar.f225327i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f225322d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f225323e);
            d02.m mVar = this.f225324f;
            if (mVar != null) {
                fVar.i(3, mVar.computeSize());
                this.f225324f.writeFields(fVar);
            }
            java.lang.String str2 = this.f225325g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f225326h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f225327i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f225322d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.h(2, this.f225323e);
            d02.m mVar2 = this.f225324f;
            if (mVar2 != null) {
                j17 += b36.f.i(3, mVar2.computeSize());
            }
            java.lang.String str6 = this.f225325g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f225326h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f225327i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        d02.j jVar = (d02.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f225322d = aVar2.k(intValue);
                return 0;
            case 2:
                jVar.f225323e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    d02.m mVar3 = new d02.m();
                    if (bArr != null && bArr.length > 0) {
                        mVar3.parseFrom(bArr);
                    }
                    jVar.f225324f = mVar3;
                }
                return 0;
            case 4:
                jVar.f225325g = aVar2.k(intValue);
                return 0;
            case 5:
                jVar.f225326h = aVar2.k(intValue);
                return 0;
            case 6:
                jVar.f225327i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
