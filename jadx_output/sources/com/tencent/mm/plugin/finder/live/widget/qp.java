package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vp f119542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(com.tencent.mm.plugin.finder.live.widget.vp vpVar) {
        super(1);
        this.f119542d = vpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.CheckBox checkBox = this.f119542d.R;
        if (checkBox != null) {
            it.put("display_location", checkBox.isChecked() ? 1 : 0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("checkBox");
        throw null;
    }
}
