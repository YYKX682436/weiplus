package com.tencent.mm.plugin.textstatus.ui;

/* renamed from: com.tencent.mm.plugin.textstatus.ui.if, reason: invalid class name */
/* loaded from: classes11.dex */
public final class Cif extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.jf f173990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(com.tencent.mm.plugin.textstatus.ui.jf jfVar) {
        super(0);
        this.f173990d = jfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f173990d.f174016a.f343783f;
        if (view != null) {
            return view.findViewById(com.tencent.mm.R.id.ovj);
        }
        return null;
    }
}
