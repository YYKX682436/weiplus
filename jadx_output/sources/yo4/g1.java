package yo4;

/* loaded from: classes10.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f464217d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f464218e;

    /* renamed from: f, reason: collision with root package name */
    public int f464219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464220g = multiVideoPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.g1(this.f464220g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[LOOP:2: B:89:0x02cf->B:102:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo4.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
