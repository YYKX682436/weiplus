package r45;

/* loaded from: classes2.dex */
public class q5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383682d;

    /* renamed from: e, reason: collision with root package name */
    public int f383683e;

    /* renamed from: f, reason: collision with root package name */
    public long f383684f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383685g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383686h;

    static {
        new r45.q5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.q5 parseFrom(byte[] bArr) {
        return (r45.q5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q5)) {
            return false;
        }
        r45.q5 q5Var = (r45.q5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383682d), java.lang.Integer.valueOf(q5Var.f383682d)) && n51.f.a(java.lang.Integer.valueOf(this.f383683e), java.lang.Integer.valueOf(q5Var.f383683e)) && n51.f.a(java.lang.Long.valueOf(this.f383684f), java.lang.Long.valueOf(q5Var.f383684f)) && n51.f.a(this.f383685g, q5Var.f383685g) && n51.f.a(this.f383686h, q5Var.f383686h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.q5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383682d);
            fVar.e(2, this.f383683e);
            fVar.h(3, this.f383684f);
            java.lang.String str = this.f383685g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f383686h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383682d) + 0 + b36.f.e(2, this.f383683e) + b36.f.h(3, this.f383684f);
            java.lang.String str3 = this.f383685g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f383686h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f383682d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f383683e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f383684f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f383685g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f383686h = aVar2.k(intValue);
        return 0;
    }
}
