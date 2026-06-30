package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ld f134500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(com.tencent.mm.plugin.finder.viewmodel.component.ld ldVar) {
        super(0);
        this.f134500d = ldVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f134500d.getIntent().getBooleanExtra("KEY_FORCE_SHOW_MUSIC_FOLLOW_PAT", false));
    }
}
