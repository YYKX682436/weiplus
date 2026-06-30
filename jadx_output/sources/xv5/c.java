package xv5;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f457449d;

    /* renamed from: e, reason: collision with root package name */
    public long f457450e;

    /* renamed from: f, reason: collision with root package name */
    public long f457451f;

    /* renamed from: g, reason: collision with root package name */
    public long f457452g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f457453h = new boolean[5];

    static {
        new xv5.c();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public xv5.c parseFrom(byte[] bArr) {
        return (xv5.c) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.c)) {
            return false;
        }
        xv5.c cVar = (xv5.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f457449d), java.lang.Long.valueOf(cVar.f457449d)) && n51.f.a(java.lang.Long.valueOf(this.f457450e), java.lang.Long.valueOf(cVar.f457450e)) && n51.f.a(java.lang.Long.valueOf(this.f457451f), java.lang.Long.valueOf(cVar.f457451f)) && n51.f.a(java.lang.Long.valueOf(this.f457452g), java.lang.Long.valueOf(cVar.f457452g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new xv5.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f457453h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f457449d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f457450e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f457451f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f457452g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f457449d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f457450e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f457451f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f457452g) : h17;
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
            this.f457449d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f457450e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f457451f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f457452g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
