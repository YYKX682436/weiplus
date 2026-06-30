package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView f191549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView appChooseItemCheckedView) {
        super(0);
        this.f191549d = appChooseItemCheckedView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView appChooseItemCheckedView = this.f191549d;
        return com.tencent.mm.ui.id.b(appChooseItemCheckedView.getContext()).inflate(com.tencent.mm.R.layout.acs, (android.view.ViewGroup) appChooseItemCheckedView, false);
    }
}
