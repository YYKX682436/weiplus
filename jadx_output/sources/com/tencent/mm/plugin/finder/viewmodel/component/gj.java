package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f134536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        super(0);
        this.f134536d = blVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f134536d.getIntent().getIntExtra("FROM_SCENE_KEY", 2));
    }
}
