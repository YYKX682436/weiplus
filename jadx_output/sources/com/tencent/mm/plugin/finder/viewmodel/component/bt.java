package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f133928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f133929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f133928d = ptVar;
        this.f133929e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f133928d;
        ptVar.f135606d = true;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f133929e;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = new com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout(appCompatActivity);
        finderVideoLandscapePreviewLayout.setCallback(new com.tencent.mm.plugin.finder.viewmodel.component.at(appCompatActivity, ptVar, finderVideoLandscapePreviewLayout));
        return finderVideoLandscapePreviewLayout;
    }
}
