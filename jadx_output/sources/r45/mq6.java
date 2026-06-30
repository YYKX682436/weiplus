package r45;

/* loaded from: classes11.dex */
public class mq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380750d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380751e;

    /* renamed from: f, reason: collision with root package name */
    public int f380752f;

    /* renamed from: g, reason: collision with root package name */
    public int f380753g;

    /* renamed from: h, reason: collision with root package name */
    public int f380754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380755i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380756m;

    /* renamed from: n, reason: collision with root package name */
    public int f380757n;

    /* renamed from: o, reason: collision with root package name */
    public int f380758o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f380759p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f380760q;

    /* renamed from: r, reason: collision with root package name */
    public r45.oq6 f380761r;

    /* renamed from: s, reason: collision with root package name */
    public int f380762s;

    /* renamed from: t, reason: collision with root package name */
    public r45.qk0 f380763t;

    /* renamed from: u, reason: collision with root package name */
    public r45.qk0 f380764u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mq6)) {
            return false;
        }
        r45.mq6 mq6Var = (r45.mq6) fVar;
        return n51.f.a(this.f380750d, mq6Var.f380750d) && n51.f.a(this.f380751e, mq6Var.f380751e) && n51.f.a(java.lang.Integer.valueOf(this.f380752f), java.lang.Integer.valueOf(mq6Var.f380752f)) && n51.f.a(java.lang.Integer.valueOf(this.f380753g), java.lang.Integer.valueOf(mq6Var.f380753g)) && n51.f.a(java.lang.Integer.valueOf(this.f380754h), java.lang.Integer.valueOf(mq6Var.f380754h)) && n51.f.a(this.f380755i, mq6Var.f380755i) && n51.f.a(this.f380756m, mq6Var.f380756m) && n51.f.a(java.lang.Integer.valueOf(this.f380757n), java.lang.Integer.valueOf(mq6Var.f380757n)) && n51.f.a(java.lang.Integer.valueOf(this.f380758o), java.lang.Integer.valueOf(mq6Var.f380758o)) && n51.f.a(this.f380759p, mq6Var.f380759p) && n51.f.a(this.f380760q, mq6Var.f380760q) && n51.f.a(this.f380761r, mq6Var.f380761r) && n51.f.a(java.lang.Integer.valueOf(this.f380762s), java.lang.Integer.valueOf(mq6Var.f380762s)) && n51.f.a(this.f380763t, mq6Var.f380763t) && n51.f.a(this.f380764u, mq6Var.f380764u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380750d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380751e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380752f);
            fVar.e(4, this.f380753g);
            fVar.e(5, this.f380754h);
            java.lang.String str3 = this.f380755i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f380756m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f380757n);
            fVar.e(9, this.f380758o);
            java.lang.String str5 = this.f380759p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f380760q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.oq6 oq6Var = this.f380761r;
            if (oq6Var != null) {
                fVar.i(12, oq6Var.computeSize());
                this.f380761r.writeFields(fVar);
            }
            fVar.e(13, this.f380762s);
            r45.qk0 qk0Var = this.f380763t;
            if (qk0Var != null) {
                fVar.i(14, qk0Var.computeSize());
                this.f380763t.writeFields(fVar);
            }
            r45.qk0 qk0Var2 = this.f380764u;
            if (qk0Var2 != null) {
                fVar.i(15, qk0Var2.computeSize());
                this.f380764u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f380750d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f380751e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f380752f) + b36.f.e(4, this.f380753g) + b36.f.e(5, this.f380754h);
            java.lang.String str9 = this.f380755i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f380756m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f380757n) + b36.f.e(9, this.f380758o);
            java.lang.String str11 = this.f380759p;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f380760q;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            r45.oq6 oq6Var2 = this.f380761r;
            if (oq6Var2 != null) {
                e18 += b36.f.i(12, oq6Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(13, this.f380762s);
            r45.qk0 qk0Var3 = this.f380763t;
            if (qk0Var3 != null) {
                e19 += b36.f.i(14, qk0Var3.computeSize());
            }
            r45.qk0 qk0Var4 = this.f380764u;
            return qk0Var4 != null ? e19 + b36.f.i(15, qk0Var4.computeSize()) : e19;
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
        r45.mq6 mq6Var = (r45.mq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mq6Var.f380750d = aVar2.k(intValue);
                return 0;
            case 2:
                mq6Var.f380751e = aVar2.k(intValue);
                return 0;
            case 3:
                mq6Var.f380752f = aVar2.g(intValue);
                return 0;
            case 4:
                mq6Var.f380753g = aVar2.g(intValue);
                return 0;
            case 5:
                mq6Var.f380754h = aVar2.g(intValue);
                return 0;
            case 6:
                mq6Var.f380755i = aVar2.k(intValue);
                return 0;
            case 7:
                mq6Var.f380756m = aVar2.k(intValue);
                return 0;
            case 8:
                mq6Var.f380757n = aVar2.g(intValue);
                return 0;
            case 9:
                mq6Var.f380758o = aVar2.g(intValue);
                return 0;
            case 10:
                mq6Var.f380759p = aVar2.k(intValue);
                return 0;
            case 11:
                mq6Var.f380760q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.oq6 oq6Var3 = new r45.oq6();
                    if (bArr != null && bArr.length > 0) {
                        oq6Var3.parseFrom(bArr);
                    }
                    mq6Var.f380761r = oq6Var3;
                }
                return 0;
            case 13:
                mq6Var.f380762s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.qk0 qk0Var5 = new r45.qk0();
                    if (bArr2 != null && bArr2.length > 0) {
                        qk0Var5.parseFrom(bArr2);
                    }
                    mq6Var.f380763t = qk0Var5;
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.qk0 qk0Var6 = new r45.qk0();
                    if (bArr3 != null && bArr3.length > 0) {
                        qk0Var6.parseFrom(bArr3);
                    }
                    mq6Var.f380764u = qk0Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
