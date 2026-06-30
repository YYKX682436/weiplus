package xv5;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final xv5.h f457481m = new xv5.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457482d;

    /* renamed from: e, reason: collision with root package name */
    public xv5.f f457483e;

    /* renamed from: f, reason: collision with root package name */
    public xv5.c f457484f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f457485g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f457486h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.ArrayMap f457487i = new android.util.ArrayMap();

    public xv5.f b() {
        return hasFieldNumber(2) ? this.f457483e : new xv5.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.h)) {
            return false;
        }
        xv5.h hVar = (xv5.h) fVar;
        return n51.f.a(this.f457482d, hVar.f457482d) && n51.f.a(this.f457483e, hVar.f457483e) && n51.f.a(this.f457484f, hVar.f457484f) && n51.f.a(this.f457485g, hVar.f457485g) && n51.f.a(this.f457486h, hVar.f457486h);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f457487i.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new xv5.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f457482d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f457482d);
            }
            if (this.f457483e != null && hasFieldNumber(2)) {
                fVar.i(2, this.f457483e.computeSize());
                this.f457483e.writeFields(fVar);
            }
            if (this.f457484f != null && hasFieldNumber(3)) {
                fVar.i(3, this.f457484f.computeSize());
                this.f457484f.writeFields(fVar);
            }
            if (this.f457485g != null && hasFieldNumber(100)) {
                fVar.b(100, this.f457485g);
            }
            if (this.f457486h != null && hasFieldNumber(101)) {
                fVar.b(101, this.f457486h);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f457482d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.j(1, this.f457482d);
            }
            if (this.f457483e != null && hasFieldNumber(2)) {
                i18 += b36.f.i(2, this.f457483e.computeSize());
            }
            if (this.f457484f != null && hasFieldNumber(3)) {
                i18 += b36.f.i(3, this.f457484f.computeSize());
            }
            if (this.f457485g != null && hasFieldNumber(100)) {
                i18 += b36.f.b(100, this.f457485g);
            }
            return (this.f457486h == null || !hasFieldNumber(101)) ? i18 : i18 + b36.f.b(101, this.f457486h);
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
        android.util.ArrayMap arrayMap = this.f457487i;
        if (intValue == 1) {
            this.f457482d = aVar2.k(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                xv5.f fVar2 = new xv5.f();
                if (bArr != null && bArr.length > 0) {
                    fVar2.parseFrom(bArr);
                }
                this.f457483e = fVar2;
            }
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 100) {
                this.f457485g = aVar2.d(intValue);
                arrayMap.put(100, java.lang.Boolean.TRUE);
                return 0;
            }
            if (intValue != 101) {
                return -1;
            }
            this.f457486h = aVar2.d(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            xv5.c cVar = new xv5.c();
            if (bArr2 != null && bArr2.length > 0) {
                cVar.parseFrom(bArr2);
            }
            this.f457484f = cVar;
        }
        arrayMap.put(3, java.lang.Boolean.TRUE);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (xv5.h) super.parseFrom(bArr);
    }
}
