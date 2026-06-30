package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class e50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        super(0);
        this.f134193d = f50Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f134193d.findViewById(com.tencent.mm.R.id.hps);
        android.widget.TextView textView = (android.widget.TextView) (com.tencent.mm.plugin.finder.storage.aj0.f126440a.p() == 1 ? ((android.view.ViewStub) findViewById.findViewById(com.tencent.mm.R.id.f485510q82)).inflate() : ((android.view.ViewStub) findViewById.findViewById(com.tencent.mm.R.id.f485511q83)).inflate()).findViewById(com.tencent.mm.R.id.qck);
        if (textView != null) {
            textView.setText(findViewById.getResources().getString(com.tencent.mm.R.string.f491929eo5));
        }
        return findViewById;
    }
}
