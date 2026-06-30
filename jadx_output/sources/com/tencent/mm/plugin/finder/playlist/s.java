package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes9.dex */
public final class s implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f122417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122419d;

    public s(android.content.Context context, r45.ev2 ev2Var, com.tencent.mm.plugin.finder.playlist.l0 l0Var, java.lang.String str) {
        this.f122416a = context;
        this.f122417b = ev2Var;
        this.f122418c = l0Var;
        this.f122419d = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.plugin.finder.assist.n7.f102406a.q(this.f122416a, this.f122417b, this.f122418c.w(), true, this.f122419d, str);
        }
    }
}
