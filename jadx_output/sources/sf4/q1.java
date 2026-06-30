package sf4;

/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final if4.h f407571a;

    /* renamed from: b, reason: collision with root package name */
    public int f407572b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f407573c;

    public q1(int i17, int i18, if4.h item, int i19, int i27) {
        java.lang.String b17;
        kotlin.jvm.internal.o.g(item, "item");
        this.f407571a = item;
        this.f407572b = i19;
        java.lang.String str = item.f291258f.f390023f;
        int i28 = item.f291255c;
        if (str == null) {
            b17 = "story_local_video_" + i28;
        } else {
            b17 = com.tencent.mm.modelcdntran.i2.b("storyvideo", i28, "story", str);
        }
        b17 = com.tencent.mm.sdk.platformtools.t8.K0(b17) ? null : b17;
        this.f407573c = b17 == null ? "" : b17;
    }

    public /* synthetic */ q1(int i17, int i18, if4.h hVar, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        this(i17, i18, hVar, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 1 : i27);
    }
}
