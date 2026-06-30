package r45;

/* loaded from: classes8.dex */
public class nw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381699d;

    /* renamed from: e, reason: collision with root package name */
    public int f381700e;

    /* renamed from: f, reason: collision with root package name */
    public int f381701f;

    /* renamed from: g, reason: collision with root package name */
    public long f381702g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381703h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f381704i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381705m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nw)) {
            return false;
        }
        r45.nw nwVar = (r45.nw) fVar;
        return n51.f.a(this.BaseResponse, nwVar.BaseResponse) && n51.f.a(this.f381699d, nwVar.f381699d) && n51.f.a(java.lang.Integer.valueOf(this.f381700e), java.lang.Integer.valueOf(nwVar.f381700e)) && n51.f.a(java.lang.Integer.valueOf(this.f381701f), java.lang.Integer.valueOf(nwVar.f381701f)) && n51.f.a(java.lang.Long.valueOf(this.f381702g), java.lang.Long.valueOf(nwVar.f381702g)) && n51.f.a(this.f381703h, nwVar.f381703h) && n51.f.a(java.lang.Boolean.valueOf(this.f381704i), java.lang.Boolean.valueOf(nwVar.f381704i)) && n51.f.a(this.f381705m, nwVar.f381705m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f381699d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f381700e);
            fVar.e(4, this.f381701f);
            fVar.h(5, this.f381702g);
            java.lang.String str2 = this.f381703h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f381704i);
            java.lang.String str3 = this.f381705m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f381699d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f381700e) + b36.f.e(4, this.f381701f) + b36.f.h(5, this.f381702g);
            java.lang.String str5 = this.f381703h;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int a17 = e17 + b36.f.a(7, this.f381704i);
            java.lang.String str6 = this.f381705m;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
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
        r45.nw nwVar = (r45.nw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    nwVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                nwVar.f381699d = aVar2.k(intValue);
                return 0;
            case 3:
                nwVar.f381700e = aVar2.g(intValue);
                return 0;
            case 4:
                nwVar.f381701f = aVar2.g(intValue);
                return 0;
            case 5:
                nwVar.f381702g = aVar2.i(intValue);
                return 0;
            case 6:
                nwVar.f381703h = aVar2.k(intValue);
                return 0;
            case 7:
                nwVar.f381704i = aVar2.c(intValue);
                return 0;
            case 8:
                nwVar.f381705m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
