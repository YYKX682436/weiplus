package r45;

/* loaded from: classes9.dex */
public class mj5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ia0 f380583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f380584e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f380585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380586g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380587h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f380588i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f380589m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f380590n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f380591o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f380592p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj5)) {
            return false;
        }
        r45.mj5 mj5Var = (r45.mj5) fVar;
        return n51.f.a(this.f380583d, mj5Var.f380583d) && n51.f.a(java.lang.Boolean.valueOf(this.f380584e), java.lang.Boolean.valueOf(mj5Var.f380584e)) && n51.f.a(java.lang.Boolean.valueOf(this.f380585f), java.lang.Boolean.valueOf(mj5Var.f380585f)) && n51.f.a(java.lang.Boolean.valueOf(this.f380586g), java.lang.Boolean.valueOf(mj5Var.f380586g)) && n51.f.a(java.lang.Boolean.valueOf(this.f380587h), java.lang.Boolean.valueOf(mj5Var.f380587h)) && n51.f.a(java.lang.Boolean.valueOf(this.f380588i), java.lang.Boolean.valueOf(mj5Var.f380588i)) && n51.f.a(java.lang.Boolean.valueOf(this.f380589m), java.lang.Boolean.valueOf(mj5Var.f380589m)) && n51.f.a(java.lang.Boolean.valueOf(this.f380590n), java.lang.Boolean.valueOf(mj5Var.f380590n)) && n51.f.a(java.lang.Boolean.valueOf(this.f380591o), java.lang.Boolean.valueOf(mj5Var.f380591o)) && n51.f.a(java.lang.Boolean.valueOf(this.f380592p), java.lang.Boolean.valueOf(mj5Var.f380592p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ia0 ia0Var = this.f380583d;
            if (ia0Var != null) {
                fVar.i(1, ia0Var.computeSize());
                this.f380583d.writeFields(fVar);
            }
            fVar.a(2, this.f380584e);
            fVar.a(3, this.f380585f);
            fVar.a(4, this.f380586g);
            fVar.a(5, this.f380587h);
            fVar.a(6, this.f380588i);
            fVar.a(7, this.f380589m);
            fVar.a(8, this.f380590n);
            fVar.a(9, this.f380591o);
            fVar.a(10, this.f380592p);
            return 0;
        }
        if (i17 == 1) {
            r45.ia0 ia0Var2 = this.f380583d;
            return (ia0Var2 != null ? 0 + b36.f.i(1, ia0Var2.computeSize()) : 0) + b36.f.a(2, this.f380584e) + b36.f.a(3, this.f380585f) + b36.f.a(4, this.f380586g) + b36.f.a(5, this.f380587h) + b36.f.a(6, this.f380588i) + b36.f.a(7, this.f380589m) + b36.f.a(8, this.f380590n) + b36.f.a(9, this.f380591o) + b36.f.a(10, this.f380592p);
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
        r45.mj5 mj5Var = (r45.mj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ia0 ia0Var3 = new r45.ia0();
                    if (bArr != null && bArr.length > 0) {
                        ia0Var3.parseFrom(bArr);
                    }
                    mj5Var.f380583d = ia0Var3;
                }
                return 0;
            case 2:
                mj5Var.f380584e = aVar2.c(intValue);
                return 0;
            case 3:
                mj5Var.f380585f = aVar2.c(intValue);
                return 0;
            case 4:
                mj5Var.f380586g = aVar2.c(intValue);
                return 0;
            case 5:
                mj5Var.f380587h = aVar2.c(intValue);
                return 0;
            case 6:
                mj5Var.f380588i = aVar2.c(intValue);
                return 0;
            case 7:
                mj5Var.f380589m = aVar2.c(intValue);
                return 0;
            case 8:
                mj5Var.f380590n = aVar2.c(intValue);
                return 0;
            case 9:
                mj5Var.f380591o = aVar2.c(intValue);
                return 0;
            case 10:
                mj5Var.f380592p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
