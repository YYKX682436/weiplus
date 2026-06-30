package cw5;

/* loaded from: classes11.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final cw5.e f224347i = new cw5.e();

    /* renamed from: d, reason: collision with root package name */
    public long f224348d;

    /* renamed from: e, reason: collision with root package name */
    public gw5.a f224349e;

    /* renamed from: f, reason: collision with root package name */
    public long f224350f;

    /* renamed from: g, reason: collision with root package name */
    public long f224351g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f224352h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof cw5.e)) {
            return false;
        }
        cw5.e eVar = (cw5.e) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f224348d), java.lang.Long.valueOf(eVar.f224348d)) && n51.f.a(this.f224349e, eVar.f224349e) && n51.f.a(java.lang.Long.valueOf(this.f224350f), java.lang.Long.valueOf(eVar.f224350f)) && n51.f.a(java.lang.Long.valueOf(this.f224351g), java.lang.Long.valueOf(eVar.f224351g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new cw5.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        gw5.a aVar;
        boolean[] zArr = this.f224352h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f224348d);
            }
            gw5.a aVar2 = this.f224349e;
            if (aVar2 != null && zArr[2]) {
                fVar.e(2, aVar2.f276166d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f224350f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f224351g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f224348d) : 0;
            gw5.a aVar3 = this.f224349e;
            if (aVar3 != null && zArr[2]) {
                h17 += b36.f.e(2, aVar3.f276166d);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f224350f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f224351g) : h17;
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
            this.f224348d = aVar5.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f224350f = aVar5.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f224351g = aVar5.i(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (aVar5.g(intValue)) {
            case 0:
                aVar = gw5.a.BOX_ACTION_UNKNOWN;
                break;
            case 1:
                aVar = gw5.a.BOX_ACTION_APP_FOREGROUND;
                break;
            case 2:
                aVar = gw5.a.BOX_ACTION_APP_BACKGROUND;
                break;
            case 3:
                aVar = gw5.a.BOX_ACTION_MAIN_TAB_EXPOSE;
                break;
            case 4:
                aVar = gw5.a.BOX_ACTION_MAIN_TAB_HIDE;
                break;
            case 5:
                aVar = gw5.a.BOX_ACTION_LOCK_SCREEN;
                break;
            case 6:
                aVar = gw5.a.BOX_ACTION_RECEIVE_NEW_MSG;
                break;
            default:
                aVar = null;
                break;
        }
        this.f224349e = aVar;
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (cw5.e) super.parseFrom(bArr);
    }
}
