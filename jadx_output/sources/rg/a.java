package rg;

/* loaded from: classes5.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    LinearPCM(0),
    /* JADX INFO: Fake field, exist only in values array */
    AC3(1),
    /* JADX INFO: Fake field, exist only in values array */
    AC360958(2),
    /* JADX INFO: Fake field, exist only in values array */
    AppleIMA4(3),
    MPEG4AAC(4),
    /* JADX INFO: Fake field, exist only in values array */
    MPEG4CELP(5),
    /* JADX INFO: Fake field, exist only in values array */
    MPEG4HVXC(6),
    /* JADX INFO: Fake field, exist only in values array */
    MPEG4TwinVQ(7),
    /* JADX INFO: Fake field, exist only in values array */
    MACE3(8),
    /* JADX INFO: Fake field, exist only in values array */
    MACE6(9),
    /* JADX INFO: Fake field, exist only in values array */
    ULaw(10),
    /* JADX INFO: Fake field, exist only in values array */
    ALaw(11),
    /* JADX INFO: Fake field, exist only in values array */
    QDesign(12),
    /* JADX INFO: Fake field, exist only in values array */
    QDesign2(13),
    /* JADX INFO: Fake field, exist only in values array */
    QUALCOMM(14),
    /* JADX INFO: Fake field, exist only in values array */
    MPEGLayer1(15),
    /* JADX INFO: Fake field, exist only in values array */
    MPEGLayer2(16),
    /* JADX INFO: Fake field, exist only in values array */
    MPEGLayer3(17),
    /* JADX INFO: Fake field, exist only in values array */
    AppleLossless(18),
    /* JADX INFO: Fake field, exist only in values array */
    AMR(19),
    /* JADX INFO: Fake field, exist only in values array */
    Audible(20),
    /* JADX INFO: Fake field, exist only in values array */
    iLBC(21),
    /* JADX INFO: Fake field, exist only in values array */
    DVIIntelIMA(22),
    /* JADX INFO: Fake field, exist only in values array */
    MicrosoftGSM(23),
    /* JADX INFO: Fake field, exist only in values array */
    AES3(24);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f395134f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f395136d;

    static {
        for (rg.a aVar : values()) {
            ((java.util.HashMap) f395134f).put(java.lang.Integer.valueOf(aVar.f395136d), aVar);
        }
    }

    a(int i17) {
        this.f395136d = i17;
    }
}
