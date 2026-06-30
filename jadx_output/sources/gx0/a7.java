package gx0;

/* loaded from: classes5.dex */
public final class a7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f276190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f276192h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f276193i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(gx0.w8 w8Var, kotlinx.coroutines.r2 r2Var, java.lang.String str, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276189e = w8Var;
        this.f276190f = r2Var;
        this.f276191g = str;
        this.f276192h = audioCacheInfo;
        this.f276193i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.a7(this.f276189e, this.f276190f, this.f276191g, this.f276192h, this.f276193i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.a7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bc A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.a7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
