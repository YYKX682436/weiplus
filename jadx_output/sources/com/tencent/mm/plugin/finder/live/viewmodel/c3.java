package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f116967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f116968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f116967d = m3Var;
        this.f116968e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var = this.f116967d;
        android.widget.TextView textView = (android.widget.TextView) m3Var.getRootView().findViewById(com.tencent.mm.R.id.sfs);
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.b3(m3Var, this.f116968e));
        return textView;
    }
}
