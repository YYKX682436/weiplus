package r45;

/* loaded from: classes2.dex */
public class eg2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f373429d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObjectDesc f373430e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373431f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373432g;

    /* renamed from: h, reason: collision with root package name */
    public long f373433h;

    /* renamed from: i, reason: collision with root package name */
    public float f373434i;

    /* renamed from: m, reason: collision with root package name */
    public float f373435m;

    /* renamed from: n, reason: collision with root package name */
    public float f373436n;

    /* renamed from: o, reason: collision with root package name */
    public float f373437o;

    /* renamed from: p, reason: collision with root package name */
    public int f373438p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f373439q;

    /* renamed from: r, reason: collision with root package name */
    public long f373440r;

    /* renamed from: s, reason: collision with root package name */
    public int f373441s;

    /* renamed from: t, reason: collision with root package name */
    public long f373442t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eg2)) {
            return false;
        }
        r45.eg2 eg2Var = (r45.eg2) fVar;
        return n51.f.a(this.BaseRequest, eg2Var.BaseRequest) && n51.f.a(this.f373429d, eg2Var.f373429d) && n51.f.a(this.f373430e, eg2Var.f373430e) && n51.f.a(this.f373431f, eg2Var.f373431f) && n51.f.a(this.f373432g, eg2Var.f373432g) && n51.f.a(java.lang.Long.valueOf(this.f373433h), java.lang.Long.valueOf(eg2Var.f373433h)) && n51.f.a(java.lang.Float.valueOf(this.f373434i), java.lang.Float.valueOf(eg2Var.f373434i)) && n51.f.a(java.lang.Float.valueOf(this.f373435m), java.lang.Float.valueOf(eg2Var.f373435m)) && n51.f.a(java.lang.Float.valueOf(this.f373436n), java.lang.Float.valueOf(eg2Var.f373436n)) && n51.f.a(java.lang.Float.valueOf(this.f373437o), java.lang.Float.valueOf(eg2Var.f373437o)) && n51.f.a(java.lang.Integer.valueOf(this.f373438p), java.lang.Integer.valueOf(eg2Var.f373438p)) && n51.f.a(this.f373439q, eg2Var.f373439q) && n51.f.a(java.lang.Long.valueOf(this.f373440r), java.lang.Long.valueOf(eg2Var.f373440r)) && n51.f.a(java.lang.Integer.valueOf(this.f373441s), java.lang.Integer.valueOf(eg2Var.f373441s)) && n51.f.a(java.lang.Long.valueOf(this.f373442t), java.lang.Long.valueOf(eg2Var.f373442t));
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
            r45.kv0 kv0Var = this.f373429d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f373429d.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = this.f373430e;
            if (finderObjectDesc != null) {
                fVar.i(3, finderObjectDesc.computeSize());
                this.f373430e.writeFields(fVar);
            }
            java.lang.String str = this.f373431f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f373432g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f373433h);
            fVar.d(7, this.f373434i);
            fVar.d(8, this.f373435m);
            fVar.d(9, this.f373436n);
            fVar.d(10, this.f373437o);
            fVar.e(11, this.f373438p);
            java.lang.String str3 = this.f373439q;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            fVar.h(13, this.f373440r);
            fVar.e(14, this.f373441s);
            fVar.h(15, this.f373442t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f373429d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc2 = this.f373430e;
            if (finderObjectDesc2 != null) {
                i18 += b36.f.i(3, finderObjectDesc2.computeSize());
            }
            java.lang.String str4 = this.f373431f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f373432g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f373433h) + b36.f.d(7, this.f373434i) + b36.f.d(8, this.f373435m) + b36.f.d(9, this.f373436n) + b36.f.d(10, this.f373437o) + b36.f.e(11, this.f373438p);
            java.lang.String str6 = this.f373439q;
            if (str6 != null) {
                h17 += b36.f.j(12, str6);
            }
            return h17 + b36.f.h(13, this.f373440r) + b36.f.e(14, this.f373441s) + b36.f.h(15, this.f373442t);
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
        r45.eg2 eg2Var = (r45.eg2) objArr[1];
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
                    eg2Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    eg2Var.f373429d = kv0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc3 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObjectDesc3.parseFrom(bArr3);
                    }
                    eg2Var.f373430e = finderObjectDesc3;
                }
                return 0;
            case 4:
                eg2Var.f373431f = aVar2.k(intValue);
                return 0;
            case 5:
                eg2Var.f373432g = aVar2.k(intValue);
                return 0;
            case 6:
                eg2Var.f373433h = aVar2.i(intValue);
                return 0;
            case 7:
                eg2Var.f373434i = aVar2.f(intValue);
                return 0;
            case 8:
                eg2Var.f373435m = aVar2.f(intValue);
                return 0;
            case 9:
                eg2Var.f373436n = aVar2.f(intValue);
                return 0;
            case 10:
                eg2Var.f373437o = aVar2.f(intValue);
                return 0;
            case 11:
                eg2Var.f373438p = aVar2.g(intValue);
                return 0;
            case 12:
                eg2Var.f373439q = aVar2.k(intValue);
                return 0;
            case 13:
                eg2Var.f373440r = aVar2.i(intValue);
                return 0;
            case 14:
                eg2Var.f373441s = aVar2.g(intValue);
                return 0;
            case 15:
                eg2Var.f373442t = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
