package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        super(0);
        this.f122481d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f122481d.f122421a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getIntent();
    }
}
