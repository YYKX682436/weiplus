package er4;

/* loaded from: classes16.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public er4.z f256104d;

    /* renamed from: e, reason: collision with root package name */
    public int f256105e;

    /* renamed from: f, reason: collision with root package name */
    public int f256106f;

    /* renamed from: g, reason: collision with root package name */
    public int f256107g;

    /* renamed from: h, reason: collision with root package name */
    public int f256108h;

    /* renamed from: i, reason: collision with root package name */
    public int f256109i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f256110m = new boolean[7];

    static {
        new er4.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof er4.j)) {
            return false;
        }
        er4.j jVar = (er4.j) fVar;
        return n51.f.a(this.f256104d, jVar.f256104d) && n51.f.a(java.lang.Integer.valueOf(this.f256105e), java.lang.Integer.valueOf(jVar.f256105e)) && n51.f.a(java.lang.Integer.valueOf(this.f256106f), java.lang.Integer.valueOf(jVar.f256106f)) && n51.f.a(java.lang.Integer.valueOf(this.f256107g), java.lang.Integer.valueOf(jVar.f256107g)) && n51.f.a(java.lang.Integer.valueOf(this.f256108h), java.lang.Integer.valueOf(jVar.f256108h)) && n51.f.a(java.lang.Integer.valueOf(this.f256109i), java.lang.Integer.valueOf(jVar.f256109i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new er4.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        er4.z zVar;
        int i18 = 0;
        boolean[] zArr = this.f256110m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            er4.z zVar2 = this.f256104d;
            if (zVar2 != null && zArr[1]) {
                fVar.e(1, zVar2.f256228d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f256105e);
            }
            if (zArr[4]) {
                fVar.e(4, this.f256106f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f256107g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f256108h);
            }
            if (zArr[2]) {
                fVar.e(2, this.f256109i);
            }
            return 0;
        }
        if (i17 == 1) {
            er4.z zVar3 = this.f256104d;
            if (zVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, zVar3.f256228d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f256105e);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f256106f);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f256107g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f256108h);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f256109i) : i18;
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
        switch (intValue) {
            case 1:
                switch (aVar2.g(intValue)) {
                    case 1:
                        zVar = er4.z.ACTION_TYPE_INCOMING_SHOW_NOTIFICATION;
                        break;
                    case 2:
                        zVar = er4.z.ACTION_TYPE_INCOMING_SHOW_CALLKIT;
                        break;
                    case 3:
                        zVar = er4.z.ACTION_TYPE_INCOMING_SHOW_CARD;
                        break;
                    case 4:
                        zVar = er4.z.ACTION_TYPE_SHOW_MAIN_TALK_VIEW;
                        break;
                    case 5:
                        zVar = er4.z.ACTION_TYPE_CAMERA_STARTUP_BEGIN;
                        break;
                    case 6:
                        zVar = er4.z.ACTION_TYPE_CAMERA_FIRST_CALLBACK;
                        break;
                    case 7:
                        zVar = er4.z.ACTION_TYPE_SHOW_LOCAL_FIRST_PICTURE;
                        break;
                    case 8:
                        zVar = er4.z.ACTION_TYPE_SHOW_REMOTE_FIRST_PICTURE;
                        break;
                    case 9:
                        zVar = er4.z.ACTION_TYPE_AUDIO_RECORDER_STARTUP_BEGIN;
                        break;
                    case 10:
                        zVar = er4.z.ACTION_TYPE_AUDIO_RECORDER_STARTUP_SUCC;
                        break;
                    case 11:
                        zVar = er4.z.ACTION_TYPE_AUDIO_RECORDER_FIRST_CALLBACK;
                        break;
                    case 12:
                        zVar = er4.z.ACTION_TYPE_AUDIO_PLAYER_STARTUP_BEGIN;
                        break;
                    case 13:
                        zVar = er4.z.ACTION_TYPE_AUDIO_PLAYER_FIRST_CALLBACK;
                        break;
                    case 14:
                        zVar = er4.z.ACTION_TYPE_AUDIO_OCCUPY_BEGIN;
                        break;
                    case 15:
                        zVar = er4.z.ACTION_TYPE_AUDIO_OCCUPY_END;
                        break;
                    default:
                        zVar = null;
                        break;
                }
                this.f256104d = zVar;
                zArr[1] = true;
                return 0;
            case 2:
                this.f256109i = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f256105e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f256106f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f256107g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f256108h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (er4.j) super.parseFrom(bArr);
    }
}
