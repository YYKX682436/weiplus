package r45;

/* loaded from: classes8.dex */
public class w extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388733d;

    /* renamed from: e, reason: collision with root package name */
    public long f388734e;

    /* renamed from: f, reason: collision with root package name */
    public int f388735f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388736g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388737h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388738i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w)) {
            return false;
        }
        r45.w wVar = (r45.w) fVar;
        return n51.f.a(this.BaseRequest, wVar.BaseRequest) && n51.f.a(this.f388733d, wVar.f388733d) && n51.f.a(java.lang.Long.valueOf(this.f388734e), java.lang.Long.valueOf(wVar.f388734e)) && n51.f.a(java.lang.Integer.valueOf(this.f388735f), java.lang.Integer.valueOf(wVar.f388735f)) && n51.f.a(this.f388736g, wVar.f388736g) && n51.f.a(this.f388737h, wVar.f388737h) && n51.f.a(this.f388738i, wVar.f388738i);
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
            java.lang.String str = this.f388733d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f388734e);
            fVar.e(4, this.f388735f);
            java.lang.String str2 = this.f388736g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f388737h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f388738i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f388733d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f388734e) + b36.f.e(4, this.f388735f);
            java.lang.String str6 = this.f388736g;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f388737h;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f388738i;
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
        r45.w wVar = (r45.w) objArr[1];
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
                    wVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                wVar.f388733d = aVar2.k(intValue);
                return 0;
            case 3:
                wVar.f388734e = aVar2.i(intValue);
                return 0;
            case 4:
                wVar.f388735f = aVar2.g(intValue);
                return 0;
            case 5:
                wVar.f388736g = aVar2.k(intValue);
                return 0;
            case 6:
                wVar.f388737h = aVar2.k(intValue);
                return 0;
            case 7:
                wVar.f388738i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
