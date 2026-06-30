package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ky extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ny f134996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar) {
        super(1);
        this.f134996d = nyVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject updateClientPageUdfKvObject = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(updateClientPageUdfKvObject, "$this$updateClientPageUdfKvObject");
        updateClientPageUdfKvObject.put("avatar_uuid", this.f134996d.getActivity().getIntent().getStringExtra("UUID_INTENT_KEY"));
        return jz5.f0.f302826a;
    }
}
