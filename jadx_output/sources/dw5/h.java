package dw5;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final dw5.h f244360i = new dw5.h();

    /* renamed from: d, reason: collision with root package name */
    public long f244361d;

    /* renamed from: e, reason: collision with root package name */
    public ew5.a f244362e;

    /* renamed from: f, reason: collision with root package name */
    public long f244363f;

    /* renamed from: g, reason: collision with root package name */
    public long f244364g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f244365h = new boolean[5];

    public ew5.a b() {
        return this.f244365h[2] ? this.f244362e : ew5.a.ACTION_UNKNOWN;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.h)) {
            return false;
        }
        dw5.h hVar = (dw5.h) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f244361d), java.lang.Long.valueOf(hVar.f244361d)) && n51.f.a(this.f244362e, hVar.f244362e) && n51.f.a(java.lang.Long.valueOf(this.f244363f), java.lang.Long.valueOf(hVar.f244363f)) && n51.f.a(java.lang.Long.valueOf(this.f244364g), java.lang.Long.valueOf(hVar.f244364g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        ew5.a aVar;
        boolean[] zArr = this.f244365h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f244361d);
            }
            ew5.a aVar2 = this.f244362e;
            if (aVar2 != null && zArr[2]) {
                fVar.e(2, aVar2.f257089d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f244363f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f244364g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f244361d) : 0;
            ew5.a aVar3 = this.f244362e;
            if (aVar3 != null && zArr[2]) {
                h17 += b36.f.e(2, aVar3.f257089d);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f244363f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f244364g) : h17;
        }
        if (i17 == 2) {
            c36.a aVar4 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar5 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f244361d = aVar5.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f244363f = aVar5.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f244364g = aVar5.i(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar5.g(intValue)) {
            case 0:
                aVar = ew5.a.ACTION_UNKNOWN;
                break;
            case 1:
                aVar = ew5.a.ACTION_APP_FOREGROUND;
                break;
            case 2:
                aVar = ew5.a.ACTION_APP_BACKGROUND;
                break;
            case 3:
                aVar = ew5.a.ACTION_MAIN_TAB_EXPOSE;
                break;
            case 4:
                aVar = ew5.a.ACTION_MAIN_TAB_HIDE;
                break;
            case 5:
                aVar = ew5.a.ACTION_LOCK_SCREEN;
                break;
            case 6:
                aVar = ew5.a.ACTION_RECEIVE_NEW_MSG;
                break;
            default:
                aVar = null;
                break;
        }
        this.f244362e = aVar;
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (dw5.h) super.parseFrom(bArr);
    }
}
