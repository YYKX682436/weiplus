package r45;

/* loaded from: classes9.dex */
public class me5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380417d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380418e;

    /* renamed from: f, reason: collision with root package name */
    public int f380419f;

    /* renamed from: g, reason: collision with root package name */
    public long f380420g;

    /* renamed from: h, reason: collision with root package name */
    public int f380421h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380422i;

    /* renamed from: m, reason: collision with root package name */
    public int f380423m;

    /* renamed from: n, reason: collision with root package name */
    public int f380424n;

    /* renamed from: o, reason: collision with root package name */
    public int f380425o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me5)) {
            return false;
        }
        r45.me5 me5Var = (r45.me5) fVar;
        return n51.f.a(this.BaseRequest, me5Var.BaseRequest) && n51.f.a(this.f380417d, me5Var.f380417d) && n51.f.a(this.f380418e, me5Var.f380418e) && n51.f.a(java.lang.Integer.valueOf(this.f380419f), java.lang.Integer.valueOf(me5Var.f380419f)) && n51.f.a(java.lang.Long.valueOf(this.f380420g), java.lang.Long.valueOf(me5Var.f380420g)) && n51.f.a(java.lang.Integer.valueOf(this.f380421h), java.lang.Integer.valueOf(me5Var.f380421h)) && n51.f.a(this.f380422i, me5Var.f380422i) && n51.f.a(java.lang.Integer.valueOf(this.f380423m), java.lang.Integer.valueOf(me5Var.f380423m)) && n51.f.a(java.lang.Integer.valueOf(this.f380424n), java.lang.Integer.valueOf(me5Var.f380424n)) && n51.f.a(java.lang.Integer.valueOf(this.f380425o), java.lang.Integer.valueOf(me5Var.f380425o));
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
            java.lang.String str = this.f380417d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f380418e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f380419f);
            fVar.h(5, this.f380420g);
            fVar.e(6, this.f380421h);
            java.lang.String str3 = this.f380422i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f380423m);
            fVar.e(9, this.f380424n);
            fVar.e(10, this.f380425o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f380417d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f380418e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f380419f) + b36.f.h(5, this.f380420g) + b36.f.e(6, this.f380421h);
            java.lang.String str6 = this.f380422i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f380423m) + b36.f.e(9, this.f380424n) + b36.f.e(10, this.f380425o);
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
        r45.me5 me5Var = (r45.me5) objArr[1];
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
                    me5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                me5Var.f380417d = aVar2.k(intValue);
                return 0;
            case 3:
                me5Var.f380418e = aVar2.k(intValue);
                return 0;
            case 4:
                me5Var.f380419f = aVar2.g(intValue);
                return 0;
            case 5:
                me5Var.f380420g = aVar2.i(intValue);
                return 0;
            case 6:
                me5Var.f380421h = aVar2.g(intValue);
                return 0;
            case 7:
                me5Var.f380422i = aVar2.k(intValue);
                return 0;
            case 8:
                me5Var.f380423m = aVar2.g(intValue);
                return 0;
            case 9:
                me5Var.f380424n = aVar2.g(intValue);
                return 0;
            case 10:
                me5Var.f380425o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
