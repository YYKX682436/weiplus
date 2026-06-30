package jj2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f299996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView f299997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299997e = ripperAnimateView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jj2.j(this.f299997e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jj2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        if (r4 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0103, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103 A[ADDED_TO_REGION, EDGE_INSN: B:29:0x0103->B:28:0x0103 BREAK  A[LOOP:0: B:8:0x0064->B:26:?], SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jj2.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
