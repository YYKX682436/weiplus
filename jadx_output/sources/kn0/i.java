package kn0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.trtc.TRTCCloudDef.TRTCParams f309555f = new com.tencent.trtc.TRTCCloudDef.TRTCParams(1400188366, "852082", "eJwtzE0LgkAUheH-creF3pnG8SK0iGhnEOiiwE01U1w-YlBTI-rvibo8zwvnC2mceJ2tIQLpIaynzca*Wn7wxBRIJLmUxhRX59hAJBSiINpoPRc7OK4tRBoVIc7WcjWKCEhK0oFYtOHneFvcM99w5ueZX6hdyQntb6XrkiqPV314HK7qlL9TbM-hof9ctvD7AxQcMac_", 12081, "", "");

    /* renamed from: g, reason: collision with root package name */
    public static final kn0.g f309556g = new kn0.g("test", 12081, 0, null, 0, 0, null, 0, 0, 0, null, 0, 0, 0, null, null, 0, 0, false, 524284, null);

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.trtc.TRTCCloudDef.TRTCParams f309557a;

    /* renamed from: b, reason: collision with root package name */
    public kn0.g f309558b;

    /* renamed from: c, reason: collision with root package name */
    public kn0.h f309559c;

    /* renamed from: d, reason: collision with root package name */
    public final kn0.f f309560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f309561e;

    public i(com.tencent.trtc.TRTCCloudDef.TRTCParams trtcParams, kn0.g liveRoomInfo, kn0.h jumpInfo) {
        kotlin.jvm.internal.o.g(trtcParams, "trtcParams");
        kotlin.jvm.internal.o.g(liveRoomInfo, "liveRoomInfo");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        this.f309557a = trtcParams;
        this.f309558b = liveRoomInfo;
        this.f309559c = jumpInfo;
        kn0.f fVar = new kn0.f(false, false, false, 0, false, 31, null);
        this.f309560d = fVar;
        fVar.f309531c = false;
        fVar.f309529a = true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.i)) {
            return false;
        }
        kn0.i iVar = (kn0.i) obj;
        return kotlin.jvm.internal.o.b(this.f309557a, iVar.f309557a) && kotlin.jvm.internal.o.b(this.f309558b, iVar.f309558b) && kotlin.jvm.internal.o.b(this.f309559c, iVar.f309559c);
    }

    public int hashCode() {
        return (((this.f309557a.hashCode() * 31) + this.f309558b.hashCode()) * 31) + this.f309559c.hashCode();
    }

    public java.lang.String toString() {
        return "LiveRoomModel(liveRoomInfo=" + this.f309558b + " liveName:" + this.f309558b.f309534a + ", trtcParams=(sdkAppId:" + this.f309557a.sdkAppId + ",uid:" + this.f309557a.userId + ",roomId:" + this.f309557a.roomId + "))";
    }
}
