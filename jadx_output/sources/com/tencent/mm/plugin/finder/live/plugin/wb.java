package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ac f114911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f114912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.tencent.mm.plugin.finder.live.plugin.ac acVar, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114911e = acVar;
        this.f114912f = bundle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.wb(this.f114911e, this.f114912f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.wb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.wb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
