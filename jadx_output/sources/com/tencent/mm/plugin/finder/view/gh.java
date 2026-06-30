package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class gh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostOriginView f132162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView, yz5.a aVar) {
        super(0);
        this.f132162d = finderPostOriginView;
        this.f132163e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderPostOriginView finderPostOriginView = this.f132162d;
        finderPostOriginView.f131377e.setCheck(true);
        finderPostOriginView.h(true);
        yz5.a aVar = this.f132163e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
