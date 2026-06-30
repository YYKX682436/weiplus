package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f117215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f117215d = m3Var;
        this.f117216e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var = this.f117215d;
        android.widget.TextView textView = (android.widget.TextView) m3Var.getRootView().findViewById(com.tencent.mm.R.id.v3_);
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.k3(m3Var, this.f117216e));
        return textView;
    }
}
