package p33;

/* loaded from: classes4.dex */
public class q extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f351631d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351632e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351633f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f351634g;

    /* renamed from: h, reason: collision with root package name */
    public long f351635h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f351636i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f351637m;

    /* renamed from: n, reason: collision with root package name */
    public int f351638n;

    /* renamed from: o, reason: collision with root package name */
    public int f351639o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.q)) {
            return false;
        }
        p33.q qVar = (p33.q) fVar;
        return n51.f.a(this.BaseResponse, qVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f351631d), java.lang.Integer.valueOf(qVar.f351631d)) && n51.f.a(this.f351632e, qVar.f351632e) && n51.f.a(this.f351633f, qVar.f351633f) && n51.f.a(java.lang.Boolean.valueOf(this.f351634g), java.lang.Boolean.valueOf(qVar.f351634g)) && n51.f.a(java.lang.Long.valueOf(this.f351635h), java.lang.Long.valueOf(qVar.f351635h)) && n51.f.a(this.f351636i, qVar.f351636i) && n51.f.a(this.f351637m, qVar.f351637m) && n51.f.a(java.lang.Integer.valueOf(this.f351638n), java.lang.Integer.valueOf(qVar.f351638n)) && n51.f.a(java.lang.Integer.valueOf(this.f351639o), java.lang.Integer.valueOf(qVar.f351639o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f351636i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f351631d);
            java.lang.String str = this.f351632e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f351633f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f351634g);
            fVar.h(6, this.f351635h);
            fVar.g(7, 8, linkedList);
            java.lang.String str3 = this.f351637m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f351638n);
            fVar.e(10, this.f351639o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f351631d);
            java.lang.String str4 = this.f351632e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f351633f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int a17 = i18 + b36.f.a(5, this.f351634g) + b36.f.h(6, this.f351635h) + b36.f.g(7, 8, linkedList);
            java.lang.String str6 = this.f351637m;
            if (str6 != null) {
                a17 += b36.f.j(8, str6);
            }
            return a17 + b36.f.e(9, this.f351638n) + b36.f.e(10, this.f351639o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        p33.q qVar = (p33.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    qVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                qVar.f351631d = aVar2.g(intValue);
                return 0;
            case 3:
                qVar.f351632e = aVar2.k(intValue);
                return 0;
            case 4:
                qVar.f351633f = aVar2.k(intValue);
                return 0;
            case 5:
                qVar.f351634g = aVar2.c(intValue);
                return 0;
            case 6:
                qVar.f351635h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    p33.e0 e0Var = new p33.e0();
                    if (bArr3 != null && bArr3.length > 0) {
                        e0Var.parseFrom(bArr3);
                    }
                    qVar.f351636i.add(e0Var);
                }
                return 0;
            case 8:
                qVar.f351637m = aVar2.k(intValue);
                return 0;
            case 9:
                qVar.f351638n = aVar2.g(intValue);
                return 0;
            case 10:
                qVar.f351639o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
