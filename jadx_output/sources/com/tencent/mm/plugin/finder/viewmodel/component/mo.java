package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.po f135192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(com.tencent.mm.plugin.finder.viewmodel.component.po poVar) {
        super(0);
        this.f135192d = poVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.po poVar = this.f135192d;
        androidx.appcompat.app.AppCompatActivity activity = poVar.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.setNavigationbarColor(poVar.f135575g);
        }
        return jz5.f0.f302826a;
    }
}
