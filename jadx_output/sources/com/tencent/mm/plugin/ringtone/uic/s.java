package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f158472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f158473e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f158474f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f158475g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f158476h;

    /* renamed from: i, reason: collision with root package name */
    public int f158477i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t45.l0 f158478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v f158479n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vx3.i f158480o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f158481p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f158482q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t45.l0 l0Var, com.tencent.mm.plugin.ringtone.uic.v vVar, vx3.i iVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158478m = l0Var;
        this.f158479n = vVar;
        this.f158480o = iVar;
        this.f158481p = u3Var;
        this.f158482q = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.s(this.f158478m, this.f158479n, this.f158480o, this.f158481p, this.f158482q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ringtone.uic.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
