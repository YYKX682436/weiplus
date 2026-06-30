package r45;

/* loaded from: classes8.dex */
public class tp4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386648d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386649e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386650f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386651g;

    /* renamed from: h, reason: collision with root package name */
    public long f386652h;

    /* renamed from: i, reason: collision with root package name */
    public int f386653i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386654m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp4)) {
            return false;
        }
        r45.tp4 tp4Var = (r45.tp4) fVar;
        return n51.f.a(this.BaseRequest, tp4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386648d), java.lang.Integer.valueOf(tp4Var.f386648d)) && n51.f.a(this.f386649e, tp4Var.f386649e) && n51.f.a(this.f386650f, tp4Var.f386650f) && n51.f.a(this.f386651g, tp4Var.f386651g) && n51.f.a(java.lang.Long.valueOf(this.f386652h), java.lang.Long.valueOf(tp4Var.f386652h)) && n51.f.a(java.lang.Integer.valueOf(this.f386653i), java.lang.Integer.valueOf(tp4Var.f386653i)) && n51.f.a(this.f386654m, tp4Var.f386654m);
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
            fVar.e(2, this.f386648d);
            java.lang.String str = this.f386649e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386650f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f386651g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f386652h);
            fVar.e(7, this.f386653i);
            java.lang.String str4 = this.f386654m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386648d);
            java.lang.String str5 = this.f386649e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f386650f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f386651g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int h17 = i18 + b36.f.h(6, this.f386652h) + b36.f.e(7, this.f386653i);
            java.lang.String str8 = this.f386654m;
            return str8 != null ? h17 + b36.f.j(8, str8) : h17;
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
        r45.tp4 tp4Var = (r45.tp4) objArr[1];
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
                    tp4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                tp4Var.f386648d = aVar2.g(intValue);
                return 0;
            case 3:
                tp4Var.f386649e = aVar2.k(intValue);
                return 0;
            case 4:
                tp4Var.f386650f = aVar2.k(intValue);
                return 0;
            case 5:
                tp4Var.f386651g = aVar2.k(intValue);
                return 0;
            case 6:
                tp4Var.f386652h = aVar2.i(intValue);
                return 0;
            case 7:
                tp4Var.f386653i = aVar2.g(intValue);
                return 0;
            case 8:
                tp4Var.f386654m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
