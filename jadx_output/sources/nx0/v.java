package nx0;

/* loaded from: classes5.dex */
public final class v extends nx0.x {

    /* renamed from: b, reason: collision with root package name */
    public final int f341240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341241c;

    /* renamed from: d, reason: collision with root package name */
    public float f341242d;

    /* renamed from: e, reason: collision with root package name */
    public float f341243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, int i18, float f17, float f18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        super((i19 & 16) != 0 ? false : z17, null);
        f17 = (i19 & 4) != 0 ? 0.0f : f17;
        f18 = (i19 & 8) != 0 ? f17 : f18;
        this.f341240b = i17;
        this.f341241c = i18;
        this.f341242d = f17;
        this.f341243e = f18;
    }
}
