package pj4;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354962d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.q f354963e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f354964f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f354965g;

    /* renamed from: h, reason: collision with root package name */
    public long f354966h;

    /* renamed from: i, reason: collision with root package name */
    public int f354967i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f354968m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f354969n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f354970o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.b)) {
            return false;
        }
        pj4.b bVar = (pj4.b) fVar;
        return n51.f.a(this.f354962d, bVar.f354962d) && n51.f.a(this.f354963e, bVar.f354963e) && n51.f.a(this.f354964f, bVar.f354964f) && n51.f.a(java.lang.Boolean.valueOf(this.f354965g), java.lang.Boolean.valueOf(bVar.f354965g)) && n51.f.a(java.lang.Long.valueOf(this.f354966h), java.lang.Long.valueOf(bVar.f354966h)) && n51.f.a(java.lang.Integer.valueOf(this.f354967i), java.lang.Integer.valueOf(bVar.f354967i)) && n51.f.a(this.f354968m, bVar.f354968m) && n51.f.a(this.f354969n, bVar.f354969n) && n51.f.a(this.f354970o, bVar.f354970o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f354962d;
            if (str != null) {
                fVar.j(1, str);
            }
            pj4.q qVar = this.f354963e;
            if (qVar != null) {
                fVar.i(2, qVar.computeSize());
                this.f354963e.writeFields(fVar);
            }
            java.lang.String str2 = this.f354964f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f354965g);
            fVar.h(5, this.f354966h);
            fVar.e(6, this.f354967i);
            java.lang.String str3 = this.f354968m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f354969n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f354970o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f354962d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            pj4.q qVar2 = this.f354963e;
            if (qVar2 != null) {
                j17 += b36.f.i(2, qVar2.computeSize());
            }
            java.lang.String str7 = this.f354964f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int a17 = j17 + b36.f.a(4, this.f354965g) + b36.f.h(5, this.f354966h) + b36.f.e(6, this.f354967i);
            java.lang.String str8 = this.f354968m;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f354969n;
            if (str9 != null) {
                a17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f354970o;
            return str10 != null ? a17 + b36.f.j(9, str10) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        pj4.b bVar = (pj4.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f354962d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    pj4.q qVar3 = new pj4.q();
                    if (bArr != null && bArr.length > 0) {
                        qVar3.parseFrom(bArr);
                    }
                    bVar.f354963e = qVar3;
                }
                return 0;
            case 3:
                bVar.f354964f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f354965g = aVar2.c(intValue);
                return 0;
            case 5:
                bVar.f354966h = aVar2.i(intValue);
                return 0;
            case 6:
                bVar.f354967i = aVar2.g(intValue);
                return 0;
            case 7:
                bVar.f354968m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f354969n = aVar2.k(intValue);
                return 0;
            case 9:
                bVar.f354970o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
