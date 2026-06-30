package pp4;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f357515d;

    /* renamed from: e, reason: collision with root package name */
    public int f357516e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout f357518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f357519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f357520i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f357521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, java.lang.Long l17, long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357518g = timelineEditorBaseVideoPluginLayout;
        this.f357519h = l17;
        this.f357520i = j17;
        this.f357521m = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pp4.d dVar = new pp4.d(this.f357518g, this.f357519h, this.f357520i, this.f357521m, continuation);
        dVar.f357517f = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pp4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r14.f357516e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r15)
            goto Ld0
        L11:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L19:
            long r3 = r14.f357515d
            java.lang.Object r1 = r14.f357517f
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r15)
            r9 = r3
            r3 = r1
            goto L5c
        L25:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.f357517f
            r1 = r15
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            long r4 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout r15 = r14.f357518g
            java.lang.Class<lp4.u> r6 = lp4.u.class
            yt3.r2 r15 = r15.j(r6)
            r12 = r15
            lp4.u r12 = (lp4.u) r12
            if (r12 == 0) goto Ld0
            java.lang.Long r11 = r14.f357519h
            long r7 = r14.f357520i
            long r9 = r14.f357521m
            r14.f357517f = r1
            r14.f357515d = r4
            r14.f357516e = r3
            kotlinx.coroutines.p0 r15 = kotlinx.coroutines.q1.f310570c
            lp4.t r3 = new lp4.t
            r13 = 0
            r6 = r3
            r6.<init>(r7, r9, r11, r12, r13)
            java.lang.Object r15 = kotlinx.coroutines.l.g(r15, r3, r14)
            if (r15 != r0) goto L5a
            return r0
        L5a:
            r3 = r1
            r9 = r4
        L5c:
            rm5.v r15 = (rm5.v) r15
            if (r15 == 0) goto Ld0
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout r1 = r14.f357518g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "jni updateTrackDuration coast:"
            r4.<init>(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r9
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r11 = "MicroMsg.TimelineProfile"
            com.tencent.mars.xlog.Log.i(r11, r4)
            r4 = 0
            r5 = 0
            pp4.b r6 = new pp4.b
            r12 = 0
            r6.<init>(r1, r15, r12)
            r7 = 3
            r8 = 0
            kotlinx.coroutines.l.b(r3, r4, r5, r6, r7, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "updateComposition:"
            r3.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r9
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r11, r3)
            com.tencent.mm.plugin.vlog.model.h1 r6 = np4.a.a(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "videoComposition2VLogComposition coast:"
            r15.<init>(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r9
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            com.tencent.mars.xlog.Log.i(r11, r15)
            kotlinx.coroutines.g3 r15 = kotlinx.coroutines.internal.b0.f310484a
            pp4.c r3 = new pp4.c
            r11 = 0
            r4 = r3
            r5 = r1
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r9)
            r14.f357517f = r12
            r14.f357516e = r2
            java.lang.Object r15 = kotlinx.coroutines.l.g(r15, r3, r14)
            if (r15 != r0) goto Ld0
            return r0
        Ld0:
            jz5.f0 r15 = jz5.f0.f302826a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: pp4.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
