package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class hf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.jf f173964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(com.tencent.mm.plugin.textstatus.ui.jf jfVar) {
        super(0);
        this.f173964d = jfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f173964d.f174016a.f343783f;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.okp);
        }
        return null;
    }
}
