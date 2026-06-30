package r45;

/* loaded from: classes8.dex */
public class u extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386894d;

    /* renamed from: e, reason: collision with root package name */
    public long f386895e;

    /* renamed from: f, reason: collision with root package name */
    public int f386896f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386897g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386898h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386899i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u)) {
            return false;
        }
        r45.u uVar = (r45.u) fVar;
        return n51.f.a(this.BaseRequest, uVar.BaseRequest) && n51.f.a(this.f386894d, uVar.f386894d) && n51.f.a(java.lang.Long.valueOf(this.f386895e), java.lang.Long.valueOf(uVar.f386895e)) && n51.f.a(java.lang.Integer.valueOf(this.f386896f), java.lang.Integer.valueOf(uVar.f386896f)) && n51.f.a(this.f386897g, uVar.f386897g) && n51.f.a(this.f386898h, uVar.f386898h) && n51.f.a(this.f386899i, uVar.f386899i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f386894d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f386895e);
            fVar.e(4, this.f386896f);
            java.lang.String str2 = this.f386897g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f386898h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f386899i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f386894d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f386895e) + b36.f.e(4, this.f386896f);
            java.lang.String str6 = this.f386897g;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f386898h;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f386899i;
            return str8 != null ? h17 + b36.f.j(7, str8) : h17;
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
        r45.u uVar = (r45.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    uVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                uVar.f386894d = aVar2.k(intValue);
                return 0;
            case 3:
                uVar.f386895e = aVar2.i(intValue);
                return 0;
            case 4:
                uVar.f386896f = aVar2.g(intValue);
                return 0;
            case 5:
                uVar.f386897g = aVar2.k(intValue);
                return 0;
            case 6:
                uVar.f386898h = aVar2.k(intValue);
                return 0;
            case 7:
                uVar.f386899i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
