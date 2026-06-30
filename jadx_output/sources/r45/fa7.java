package r45;

/* loaded from: classes8.dex */
public class fa7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374152d;

    /* renamed from: e, reason: collision with root package name */
    public int f374153e;

    /* renamed from: f, reason: collision with root package name */
    public int f374154f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374155g;

    /* renamed from: h, reason: collision with root package name */
    public int f374156h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374157i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374158m;

    /* renamed from: n, reason: collision with root package name */
    public r45.n54 f374159n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374160o;

    /* renamed from: p, reason: collision with root package name */
    public int f374161p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa7)) {
            return false;
        }
        r45.fa7 fa7Var = (r45.fa7) fVar;
        return n51.f.a(this.BaseRequest, fa7Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374152d), java.lang.Integer.valueOf(fa7Var.f374152d)) && n51.f.a(java.lang.Integer.valueOf(this.f374153e), java.lang.Integer.valueOf(fa7Var.f374153e)) && n51.f.a(java.lang.Integer.valueOf(this.f374154f), java.lang.Integer.valueOf(fa7Var.f374154f)) && n51.f.a(this.f374155g, fa7Var.f374155g) && n51.f.a(java.lang.Integer.valueOf(this.f374156h), java.lang.Integer.valueOf(fa7Var.f374156h)) && n51.f.a(this.f374157i, fa7Var.f374157i) && n51.f.a(this.f374158m, fa7Var.f374158m) && n51.f.a(this.f374159n, fa7Var.f374159n) && n51.f.a(this.f374160o, fa7Var.f374160o) && n51.f.a(java.lang.Integer.valueOf(this.f374161p), java.lang.Integer.valueOf(fa7Var.f374161p));
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
            fVar.e(2, this.f374152d);
            fVar.e(3, this.f374153e);
            fVar.e(4, this.f374154f);
            java.lang.String str = this.f374155g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f374156h);
            java.lang.String str2 = this.f374157i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f374158m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.n54 n54Var = this.f374159n;
            if (n54Var != null) {
                fVar.i(9, n54Var.computeSize());
                this.f374159n.writeFields(fVar);
            }
            java.lang.String str4 = this.f374160o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f374161p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374152d) + b36.f.e(3, this.f374153e) + b36.f.e(4, this.f374154f);
            java.lang.String str5 = this.f374155g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int e17 = i18 + b36.f.e(6, this.f374156h);
            java.lang.String str6 = this.f374157i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f374158m;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            r45.n54 n54Var2 = this.f374159n;
            if (n54Var2 != null) {
                e17 += b36.f.i(9, n54Var2.computeSize());
            }
            java.lang.String str8 = this.f374160o;
            if (str8 != null) {
                e17 += b36.f.j(10, str8);
            }
            return e17 + b36.f.e(11, this.f374161p);
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
        r45.fa7 fa7Var = (r45.fa7) objArr[1];
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
                    fa7Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fa7Var.f374152d = aVar2.g(intValue);
                return 0;
            case 3:
                fa7Var.f374153e = aVar2.g(intValue);
                return 0;
            case 4:
                fa7Var.f374154f = aVar2.g(intValue);
                return 0;
            case 5:
                fa7Var.f374155g = aVar2.k(intValue);
                return 0;
            case 6:
                fa7Var.f374156h = aVar2.g(intValue);
                return 0;
            case 7:
                fa7Var.f374157i = aVar2.k(intValue);
                return 0;
            case 8:
                fa7Var.f374158m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.n54 n54Var3 = new r45.n54();
                    if (bArr2 != null && bArr2.length > 0) {
                        n54Var3.parseFrom(bArr2);
                    }
                    fa7Var.f374159n = n54Var3;
                }
                return 0;
            case 10:
                fa7Var.f374160o = aVar2.k(intValue);
                return 0;
            case 11:
                fa7Var.f374161p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
