package mx0;

/* loaded from: classes5.dex */
public final class s7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332316d;

    /* renamed from: e, reason: collision with root package name */
    public int f332317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jz5.l f332319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jz5.l f332320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332321i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f332322m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, jz5.l lVar, jz5.l lVar2, java.util.List list, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332318f = shootComposingPluginLayout;
        this.f332319g = lVar;
        this.f332320h = lVar2;
        this.f332321i = list;
        this.f332322m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.s7(this.f332318f, this.f332319g, this.f332320h, this.f332321i, this.f332322m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.s7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x01e9, code lost:
    
        if (kotlin.jvm.internal.o.b(r10, r11 != null ? r11.f332249b : null) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x045b, code lost:
    
        if (r2.f383595q == 0) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0477, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0468, code lost:
    
        if (((com.tencent.maas.camstudio.MJCamTemplateInfo) r32.f332319g.f302834e).isOSTEnabled() == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0475, code lost:
    
        if (((com.tencent.maas.camstudio.MJCamTemplateInfo) r32.f332319g.f302834e).isOSTEnabled() == false) goto L263;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x04b1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.s7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
